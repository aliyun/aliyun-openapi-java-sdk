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

package com.aliyuncs.dts.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ShieldPrecheckRequest extends RpcAcsRequest<ShieldPrecheckResponse> {
	   

	private String precheckItems;

	private String dtsInstanceId;
	public ShieldPrecheckRequest() {
		super("Dts", "2020-01-01", "ShieldPrecheck", "dts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPrecheckItems() {
		return this.precheckItems;
	}

	public void setPrecheckItems(String precheckItems) {
		this.precheckItems = precheckItems;
		if(precheckItems != null){
			putQueryParameter("PrecheckItems", precheckItems);
		}
	}

	public String getDtsInstanceId() {
		return this.dtsInstanceId;
	}

	public void setDtsInstanceId(String dtsInstanceId) {
		this.dtsInstanceId = dtsInstanceId;
		if(dtsInstanceId != null){
			putQueryParameter("DtsInstanceId", dtsInstanceId);
		}
	}

	@Override
	public Class<ShieldPrecheckResponse> getResponseClass() {
		return ShieldPrecheckResponse.class;
	}

}
