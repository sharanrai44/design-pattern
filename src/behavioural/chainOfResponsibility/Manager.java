package behavioural.chainOfResponsibility;

public class Manager extends Employee {

    public Manager(LeaveApprover successor) {
        super("Manager", successor);
    }

    @Override
    public boolean processRequest(LeaveApplication leaveApplication) {
        switch (leaveApplication.getType()) {
            case Sick -> {
                leaveApplication.approve(getApproverRole());
                return true;
            }
            case LOP -> {
                if (leaveApplication.getNoOfDays() < 5) {
                    leaveApplication.approve(getApproverRole());
                    return true;
                }
            }
        }
        return false;

    }
}
