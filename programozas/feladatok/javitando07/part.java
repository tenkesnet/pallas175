//figyelem: HIBAS kod, ki kell javitani

    public List<String> whoHasSameRaces(String driverName) {
        Driver driver = null;
        for (Driver d : drivers) {
            if (d.getName().equals(driverName)) {
                driver = d;
            }
        }
        
        List<String> result = new List<String>;
        for (Driver d : drivers) {
            if (driver.getRaces() == d.getRaces()) {
                result.add(d.getName());
            }
        }
        
        return result;
    }
