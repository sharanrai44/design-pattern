package behavioural.chainOfResponsibility;

public class Director extends Employee {

    public Director(LeaveApprover successor) {
        super("Director", successor);
    }

    @Override
    public boolean processRequest(LeaveApplication leaveApplication) {
        leaveApplication.approve(getApproverRole());
        return true;

    }
}
