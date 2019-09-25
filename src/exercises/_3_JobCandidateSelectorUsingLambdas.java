package exercises;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _3_JobCandidateSelectorUsingLambdas {
	
	private static void sortBySalary(List<JobCandidate> candidates) {
		Collections.sort(candidates, new Comparator<JobCandidate>() {
			@Override
			public int compare(JobCandidate jc1, JobCandidate jc2) {
				if(jc1.getSalaryRequired()< jc2.getSalaryRequired()) {
					return -1;
				}else if (jc1.getSalaryRequired() > jc2.getSalaryRequired()) {
					return 1;
				}else {
					return 0;
				}
			}
		});
		candidates.forEach((candidate) -> {
			System.out.println(candidate.getName() + " "  + candidate.getSalaryRequired());
		});
	}
	
	
	public static void main(String[] args) {
		List<JobCandidate> candidates = JobCandidate.jobCandidates;

		// 1. Sort the candidates by salary requirements, low to high.
		sortBySalary(candidates);
		

		// 2. Filter out any candidates that have not been taught by me (June)
		// Hint: see the removeIf() method in the Collections class
		candidates.removeIf(c -> !c.getTeacherName().contains("June"));
		 
		 candidates.forEach((candidate) -> {
				System.out.println(candidate.getName()  + ", " + candidate.getTeacherName());
			});
		
		
	}
}
