package Tsss.Bum;

import lombok.*;

@Data
class Dish {
    private int tagDish;
    private String nameDish;
    private double priseDish;

     Dish(@NonNull int tagDish, String nameDish, double priseDish) {
        this.tagDish = tagDish;
        this.nameDish = nameDish;
        this.priseDish = priseDish;
    }
/*
    public int getTagDish() {
        return tagDish;
    }

    public void setTagDish(int tagDish) {
        this.tagDish = tagDish;
    }

    public String getNameDish() {
        return nameDish;
    }

    public void setNameDish(String nameDish) {
        this.nameDish = nameDish;
    }

    public double getPriseDish() {
        return priseDish;
    }

    public void setPriseDish(double priseDish) {
        this.priseDish = priseDish;
    }

 */
}

