import java.io.*;
import java.util.*;

class ReadFile{
	public static void main(String args[]){
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		int choice = 0;
		String filename,contentWritten;
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu..");
		System.out.println("1.Read the file and display their content.");
		System.out.println("2.Write content into file.");

		System.out.print("\nEnter the choice : ");
		choice = sc.nextInt();
		System.out.println("\n");

		switch(choice){
		case 1:
			//************************************************************************
			try{
				System.out.println("Enter the file name (Name.txt):");
				filename = sc.next();
				FileInputStream fin = new FileInputStream(filename);
				int i = 0;
				while((i = fin.read()) != -1){
					System.out.print((char)i);
				}
			}catch(Exception e){
				System.out.println("File is not present.");
			}
			//***********************************************************************
			break;
		case 2:
			//***********************************************************************
			try{
				System.out.println("Enter the file name (Name.txt):");
				filename = sc.next();
				File fileCreate = new File(filename);
				if(fileCreate.createNewFile()){
					try{
						System.out.println("Enter the content to be written in file : ");
						contentWritten = obj.readLine();
						FileOutputStream fout = new FileOutputStream(filename);
						byte b[] = contentWritten.getBytes();
						fout.write(b);
						fout.close();
					}catch(Exception e){
						System.out.println(e);
					}
				}
				else{
					try{
						System.out.println("Enter the content to be written in file : ");
						contentWritten = obj.readLine();
						FileOutputStream fout = new FileOutputStream(filename);
						byte b[] = contentWritten.getBytes();
						fout.write(b);
						fout.close();
					}catch(Exception e){
						System.out.println(e);
					}
				}
			}catch(Exception e){
				System.out.println(e);
			}
			//***********************************************************************
			break;
		default:
			System.out.println("Entered choice is wrong.");
		}
	}
}