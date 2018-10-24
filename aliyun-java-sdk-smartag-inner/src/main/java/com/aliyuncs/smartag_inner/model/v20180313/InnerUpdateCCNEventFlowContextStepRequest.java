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
public class InnerUpdateCCNEventFlowContextStepRequest extends RpcAcsRequest<InnerUpdateCCNEventFlowContextStepResponse> {
	
	public InnerUpdateCCNEventFlowContextStepRequest() {
		super("Smartag-inner", "2018-03-13", "InnerUpdateCCNEventFlowContextStep", "smartag", "innerAPI");
	}

	private String access_key_id;

	private String contextNamespace;

	private String instanceId;

	private String data;

	private String namespace;

	private String step;

	private String state;

	private String message;

	private String contextInstanceId;

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

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
		if(data != null){
			putQueryParameter("Data", data);
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

	public String getStep() {
		return this.step;
	}

	public void setStep(String step) {
		this.step = step;
		if(step != null){
			putQueryParameter("Step", step);
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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
		if(message != null){
			putQueryParameter("Message", message);
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
	public Class<InnerUpdateCCNEventFlowContextStepResponse> getResponseClass() {
		return InnerUpdateCCNEventFlowContextStepResponse.class;
	}

}
