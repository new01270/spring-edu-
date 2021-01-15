package co.syeon.spex.member.serviceImpl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.syeon.spex.member.service.MemberService;
import co.syeon.spex.member.vo.MemberVO;

/** MemberService.java의 구현체 **/

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMybatisDAO dao;

	@Override
	public List<MemberVO> memberList() throws SQLException {
		return dao.memberList();
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) throws SQLException {
		return dao.memberSelect(vo);
	}

	@Override
	public int memberInsert(MemberVO vo) throws SQLException {
		return dao.memberInsert(vo);
	}

	@Override
	public int memberUpdate(MemberVO vo) throws SQLException {
		return dao.memberUpdate(vo);
	}

	@Override
	public int memberDelete(MemberVO vo) throws SQLException {
		return dao.memberDelete(vo);
	}

	@Override
	public boolean memberLoginCheck(MemberVO vo) throws SQLException {
		return dao.memberLoginCheck(vo);
	}

}
