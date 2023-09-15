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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.domain.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryTaskDetailHistoryRequest extends RpcAcsRequest<QueryTaskDetailHistoryResponse> {
	   

	private String domainName;

	private Integer taskStatus;

	private String userClientIp;

	private String taskNo;

	private Integer pageSize;

	private String taskDetailNoCursor;

	private String lang;

	private String domainNameCursor;
	public QueryTaskDetailHistoryRequest() {
		super("Domain", "2018-01-29", "QueryTaskDetailHistory");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Integer getTaskStatus() {
		return this.taskStatus;
	}

	public void setTaskStatus(Integer taskStatus) {
		this.taskStatus = taskStatus;
		if(taskStatus != null){
			putQueryParameter("TaskStatus", taskStatus.toString());
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

	public String getTaskNo() {
		return this.taskNo;
	}

	public void setTaskNo(String taskNo) {
		this.taskNo = taskNo;
		if(taskNo != null){
			putQueryParameter("TaskNo", taskNo);
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

	public String getTaskDetailNoCursor() {
		return this.taskDetailNoCursor;
	}

	public void setTaskDetailNoCursor(String taskDetailNoCursor) {
		this.taskDetailNoCursor = taskDetailNoCursor;
		if(taskDetailNoCursor != null){
			putQueryParameter("TaskDetailNoCursor", taskDetailNoCursor);
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

	public String getDomainNameCursor() {
		return this.domainNameCursor;
	}

	public void setDomainNameCursor(String domainNameCursor) {
		this.domainNameCursor = domainNameCursor;
		if(domainNameCursor != null){
			putQueryParameter("DomainNameCursor", domainNameCursor);
		}
	}

	@Override
	public Class<QueryTaskDetailHistoryResponse> getResponseClass() {
		return QueryTaskDetailHistoryResponse.class;
	}

}
