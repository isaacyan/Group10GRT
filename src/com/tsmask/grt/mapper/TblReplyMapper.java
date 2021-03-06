package com.tsmask.grt.mapper;

import java.util.List;
import java.util.Map;

import com.tsmask.grt.pojo.TblReply;

/**
 * TblReplyMapper 回复服务映射接口
 * 
 * @author tsmak
 *
 */
public interface TblReplyMapper {
	
	// 查询所有
	List<TblReply> findAll();

	// 通过主键查询
	TblReply findByID(Integer replyid);

	// 通过总帖子id查询
	List<TblReply> findByPostID(Integer reply_id);

	// 得到数据库中总条数
	long count();

	// 选择性插入数据
	int insertSelective(TblReply tblReply);

	// 通过主键选择性更新数据map
	int updateByMapSelective(Map<String, Object> map);
    
}