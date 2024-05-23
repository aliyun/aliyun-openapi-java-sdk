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

package com.aliyuncs.ccc.model.v20200701;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListDocumentsRequest extends RpcAcsRequest<ListDocumentsResponse> {
	   

	private String nextPageToken;

	private String searchPattern;

	private String instanceId;

	private String schemaId;

	private String requestId;

	private Integer pageSize;

	@SerializedName("sorts")
	private List<Sorts> sorts;
	public ListDocumentsRequest() {
		super("CCC", "2020-07-01", "ListDocuments", "CCC");
		setMethod(MethodType.POST);
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
			putBodyParameter("NextPageToken", nextPageToken);
		}
	}

	public String getSearchPattern() {
		return this.searchPattern;
	}

	public void setSearchPattern(String searchPattern) {
		this.searchPattern = searchPattern;
		if(searchPattern != null){
			putBodyParameter("SearchPattern", searchPattern);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getSchemaId() {
		return this.schemaId;
	}

	public void setSchemaId(String schemaId) {
		this.schemaId = schemaId;
		if(schemaId != null){
			putBodyParameter("SchemaId", schemaId);
		}
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putBodyParameter("RequestId", requestId);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public List<Sorts> getSorts() {
		return this.sorts;
	}

	public void setSorts(List<Sorts> sorts) {
		this.sorts = sorts;	
		if (sorts != null) {
			putBodyParameter("Sorts" , new Gson().toJson(sorts));
		}	
	}

	public static class Sorts {

		@SerializedName("PropertyName")
		private String propertyName;

		@SerializedName("Order")
		private String order;

		public String getPropertyName() {
			return this.propertyName;
		}

		public void setPropertyName(String propertyName) {
			this.propertyName = propertyName;
		}

		public String getOrder() {
			return this.order;
		}

		public void setOrder(String order) {
			this.order = order;
		}
	}

	@Override
	public Class<ListDocumentsResponse> getResponseClass() {
		return ListDocumentsResponse.class;
	}

}
