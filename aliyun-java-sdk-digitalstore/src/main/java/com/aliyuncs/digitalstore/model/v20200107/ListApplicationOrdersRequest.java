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
public class ListApplicationOrdersRequest extends RpcAcsRequest<ListApplicationOrdersResponse> {
	   

	private String confirmDeliveryDateEnd;

	private String code;

	private String orderByField;

	private List<String> fromBusinessUnitIdss;

	private Integer pageNumber;

	private String sourceOrderCode;

	private Integer pageSize;

	private String createEndTime;

	private String orderId;

	private String createBeginTime;

	private String confirmDeliveryDateBegin;

	private Long merchantId;

	private String orderByMethod;

	private List<String> warehouseIdss;

	private List<String> statuss;
	public ListApplicationOrdersRequest() {
		super("digitalstore", "2020-01-07", "ListApplicationOrders", "digitalstore");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getConfirmDeliveryDateEnd() {
		return this.confirmDeliveryDateEnd;
	}

	public void setConfirmDeliveryDateEnd(String confirmDeliveryDateEnd) {
		this.confirmDeliveryDateEnd = confirmDeliveryDateEnd;
		if(confirmDeliveryDateEnd != null){
			putBodyParameter("ConfirmDeliveryDateEnd", confirmDeliveryDateEnd);
		}
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
		if(code != null){
			putBodyParameter("Code", code);
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

	public List<String> getFromBusinessUnitIdss() {
		return this.fromBusinessUnitIdss;
	}

	public void setFromBusinessUnitIdss(List<String> fromBusinessUnitIdss) {
		this.fromBusinessUnitIdss = fromBusinessUnitIdss;	
		if (fromBusinessUnitIdss != null) {
			for (int i = 0; i < fromBusinessUnitIdss.size(); i++) {
				putBodyParameter("FromBusinessUnitIds." + (i + 1) , fromBusinessUnitIdss.get(i));
			}
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

	public String getSourceOrderCode() {
		return this.sourceOrderCode;
	}

	public void setSourceOrderCode(String sourceOrderCode) {
		this.sourceOrderCode = sourceOrderCode;
		if(sourceOrderCode != null){
			putBodyParameter("SourceOrderCode", sourceOrderCode);
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

	public String getCreateEndTime() {
		return this.createEndTime;
	}

	public void setCreateEndTime(String createEndTime) {
		this.createEndTime = createEndTime;
		if(createEndTime != null){
			putBodyParameter("CreateEndTime", createEndTime);
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

	public String getCreateBeginTime() {
		return this.createBeginTime;
	}

	public void setCreateBeginTime(String createBeginTime) {
		this.createBeginTime = createBeginTime;
		if(createBeginTime != null){
			putBodyParameter("CreateBeginTime", createBeginTime);
		}
	}

	public String getConfirmDeliveryDateBegin() {
		return this.confirmDeliveryDateBegin;
	}

	public void setConfirmDeliveryDateBegin(String confirmDeliveryDateBegin) {
		this.confirmDeliveryDateBegin = confirmDeliveryDateBegin;
		if(confirmDeliveryDateBegin != null){
			putBodyParameter("ConfirmDeliveryDateBegin", confirmDeliveryDateBegin);
		}
	}

	public Long getMerchantId() {
		return this.merchantId;
	}

	public void setMerchantId(Long merchantId) {
		this.merchantId = merchantId;
		if(merchantId != null){
			putBodyParameter("MerchantId", merchantId.toString());
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

	public List<String> getWarehouseIdss() {
		return this.warehouseIdss;
	}

	public void setWarehouseIdss(List<String> warehouseIdss) {
		this.warehouseIdss = warehouseIdss;	
		if (warehouseIdss != null) {
			for (int i = 0; i < warehouseIdss.size(); i++) {
				putBodyParameter("WarehouseIds." + (i + 1) , warehouseIdss.get(i));
			}
		}	
	}

	public List<String> getStatuss() {
		return this.statuss;
	}

	public void setStatuss(List<String> statuss) {
		this.statuss = statuss;	
		if (statuss != null) {
			for (int i = 0; i < statuss.size(); i++) {
				putBodyParameter("Status." + (i + 1) , statuss.get(i));
			}
		}	
	}

	@Override
	public Class<ListApplicationOrdersResponse> getResponseClass() {
		return ListApplicationOrdersResponse.class;
	}

}
