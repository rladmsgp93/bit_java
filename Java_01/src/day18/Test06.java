package day18;



import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test06 {
public static void main(String[] args) {
	Set<Employee> set = new TreeSet<Employee>();
	boolean flag = set.add(new Employee(2017001,"홍씨","영업"));
	if(flag)System.out.println("등록되었습니다.");
	flag=set.add(new Employee(2017001,"홍씨","영업"));
	if(!flag)System.out.println("이미 존재하는 데이터입니다.");
	set.add(new Employee(2017001,"동씨","영업"));
	set.add(new Employee(2017002,"김씨","마케팅"));
	set.add(new Employee(2017003,"홍씨","영업"));
	
	Iterator<Employee> it = set.iterator();
	System.out.println("사원 목록입니다.");
	while(it.hasNext()) {
		Employee data = it.next();
		System.out.println(data.toString());
	}
	System.out.println("==================================");
	//2017003사번의 사원을 검색 출력하세요
	it= set.iterator();
	System.out.println("2017003검색 결과입니다.");
	while(it.hasNext()) {
		Employee data= it.next();
		if(data.number==2017003) {
			System.out.println(data);
		}
	}
	System.out.println("==================정렬 사원=====================");

	it= set.iterator();
	while(it.hasNext()) {
		Employee data= it.next();
		
			System.out.println(data);
		
	}
}
}

