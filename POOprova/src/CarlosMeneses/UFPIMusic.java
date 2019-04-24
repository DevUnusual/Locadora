package CarlosMeneses;

import java.util.ArrayList;
import java.util.Date;

public class UFPIMusic implements InterfaceStreaming {

    @Override
    public void cadastrarEstilo(String nome) throws ValorInvalido, EstiloJaCadastrado {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Musica> pesquisarPorEstilo(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Musica> pesquisarPorData(Date inicial) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Musica> pesquisarPorArtista(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cadastrarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void adicionarMusica(String idUsu, String nomeMusica, String estilo, String link, int duracao, Date lancamento) throws ValorInvalido, UsuarioNaoCadastrado, MusicaJaCadastrada, EstiloNaoCadastrado {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void criarPlaylist(String idUsu, String nomeLista) throws ValorInvalido, UsuarioNaoCadastrado, PlaylistExistente {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void adicionarMusicaPlaylist(String idUsu, String nomeLista, String nomeAutor, String nomeMusica) throws UsuarioNaoCadastrado, PlaylistNaoExistente, MusicaNaoCadastrada, MusicaJaCadastrada {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Playlist pesquisaPlaylistUsuario(String idUsu, String nomeLista) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Playlist> pesquisaPlaylistEstilo(String idUsu, String estilo) throws UsuarioNaoCadastrado, PlaylistNaoExistente {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
