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

package com.aliyuncs.eflo.model.v20220530;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListLniPrivateIpAddressRequest extends RpcAcsRequest<ListLniPrivateIpAddressResponse> {
	   

	private String clientToken;

	private Integer pageNumber;

	private Integer pageSize;

	private String nodeId;

	private String subnetId;

	private String ip;

	private String vpdId;

	private Boolean enablePage;

	private String networkInterfaceId;
	public ListLniPrivateIpAddressRequest() {
		super("eflo", "2022-05-30", "ListLniPrivateIpAddress", "eflo");
		setMethod(MethodType.POST);
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
		if(nodeId != null){
			putBodyParameter("NodeId", nodeId);
		}
	}

	public String getSubnetId() {
		return this.subnetId;
	}

	public void setSubnetId(String subnetId) {
		this.subnetId = subnetId;
		if(subnetId != null){
			putBodyParameter("SubnetId", subnetId);
		}
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
		if(ip != null){
			putBodyParameter("Ip", ip);
		}
	}

	public String getVpdId() {
		return this.vpdId;
	}

	public void setVpdId(String vpdId) {
		this.vpdId = vpdId;
		if(vpdId != null){
			putBodyParameter("VpdId", vpdId);
		}
	}

	public Boolean getEnablePage() {
		return this.enablePage;
	}

	public void setEnablePage(Boolean enablePage) {
		this.enablePage = enablePage;
		if(enablePage != null){
			putBodyParameter("EnablePage", enablePage.toString());
		}
	}

	public String getNetworkInterfaceId() {
		return this.networkInterfaceId;
	}

	public void setNetworkInterfaceId(String networkInterfaceId) {
		this.networkInterfaceId = networkInterfaceId;
		if(networkInterfaceId != null){
			putBodyParameter("NetworkInterfaceId", networkInterfaceId);
		}
	}

	@Override
	public Class<ListLniPrivateIpAddressResponse> getResponseClass() {
		return ListLniPrivateIpAddressResponse.class;
	}

}
