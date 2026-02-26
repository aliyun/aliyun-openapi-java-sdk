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
public class BatchGetStoreTextDataRequest extends RoaAcsRequest<BatchGetStoreTextDataResponse> {
	   

	private String country;

	@SerializedName("storeIds")
	private List<String> storeIds;
	public BatchGetStoreTextDataRequest() {
		super("cd", "2021-12-7", "BatchGetStoreTextData");
		setUriPattern("/BatchGetStoreTextData");
		setMethod(MethodType.POST);
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
		if(country != null){
			putBodyParameter("country", country);
		}
	}

	public List<String> getStoreIds() {
		return this.storeIds;
	}

	public void setStoreIds(List<String> storeIds) {
		this.storeIds = storeIds;	
		if (storeIds != null) {
			putBodyParameter("StoreIds" , new Gson().toJson(storeIds));
		}	
	}

	@Override
	public Class<BatchGetStoreTextDataResponse> getResponseClass() {
		return BatchGetStoreTextDataResponse.class;
	}

}
