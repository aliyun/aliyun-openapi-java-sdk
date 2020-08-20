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

package com.aliyuncs.idrsservice.model.v20200630;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.idrsservice.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListDetectionsRequest extends RpcAcsRequest<ListDetectionsResponse> {
	   

	private String createDateTo;

	private String departmentId;

	private String recordingType;

	private String createDateFrom;

	private Integer pageSize;

	private Integer pageIndex;

	private String ruleId;
	public ListDetectionsRequest() {
		super("idrsservice", "2020-06-30", "ListDetections", "idrsservice");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCreateDateTo() {
		return this.createDateTo;
	}

	public void setCreateDateTo(String createDateTo) {
		this.createDateTo = createDateTo;
		if(createDateTo != null){
			putQueryParameter("CreateDateTo", createDateTo);
		}
	}

	public String getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
		if(departmentId != null){
			putQueryParameter("DepartmentId", departmentId);
		}
	}

	public String getRecordingType() {
		return this.recordingType;
	}

	public void setRecordingType(String recordingType) {
		this.recordingType = recordingType;
		if(recordingType != null){
			putQueryParameter("RecordingType", recordingType);
		}
	}

	public String getCreateDateFrom() {
		return this.createDateFrom;
	}

	public void setCreateDateFrom(String createDateFrom) {
		this.createDateFrom = createDateFrom;
		if(createDateFrom != null){
			putQueryParameter("CreateDateFrom", createDateFrom);
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

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putQueryParameter("PageIndex", pageIndex.toString());
		}
	}

	public String getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
		if(ruleId != null){
			putQueryParameter("RuleId", ruleId);
		}
	}

	@Override
	public Class<ListDetectionsResponse> getResponseClass() {
		return ListDetectionsResponse.class;
	}

}
