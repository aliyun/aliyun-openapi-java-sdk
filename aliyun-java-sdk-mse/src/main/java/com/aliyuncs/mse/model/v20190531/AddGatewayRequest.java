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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddGatewayRequest extends RpcAcsRequest<AddGatewayResponse> {
	   

	private String internetSlbSpec;

	private Integer replica;

	private String vswitch2;

	private String spec;

	private Boolean enterpriseSecurityGroup;

	private String vpc;

	private String vswitch;

	private String slbSpec;

	private String name;

	private String region;
	public AddGatewayRequest() {
		super("mse", "2019-05-31", "AddGateway", "mse");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInternetSlbSpec() {
		return this.internetSlbSpec;
	}

	public void setInternetSlbSpec(String internetSlbSpec) {
		this.internetSlbSpec = internetSlbSpec;
		if(internetSlbSpec != null){
			putQueryParameter("InternetSlbSpec", internetSlbSpec);
		}
	}

	public Integer getReplica() {
		return this.replica;
	}

	public void setReplica(Integer replica) {
		this.replica = replica;
		if(replica != null){
			putQueryParameter("Replica", replica.toString());
		}
	}

	public String getVswitch2() {
		return this.vswitch2;
	}

	public void setVswitch2(String vswitch2) {
		this.vswitch2 = vswitch2;
		if(vswitch2 != null){
			putQueryParameter("Vswitch2", vswitch2);
		}
	}

	public String getSpec() {
		return this.spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
		if(spec != null){
			putQueryParameter("Spec", spec);
		}
	}

	public Boolean getEnterpriseSecurityGroup() {
		return this.enterpriseSecurityGroup;
	}

	public void setEnterpriseSecurityGroup(Boolean enterpriseSecurityGroup) {
		this.enterpriseSecurityGroup = enterpriseSecurityGroup;
		if(enterpriseSecurityGroup != null){
			putQueryParameter("EnterpriseSecurityGroup", enterpriseSecurityGroup.toString());
		}
	}

	public String getVpc() {
		return this.vpc;
	}

	public void setVpc(String vpc) {
		this.vpc = vpc;
		if(vpc != null){
			putQueryParameter("Vpc", vpc);
		}
	}

	public String getVswitch() {
		return this.vswitch;
	}

	public void setVswitch(String vswitch) {
		this.vswitch = vswitch;
		if(vswitch != null){
			putQueryParameter("Vswitch", vswitch);
		}
	}

	public String getSlbSpec() {
		return this.slbSpec;
	}

	public void setSlbSpec(String slbSpec) {
		this.slbSpec = slbSpec;
		if(slbSpec != null){
			putQueryParameter("SlbSpec", slbSpec);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	@Override
	public Class<AddGatewayResponse> getResponseClass() {
		return AddGatewayResponse.class;
	}

}
