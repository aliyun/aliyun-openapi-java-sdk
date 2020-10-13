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

package com.aliyuncs.reid.model.v20190928;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.reid.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListDevicesImagesRequest extends RpcAcsRequest<ListDevicesImagesResponse> {
	   

	private String ipcIdList;

	private Long storeId;
	public ListDevicesImagesRequest() {
		super("reid", "2019-09-28", "ListDevicesImages", "1.1.8.5");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIpcIdList() {
		return this.ipcIdList;
	}

	public void setIpcIdList(String ipcIdList) {
		this.ipcIdList = ipcIdList;
		if(ipcIdList != null){
			putBodyParameter("IpcIdList", ipcIdList);
		}
	}

	public Long getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putBodyParameter("StoreId", storeId.toString());
		}
	}

	@Override
	public Class<ListDevicesImagesResponse> getResponseClass() {
		return ListDevicesImagesResponse.class;
	}

}
