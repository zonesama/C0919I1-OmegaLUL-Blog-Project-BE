package zone.god.blogprojectbe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zone.god.blogprojectbe.model.Tag;
import zone.god.blogprojectbe.repository.TagRepository;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {
    @Autowired
    private TagRepository tagRepository;

    @Override
    public List<Tag> findAll() {
        return tagRepository.findAll();
    }

    @Override
    public List<Tag> findAllById(Iterable<Long> ids) {
        return tagRepository.findAllById(ids);
    }

    @Override
    public Tag addTag(Tag tag) {
        tagRepository.save(tag);
        return tag;
    }

    @Override
    public Tag findById(long id) {
        return tagRepository.findById(id).get();
    }
}
