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
public class InnerRescheduleCCNEventRequest extends RpcAcsRequest<InnerRescheduleCCNEventResponse> {
	
	public InnerRescheduleCCNEventRequest() {
		super("Smartag-inner", "2018-03-13", "InnerRescheduleCCNEvent", "smartag", "innerAPI");
	}

	private String access_key_id;

	private String instanceId;

	private Long delay;

	private String namespace;

	private String timeUnit;

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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Long getDelay() {
		return this.delay;
	}

	public void setDelay(Long delay) {
		this.delay = delay;
		if(delay != null){
			putQueryParameter("Delay", delay.toString());
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

	public String getTimeUnit() {
		return this.timeUnit;
	}

	public void setTimeUnit(String timeUnit) {
		this.timeUnit = timeUnit;
		if(timeUnit != null){
			putQueryParameter("TimeUnit", timeUnit);
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
	public Class<InnerRescheduleCCNEventResponse> getResponseClass() {
		return InnerRescheduleCCNEventResponse.class;
	}

}
