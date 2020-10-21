package com.LaptrinhjavaT3h.modles;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	public static List<Student> ls = new ArrayList<Student>();

	public Student findById(String id) {
		for (Student student : ls) {
			if (student.getId().equals(id)) {
				return student;
			}
		}
		return null;
	}

	public int update(Student student) {
		for (int i = 0; i < ls.size(); i++) {
			if (ls.get(i).getId().equals(student.getId())) {
				ls.set(i, student);
				return i;
			}

		}
		return -1;
	}

	public int save(Student student) {
		if (findById(student.getId()) != null) {
			update(student);
		} else {
			ls.add(student);
		}
		return 1;
	}

	public int delete(String id) {
		Student u = findById(id);
		if (u != null) {
			ls.remove(u);
			return 1;
		}
		return 0;
	}

	public List<Student> getAll() {
		return ls;
	}

}
