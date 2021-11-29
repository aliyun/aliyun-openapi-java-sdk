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

package com.aliyuncs.dcdn.model.v20180115;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dcdn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetDcdnFullDomainsBlockIPRequest extends RpcAcsRequest<SetDcdnFullDomainsBlockIPResponse> {
	   

	private String iPList;

	private Integer blockInterval;

	private String operationType;

	private Long ownerId;
	public SetDcdnFullDomainsBlockIPRequest() {
		super("dcdn", "2018-01-15", "SetDcdnFullDomainsBlockIP");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIPList() {
		return this.iPList;
	}

	public void setIPList(String iPList) {
		this.iPList = iPList;
		if(iPList != null){
			putBodyParameter("IPList", iPList);
		}
	}

	public Integer getBlockInterval() {
		return this.blockInterval;
	}

	public void setBlockInterval(Integer blockInterval) {
		this.blockInterval = blockInterval;
		if(blockInterval != null){
			putBodyParameter("BlockInterval", blockInterval.toString());
		}
	}

	public String getOperationType() {
		return this.operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
		if(operationType != null){
			putBodyParameter("OperationType", operationType);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	@Override
	public Class<SetDcdnFullDomainsBlockIPResponse> getResponseClass() {
		return SetDcdnFullDomainsBlockIPResponse.class;
	}

}
