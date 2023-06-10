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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateHoneypotRequest extends RpcAcsRequest<CreateHoneypotResponse> {
	   

	private String honeypotName;

	private String nodeId;

	private String honeypotImageId;

	private String meta;

	private String honeypotImageName;
	public CreateHoneypotRequest() {
		super("Sas", "2018-12-03", "CreateHoneypot", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getHoneypotName() {
		return this.honeypotName;
	}

	public void setHoneypotName(String honeypotName) {
		this.honeypotName = honeypotName;
		if(honeypotName != null){
			putQueryParameter("HoneypotName", honeypotName);
		}
	}

	public String getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
		if(nodeId != null){
			putQueryParameter("NodeId", nodeId);
		}
	}

	public String getHoneypotImageId() {
		return this.honeypotImageId;
	}

	public void setHoneypotImageId(String honeypotImageId) {
		this.honeypotImageId = honeypotImageId;
		if(honeypotImageId != null){
			putQueryParameter("HoneypotImageId", honeypotImageId);
		}
	}

	public String getMeta() {
		return this.meta;
	}

	public void setMeta(String meta) {
		this.meta = meta;
		if(meta != null){
			putQueryParameter("Meta", meta);
		}
	}

	public String getHoneypotImageName() {
		return this.honeypotImageName;
	}

	public void setHoneypotImageName(String honeypotImageName) {
		this.honeypotImageName = honeypotImageName;
		if(honeypotImageName != null){
			putQueryParameter("HoneypotImageName", honeypotImageName);
		}
	}

	@Override
	public Class<CreateHoneypotResponse> getResponseClass() {
		return CreateHoneypotResponse.class;
	}

}
