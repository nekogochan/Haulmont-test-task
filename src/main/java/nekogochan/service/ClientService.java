package nekogochan.service;

import nekogochan.entity.Client;
import nekogochan.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService extends DefaultEntityService<Client> {
    public ClientService(ClientRepository repository) {
        setRepository(repository);
        setNotFoundExceptionProvider(ClientRepository.NotFoundException::new);
    }
}
