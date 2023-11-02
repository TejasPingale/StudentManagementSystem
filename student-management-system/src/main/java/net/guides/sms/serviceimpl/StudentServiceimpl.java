package net.guides.sms.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.guides.sms.entity.Student;
import net.guides.sms.repository.StudentRepository;
import net.guides.sms.service.StudentService;
@Service
public class StudentServiceimpl implements StudentService {

	private StudentRepository studentRepository;
	
	public StudentServiceimpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudent() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		
		studentRepository.deleteById(id);
	}

}
