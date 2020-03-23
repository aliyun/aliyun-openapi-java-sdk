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

package com.aliyuncs.imgsearch.model.v20200320;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imgsearch.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListImagesRequest extends RpcAcsRequest<ListImagesResponse> {
	   

	private String fromScrollId;

	private String dbName;
	public ListImagesRequest() {
		super("imgsearch", "2020-03-20", "ListImages", "imgsearch");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFromScrollId() {
		return this.fromScrollId;
	}

	public void setFromScrollId(String fromScrollId) {
		this.fromScrollId = fromScrollId;
		if(fromScrollId != null){
			putBodyParameter("FromScrollId", fromScrollId);
		}
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putBodyParameter("DbName", dbName);
		}
	}

	@Override
	public Class<ListImagesResponse> getResponseClass() {
		return ListImagesResponse.class;
	}

}
