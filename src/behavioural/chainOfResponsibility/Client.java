package behavioural.chainOfResponsibility;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        LeaveApplication application = LeaveApplication.getBuilder().withType(LeaveApplication.Type.LOP)
                .from(LocalDate.now()).to(LocalDate.of(2024, 12, 16))
                .build();

        System.out.println(application);
        System.out.println("*************************************");
        LeaveApprover approver = createChain();
        approver.processLeaveApplication(application);
        System.out.println(application);
    }

    private static LeaveApprover createChain() {
        Director director = new Director(null);
        Manager manager = new Manager(director);
        TeamLead teamLead = new TeamLead(manager);
        return teamLead;
    }
}
