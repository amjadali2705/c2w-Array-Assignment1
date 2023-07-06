import java.io.*;
class Core2Web{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of Array");
        int n = Integer.parseInt(br.readLine());
        char[] ch = new char[n]; 
        System.out.println("Enter Elements");
        for(int i=0; i<n;i++){
            ch[i] = (char)br.read();
        }
        System.out.println("Vowels are");
        for(int i=0; i<n; i++){
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U'){
                System.out.print(ch[i]+" ");
            }
        }
        
    }
}