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

package com.aliyuncs.advisor_share.model.v20180608;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddInspectStrategyWhiteRequest extends RpcAcsRequest<AddInspectStrategyWhiteResponse> {
	   

	private String product;

	@SerializedName("whiteList")
	private List<WhiteList> whiteList;
	public AddInspectStrategyWhiteRequest() {
		super("Advisor-Share", "2018-06-08", "AddInspectStrategyWhite", "advisor");
		setMethod(MethodType.POST);
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
		if(product != null){
			putBodyParameter("Product", product);
		}
	}

	public List<WhiteList> getWhiteList() {
		return this.whiteList;
	}

	public void setWhiteList(List<WhiteList> whiteList) {
		this.whiteList = whiteList;	
		if (whiteList != null) {
			putBodyParameter("WhiteList" , new Gson().toJson(whiteList));
		}	
	}

	public static class WhiteList {

		@SerializedName("ResourceId")
		private String resourceId;

		@SerializedName("RegionId")
		private String regionId;

		@SerializedName("ResourceName")
		private String resourceName;

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getResourceName() {
			return this.resourceName;
		}

		public void setResourceName(String resourceName) {
			this.resourceName = resourceName;
		}
	}

	@Override
	public Class<AddInspectStrategyWhiteResponse> getResponseClass() {
		return AddInspectStrategyWhiteResponse.class;
	}

}
