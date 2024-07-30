public class Main {
    public static void main(String[] args) {
        Class<Pessoa> pessoaClass = Pessoa.class;

        if (pessoaClass.isAnnotationPresent(Tabela.class)) {
            Tabela tabelaAnootation = pessoaClass.getAnnotation(Tabela.class);
            String tableName = tabelaAnootation.value();
            System.out.println("Nome da tabela: " + tableName);
        }
    }
}
