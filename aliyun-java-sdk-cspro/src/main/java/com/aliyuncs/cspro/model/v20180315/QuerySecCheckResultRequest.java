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

package com.aliyuncs.cspro.model.v20180315;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QuerySecCheckResultRequest extends RpcAcsRequest<QuerySecCheckResultResponse> {
	   

	private String checkType;

	private Long endDate;

	private Integer pageSize;

	private Integer currentPage;

	private Long startDate;

	private String checkTarget;

	private String confType;
	public QuerySecCheckResultRequest() {
		super("cspro", "2018-03-15", "QuerySecCheckResult", "cspro");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getCheckType() {
		return this.checkType;
	}

	public void setCheckType(String checkType) {
		this.checkType = checkType;
		if(checkType != null){
			putBodyParameter("CheckType", checkType);
		}
	}

	public Long getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Long endDate) {
		this.endDate = endDate;
		if(endDate != null){
			putBodyParameter("EndDate", endDate.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putBodyParameter("CurrentPage", currentPage.toString());
		}
	}

	public Long getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Long startDate) {
		this.startDate = startDate;
		if(startDate != null){
			putBodyParameter("StartDate", startDate.toString());
		}
	}

	public String getCheckTarget() {
		return this.checkTarget;
	}

	public void setCheckTarget(String checkTarget) {
		this.checkTarget = checkTarget;
		if(checkTarget != null){
			putBodyParameter("CheckTarget", checkTarget);
		}
	}

	public String getConfType() {
		return this.confType;
	}

	public void setConfType(String confType) {
		this.confType = confType;
		if(confType != null){
			putBodyParameter("ConfType", confType);
		}
	}

	@Override
	public Class<QuerySecCheckResultResponse> getResponseClass() {
		return QuerySecCheckResultResponse.class;
	}

}
