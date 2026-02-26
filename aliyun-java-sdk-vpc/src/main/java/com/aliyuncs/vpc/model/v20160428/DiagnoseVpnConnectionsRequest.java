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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DiagnoseVpnConnectionsRequest extends RpcAcsRequest<DiagnoseVpnConnectionsResponse> {
	   

	private List<String> tunnelIdss;

	private Long resourceOwnerId;

	private String vpnGatewayId;

	private Integer pageNumber;

	private List<String> vpnConnectionIdss;

	private Integer pageSize;
	public DiagnoseVpnConnectionsRequest() {
		super("Vpc", "2016-04-28", "DiagnoseVpnConnections", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getTunnelIdss() {
		return this.tunnelIdss;
	}

	public void setTunnelIdss(List<String> tunnelIdss) {
		this.tunnelIdss = tunnelIdss;	
		if (tunnelIdss != null) {
			for (int i = 0; i < tunnelIdss.size(); i++) {
				putQueryParameter("TunnelIds." + (i + 1) , tunnelIdss.get(i));
			}
		}	
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getVpnGatewayId() {
		return this.vpnGatewayId;
	}

	public void setVpnGatewayId(String vpnGatewayId) {
		this.vpnGatewayId = vpnGatewayId;
		if(vpnGatewayId != null){
			putQueryParameter("VpnGatewayId", vpnGatewayId);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public List<String> getVpnConnectionIdss() {
		return this.vpnConnectionIdss;
	}

	public void setVpnConnectionIdss(List<String> vpnConnectionIdss) {
		this.vpnConnectionIdss = vpnConnectionIdss;	
		if (vpnConnectionIdss != null) {
			for (int i = 0; i < vpnConnectionIdss.size(); i++) {
				putQueryParameter("VpnConnectionIds." + (i + 1) , vpnConnectionIdss.get(i));
			}
		}	
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	@Override
	public Class<DiagnoseVpnConnectionsResponse> getResponseClass() {
		return DiagnoseVpnConnectionsResponse.class;
	}

}
