package Curs03_DesignPatterns.Ch6_Builder;

public class Person {
    private String name, job, univeristy;
    private boolean drivingLicense, isMaried;

    private Person(){};
    private Person( Builder builder ) {
        this.name = builder.name;
        this.job = builder.job;
        this.univeristy = builder.univeristy;
        this.drivingLicense = builder.drivingLicense;
        this.isMaried = builder.isMaried;
    }

    public static class Builder {
        private String name, job, univeristy;
        private boolean drivingLicense, isMaried;

        public Builder(String name) {

            this.name = name;
        }

        public Builder setJob(String job) {
            this.job = job;
            return this;
        }

        public Builder setUniversity(String univeristy) {
            this.univeristy = univeristy;
            return this;
        }

        public Builder setDrivingLicense(boolean drivingLicense) {
            this.drivingLicense = drivingLicense;
            return this;
        }

        public Builder setIsMaried(boolean isMaried) {
            this.isMaried = isMaried;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
        @Override
        public String toString() {
            return "Person details: " +
                    "name='" + name + '\'' +
                    ", job='" + job + '\'' +
                    ", univeristy='" + univeristy + '\'' +
                    ", drivingLicense=" + drivingLicense +
                    ", isMaried=" + isMaried +
                    '}';
        }
    }

