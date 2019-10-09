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

package com.aliyuncs.market.model.v20151101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.market.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryMarketImagesRequest extends RpcAcsRequest<QueryMarketImagesResponse> {
	   

	private String param;
	public QueryMarketImagesRequest() {
		super("Market", "2015-11-01", "QueryMarketImages", "yunmarket");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getParam() {
		return this.param;
	}

	public void setParam(String param) {
		this.param = param;
		if(param != null){
			putQueryParameter("Param", param);
		}
	}

	@Override
	public Class<QueryMarketImagesResponse> getResponseClass() {
		return QueryMarketImagesResponse.class;
	}

}
