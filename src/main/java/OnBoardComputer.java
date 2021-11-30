public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {

        int velocity = status.getVelocity();
        int altitude = status.getAltitude();

        int burn = (velocity * velocity)/(2 * altitude);
        System.out.println(burn); /*hack!*/

        return burn;
    }

}
