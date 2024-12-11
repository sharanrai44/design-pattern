package behavioural.chainOfResponsibility;

public interface LeaveApprover {

    void  processLeaveApplication(LeaveApplication leaveApplication);

    String getApproverRole();
}
