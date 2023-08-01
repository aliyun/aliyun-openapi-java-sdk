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

package com.aliyuncs.ft.model.v20210101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ft.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RpcDataUploadAndDownloadRequest extends RpcAcsRequest<RpcDataUploadAndDownloadResponse> {
	   

	private String query1;
	public RpcDataUploadAndDownloadRequest() {
		super("Ft", "2021-01-01", "RpcDataUploadAndDownload");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getQuery1() {
		return this.query1;
	}

	public void setQuery1(String query1) {
		this.query1 = query1;
		if(query1 != null){
			putQueryParameter("query1", query1);
		}
	}

	@Override
	public Class<RpcDataUploadAndDownloadResponse> getResponseClass() {
		return RpcDataUploadAndDownloadResponse.class;
	}

}
