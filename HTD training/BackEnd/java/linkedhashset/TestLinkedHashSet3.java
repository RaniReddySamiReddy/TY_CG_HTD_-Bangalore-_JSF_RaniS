package linkedhashset;

public class TestLinkedHashSet3 {
    int empAge;
    String empName;
	public TestLinkedHashSet3(int empAge, String empName) {
		super();
		this.empAge = empAge;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "TestLinkedHashSet3 [empAge=" + empAge + ", empName=" + empName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empAge;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestLinkedHashSet3 other = (TestLinkedHashSet3) obj;
		if (empAge != other.empAge)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}
}
