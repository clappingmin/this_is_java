package customer;

import java.util.List;
import java.util.*;

public class EmpManager {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		IEmpDAO dao = new EmpDAO();
		EmpVO emp = new EmpVO();
		int menu = 5;
		int EmployeeId;
		String FirstName;
		String LastName;
		String Email;
		String PhoneNumber;
		int Salary;
		double CommissionPct;

		try {
			System.out.println("---------------------");
			System.out.println("1.생성 2.갱신 3.삭제 4.출력");
			System.out.println("---------------------");
			System.out.println("메뉴 선택>>");
			menu = scanner.nextInt();
			switch (menu) {
			case 1:
				System.out.println("EmployeeId: ");
				EmployeeId = scanner.nextInt();
				emp.setEmployeeId(EmployeeId);

				System.out.println("FirstName: ");
				FirstName = scanner.next();
				emp.setFirstName(FirstName);

				System.out.println("LastName: ");
				LastName = scanner.next();
				emp.setLastName(LastName);

				System.out.println("Email: ");
				Email = scanner.next();
				emp.setEmail(Email);

				System.out.println("PhoneNumber: ");
				PhoneNumber = scanner.next();
				emp.setPhoneNumber(PhoneNumber);

				emp.setHireDate(new java.sql.Date(new java.util.Date().getTime()));

				emp.setJobId("IT_PROG");
				emp.setSalary(9000);
				emp.setCommissionPct(0.8);
				emp.setManagerId(100);
				emp.setDepartmentId(60);

				dao.insertEmp(emp);
				System.out.println("입력 성공!!!");
				break;

			case 2:
				
				System.out.println("변경 후 Email : ");
				Email = scanner.next();
				emp.setEmail(Email);
				
				System.out.println("변경 후 Salary : ");
				Salary = scanner.nextInt();
				emp.setSalary(Salary);
				
				System.out.println("변경 후 CommissionPct : ");
				CommissionPct = scanner.nextDouble();
				emp.setCommissionPct(CommissionPct);
				
				System.out.println("수정하려는 EmployeeId>>");
				EmployeeId = scanner.nextInt();	
				emp.setEmployeeId(EmployeeId);
				
				dao.updateEmp(emp);
				System.out.println("수정 성공!!!");
				break;

			case 3:
				System.out.println("삭제하려는 EmployeeId는>>");
				EmployeeId = scanner.nextInt();
				dao.deleteEmp(EmployeeId);
				System.out.println("삭제 성공!!!");
				break;
				
			case 4:
				EmpVO emp1 = dao.selectEmp(100);
				System.out.println(emp1);
				List<EmpVO> empList1 = dao.selectEmpByDeptno(60);
				List<EmpVO> empList = dao.selectAllEmp();
				for (EmpVO vo : empList) {
					System.out.println(vo);
				}
				break;
			}
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
}