package com.company.homework;

public class Test {
    public static void main(String[] args) {

    }
    private  static  Plate getPCPlate() {
        return new Plate("PC","PC.png");
    }
    private   static Plate getMobilePlate() {
        return new Plate("Mobile","Mobile.png");
    }
    private  static  Plate getPadPlate() {
        return new Plate("Pad","Pad.png");
    }
    private  static  Plate getLaptopPlate() {
        return new Plate("Laptop","Laptop.png");
    }
    private  static  Plate getTVPlate() {
        return new Plate("TV","TV.png");
    }
    private  static  Plate getSmartWatchPlate() {
        return new Plate("Smart watch","Smart watch.png");
    }
    private  static  Plate getSmartphoneAccessoriesPlate() {
        return new Plate("Smartphone accessories","Smartphone accessories.png");
    }
    private  static  Plate getHeadphonesAndAudioEquipmentPlate() {
        return new Plate("Headphones and audio equipment","Headphones and audio equipment.png");
    }
    private  static  Plate getPhotoAndVideoCamerasPlate() {
        return new Plate("Photo and video cameras","Photo and video cameras.png");
    }

    private  static  Plate getGamesAndConsolesPlate() {
        return new Plate("Games and consoles","Games and consoles.png");
    }

    private  static  Plate getSmartHomeAndSecurityPlate() {
        return new Plate("Smart home and security", "Smart home and security.png");
    }

    private  static  Plate getOfficeEquipmentPlate() {
        return new Plate(" Office equipment", " Office equipment.png");
    }

    private static SearchElement getSearchButton() {
        return new SearchButtonElement();
    }

    private static SearchElement getSearchField() {
        return new SearchFieldElement();
    }

    private static SearchElement getSearchDropDownElement() {
        return new SearchDropDownElement();
    }

}
