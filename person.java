public class person {
    String Name;
    int Age;
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Name == null) ? 0 : Name.hashCode());
        result = prime * result + Age;
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
        person other = (person) obj;
        if (Name == null) {
            if (other.Name != null)
                return false;
        } else if (!Name.equals(other.Name))
            return false;
        if (Age != other.Age)
            return false;
        return true;
    }
    
}
