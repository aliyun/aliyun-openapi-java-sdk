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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SwitchReplicationLinkRequest extends RpcAcsRequest<SwitchReplicationLinkResponse> {
	   

	private Long ownerId;

	private String targetInstanceRegionId;

	private String targetInstanceName;

	private String dBInstanceId;
	public SwitchReplicationLinkRequest() {
		super("Rds", "2014-08-15", "SwitchReplicationLink", "rds");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getTargetInstanceRegionId() {
		return this.targetInstanceRegionId;
	}

	public void setTargetInstanceRegionId(String targetInstanceRegionId) {
		this.targetInstanceRegionId = targetInstanceRegionId;
		if(targetInstanceRegionId != null){
			putQueryParameter("TargetInstanceRegionId", targetInstanceRegionId);
		}
	}

	public String getTargetInstanceName() {
		return this.targetInstanceName;
	}

	public void setTargetInstanceName(String targetInstanceName) {
		this.targetInstanceName = targetInstanceName;
		if(targetInstanceName != null){
			putQueryParameter("TargetInstanceName", targetInstanceName);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	@Override
	public Class<SwitchReplicationLinkResponse> getResponseClass() {
		return SwitchReplicationLinkResponse.class;
	}

}
