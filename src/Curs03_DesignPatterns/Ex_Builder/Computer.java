package Curs03_DesignPatterns.Ex_Builder;

public class Computer {

    private String RAM;
    private boolean bluetooth;
    private String storage;
    private String GPU;
    private String CPU;
    private String audio;

     private Computer(){};
     private Computer( Builder builder){
         this.RAM = builder.RAM;
         this.bluetooth = builder.bluetooth;
         this.storage = builder.storage;
         this.GPU = builder.GPU;
         this.CPU = builder.CPU;
         this.audio = builder.audio;

     }

   public static class Builder{
       private String RAM;
       private boolean bluetooth;
       private String storage;
       private String GPU;
       private String CPU;
       private String audio;

       public Builder(String RAM) {
           this.RAM = RAM;
       }

       public Builder setBluetooth(boolean bluetooth) {
           this.bluetooth = bluetooth;
           return this;
       }

       public Builder setStorage(String storage) {
           this.storage = storage;
           return this;
       }

       public Builder setGPU(String GPU) {
           this.GPU = GPU;
           return this;
       }

       public Builder setCPU(String CPU) {
           this.CPU = CPU;
           return this;
       }

       public Builder setAudio(String audio) {
           this.audio = audio;
           return this;
       }

       public Computer build() {
           return new Computer(this);
       }
   }

    @Override
    public String toString(){
       return "RAM: " + RAM + ", bluetooth: " + bluetooth + ", storage: " + storage + ", GPU: " + GPU + ", CPU: " + CPU + ", audio: " + audio;
   }
}
