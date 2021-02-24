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

package com.aliyuncs.scsp.model.v20200702;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.scsp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetCMSIdByForeignIdRequest extends RpcAcsRequest<GetCMSIdByForeignIdResponse> {
	   

	private String nick;

	private Long sourceId;

	private String foreignId;

	private String instanceId;
	public GetCMSIdByForeignIdRequest() {
		super("scsp", "2020-07-02", "GetCMSIdByForeignId");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNick() {
		return this.nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
		if(nick != null){
			putQueryParameter("Nick", nick);
		}
	}

	public Long getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(Long sourceId) {
		this.sourceId = sourceId;
		if(sourceId != null){
			putQueryParameter("SourceId", sourceId.toString());
		}
	}

	public String getForeignId() {
		return this.foreignId;
	}

	public void setForeignId(String foreignId) {
		this.foreignId = foreignId;
		if(foreignId != null){
			putQueryParameter("ForeignId", foreignId);
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
	public Class<GetCMSIdByForeignIdResponse> getResponseClass() {
		return GetCMSIdByForeignIdResponse.class;
	}

}
