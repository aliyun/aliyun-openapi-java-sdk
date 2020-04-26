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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.digitalstore.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListInboundOrdersRequest extends RpcAcsRequest<ListInboundOrdersResponse> {
	   

	private String beginDate;

	private String orderByField;

	private Integer pageNumber;

	private List<String> statusCodes;

	private String orderCode;

	private String fromBusinessUnitId;

	private Integer pageSize;

	private String fromWarehouseId;

	private String orderId;

	private String toWarehouseId;

	private String toBusinessUnitId;

	private String endDate;

	private String orderByMethod;
	public ListInboundOrdersRequest() {
		super("digitalstore", "2020-01-07", "ListInboundOrders", "digitalstore");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBeginDate() {
		return this.beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
		if(beginDate != null){
			putBodyParameter("BeginDate", beginDate);
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

	public List<String> getStatusCodes() {
		return this.statusCodes;
	}

	public void setStatusCodes(List<String> statusCodes) {
		this.statusCodes = statusCodes;	
		if (statusCodes != null) {
			for (int i = 0; i < statusCodes.size(); i++) {
				putBodyParameter("StatusCode." + (i + 1) , statusCodes.get(i));
			}
		}	
	}

	public String getOrderCode() {
		return this.orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
		if(orderCode != null){
			putBodyParameter("OrderCode", orderCode);
		}
	}

	public String getFromBusinessUnitId() {
		return this.fromBusinessUnitId;
	}

	public void setFromBusinessUnitId(String fromBusinessUnitId) {
		this.fromBusinessUnitId = fromBusinessUnitId;
		if(fromBusinessUnitId != null){
			putBodyParameter("FromBusinessUnitId", fromBusinessUnitId);
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

	public String getFromWarehouseId() {
		return this.fromWarehouseId;
	}

	public void setFromWarehouseId(String fromWarehouseId) {
		this.fromWarehouseId = fromWarehouseId;
		if(fromWarehouseId != null){
			putBodyParameter("FromWarehouseId", fromWarehouseId);
		}
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putBodyParameter("OrderId", orderId);
		}
	}

	public String getToWarehouseId() {
		return this.toWarehouseId;
	}

	public void setToWarehouseId(String toWarehouseId) {
		this.toWarehouseId = toWarehouseId;
		if(toWarehouseId != null){
			putBodyParameter("ToWarehouseId", toWarehouseId);
		}
	}

	public String getToBusinessUnitId() {
		return this.toBusinessUnitId;
	}

	public void setToBusinessUnitId(String toBusinessUnitId) {
		this.toBusinessUnitId = toBusinessUnitId;
		if(toBusinessUnitId != null){
			putBodyParameter("ToBusinessUnitId", toBusinessUnitId);
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
	public Class<ListInboundOrdersResponse> getResponseClass() {
		return ListInboundOrdersResponse.class;
	}

}
