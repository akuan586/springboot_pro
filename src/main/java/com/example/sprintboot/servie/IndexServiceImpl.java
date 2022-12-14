package com.example.sprintboot.servie;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sprintboot.dao.IndexMapper;
import com.example.sprintboot.entity.NocvData;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl extends ServiceImpl<IndexMapper,NocvData> implements IndexService{
}
