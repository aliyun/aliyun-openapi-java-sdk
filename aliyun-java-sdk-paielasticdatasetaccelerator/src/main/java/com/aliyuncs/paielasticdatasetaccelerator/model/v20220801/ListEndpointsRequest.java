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

package com.aliyuncs.paielasticdatasetaccelerator.model.v20220801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListEndpointsRequest extends RoaAcsRequest<ListEndpointsResponse> {
	   

	private String slotIds;

	private String instanceIds;

	private String name;

	private Integer pageSize;

	private String sortBy;

	private String type;

	private String endpointIds;

	private Integer pageNumber;

	private String order;
	public ListEndpointsRequest() {
		super("PAIElasticDatasetAccelerator", "2022-08-01", "ListEndpoints", "datasetacc");
		setUriPattern("/api/v1/endpoints");
		setMethod(MethodType.GET);
	}

	public String getSlotIds() {
		return this.slotIds;
	}

	public void setSlotIds(String slotIds) {
		this.slotIds = slotIds;
		if(slotIds != null){
			putQueryParameter("SlotIds", slotIds);
		}
	}

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
		if(instanceIds != null){
			putQueryParameter("InstanceIds", instanceIds);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
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

	public String getSortBy() {
		return this.sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
		if(sortBy != null){
			putQueryParameter("SortBy", sortBy);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getEndpointIds() {
		return this.endpointIds;
	}

	public void setEndpointIds(String endpointIds) {
		this.endpointIds = endpointIds;
		if(endpointIds != null){
			putQueryParameter("EndpointIds", endpointIds);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putQueryParameter("Order", order);
		}
	}

	@Override
	public Class<ListEndpointsResponse> getResponseClass() {
		return ListEndpointsResponse.class;
	}

}
