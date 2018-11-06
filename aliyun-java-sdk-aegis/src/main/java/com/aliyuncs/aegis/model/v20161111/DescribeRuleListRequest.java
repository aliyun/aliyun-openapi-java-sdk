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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeRuleListRequest extends RpcAcsRequest<DescribeRuleListResponse> {
	
	public DescribeRuleListRequest() {
		super("aegis", "2016-11-11", "DescribeRuleList", "vipaegis");
	}

	private String warnLevel;

	private String sourceIp;

	private Long groupId;

	private Integer pageSize;

	private String remark;

	private Integer currentPage;

	private Long id;

	private String lang;

	private String exGroupId;

	public String getWarnLevel() {
		return this.warnLevel;
	}

	public void setWarnLevel(String warnLevel) {
		this.warnLevel = warnLevel;
		if(warnLevel != null){
			putQueryParameter("WarnLevel", warnLevel);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId.toString());
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

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getExGroupId() {
		return this.exGroupId;
	}

	public void setExGroupId(String exGroupId) {
		this.exGroupId = exGroupId;
		if(exGroupId != null){
			putQueryParameter("ExGroupId", exGroupId);
		}
	}

	@Override
	public Class<DescribeRuleListResponse> getResponseClass() {
		return DescribeRuleListResponse.class;
	}

}
