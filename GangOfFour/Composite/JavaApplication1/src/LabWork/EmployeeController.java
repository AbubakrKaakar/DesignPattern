/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabWork;

/**
 *
 * @author sp20-bse-072
 */
public class EmployeeController {
  public String generateOrganogram(IEmployee employee) {
        StringBuilder orgChart = new StringBuilder();

        orgChart.append(employee.getClass().getSimpleName()).append(" -> ");

        for (IEmployee subordinate : employee.getSubordinates()) {
            orgChart.append(subordinate.getClass().getSimpleName()).append(", ");
            orgChart.append(generateOrganogram(subordinate));
        }

        return orgChart.toString();
    }
}
