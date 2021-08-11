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

package com.aliyuncs.retailadvqa_public.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListTemplatesRequest extends RpcAcsRequest<ListTemplatesResponse> {
	   

	private Long isVariable;

	private String comefrom;

	private String platformId;

	private Long pageNum;

	private String columnName;

	private String accessId;

	private Long templateType;

	private Long pageSize;

	private String tenantId;

	private String keyword;

	private String order;

	private String workspaceId;
	public ListTemplatesRequest() {
		super("retailadvqa-public", "2020-05-15", "ListTemplates");
		setMethod(MethodType.GET);
	}

	public Long getIsVariable() {
		return this.isVariable;
	}

	public void setIsVariable(Long isVariable) {
		this.isVariable = isVariable;
		if(isVariable != null){
			putQueryParameter("IsVariable", isVariable.toString());
		}
	}

	public String getComefrom() {
		return this.comefrom;
	}

	public void setComefrom(String comefrom) {
		this.comefrom = comefrom;
		if(comefrom != null){
			putQueryParameter("Comefrom", comefrom);
		}
	}

	public String getPlatformId() {
		return this.platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
		if(platformId != null){
			putQueryParameter("PlatformId", platformId);
		}
	}

	public Long getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public String getColumnName() {
		return this.columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
		if(columnName != null){
			putQueryParameter("ColumnName", columnName);
		}
	}

	public String getAccessId() {
		return this.accessId;
	}

	public void setAccessId(String accessId) {
		this.accessId = accessId;
		if(accessId != null){
			putQueryParameter("AccessId", accessId);
		}
	}

	public Long getTemplateType() {
		return this.templateType;
	}

	public void setTemplateType(Long templateType) {
		this.templateType = templateType;
		if(templateType != null){
			putQueryParameter("TemplateType", templateType.toString());
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putQueryParameter("TenantId", tenantId);
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putQueryParameter("Keyword", keyword);
		}
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putQueryParameter("Order", order);
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putQueryParameter("WorkspaceId", workspaceId);
		}
	}

	@Override
	public Class<ListTemplatesResponse> getResponseClass() {
		return ListTemplatesResponse.class;
	}

}
