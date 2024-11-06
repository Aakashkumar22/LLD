package assignament;

public interface Process {
    void addStep(Step step);
    void execute(Context context);
}

