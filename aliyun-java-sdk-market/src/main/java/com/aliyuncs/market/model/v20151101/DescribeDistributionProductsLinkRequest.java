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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.market.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeDistributionProductsLinkRequest extends RpcAcsRequest<DescribeDistributionProductsLinkResponse> {
	   

	@SerializedName("codes")
	private List<String> codes;
	public DescribeDistributionProductsLinkRequest() {
		super("Market", "2015-11-01", "DescribeDistributionProductsLink");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getCodes() {
		return this.codes;
	}

	public void setCodes(List<String> codes) {
		this.codes = codes;	
		if (codes != null) {
			putQueryParameter("Codes" , new Gson().toJson(codes));
		}	
	}

	@Override
	public Class<DescribeDistributionProductsLinkResponse> getResponseClass() {
		return DescribeDistributionProductsLinkResponse.class;
	}

}
