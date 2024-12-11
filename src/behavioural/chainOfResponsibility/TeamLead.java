package behavioural.chainOfResponsibility;

public class TeamLead extends Employee {

    public TeamLead(LeaveApprover successor) {
        super("TeamLead", successor);
    }

    @Override
    public boolean processRequest(LeaveApplication leaveApplication) {
        if (leaveApplication.getType().equals(LeaveApplication.Type.Sick)) {
            if (leaveApplication.getNoOfDays() < 2) {
                leaveApplication.approve(getApproverRole());
                return true;
            }
        }
        return false;
    }
}
