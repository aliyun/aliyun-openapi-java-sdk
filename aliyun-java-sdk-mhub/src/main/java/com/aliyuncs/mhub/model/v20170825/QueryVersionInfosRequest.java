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

package com.aliyuncs.mhub.model.v20170825;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mhub.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryVersionInfosRequest extends RpcAcsRequest<QueryVersionInfosResponse> {
	   

	private String productID;

	private String oS;
	public QueryVersionInfosRequest() {
		super("Mhub", "2017-08-25", "QueryVersionInfos");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProductID() {
		return this.productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
		if(productID != null){
			putQueryParameter("ProductID", productID);
		}
	}

	public String getOS() {
		return this.oS;
	}

	public void setOS(String oS) {
		this.oS = oS;
		if(oS != null){
			putQueryParameter("OS", oS);
		}
	}

	@Override
	public Class<QueryVersionInfosResponse> getResponseClass() {
		return QueryVersionInfosResponse.class;
	}

}
