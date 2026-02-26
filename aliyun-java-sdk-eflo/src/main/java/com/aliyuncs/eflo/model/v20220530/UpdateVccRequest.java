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
public class UpdateVccRequest extends RpcAcsRequest<UpdateVccResponse> {
	   

	private Integer bandwidth;

	private String orderId;

	private String vccName;

	private String vccId;
	public UpdateVccRequest() {
		super("eflo", "2022-05-30", "UpdateVcc", "eflo");
		setMethod(MethodType.POST);
	}

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
		if(bandwidth != null){
			putBodyParameter("Bandwidth", bandwidth.toString());
		}
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putBodyParameter("OrderId", orderId);
		}
	}

	public String getVccName() {
		return this.vccName;
	}

	public void setVccName(String vccName) {
		this.vccName = vccName;
		if(vccName != null){
			putBodyParameter("VccName", vccName);
		}
	}

	public String getVccId() {
		return this.vccId;
	}

	public void setVccId(String vccId) {
		this.vccId = vccId;
		if(vccId != null){
			putBodyParameter("VccId", vccId);
		}
	}

	@Override
	public Class<UpdateVccResponse> getResponseClass() {
		return UpdateVccResponse.class;
	}

}
