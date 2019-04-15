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
public class DescribeWhiteListProcessRequest extends RpcAcsRequest<DescribeWhiteListProcessResponse> {
	
	public DescribeWhiteListProcessRequest() {
		super("aegis", "2016-11-11", "DescribeWhiteListProcess", "vipaegis");
	}

	private String sourceIp;

	private String processName;

	private Integer pageSize;

	private Integer processType;

	private Integer orderBy;

	private Long strategyId;

	private Integer currentPage;

	private String lang;

	private Integer desc;

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getProcessName() {
		return this.processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
		if(processName != null){
			putQueryParameter("ProcessName", processName);
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

	public Integer getProcessType() {
		return this.processType;
	}

	public void setProcessType(Integer processType) {
		this.processType = processType;
		if(processType != null){
			putQueryParameter("ProcessType", processType.toString());
		}
	}

	public Integer getOrderBy() {
		return this.orderBy;
	}

	public void setOrderBy(Integer orderBy) {
		this.orderBy = orderBy;
		if(orderBy != null){
			putQueryParameter("OrderBy", orderBy.toString());
		}
	}

	public Long getStrategyId() {
		return this.strategyId;
	}

	public void setStrategyId(Long strategyId) {
		this.strategyId = strategyId;
		if(strategyId != null){
			putQueryParameter("StrategyId", strategyId.toString());
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

	public Integer getDesc() {
		return this.desc;
	}

	public void setDesc(Integer desc) {
		this.desc = desc;
		if(desc != null){
			putQueryParameter("Desc", desc.toString());
		}
	}

	@Override
	public Class<DescribeWhiteListProcessResponse> getResponseClass() {
		return DescribeWhiteListProcessResponse.class;
	}

}
