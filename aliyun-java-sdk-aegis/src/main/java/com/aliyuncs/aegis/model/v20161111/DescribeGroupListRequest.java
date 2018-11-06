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
public class DescribeGroupListRequest extends RpcAcsRequest<DescribeGroupListResponse> {
	
	public DescribeGroupListRequest() {
		super("aegis", "2016-11-11", "DescribeGroupList", "vipaegis");
	}

	private String warnLevel;

	private String sourceIp;

	private Long ruleGroupId;

	private Integer pageSize;

	private Integer currentPage;

	private String lang;

	private Long exGroupId;

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

	public Long getRuleGroupId() {
		return this.ruleGroupId;
	}

	public void setRuleGroupId(Long ruleGroupId) {
		this.ruleGroupId = ruleGroupId;
		if(ruleGroupId != null){
			putQueryParameter("RuleGroupId", ruleGroupId.toString());
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

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
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

	public Long getExGroupId() {
		return this.exGroupId;
	}

	public void setExGroupId(Long exGroupId) {
		this.exGroupId = exGroupId;
		if(exGroupId != null){
			putQueryParameter("ExGroupId", exGroupId.toString());
		}
	}

	@Override
	public Class<DescribeGroupListResponse> getResponseClass() {
		return DescribeGroupListResponse.class;
	}

}
