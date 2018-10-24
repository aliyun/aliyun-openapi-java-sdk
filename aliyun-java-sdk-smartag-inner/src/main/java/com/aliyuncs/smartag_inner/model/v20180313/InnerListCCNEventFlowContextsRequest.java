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

package com.aliyuncs.smartag_inner.model.v20180313;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class InnerListCCNEventFlowContextsRequest extends RpcAcsRequest<InnerListCCNEventFlowContextsResponse> {
	
	public InnerListCCNEventFlowContextsRequest() {
		super("Smartag-inner", "2018-03-13", "InnerListCCNEventFlowContexts", "smartag", "innerAPI");
	}

	private String access_key_id;

	private String eventState;

	private String flowContextNamespace;

	private Integer pageSize;

	private String eventNamespace;

	private String flowContextInstanceId;

	private String eventInstanceId;

	private String flowContextState;

	private Integer pageNumber;

	private String regionNo;

	public String getAccess_key_id() {
		return this.access_key_id;
	}

	public void setAccess_key_id(String access_key_id) {
		this.access_key_id = access_key_id;
		if(access_key_id != null){
			putQueryParameter("access_key_id", access_key_id);
		}
	}

	public String getEventState() {
		return this.eventState;
	}

	public void setEventState(String eventState) {
		this.eventState = eventState;
		if(eventState != null){
			putQueryParameter("EventState", eventState);
		}
	}

	public String getFlowContextNamespace() {
		return this.flowContextNamespace;
	}

	public void setFlowContextNamespace(String flowContextNamespace) {
		this.flowContextNamespace = flowContextNamespace;
		if(flowContextNamespace != null){
			putQueryParameter("FlowContextNamespace", flowContextNamespace);
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

	public String getEventNamespace() {
		return this.eventNamespace;
	}

	public void setEventNamespace(String eventNamespace) {
		this.eventNamespace = eventNamespace;
		if(eventNamespace != null){
			putQueryParameter("EventNamespace", eventNamespace);
		}
	}

	public String getFlowContextInstanceId() {
		return this.flowContextInstanceId;
	}

	public void setFlowContextInstanceId(String flowContextInstanceId) {
		this.flowContextInstanceId = flowContextInstanceId;
		if(flowContextInstanceId != null){
			putQueryParameter("FlowContextInstanceId", flowContextInstanceId);
		}
	}

	public String getEventInstanceId() {
		return this.eventInstanceId;
	}

	public void setEventInstanceId(String eventInstanceId) {
		this.eventInstanceId = eventInstanceId;
		if(eventInstanceId != null){
			putQueryParameter("EventInstanceId", eventInstanceId);
		}
	}

	public String getFlowContextState() {
		return this.flowContextState;
	}

	public void setFlowContextState(String flowContextState) {
		this.flowContextState = flowContextState;
		if(flowContextState != null){
			putQueryParameter("FlowContextState", flowContextState);
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

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("RegionNo", regionNo);
		}
	}

	@Override
	public Class<InnerListCCNEventFlowContextsResponse> getResponseClass() {
		return InnerListCCNEventFlowContextsResponse.class;
	}

}
