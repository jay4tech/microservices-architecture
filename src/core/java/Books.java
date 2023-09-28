package core.java;

class Books {
    int id;
    String name;
    String author;
    String publisher;
    int quantity;

    public Books(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "core.java.Books [author=" + author + ", id=" + id + ", name=" + name + ", publisher=" + publisher + ", quantity="
                + quantity + "]";
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int hash = 1;
        hash = prime * hash + id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Books other = (Books) obj;
        return id == other.id;
    }

}