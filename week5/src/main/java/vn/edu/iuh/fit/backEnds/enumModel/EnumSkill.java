package vn.edu.iuh.fit.backEnds.enumModel;

public enum EnumSkill {
    BEGINNER(0),INTERMEDIATE(1),ADVANCED(2);
    private int level;

    EnumSkill(int level) {
        this.level = level;
    }
}
