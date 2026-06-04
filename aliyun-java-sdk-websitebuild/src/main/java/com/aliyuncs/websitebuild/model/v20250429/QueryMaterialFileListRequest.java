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

package com.aliyuncs.websitebuild.model.v20250429;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryMaterialFileListRequest extends RpcAcsRequest<QueryMaterialFileListResponse> {
	   

	@SerializedName("statusList")
	private List<String> statusList;

	private Integer pageNum;

	private String orderColumn;

	private Long minFileSize;

	private String nextToken;

	private Integer pageSize;

	private String directoryId;

	@SerializedName("suffixList")
	private List<String> suffixList;

	private Long maxFileSize;

	@SerializedName("typeList")
	private List<String> typeList;

	private String bizId;

	private String name;

	private Integer maxResults;

	private String orderType;
	public QueryMaterialFileListRequest() {
		super("WebsiteBuild", "2025-04-29", "QueryMaterialFileList");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<String> getStatusList() {
		return this.statusList;
	}

	public void setStatusList(List<String> statusList) {
		this.statusList = statusList;	
		if (statusList != null) {
			putQueryParameter("StatusList" , new Gson().toJson(statusList));
		}	
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public String getOrderColumn() {
		return this.orderColumn;
	}

	public void setOrderColumn(String orderColumn) {
		this.orderColumn = orderColumn;
		if(orderColumn != null){
			putQueryParameter("OrderColumn", orderColumn);
		}
	}

	public Long getMinFileSize() {
		return this.minFileSize;
	}

	public void setMinFileSize(Long minFileSize) {
		this.minFileSize = minFileSize;
		if(minFileSize != null){
			putQueryParameter("MinFileSize", minFileSize.toString());
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getDirectoryId() {
		return this.directoryId;
	}

	public void setDirectoryId(String directoryId) {
		this.directoryId = directoryId;
		if(directoryId != null){
			putQueryParameter("DirectoryId", directoryId);
		}
	}

	public List<String> getSuffixList() {
		return this.suffixList;
	}

	public void setSuffixList(List<String> suffixList) {
		this.suffixList = suffixList;	
		if (suffixList != null) {
			putQueryParameter("SuffixList" , new Gson().toJson(suffixList));
		}	
	}

	public Long getMaxFileSize() {
		return this.maxFileSize;
	}

	public void setMaxFileSize(Long maxFileSize) {
		this.maxFileSize = maxFileSize;
		if(maxFileSize != null){
			putQueryParameter("MaxFileSize", maxFileSize.toString());
		}
	}

	public List<String> getTypeList() {
		return this.typeList;
	}

	public void setTypeList(List<String> typeList) {
		this.typeList = typeList;	
		if (typeList != null) {
			putQueryParameter("TypeList" , new Gson().toJson(typeList));
		}	
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
		if(orderType != null){
			putQueryParameter("OrderType", orderType);
		}
	}

	@Override
	public Class<QueryMaterialFileListResponse> getResponseClass() {
		return QueryMaterialFileListResponse.class;
	}

}
