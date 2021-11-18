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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListProxySQLExecAuditLogRequest extends RpcAcsRequest<ListProxySQLExecAuditLogResponse> {
	   

	private String sQLType;

	private String searchName;

	private String opUserName;

	private Long endTime;

	private Long startTime;

	private Integer pageNumber;

	private Long tid;

	private Integer pageSize;

	private String execState;
	public ListProxySQLExecAuditLogRequest() {
		super("dms-enterprise", "2018-11-01", "ListProxySQLExecAuditLog", "dms-enterprise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSQLType() {
		return this.sQLType;
	}

	public void setSQLType(String sQLType) {
		this.sQLType = sQLType;
		if(sQLType != null){
			putQueryParameter("SQLType", sQLType);
		}
	}

	public String getSearchName() {
		return this.searchName;
	}

	public void setSearchName(String searchName) {
		this.searchName = searchName;
		if(searchName != null){
			putQueryParameter("SearchName", searchName);
		}
	}

	public String getOpUserName() {
		return this.opUserName;
	}

	public void setOpUserName(String opUserName) {
		this.opUserName = opUserName;
		if(opUserName != null){
			putQueryParameter("OpUserName", opUserName);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
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

	public String getExecState() {
		return this.execState;
	}

	public void setExecState(String execState) {
		this.execState = execState;
		if(execState != null){
			putQueryParameter("ExecState", execState);
		}
	}

	@Override
	public Class<ListProxySQLExecAuditLogResponse> getResponseClass() {
		return ListProxySQLExecAuditLogResponse.class;
	}

}
