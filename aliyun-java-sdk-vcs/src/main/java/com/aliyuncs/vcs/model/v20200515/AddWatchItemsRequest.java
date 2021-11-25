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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddWatchItemsRequest extends RpcAcsRequest<AddWatchItemsResponse> {
	   

	private List<WatchItemList> watchItemList;

	private String watchPolicyId;
	public AddWatchItemsRequest() {
		super("Vcs", "2020-05-15", "AddWatchItems");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<WatchItemList> getWatchItemList() {
		return this.watchItemList;
	}

	public void setWatchItemList(List<WatchItemList> watchItemList) {
		this.watchItemList = watchItemList;	
		if (watchItemList != null) {
			for (int depth1 = 0; depth1 < watchItemList.size(); depth1++) {
				if (watchItemList.get(depth1) != null) {
					
						putBodyParameter("WatchItemList." + (depth1 + 1) + ".ItemAttributes" , watchItemList.get(depth1).getItemAttributes());
						putBodyParameter("WatchItemList." + (depth1 + 1) + ".ItemImageUrl" , watchItemList.get(depth1).getItemImageUrl());
						putBodyParameter("WatchItemList." + (depth1 + 1) + ".WatchItemName" , watchItemList.get(depth1).getWatchItemName());
						putBodyParameter("WatchItemList." + (depth1 + 1) + ".WatchItemId" , watchItemList.get(depth1).getWatchItemId());
				}
			}
		}	
	}

	public String getWatchPolicyId() {
		return this.watchPolicyId;
	}

	public void setWatchPolicyId(String watchPolicyId) {
		this.watchPolicyId = watchPolicyId;
		if(watchPolicyId != null){
			putBodyParameter("WatchPolicyId", watchPolicyId);
		}
	}

	public static class WatchItemList {

		private String itemAttributes;

		private String itemImageUrl;

		private String watchItemName;

		private String watchItemId;

		public String getItemAttributes() {
			return this.itemAttributes;
		}

		public void setItemAttributes(String itemAttributes) {
			this.itemAttributes = itemAttributes;
		}

		public String getItemImageUrl() {
			return this.itemImageUrl;
		}

		public void setItemImageUrl(String itemImageUrl) {
			this.itemImageUrl = itemImageUrl;
		}

		public String getWatchItemName() {
			return this.watchItemName;
		}

		public void setWatchItemName(String watchItemName) {
			this.watchItemName = watchItemName;
		}

		public String getWatchItemId() {
			return this.watchItemId;
		}

		public void setWatchItemId(String watchItemId) {
			this.watchItemId = watchItemId;
		}
	}

	@Override
	public Class<AddWatchItemsResponse> getResponseClass() {
		return AddWatchItemsResponse.class;
	}

}
