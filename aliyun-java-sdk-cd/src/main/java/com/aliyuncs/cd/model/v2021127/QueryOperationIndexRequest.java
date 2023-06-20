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

package com.aliyuncs.cd.model.v2021127;

import com.aliyuncs.RoaAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryOperationIndexRequest extends RoaAcsRequest<QueryOperationIndexResponse> {
	   

	private String country;

	@SerializedName("shopIdList")
	private List<String> shopIdList;

	private String startDate;

	private String endDate;
	public QueryOperationIndexRequest() {
		super("cd", "2021-12-7", "QueryOperationIndex");
		setUriPattern("/QueryOperationIndex");
		setMethod(MethodType.POST);
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
		if(country != null){
			putBodyParameter("Country", country);
		}
	}

	public List<String> getShopIdList() {
		return this.shopIdList;
	}

	public void setShopIdList(List<String> shopIdList) {
		this.shopIdList = shopIdList;	
		if (shopIdList != null) {
			putBodyParameter("ShopIdList" , new Gson().toJson(shopIdList));
		}	
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
		if(startDate != null){
			putBodyParameter("StartDate", startDate);
		}
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
		if(endDate != null){
			putBodyParameter("EndDate", endDate);
		}
	}

	@Override
	public Class<QueryOperationIndexResponse> getResponseClass() {
		return QueryOperationIndexResponse.class;
	}

}
