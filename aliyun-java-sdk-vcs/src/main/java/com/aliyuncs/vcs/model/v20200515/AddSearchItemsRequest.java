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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddSearchItemsRequest extends RpcAcsRequest<AddSearchItemsResponse> {
	   

	private String searchTableId;

	@SerializedName("searchItemList")
	private List<SearchItemList> searchItemList;
	public AddSearchItemsRequest() {
		super("Vcs", "2020-05-15", "AddSearchItems");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSearchTableId() {
		return this.searchTableId;
	}

	public void setSearchTableId(String searchTableId) {
		this.searchTableId = searchTableId;
		if(searchTableId != null){
			putBodyParameter("SearchTableId", searchTableId);
		}
	}

	public List<SearchItemList> getSearchItemList() {
		return this.searchItemList;
	}

	public void setSearchItemList(List<SearchItemList> searchItemList) {
		this.searchItemList = searchItemList;	
		if (searchItemList != null) {
			putBodyParameter("SearchItemList" , new Gson().toJson(searchItemList));
		}	
	}

	public static class SearchItemList {

		@SerializedName("SearchItemId")
		private String searchItemId;

		@SerializedName("ItemImageUrl")
		private String itemImageUrl;

		@SerializedName("SearchItemName")
		private String searchItemName;

		public String getSearchItemId() {
			return this.searchItemId;
		}

		public void setSearchItemId(String searchItemId) {
			this.searchItemId = searchItemId;
		}

		public String getItemImageUrl() {
			return this.itemImageUrl;
		}

		public void setItemImageUrl(String itemImageUrl) {
			this.itemImageUrl = itemImageUrl;
		}

		public String getSearchItemName() {
			return this.searchItemName;
		}

		public void setSearchItemName(String searchItemName) {
			this.searchItemName = searchItemName;
		}
	}

	@Override
	public Class<AddSearchItemsResponse> getResponseClass() {
		return AddSearchItemsResponse.class;
	}

}
