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

package com.aliyuncs.alikafka.model.v20190916;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alikafka.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpgradePrePayOrderRequest extends RpcAcsRequest<UpgradePrePayOrderResponse> {
	   

	private Integer diskSize;

	private Integer ioMax;

	private Integer topicQuota;

	private Integer eipMax;

	private String specType;

	private String instanceId;
	public UpgradePrePayOrderRequest() {
		super("alikafka", "2019-09-16", "UpgradePrePayOrder", "alikafka");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getDiskSize() {
		return this.diskSize;
	}

	public void setDiskSize(Integer diskSize) {
		this.diskSize = diskSize;
		if(diskSize != null){
			putQueryParameter("DiskSize", diskSize.toString());
		}
	}

	public Integer getIoMax() {
		return this.ioMax;
	}

	public void setIoMax(Integer ioMax) {
		this.ioMax = ioMax;
		if(ioMax != null){
			putQueryParameter("IoMax", ioMax.toString());
		}
	}

	public Integer getTopicQuota() {
		return this.topicQuota;
	}

	public void setTopicQuota(Integer topicQuota) {
		this.topicQuota = topicQuota;
		if(topicQuota != null){
			putQueryParameter("TopicQuota", topicQuota.toString());
		}
	}

	public Integer getEipMax() {
		return this.eipMax;
	}

	public void setEipMax(Integer eipMax) {
		this.eipMax = eipMax;
		if(eipMax != null){
			putQueryParameter("EipMax", eipMax.toString());
		}
	}

	public String getSpecType() {
		return this.specType;
	}

	public void setSpecType(String specType) {
		this.specType = specType;
		if(specType != null){
			putQueryParameter("SpecType", specType);
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

	@Override
	public Class<UpgradePrePayOrderResponse> getResponseClass() {
		return UpgradePrePayOrderResponse.class;
	}

}
