package himedia.myportal.mappers;

import java.util.Map;

import himedia.myportal.repositories.vo.UserVo;

public interface UserMapper {
//	<insert id="insert" parameterType="userVo">
	int insert(UserVo vo);
//	<select id="selectUserByEmailAndPassword"
//			parameterType="map"
//			resultType="userVo">
	UserVo selectUserByEmailAndPassword(Map<String, String> map);
//	<select id="selectUserByEmail"
//			parameterType="string"
//			resultType="userVo">
	UserVo selectUserByEmail(String email);
}
