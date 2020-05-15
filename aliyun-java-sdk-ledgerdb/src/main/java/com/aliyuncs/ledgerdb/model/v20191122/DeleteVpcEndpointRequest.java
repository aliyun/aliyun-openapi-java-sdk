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

package com.aliyuncs.ledgerdb.model.v20191122;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteVpcEndpointRequest extends RpcAcsRequest<DeleteVpcEndpointResponse> {
	   

	private String ledgerId;

	private String vSwitchId;

	private String vpcId;

	private String vpcEndpointId;
	public DeleteVpcEndpointRequest() {
		super("ledgerdb", "2019-11-22", "DeleteVpcEndpoint", "ledgerdb");
		setMethod(MethodType.POST);
	}

	public String getLedgerId() {
		return this.ledgerId;
	}

	public void setLedgerId(String ledgerId) {
		this.ledgerId = ledgerId;
		if(ledgerId != null){
			putQueryParameter("LedgerId", ledgerId);
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
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

	public String getVpcEndpointId() {
		return this.vpcEndpointId;
	}

	public void setVpcEndpointId(String vpcEndpointId) {
		this.vpcEndpointId = vpcEndpointId;
		if(vpcEndpointId != null){
			putQueryParameter("VpcEndpointId", vpcEndpointId);
		}
	}

	@Override
	public Class<DeleteVpcEndpointResponse> getResponseClass() {
		return DeleteVpcEndpointResponse.class;
	}

}
