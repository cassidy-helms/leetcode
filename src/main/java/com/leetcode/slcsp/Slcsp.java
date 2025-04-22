package com.leetcode.slcsp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Slcsp {
    private static Map<RateArea, List<Double>> silverPlans = new HashMap<>();
    private static Map<String, List<RateArea>> zipCodes = new HashMap<>();

    public static void main(String[] args) {
        readPlans();
        readZipCodes();

        // for(Entry<RateArea, List<Double>> zip : silverPlans.entrySet()) {
        //     System.out.println("Key: " + zip.getKey() + ", Value: " + zip.getValue());
        // }

        // List<RateArea> rateAreas = zipCodes.get("64148");
        // System.out.println("Rate Areas: ");
        // for(RateArea rateArea : rateAreas) {
        //     System.out.println(rateArea);
        // }

        // List<Double> plans = silverPlans.get(rateAreas.get(0));
        // plans = plans.stream().sorted().collect(Collectors.toList());
        // System.out.print("[");
        // for(Double plan : plans) {
        //     System.out.print(plan + ", ");
        // }
        // System.out.println("]");

        // System.out.println(getSecondLowestCostSilverPlan("64148"));
    }

    public static void writeToSlcsp() {
        try(BufferedReader br = new BufferedReader(new FileReader("leetcode\\src\\main\\java\\com\\leetcode\\slcsp\\slcsp.csv"))) {
            String line;
            while((line = br.readLine()) != null) {
                String zipCode = line.substring(0, line.length() - 1);

                double slcsp = getSecondLowestCostSilverPlan(zipCode);

                if(slcsp != -1.0) {

                }
            }
        } catch(IOException ie) {
            ie.printStackTrace();
        }
    }

    public static double getSecondLowestCostSilverPlan(String zipCode) {
        List<RateArea> rateAreas = zipCodes.get(zipCode);

        if(rateAreas.size() != 1) return -1.0;

        List<Double> rates = silverPlans.get(rateAreas.get(0));

        return rates.stream().sorted().skip(1).findFirst().orElse(-1.0);
    }

    public static void readPlans() {
        try(BufferedReader br = new BufferedReader(new FileReader("leetcode\\src\\main\\java\\com\\leetcode\\slcsp\\plans.csv"))) {
            String line;
            while((line = br.readLine()) != null) {
                /*
                 * values[0] - plan id
                 * values[1] - state
                 * values[2] - metal level
                 * values[3] - rate
                 * values[4] - area
                 */
                String[] values = line.split(",");

                if(values[2].equals("Silver")) {
                    RateArea rateArea = new RateArea(values[1], values[4]);
                    List<Double> rates = silverPlans.getOrDefault(rateArea, new ArrayList<>());
                    rates.add(Double.parseDouble(values[3]));
                    silverPlans.putIfAbsent(rateArea, rates);
                }
            }
        } catch(IOException ie) {
            ie.printStackTrace();
        }
    }

    public static void readZipCodes() {
        try(BufferedReader br = new BufferedReader(new FileReader("leetcode\\src\\main\\java\\com\\leetcode\\slcsp\\zips.csv"))) {
            String line;
            while((line = br.readLine()) != null) {
                /*
                 * values[0] - zipcode
                 * values[1] - state
                 * values[2] - county code
                 * values[3] - name
                 * values[4] - area
                 */
                String[] values = line.split(",");

                List<RateArea> rateAreas = zipCodes.getOrDefault(values[0], new ArrayList<>());
                RateArea rateArea = new RateArea(values[1], values[4]);
                if(!rateAreas.contains(rateArea)) {
                    rateAreas.add(rateArea);
                }
                zipCodes.putIfAbsent(values[0], rateAreas);
            }
        } catch(IOException ie) {
            ie.printStackTrace();
        }
    }
}
