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

package com.aliyuncs.nis.model.v20211216;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteNetworkPathRequest extends RpcAcsRequest<DeleteNetworkPathResponse> {
	   

	@SerializedName("networkPathIds")
	private List<String> networkPathIds;
	public DeleteNetworkPathRequest() {
		super("nis", "2021-12-16", "DeleteNetworkPath", "networkana");
		setMethod(MethodType.POST);
	}

	public List<String> getNetworkPathIds() {
		return this.networkPathIds;
	}

	public void setNetworkPathIds(List<String> networkPathIds) {
		this.networkPathIds = networkPathIds;	
		if (networkPathIds != null) {
			putQueryParameter("NetworkPathIds" , new Gson().toJson(networkPathIds));
		}	
	}

	@Override
	public Class<DeleteNetworkPathResponse> getResponseClass() {
		return DeleteNetworkPathResponse.class;
	}

}
