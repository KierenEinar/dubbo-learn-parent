package dubbo.learn.provider.service.admin;

import dubbo.learn.api.modules.admin.AdminService;
import dubbo.learn.entity.Admin;
import dubbo.learn.mapper.AdminMapper;
import dubbo.learn.repository.admin.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by kieren on 18/2/12.
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private AdminMapper adminMapper;


    @Override
    @Transactional(readOnly = true, transactionManager = "transactionManager")
    public List<Admin> findAll() {
        return adminRepository.findAll();
    }

//    @Override
//    public Admin findOne(Long id) {
//        return adminRepository.findOne(id);
//    }

    @Override
    @Transactional(readOnly = true, transactionManager = "dataSourceTransactionManager")
    public Admin findOne(Long id) {
        return adminMapper.findOne(id);
    }


}
