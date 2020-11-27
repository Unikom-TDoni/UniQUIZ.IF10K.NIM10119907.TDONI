/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUIZ.IF10K.NIM10119907.TDONI;

/**
 *
 * @author aris
 */
public class ServicePrice implements ServiceItem {
    
    private float priceService;
    private float discount;
   
    @Override
    public void displayService() {
        System.out.println("#*****************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#******Service List******#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash: IDR 55K");
        System.out.println("3. Haircut Only: IDR 15K");
        System.out.println("#*****************#");
        System.out.println("Choose(1/2/3)");
    }

    @Override
    public float getPrice(int serviceItem) {
        switch(serviceItem){
            case 1:
                return 45000;
            case 2:
                return 55000;
            case 3:
                return 15000;
            default:
                return 0;
        }
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
        return statusMember.equals("Yes");
    }

    @Override
    public float getSale(boolean isMember, float parServicePrize) {
        if(isMember)
            return parServicePrize * 0.1f;
        
        return parServicePrize;
    }
    
    public float getTotalPay(float priceService, float discount){
        return priceService - discount;
    }
    
    public float getPriceService(){
        return priceService;
    }
    
    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }
}
