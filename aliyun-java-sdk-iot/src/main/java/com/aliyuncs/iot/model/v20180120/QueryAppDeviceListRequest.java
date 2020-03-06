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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryAppDeviceListRequest extends RpcAcsRequest<QueryAppDeviceListResponse> {
	   

	private Integer currentPage;

	private List<TagList> tagLists;

	private List<String> productKeyLists;

	private List<String> categoryKeyLists;

	private String iotInstanceId;

	private Integer pageSize;

	private String appKey;
	public QueryAppDeviceListRequest() {
		super("Iot", "2018-01-20", "QueryAppDeviceList", "Iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public List<TagList> getTagLists() {
		return this.tagLists;
	}

	public void setTagLists(List<TagList> tagLists) {
		this.tagLists = tagLists;	
		if (tagLists != null) {
			for (int depth1 = 0; depth1 < tagLists.size(); depth1++) {
				putQueryParameter("TagList." + (depth1 + 1) + ".TagName" , tagLists.get(depth1).getTagName());
				putQueryParameter("TagList." + (depth1 + 1) + ".TagValue" , tagLists.get(depth1).getTagValue());
			}
		}	
	}

	public List<String> getProductKeyLists() {
		return this.productKeyLists;
	}

	public void setProductKeyLists(List<String> productKeyLists) {
		this.productKeyLists = productKeyLists;	
		if (productKeyLists != null) {
			for (int i = 0; i < productKeyLists.size(); i++) {
				putQueryParameter("ProductKeyList." + (i + 1) , productKeyLists.get(i));
			}
		}	
	}

	public List<String> getCategoryKeyLists() {
		return this.categoryKeyLists;
	}

	public void setCategoryKeyLists(List<String> categoryKeyLists) {
		this.categoryKeyLists = categoryKeyLists;	
		if (categoryKeyLists != null) {
			for (int i = 0; i < categoryKeyLists.size(); i++) {
				putQueryParameter("CategoryKeyList." + (i + 1) , categoryKeyLists.get(i));
			}
		}	
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
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

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
		if(appKey != null){
			putQueryParameter("AppKey", appKey);
		}
	}

	public static class TagList {

		private String tagName;

		private String tagValue;

		public String getTagName() {
			return this.tagName;
		}

		public void setTagName(String tagName) {
			this.tagName = tagName;
		}

		public String getTagValue() {
			return this.tagValue;
		}

		public void setTagValue(String tagValue) {
			this.tagValue = tagValue;
		}
	}

	@Override
	public Class<QueryAppDeviceListResponse> getResponseClass() {
		return QueryAppDeviceListResponse.class;
	}

}
