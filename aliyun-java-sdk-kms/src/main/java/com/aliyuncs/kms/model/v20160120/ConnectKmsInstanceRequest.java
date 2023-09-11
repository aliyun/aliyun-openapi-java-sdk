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

package com.aliyuncs.kms.model.v20160120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.kms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ConnectKmsInstanceRequest extends RpcAcsRequest<ConnectKmsInstanceResponse> {
	   

	private String kmsInstanceId;

	private String vSwitchIds;

	private String kMProvider;

	private String zoneIds;

	private String vpcId;
	public ConnectKmsInstanceRequest() {
		super("Kms", "2016-01-20", "ConnectKmsInstance", "kms");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getKmsInstanceId() {
		return this.kmsInstanceId;
	}

	public void setKmsInstanceId(String kmsInstanceId) {
		this.kmsInstanceId = kmsInstanceId;
		if(kmsInstanceId != null){
			putQueryParameter("KmsInstanceId", kmsInstanceId);
		}
	}

	public String getVSwitchIds() {
		return this.vSwitchIds;
	}

	public void setVSwitchIds(String vSwitchIds) {
		this.vSwitchIds = vSwitchIds;
		if(vSwitchIds != null){
			putQueryParameter("VSwitchIds", vSwitchIds);
		}
	}

	public String getKMProvider() {
		return this.kMProvider;
	}

	public void setKMProvider(String kMProvider) {
		this.kMProvider = kMProvider;
		if(kMProvider != null){
			putQueryParameter("KMProvider", kMProvider);
		}
	}

	public String getZoneIds() {
		return this.zoneIds;
	}

	public void setZoneIds(String zoneIds) {
		this.zoneIds = zoneIds;
		if(zoneIds != null){
			putQueryParameter("ZoneIds", zoneIds);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	@Override
	public Class<ConnectKmsInstanceResponse> getResponseClass() {
		return ConnectKmsInstanceResponse.class;
	}

}
