class args{
    public static void main(String [] args){
        if( args.length > 0){
            System.out.println("Args are passed bro ");
        }
        for( int i=0;i<args.length;i++){
            System.out.println((i+1) + " argument is " + args[i] );
         
        }
    }
}