package tn.esprit.spring.services;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.apache.log4j.Logger;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.repository.EntrepriseRepository;

@Service
public class EntrepriseServiceImpl implements IEntrepriseService {
	
	@Autowired
    EntrepriseRepository entrepriseRepoistory;
	@Autowired
	DepartementRepository deptRepoistory;
	private static final Logger l = Logger.getLogger(EntrepriseServiceImpl.class);	
	
	public int ajouterEntreprise(Entreprise entreprise) {
		
	if(entreprise.getName()==null || entreprise.getRaisonSocial()==null)	
	{
	return 0;
	}
	else{
		entrepriseRepoistory.save(entreprise);
		return entreprise.getId();
		}	
	}

	public int ajouterDepartement(Departement dep) {
		
		deptRepoistory.save(dep);
		
		return dep.getId();
	}
	
	

}
