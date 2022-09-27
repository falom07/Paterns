package Visitor;

public class House implements TheBuildings{
    @Override
    public void accept(ViewOfCheck viewOfCheck) {
        System.out.println("На даный момент для этого зданий нету даанных функцый %3CmxGraphModel%3E%3Croot%3E%3CmxCell%20id%3D%220%22%2F%3E%3CmxCell%20id%3D%221%22%20parent%3D%220%22%2F%3E%3CmxCell%20id%3D%222%22%20value%3D%22%26lt%3Bp%20style%3D%26quot%3Bmargin%3A0px%3Bmargin-top%3A4px%3Btext-align%3Acenter%3B%26quot%3B%26gt%3B%26lt%3Bi%26gt%3BBarnOf%26lt%3B%2Fi%26gt%3B%26lt%3B%2Fp%26gt%3B%26lt%3Bhr%20size%3D%26quot%3B1%26quot%3B%26gt%3B%26lt%3Bp%20style%3D%26quot%3Bmargin%3A0px%3Bmargin-left%3A4px%3B%26quot%3B%26gt%3B%2B%20accept(viewOfCheak%3AViewOfCheck)%3Avoid%26lt%3B%2Fp%26gt%3B%22%20style%3D%22verticalAlign%3Dtop%3Balign%3Dleft%3Boverflow%3Dfill%3BfontSize%3D12%3BfontFamily%3DHelvetica%3Bhtml%3D1%3B%22%20vertex%3D%221%22%20parent%3D%221%22%3E%3CmxGeometry%20x%3D%22-50%22%20y%3D%22270%22%20width%3D%22250%22%20height%3D%2280%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3C%2Froot%3E%3C%2FmxGraphModel%3E");
    }
}
