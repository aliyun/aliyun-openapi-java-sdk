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

package com.aliyuncs.dg.model.v20190327;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dg.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDatabaseAccessPointRequest extends RpcAcsRequest<CreateDatabaseAccessPointResponse> {
	   

	private String vpcAZone;

	private String clientToken;

	private String dbInstanceId;

	private String vpcRegionId;

	private String vSwitchId;

	private String vpcId;
	public CreateDatabaseAccessPointRequest() {
		super("dg", "2019-03-27", "CreateDatabaseAccessPoint", "dg");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getVpcAZone() {
		return this.vpcAZone;
	}

	public void setVpcAZone(String vpcAZone) {
		this.vpcAZone = vpcAZone;
		if(vpcAZone != null){
			putBodyParameter("VpcAZone", vpcAZone);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public String getDbInstanceId() {
		return this.dbInstanceId;
	}

	public void setDbInstanceId(String dbInstanceId) {
		this.dbInstanceId = dbInstanceId;
		if(dbInstanceId != null){
			putBodyParameter("DbInstanceId", dbInstanceId);
		}
	}

	public String getVpcRegionId() {
		return this.vpcRegionId;
	}

	public void setVpcRegionId(String vpcRegionId) {
		this.vpcRegionId = vpcRegionId;
		if(vpcRegionId != null){
			putBodyParameter("VpcRegionId", vpcRegionId);
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putBodyParameter("VSwitchId", vSwitchId);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putBodyParameter("VpcId", vpcId);
		}
	}

	@Override
	public Class<CreateDatabaseAccessPointResponse> getResponseClass() {
		return CreateDatabaseAccessPointResponse.class;
	}

}
