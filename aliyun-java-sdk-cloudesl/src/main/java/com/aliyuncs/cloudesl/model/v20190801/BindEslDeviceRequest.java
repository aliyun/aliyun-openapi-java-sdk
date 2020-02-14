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

package com.aliyuncs.cloudesl.model.v20190801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudesl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BindEslDeviceRequest extends RpcAcsRequest<BindEslDeviceResponse> {
	   

	private String storeId;

	private String eslBarCode;

	private String itemBarCode;
	public BindEslDeviceRequest() {
		super("cloudesl", "2019-08-01", "BindEslDevice", "cloudesl");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putBodyParameter("StoreId", storeId);
		}
	}

	public String getEslBarCode() {
		return this.eslBarCode;
	}

	public void setEslBarCode(String eslBarCode) {
		this.eslBarCode = eslBarCode;
		if(eslBarCode != null){
			putBodyParameter("EslBarCode", eslBarCode);
		}
	}

	public String getItemBarCode() {
		return this.itemBarCode;
	}

	public void setItemBarCode(String itemBarCode) {
		this.itemBarCode = itemBarCode;
		if(itemBarCode != null){
			putBodyParameter("ItemBarCode", itemBarCode);
		}
	}

	@Override
	public Class<BindEslDeviceResponse> getResponseClass() {
		return BindEslDeviceResponse.class;
	}

}
