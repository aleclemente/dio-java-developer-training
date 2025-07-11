package me.dio.javadevelopertraining.exceptiontraining.model;

public enum OptionMenu {
    CADASTRAR(1, "Cadastrar"),
    ATUALIZAR(2, "Atualizar"),
    EXCLUIR(3, "Excluir"),
    BUSCAR_POR_ID(4, "Buscar por id"),
    LISTAR(5, "Listar"),
    SAIR(6, "Sair");

    private final int codigo;
    private final String descricao;

    OptionMenu(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static OptionMenu fromCodigo(int codigo) {
        for (OptionMenu option : values()) {
            if (option.codigo == codigo) {
                return option;
            }
        }
        throw new IllegalArgumentException("Opção inválida: " + codigo);
    }
}

