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

package com.aliyuncs.foas.model.v20181111;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.foas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateQueueRequest extends RoaAcsRequest<CreateQueueResponse> {
	   

	private String queueName;

	private Integer maxMemMB;

	private String clusterId;

	private Integer gpu;

	private Integer maxVcore;
	public CreateQueueRequest() {
		super("foas", "2018-11-11", "CreateQueue", "foas");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/api/v2/clusters/[clusterId]/queue");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getQueueName() {
		return this.queueName;
	}

	public void setQueueName(String queueName) {
		this.queueName = queueName;
		if(queueName != null){
			putBodyParameter("queueName", queueName);
		}
	}

	public Integer getMaxMemMB() {
		return this.maxMemMB;
	}

	public void setMaxMemMB(Integer maxMemMB) {
		this.maxMemMB = maxMemMB;
		if(maxMemMB != null){
			putBodyParameter("maxMemMB", maxMemMB.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putPathParameter("clusterId", clusterId);
		}
	}

	public Integer getGpu() {
		return this.gpu;
	}

	public void setGpu(Integer gpu) {
		this.gpu = gpu;
		if(gpu != null){
			putBodyParameter("gpu", gpu.toString());
		}
	}

	public Integer getMaxVcore() {
		return this.maxVcore;
	}

	public void setMaxVcore(Integer maxVcore) {
		this.maxVcore = maxVcore;
		if(maxVcore != null){
			putBodyParameter("maxVcore", maxVcore.toString());
		}
	}

	@Override
	public Class<CreateQueueResponse> getResponseClass() {
		return CreateQueueResponse.class;
	}

}
