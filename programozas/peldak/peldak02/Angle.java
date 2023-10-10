/**
 * Fok <-> radián konverzió.
 */
 
public class Angle{

	// Fok -> radián konverzió
    static double degreeToRadian(double theta) {
        return Math.toRadians(theta);
    }

    // Radián -> fok konverzió
    static double radianToDegree(double theta) {
        return Math.toDegrees(theta);
    }
}