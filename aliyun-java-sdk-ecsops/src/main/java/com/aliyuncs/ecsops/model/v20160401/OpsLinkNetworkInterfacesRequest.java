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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsLinkNetworkInterfacesRequest extends RpcAcsRequest<OpsLinkNetworkInterfacesResponse> {
	   

	private String operator;

	private String destNetworkInterfaceId;

	private Long aliUid;

	private List<SrcNetworkInterface> srcNetworkInterfaces;

	private String workOrderId;

	private String bid;

	private String auditParamStr;
	public OpsLinkNetworkInterfacesRequest() {
		super("Ecsops", "2016-04-01", "OpsLinkNetworkInterfaces", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public String getDestNetworkInterfaceId() {
		return this.destNetworkInterfaceId;
	}

	public void setDestNetworkInterfaceId(String destNetworkInterfaceId) {
		this.destNetworkInterfaceId = destNetworkInterfaceId;
		if(destNetworkInterfaceId != null){
			putQueryParameter("DestNetworkInterfaceId", destNetworkInterfaceId);
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
		}
	}

	public List<SrcNetworkInterface> getSrcNetworkInterfaces() {
		return this.srcNetworkInterfaces;
	}

	public void setSrcNetworkInterfaces(List<SrcNetworkInterface> srcNetworkInterfaces) {
		this.srcNetworkInterfaces = srcNetworkInterfaces;	
		if (srcNetworkInterfaces != null) {
			for (int depth1 = 0; depth1 < srcNetworkInterfaces.size(); depth1++) {
				putQueryParameter("SrcNetworkInterface." + (depth1 + 1) + ".VlanId" , srcNetworkInterfaces.get(depth1).getVlanId());
				putQueryParameter("SrcNetworkInterface." + (depth1 + 1) + ".NetworkInterfaceId" , srcNetworkInterfaces.get(depth1).getNetworkInterfaceId());
			}
		}	
	}

	public String getWorkOrderId() {
		return this.workOrderId;
	}

	public void setWorkOrderId(String workOrderId) {
		this.workOrderId = workOrderId;
		if(workOrderId != null){
			putQueryParameter("WorkOrderId", workOrderId);
		}
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		if(bid != null){
			putQueryParameter("Bid", bid);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	public static class SrcNetworkInterface {

		private Integer vlanId;

		private String networkInterfaceId;

		public Integer getVlanId() {
			return this.vlanId;
		}

		public void setVlanId(Integer vlanId) {
			this.vlanId = vlanId;
		}

		public String getNetworkInterfaceId() {
			return this.networkInterfaceId;
		}

		public void setNetworkInterfaceId(String networkInterfaceId) {
			this.networkInterfaceId = networkInterfaceId;
		}
	}

	@Override
	public Class<OpsLinkNetworkInterfacesResponse> getResponseClass() {
		return OpsLinkNetworkInterfacesResponse.class;
	}

}
