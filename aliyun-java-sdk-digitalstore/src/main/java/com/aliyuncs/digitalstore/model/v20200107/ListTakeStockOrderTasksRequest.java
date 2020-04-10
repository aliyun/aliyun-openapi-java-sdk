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

package com.aliyuncs.digitalstore.model.v20200107;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.digitalstore.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListTakeStockOrderTasksRequest extends RpcAcsRequest<ListTakeStockOrderTasksResponse> {
	   

	private String takeStockTaskId;

	private String orderByField;

	private Integer pageNumber;

	private String deviceNumber;

	private String takeStockOrderId;

	private Integer pageSize;

	private String taskCode;

	private String orderByMethod;
	public ListTakeStockOrderTasksRequest() {
		super("digitalstore", "2020-01-07", "ListTakeStockOrderTasks", "digitalstore");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTakeStockTaskId() {
		return this.takeStockTaskId;
	}

	public void setTakeStockTaskId(String takeStockTaskId) {
		this.takeStockTaskId = takeStockTaskId;
		if(takeStockTaskId != null){
			putBodyParameter("TakeStockTaskId", takeStockTaskId);
		}
	}

	public String getOrderByField() {
		return this.orderByField;
	}

	public void setOrderByField(String orderByField) {
		this.orderByField = orderByField;
		if(orderByField != null){
			putBodyParameter("OrderByField", orderByField);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getDeviceNumber() {
		return this.deviceNumber;
	}

	public void setDeviceNumber(String deviceNumber) {
		this.deviceNumber = deviceNumber;
		if(deviceNumber != null){
			putBodyParameter("DeviceNumber", deviceNumber);
		}
	}

	public String getTakeStockOrderId() {
		return this.takeStockOrderId;
	}

	public void setTakeStockOrderId(String takeStockOrderId) {
		this.takeStockOrderId = takeStockOrderId;
		if(takeStockOrderId != null){
			putBodyParameter("TakeStockOrderId", takeStockOrderId);
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

	public String getTaskCode() {
		return this.taskCode;
	}

	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
		if(taskCode != null){
			putBodyParameter("TaskCode", taskCode);
		}
	}

	public String getOrderByMethod() {
		return this.orderByMethod;
	}

	public void setOrderByMethod(String orderByMethod) {
		this.orderByMethod = orderByMethod;
		if(orderByMethod != null){
			putBodyParameter("OrderByMethod", orderByMethod);
		}
	}

	@Override
	public Class<ListTakeStockOrderTasksResponse> getResponseClass() {
		return ListTakeStockOrderTasksResponse.class;
	}

}
