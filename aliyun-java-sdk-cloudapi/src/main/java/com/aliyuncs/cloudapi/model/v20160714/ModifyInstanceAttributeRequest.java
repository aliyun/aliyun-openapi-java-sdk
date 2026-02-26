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

package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyInstanceAttributeRequest extends RpcAcsRequest<ModifyInstanceAttributeResponse> {
	   

	private String egressIpv6Enable;

	private String httpsPolicy;

	private String toConnectVpcIpBlock;

	private String maintainStartTime;

	private String vpcSlbIntranetEnable;

	private String deleteVpcIpBlock;

	private String intranetSegments;

	private String maintainEndTime;

	private String token;

	private String iPV6Enabled;

	private String instanceId;

	private String instanceName;
	public ModifyInstanceAttributeRequest() {
		super("CloudAPI", "2016-07-14", "ModifyInstanceAttribute", "apigateway");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEgressIpv6Enable() {
		return this.egressIpv6Enable;
	}

	public void setEgressIpv6Enable(String egressIpv6Enable) {
		this.egressIpv6Enable = egressIpv6Enable;
		if(egressIpv6Enable != null){
			putQueryParameter("EgressIpv6Enable", egressIpv6Enable);
		}
	}

	public String getHttpsPolicy() {
		return this.httpsPolicy;
	}

	public void setHttpsPolicy(String httpsPolicy) {
		this.httpsPolicy = httpsPolicy;
		if(httpsPolicy != null){
			putQueryParameter("HttpsPolicy", httpsPolicy);
		}
	}

	public String getToConnectVpcIpBlock() {
		return this.toConnectVpcIpBlock;
	}

	public void setToConnectVpcIpBlock(String toConnectVpcIpBlock) {
		this.toConnectVpcIpBlock = toConnectVpcIpBlock;
		if(toConnectVpcIpBlock != null){
			putQueryParameter("ToConnectVpcIpBlock", toConnectVpcIpBlock);
		}
	}

	public String getMaintainStartTime() {
		return this.maintainStartTime;
	}

	public void setMaintainStartTime(String maintainStartTime) {
		this.maintainStartTime = maintainStartTime;
		if(maintainStartTime != null){
			putQueryParameter("MaintainStartTime", maintainStartTime);
		}
	}

	public String getVpcSlbIntranetEnable() {
		return this.vpcSlbIntranetEnable;
	}

	public void setVpcSlbIntranetEnable(String vpcSlbIntranetEnable) {
		this.vpcSlbIntranetEnable = vpcSlbIntranetEnable;
		if(vpcSlbIntranetEnable != null){
			putQueryParameter("VpcSlbIntranetEnable", vpcSlbIntranetEnable);
		}
	}

	public String getDeleteVpcIpBlock() {
		return this.deleteVpcIpBlock;
	}

	public void setDeleteVpcIpBlock(String deleteVpcIpBlock) {
		this.deleteVpcIpBlock = deleteVpcIpBlock;
		if(deleteVpcIpBlock != null){
			putQueryParameter("DeleteVpcIpBlock", deleteVpcIpBlock);
		}
	}

	public String getIntranetSegments() {
		return this.intranetSegments;
	}

	public void setIntranetSegments(String intranetSegments) {
		this.intranetSegments = intranetSegments;
		if(intranetSegments != null){
			putQueryParameter("IntranetSegments", intranetSegments);
		}
	}

	public String getMaintainEndTime() {
		return this.maintainEndTime;
	}

	public void setMaintainEndTime(String maintainEndTime) {
		this.maintainEndTime = maintainEndTime;
		if(maintainEndTime != null){
			putQueryParameter("MaintainEndTime", maintainEndTime);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	public String getIPV6Enabled() {
		return this.iPV6Enabled;
	}

	public void setIPV6Enabled(String iPV6Enabled) {
		this.iPV6Enabled = iPV6Enabled;
		if(iPV6Enabled != null){
			putQueryParameter("IPV6Enabled", iPV6Enabled);
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

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("InstanceName", instanceName);
		}
	}

	@Override
	public Class<ModifyInstanceAttributeResponse> getResponseClass() {
		return ModifyInstanceAttributeResponse.class;
	}

}
