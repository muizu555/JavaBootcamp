class ComputeInitials{
    public static void main(String[] args){
        String a = args[0];
        String[] aSplit = a.split(" ");
        StringBuilder initials = new StringBuilder();
        for(int i = 0;i<aSplit.length;i++){
            if(aSplit != null){
                initials.append(aSplit[i].charAt(0));
            }
        }
    
        System.out.println("My initials are: "+initials);
    }
}