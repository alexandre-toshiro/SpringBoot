package br.com.alura.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.dto.TopicoDto;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicoRepository;

@RestController // Já assume que todos os métodos da classe retornarão no body .
public class TopicosController {
	@Autowired
	private TopicoRepository topicoRepository;

	@RequestMapping("/topicos")
	public List<TopicoDto> lista(String nomeCurso) {// Recebe o parâmetro que será utilizado na uri.
		if(nomeCurso == null) {
		List<Topico> topicos = topicoRepository.findAll(); // Encontra todos os registos no banco.
		return TopicoDto.converter(topicos);// converte a lista dos achados em banco para TopicoDto.

		}else {
			List<Topico> topicos = topicoRepository.findByCurso_Nome(nomeCurso);
			return TopicoDto.converter(topicos);
		}
	}

}
