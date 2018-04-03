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

package com.aliyuncs.domain.model.v20180129;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryTransferInListRequest extends RpcAcsRequest<QueryTransferInListResponse> {
	
	public QueryTransferInListRequest() {
		super("Domain", "2018-01-29", "QueryTransferInList");
	}

	private Long submissionStartDate;

	private String userClientIp;

	private Long submissionEndDate;

	private String domainName;

	private String simpleTransferInStatus;

	private Integer pageSize;

	private String lang;

	private Integer pageNum;

	public Long getSubmissionStartDate() {
		return this.submissionStartDate;
	}

	public void setSubmissionStartDate(Long submissionStartDate) {
		this.submissionStartDate = submissionStartDate;
		if(submissionStartDate != null){
			putQueryParameter("SubmissionStartDate", submissionStartDate.toString());
		}
	}

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		if(userClientIp != null){
			putQueryParameter("UserClientIp", userClientIp);
		}
	}

	public Long getSubmissionEndDate() {
		return this.submissionEndDate;
	}

	public void setSubmissionEndDate(Long submissionEndDate) {
		this.submissionEndDate = submissionEndDate;
		if(submissionEndDate != null){
			putQueryParameter("SubmissionEndDate", submissionEndDate.toString());
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public String getSimpleTransferInStatus() {
		return this.simpleTransferInStatus;
	}

	public void setSimpleTransferInStatus(String simpleTransferInStatus) {
		this.simpleTransferInStatus = simpleTransferInStatus;
		if(simpleTransferInStatus != null){
			putQueryParameter("SimpleTransferInStatus", simpleTransferInStatus);
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

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
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

	@Override
	public Class<QueryTransferInListResponse> getResponseClass() {
		return QueryTransferInListResponse.class;
	}

}
