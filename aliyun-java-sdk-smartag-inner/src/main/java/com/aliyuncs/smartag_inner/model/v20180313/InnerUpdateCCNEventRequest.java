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
public class InnerUpdateCCNEventRequest extends RpcAcsRequest<InnerUpdateCCNEventResponse> {
	
	public InnerUpdateCCNEventRequest() {
		super("Smartag-inner", "2018-03-13", "InnerUpdateCCNEvent", "smartag", "innerAPI");
	}

	private String access_key_id;

	private String dataSchemaNamespace;

	private Long handledTimes;

	private String data;

	private String sourceNamespace;

	private String delayPolicy;

	private String timeoutRetryPolicy;

	private String regionNo;

	private String instanceId;

	private String namespace;

	private Long maxHandleTimes;

	private String sourceInstanceId;

	private String state;

	public String getAccess_key_id() {
		return this.access_key_id;
	}

	public void setAccess_key_id(String access_key_id) {
		this.access_key_id = access_key_id;
		if(access_key_id != null){
			putQueryParameter("access_key_id", access_key_id);
		}
	}

	public String getDataSchemaNamespace() {
		return this.dataSchemaNamespace;
	}

	public void setDataSchemaNamespace(String dataSchemaNamespace) {
		this.dataSchemaNamespace = dataSchemaNamespace;
		if(dataSchemaNamespace != null){
			putQueryParameter("DataSchemaNamespace", dataSchemaNamespace);
		}
	}

	public Long getHandledTimes() {
		return this.handledTimes;
	}

	public void setHandledTimes(Long handledTimes) {
		this.handledTimes = handledTimes;
		if(handledTimes != null){
			putQueryParameter("HandledTimes", handledTimes.toString());
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

	public String getSourceNamespace() {
		return this.sourceNamespace;
	}

	public void setSourceNamespace(String sourceNamespace) {
		this.sourceNamespace = sourceNamespace;
		if(sourceNamespace != null){
			putQueryParameter("SourceNamespace", sourceNamespace);
		}
	}

	public String getDelayPolicy() {
		return this.delayPolicy;
	}

	public void setDelayPolicy(String delayPolicy) {
		this.delayPolicy = delayPolicy;
		if(delayPolicy != null){
			putQueryParameter("DelayPolicy", delayPolicy);
		}
	}

	public String getTimeoutRetryPolicy() {
		return this.timeoutRetryPolicy;
	}

	public void setTimeoutRetryPolicy(String timeoutRetryPolicy) {
		this.timeoutRetryPolicy = timeoutRetryPolicy;
		if(timeoutRetryPolicy != null){
			putQueryParameter("TimeoutRetryPolicy", timeoutRetryPolicy);
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

	public Long getMaxHandleTimes() {
		return this.maxHandleTimes;
	}

	public void setMaxHandleTimes(Long maxHandleTimes) {
		this.maxHandleTimes = maxHandleTimes;
		if(maxHandleTimes != null){
			putQueryParameter("MaxHandleTimes", maxHandleTimes.toString());
		}
	}

	public String getSourceInstanceId() {
		return this.sourceInstanceId;
	}

	public void setSourceInstanceId(String sourceInstanceId) {
		this.sourceInstanceId = sourceInstanceId;
		if(sourceInstanceId != null){
			putQueryParameter("SourceInstanceId", sourceInstanceId);
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

	@Override
	public Class<InnerUpdateCCNEventResponse> getResponseClass() {
		return InnerUpdateCCNEventResponse.class;
	}

}
