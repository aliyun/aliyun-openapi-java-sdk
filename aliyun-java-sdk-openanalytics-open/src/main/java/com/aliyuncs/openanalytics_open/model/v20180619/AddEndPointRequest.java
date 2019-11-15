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

package com.aliyuncs.openanalytics_open.model.v20180619;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.openanalytics_open.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddEndPointRequest extends RpcAcsRequest<AddEndPointResponse> {
	   

	private String product;

	private String networkType;

	private String vswitch;

	private String zone;

	private String vpcID;
	public AddEndPointRequest() {
		super("openanalytics-open", "2018-06-19", "AddEndPoint", "openanalytics");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
		if(product != null){
			putBodyParameter("Product", product);
		}
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putBodyParameter("NetworkType", networkType);
		}
	}

	public String getVswitch() {
		return this.vswitch;
	}

	public void setVswitch(String vswitch) {
		this.vswitch = vswitch;
		if(vswitch != null){
			putBodyParameter("Vswitch", vswitch);
		}
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
		if(zone != null){
			putBodyParameter("Zone", zone);
		}
	}

	public String getVpcID() {
		return this.vpcID;
	}

	public void setVpcID(String vpcID) {
		this.vpcID = vpcID;
		if(vpcID != null){
			putBodyParameter("VpcID", vpcID);
		}
	}

	@Override
	public Class<AddEndPointResponse> getResponseClass() {
		return AddEndPointResponse.class;
	}

}
