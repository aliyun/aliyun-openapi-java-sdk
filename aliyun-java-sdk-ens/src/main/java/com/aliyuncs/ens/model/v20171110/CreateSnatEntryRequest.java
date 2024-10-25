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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateSnatEntryRequest extends RpcAcsRequest<CreateSnatEntryResponse> {
	   

	private String snatIp;

	private String sourceVSwitchId;

	private String sourceNetworkId;

	private String standbySnatIp;

	private String sourceCIDR;

	private String natGatewayId;

	private Integer idleTimeout;

	private String snatEntryName;
	public CreateSnatEntryRequest() {
		super("Ens", "2017-11-10", "CreateSnatEntry", "ens");
		setMethod(MethodType.POST);
	}

	public String getSnatIp() {
		return this.snatIp;
	}

	public void setSnatIp(String snatIp) {
		this.snatIp = snatIp;
		if(snatIp != null){
			putQueryParameter("SnatIp", snatIp);
		}
	}

	public String getSourceVSwitchId() {
		return this.sourceVSwitchId;
	}

	public void setSourceVSwitchId(String sourceVSwitchId) {
		this.sourceVSwitchId = sourceVSwitchId;
		if(sourceVSwitchId != null){
			putQueryParameter("SourceVSwitchId", sourceVSwitchId);
		}
	}

	public String getSourceNetworkId() {
		return this.sourceNetworkId;
	}

	public void setSourceNetworkId(String sourceNetworkId) {
		this.sourceNetworkId = sourceNetworkId;
		if(sourceNetworkId != null){
			putQueryParameter("SourceNetworkId", sourceNetworkId);
		}
	}

	public String getStandbySnatIp() {
		return this.standbySnatIp;
	}

	public void setStandbySnatIp(String standbySnatIp) {
		this.standbySnatIp = standbySnatIp;
		if(standbySnatIp != null){
			putQueryParameter("StandbySnatIp", standbySnatIp);
		}
	}

	public String getSourceCIDR() {
		return this.sourceCIDR;
	}

	public void setSourceCIDR(String sourceCIDR) {
		this.sourceCIDR = sourceCIDR;
		if(sourceCIDR != null){
			putQueryParameter("SourceCIDR", sourceCIDR);
		}
	}

	public String getNatGatewayId() {
		return this.natGatewayId;
	}

	public void setNatGatewayId(String natGatewayId) {
		this.natGatewayId = natGatewayId;
		if(natGatewayId != null){
			putQueryParameter("NatGatewayId", natGatewayId);
		}
	}

	public Integer getIdleTimeout() {
		return this.idleTimeout;
	}

	public void setIdleTimeout(Integer idleTimeout) {
		this.idleTimeout = idleTimeout;
		if(idleTimeout != null){
			putQueryParameter("IdleTimeout", idleTimeout.toString());
		}
	}

	public String getSnatEntryName() {
		return this.snatEntryName;
	}

	public void setSnatEntryName(String snatEntryName) {
		this.snatEntryName = snatEntryName;
		if(snatEntryName != null){
			putQueryParameter("SnatEntryName", snatEntryName);
		}
	}

	@Override
	public Class<CreateSnatEntryResponse> getResponseClass() {
		return CreateSnatEntryResponse.class;
	}

}
