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

package com.aliyuncs.bssopenapi.model.v20171214;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.bssopenapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QuerySkuPriceListRequest extends RpcAcsRequest<QuerySkuPriceListResponse> {
	   

	private String nextPageToken;

	private String commodityCode;

	@SerializedName("priceFactorConditionMap")
	private Map<String,List<String>> priceFactorConditionMap;

	private String priceEntityCode;

	private Integer pageSize;
	public QuerySkuPriceListRequest() {
		super("BssOpenApi", "2017-12-14", "QuerySkuPriceList", "bssopenapi");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNextPageToken() {
		return this.nextPageToken;
	}

	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
		if(nextPageToken != null){
			putQueryParameter("NextPageToken", nextPageToken);
		}
	}

	public String getCommodityCode() {
		return this.commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
		if(commodityCode != null){
			putQueryParameter("CommodityCode", commodityCode);
		}
	}

	public Map<String,List<String>> getPriceFactorConditionMap() {
		return this.priceFactorConditionMap;
	}

	public void setPriceFactorConditionMap(Map<String,List<String>> priceFactorConditionMap) {
		this.priceFactorConditionMap = priceFactorConditionMap;	
		if (priceFactorConditionMap != null) {
			putQueryParameter("PriceFactorConditionMap" , new Gson().toJson(priceFactorConditionMap));
		}	
	}

	public String getPriceEntityCode() {
		return this.priceEntityCode;
	}

	public void setPriceEntityCode(String priceEntityCode) {
		this.priceEntityCode = priceEntityCode;
		if(priceEntityCode != null){
			putQueryParameter("PriceEntityCode", priceEntityCode);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	@Override
	public Class<QuerySkuPriceListResponse> getResponseClass() {
		return QuerySkuPriceListResponse.class;
	}

}
