/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cccxspaceinner.model.v20191227;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryServicerByPageRequest extends RpcAcsRequest<QueryServicerByPageResponse> {
	   

	private Long buId;

	@SerializedName("userStatusList")
	private List<Integer> userStatusList;

	private Long pageNo;

	private Long groupId;

	@SerializedName("servicerIds")
	private List<Long> servicerIds;

	private Long pageSize;

	private Long adminId;

	private String keyword;

	private String realName;
	public QueryServicerByPageRequest() {
		super("CCCXSpaceInner", "2019-12-27", "QueryServicerByPage");
		setMethod(MethodType.POST);
	}

	public Long getBuId() {
		return this.buId;
	}

	public void setBuId(Long buId) {
		this.buId = buId;
		if(buId != null){
			putBodyParameter("BuId", buId.toString());
		}
	}

	public List<Integer> getUserStatusList() {
		return this.userStatusList;
	}

	public void setUserStatusList(List<Integer> userStatusList) {
		this.userStatusList = userStatusList;	
		if (userStatusList != null) {
			putBodyParameter("UserStatusList" , new Gson().toJson(userStatusList));
		}	
	}

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putBodyParameter("PageNo", pageNo.toString());
		}
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putBodyParameter("GroupId", groupId.toString());
		}
	}

	public List<Long> getServicerIds() {
		return this.servicerIds;
	}

	public void setServicerIds(List<Long> servicerIds) {
		this.servicerIds = servicerIds;	
		if (servicerIds != null) {
			putBodyParameter("ServicerIds" , new Gson().toJson(servicerIds));
		}	
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public Long getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Long adminId) {
		this.adminId = adminId;
		if(adminId != null){
			putBodyParameter("AdminId", adminId.toString());
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putBodyParameter("Keyword", keyword);
		}
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
		if(realName != null){
			putBodyParameter("RealName", realName);
		}
	}

	@Override
	public Class<QueryServicerByPageResponse> getResponseClass() {
		return QueryServicerByPageResponse.class;
	}

}
