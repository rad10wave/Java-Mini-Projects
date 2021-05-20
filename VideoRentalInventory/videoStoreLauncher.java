package new_project;
import java.util.Scanner;

class video{
	String title;
	int userrating;
	boolean flag;
	
	void beingChecked() {
		System.out.println("Video "+'"'+this.title+'"' +" checked out.");
	}
	void beingReturned() {
		flag=true;
	}
	void receiveRating(int userrating) {
		this.userrating=userrating;
	}
	void addVideo(String name) {
		this.title=name;
	}
	
}



class videoStore extends video{
	video videoarray[];
	
		videoStore() {
				videoarray=new video[2];
				// TODO Auto-generated constructor stub
			}
		
		void addVideo(String name) {
			videoarray[0]=new video();
			videoarray[0].addVideo(name);
		}
		
		void checkOut(String name) {
			if(videoarray[0].title.equals(name))
				videoarray[0].beingChecked();
		}
		
		void returnVideo(String name) {
			if(videoarray[0].title.equals(name))
				videoarray[0].beingReturned();
		}
		
		void receiveRating(String name,int rating) {
			if(videoarray[0].title.equals(name))
				videoarray[0].receiveRating(rating);
		}
		
		public void listInventory() {		
			System.out.println("Video Name:"+videoarray[0].title+"\nCheckout Status: "+videoarray[0].flag+"\nRating: "+ videoarray[0].userrating);
		}
}
public class videoStoreLauncher {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int choice;
		videoStore videoStore=new videoStore();
		do {
			
				System.out.println("Press 1 to add video:");
				System.out.println("Press 2 to Check Out Video:");
				System.out.println("Press 3 to Return Video:");
				System.out.println("Press 4 to Receive Rating:");
				System.out.println("Press 5 to List Inventory:");
				System.out.println("Press 6 to Exit:");
				System.out.print("Enter your choice: ");
				
				choice=input.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter the name of the video you want to add: ");
					videoStore.addVideo(input.next());
					break;
				case 2:
						System.out.print("Enter the name of the video you want to check out: ");
						videoStore.checkOut(input.next());
						break;
				case 3:
					System.out.print("Enter the name of the video you want to Return:");
					videoStore.returnVideo(input.next());;
					break;
				case 4:
					System.out.println("Enter the name then the rating: ");
					videoStore.receiveRating(input.next(), input.nextInt());
					break;
				case 5:
					videoStore.listInventory();
					break;
				case 6:
					System.out.println("Thank You !");
					System.exit(1);
					break;
				default:
					System.err.print("No such option available");
					break;
				}
		}while(!(choice==6));		
				input.close();
	}

}
