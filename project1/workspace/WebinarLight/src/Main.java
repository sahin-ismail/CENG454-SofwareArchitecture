

abstract class Main$$Webinar {
	
	public String getBPMNPath() {
		return "../WebinarBPMN/src/main/resources/com/sample/process/";
	}
	
	public void print(){
		System.out.println("Webinar");

		XMLFileOperations.cleanDirectory(getBPMNPath());
		XMLFileOperations.copyFile("processes/Webinar/Webinar.bpmn", 
				getBPMNPath()+"Webinar.bpmn");
	}

	public static void main(String[] args) {
		new Main().print();
	} 
}

abstract class Main$$Background extends  Main$$Webinar  {
	public void print() {
		super.print();
		System.out.println("- Background View");
		XMLFileOperations.addFeature("processes/BackgroundView/DiffBackgroundView.xml", 
				super.getBPMNPath()+"Webinar.bpmn"); 
		
//		XMLFileOperations.copyFile("processes/PassPresenter/PassPresenter.bpmn", 
//				Super().getBPMNPath()+"PassPresenter.bpmn");
	}
}

abstract class Main$$PassPresenter extends  Main$$Background  {
	public void print() {
		super.print();
		System.out.println("- Pass Presenter");
		XMLFileOperations.addFeature("processes/PassPresenter/DiffPassPresenter.xml", 
				super.getBPMNPath()+"Webinar.bpmn"); 
		
//		XMLFileOperations.copyFile("processes/PassPresenter/PassPresenter.bpmn", 
//				Super().getBPMNPath()+"PassPresenter.bpmn");
	}
}

abstract class Main$$ScreenShare extends  Main$$PassPresenter  {
	public void print() {
		super.print();
		System.out.println("- Screen Share");
		XMLFileOperations.addFeature("processes/ScreenShare/DiffScreenShare.xml", 
				super.getBPMNPath()+"Webinar.bpmn"); 
		
//		XMLFileOperations.copyFile("processes/PassPresenter/PassPresenter.bpmn", 
//				Super().getBPMNPath()+"PassPresenter.bpmn");
	}
}

abstract class Main$$WaitingRooms extends  Main$$ScreenShare  {
	public void print() {
		super.print();
		System.out.println("- Waiting Rooms");
		XMLFileOperations.addFeature("processes/WaitingRooms/DiffWaitingRooms.xml", 
				super.getBPMNPath()+"Webinar.bpmn"); 
		
//		XMLFileOperations.copyFile("processes/PassPresenter/PassPresenter.bpmn", 
//				Super().getBPMNPath()+"PassPresenter.bpmn");
	}
}

abstract class Main$$ChatMessaging extends  Main$$WaitingRooms  {
	public void print() {
		super.print();
		System.out.println("- Chat Messaging");
		XMLFileOperations.addFeature("processes/ChatMessaging/DiffChatMessaging.xml", 
				super.getBPMNPath()+"Webinar.bpmn");

//		XMLFileOperations.copyFile("processes/ChatMessaging/ChatMessaging.bpmn", 
//				Super().getBPMNPath()+"ChatMessaging.bpmn");
	}
}

abstract class Main$$Polling extends  Main$$ChatMessaging  {
	public void print() {
		super.print();
		System.out.println("- Polling System");
		XMLFileOperations.addFeature("processes/PollingSystem/DiffPollingSystem.xml", 
				super.getBPMNPath()+"Webinar.bpmn"); 
		
//		XMLFileOperations.copyFile("processes/PassPresenter/PassPresenter.bpmn", 
//				Super().getBPMNPath()+"PassPresenter.bpmn");
	}
}

abstract class Main$$EngagementAnalysis extends  Main$$Polling  {
	public void print() {
		super.print();
		System.out.println("- Engagemet Analysis");
		XMLFileOperations.addFeature("processes/EngagementAnalysis/DiffEngagementAnalysis.xml", 
				super.getBPMNPath()+"Webinar.bpmn"); 
		
//		XMLFileOperations.copyFile("processes/PassPresenter/PassPresenter.bpmn", 
//				Super().getBPMNPath()+"PassPresenter.bpmn");
	}
}

public class Main extends  Main$$EngagementAnalysis  {
	public void print() {
		super.print();
		System.out.println("- AI Analysis");
		XMLFileOperations.addFeature("processes/AIAnalysis/DiffAIAnalysis.xml", 
				super.getBPMNPath()+"Webinar.bpmn"); 
		
//		XMLFileOperations.copyFile("processes/PassPresenter/PassPresenter.bpmn", 
//				Super().getBPMNPath()+"PassPresenter.bpmn");
	}
}