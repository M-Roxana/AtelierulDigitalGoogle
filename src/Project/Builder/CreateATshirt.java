package Project.Builder;

public class CreateATshirt {

    private String gender;
    private String size;
    private Types type;
    private String color;
    private boolean withPrint;
    private String print;
    private String text;

    private CreateATshirt(){};
    private CreateATshirt(Builder builder){
        this.gender = builder.gender ;
        this.size = builder.size;
        this.type = builder.type;
        this.color = builder.color;
        this.withPrint = builder.withPrint;
        this.print = builder.print;
        this.text = builder.text;

    }

    public static class Builder{
        private String gender ;
        private String size;
        private Types type;
        private String color;
        private boolean withPrint;
        private String print;
        private String text;

        public Builder(String gender ) {
            this.gender  = gender ;
        }

        public Builder setSize(String size) {
            this.size = size;
            return this;
        }

        public Builder setType(Types type) {
            this.type = type;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setPrint(boolean withPrint) {
            this.withPrint = withPrint;
            return this;
        }

            public Builder addPrint (String print){
            if( withPrint ) {
                this.print = print;
                return this;
            }
            return setPrint(false);
        }

        public Builder setText(String text) {
            this.text = text;
            return this;
        }

        public CreateATshirt build() {
            return new CreateATshirt(this);
        }
    }

    @Override
    public String toString() {
        return "Your created a Tshirt for a " +
                 gender + ", " + '\n' +
                "size: " + size + '\n' +
                "color: " + color + '\n' +
                "type: " + type  + '\n' +
                "with print: " + withPrint + '\n' +
                "print pattern: " + print + '\n' +
                "text: " + text + '\n' +
                "Good choice. It just looks awesome!";
    }
}
