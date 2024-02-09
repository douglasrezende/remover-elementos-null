private Page<PesquisaResponseVO> removerElementosNull(Page<PesquisaResponseVO> page) {



		List<PesquisaResponseVO> listaFiltrada = page.stream()

				.filter(Objects::nonNull)

				.collect(Collectors.toList());



		return new PageImpl<>(listaFiltrada, page.getPageable(), page.getTotalElements());

	}

