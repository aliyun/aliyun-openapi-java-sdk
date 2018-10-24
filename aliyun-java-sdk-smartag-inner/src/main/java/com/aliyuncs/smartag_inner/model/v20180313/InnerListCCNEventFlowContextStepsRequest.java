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
public class InnerListCCNEventFlowContextStepsRequest extends RpcAcsRequest<InnerListCCNEventFlowContextStepsResponse> {
	
	public InnerListCCNEventFlowContextStepsRequest() {
		super("Smartag-inner", "2018-03-13", "InnerListCCNEventFlowContextSteps", "smartag", "innerAPI");
	}

	private String access_key_id;

	private String contextNamespace;

	private String instanceId;

	private String namespace;

	private Integer pageSize;

	private String state;

	private String contextInstanceId;

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

	public String getContextNamespace() {
		return this.contextNamespace;
	}

	public void setContextNamespace(String contextNamespace) {
		this.contextNamespace = contextNamespace;
		if(contextNamespace != null){
			putQueryParameter("ContextNamespace", contextNamespace);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
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

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		if(state != null){
			putQueryParameter("State", state);
		}
	}

	public String getContextInstanceId() {
		return this.contextInstanceId;
	}

	public void setContextInstanceId(String contextInstanceId) {
		this.contextInstanceId = contextInstanceId;
		if(contextInstanceId != null){
			putQueryParameter("ContextInstanceId", contextInstanceId);
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
	public Class<InnerListCCNEventFlowContextStepsResponse> getResponseClass() {
		return InnerListCCNEventFlowContextStepsResponse.class;
	}

}
