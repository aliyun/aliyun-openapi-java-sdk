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
public class SaveOrderSKUTagsRequest extends RpcAcsRequest<SaveOrderSKUTagsResponse> {
	   

	private String orderId;

	private List<SkuTags> skuTagss;

	private String orderType;
	public SaveOrderSKUTagsRequest() {
		super("digitalstore", "2020-01-07", "SaveOrderSKUTags", "digitalstore");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<SkuTags> getSkuTagss() {
		return this.skuTagss;
	}

	public void setSkuTagss(List<SkuTags> skuTagss) {
		this.skuTagss = skuTagss;	
		if (skuTagss != null) {
			for (int depth1 = 0; depth1 < skuTagss.size(); depth1++) {
				putBodyParameter("SkuTags." + (depth1 + 1) + ".TagValue" , skuTagss.get(depth1).getTagValue());
				putBodyParameter("SkuTags." + (depth1 + 1) + ".CaseId" , skuTagss.get(depth1).getCaseId());
				putBodyParameter("SkuTags." + (depth1 + 1) + ".DeviceId" , skuTagss.get(depth1).getDeviceId());
				putBodyParameter("SkuTags." + (depth1 + 1) + ".Barcode" , skuTagss.get(depth1).getBarcode());
			}
		}	
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
		if(orderType != null){
			putBodyParameter("OrderType", orderType);
		}
	}

	public static class SkuTags {

		private String tagValue;

		private String caseId;

		private String deviceId;

		private String barcode;

		public String getTagValue() {
			return this.tagValue;
		}

		public void setTagValue(String tagValue) {
			this.tagValue = tagValue;
		}

		public String getCaseId() {
			return this.caseId;
		}

		public void setCaseId(String caseId) {
			this.caseId = caseId;
		}

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public String getBarcode() {
			return this.barcode;
		}

		public void setBarcode(String barcode) {
			this.barcode = barcode;
		}
	}

	@Override
	public Class<SaveOrderSKUTagsResponse> getResponseClass() {
		return SaveOrderSKUTagsResponse.class;
	}

}
