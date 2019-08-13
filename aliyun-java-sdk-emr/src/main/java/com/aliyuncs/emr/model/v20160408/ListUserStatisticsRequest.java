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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListUserStatisticsRequest extends RpcAcsRequest<ListUserStatisticsResponse> {
	
	public ListUserStatisticsRequest() {
		super("Emr", "2016-04-08", "ListUserStatistics", "emr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private String orderMode;

	private Integer pageSize;

	private String orderFieldName;

	private Integer currentSize;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getOrderMode() {
		return this.orderMode;
	}

	public void setOrderMode(String orderMode) {
		this.orderMode = orderMode;
		if(orderMode != null){
			putQueryParameter("OrderMode", orderMode);
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

	public String getOrderFieldName() {
		return this.orderFieldName;
	}

	public void setOrderFieldName(String orderFieldName) {
		this.orderFieldName = orderFieldName;
		if(orderFieldName != null){
			putQueryParameter("OrderFieldName", orderFieldName);
		}
	}

	public Integer getCurrentSize() {
		return this.currentSize;
	}

	public void setCurrentSize(Integer currentSize) {
		this.currentSize = currentSize;
		if(currentSize != null){
			putQueryParameter("CurrentSize", currentSize.toString());
		}
	}

	@Override
	public Class<ListUserStatisticsResponse> getResponseClass() {
		return ListUserStatisticsResponse.class;
	}

}
