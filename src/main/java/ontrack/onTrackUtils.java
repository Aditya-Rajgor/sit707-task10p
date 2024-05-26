package ontrack;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * @author: Aditya 
 * @student-id: 222391148
 */

import java.util.List;
import java.util.Map;

public class onTrackUtils {

	public static String[] getUnits(String studentId) {
		String[] studentUnits = { "SIT707", "SIT770", "SIT743" };
		return studentUnits;
	}

	public static Map<String, Boolean> getStudentTaskStatus(String studentId) {
		Map<String, Boolean> studentTaskStatus = new HashMap<>();

		studentTaskStatus.put("Task1.1", true);
		studentTaskStatus.put("Task2.1", true);
		studentTaskStatus.put("Task2.2", false);
		studentTaskStatus.put("Exam", true);

		return studentTaskStatus;
	}

	public static List<String> getPassedTasks(String studentId) {
		List<String> studentPassedTaskList = new ArrayList<>();

		studentPassedTaskList.add("Task1.1");
		studentPassedTaskList.add("Task2.1");
		studentPassedTaskList.add("Exam");

		return studentPassedTaskList;
	}
}