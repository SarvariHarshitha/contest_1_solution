// Implemented queue data structure to store the order of the students and poll the students in the front and add them in the rear side

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<students.length;i++){
            q.add(students[i]);
        }
        int count=0;
        int i=0;
        while(count!=q.size()){
            if(q.peek()==sandwiches[i]){
                count=0;
                q.poll();
                i++;
            }
            else{
                count++;
                q.add(q.poll());
            }
        }
        return count;
    }
}
