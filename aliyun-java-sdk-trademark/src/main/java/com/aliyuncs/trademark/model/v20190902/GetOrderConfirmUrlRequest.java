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

package com.aliyuncs.trademark.model.v20190902;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetOrderConfirmUrlRequest extends RpcAcsRequest<GetOrderConfirmUrlResponse> {
	   

	private String outTraceCode;

	private String outTraceType;

	private List<Items> itemss;
	public GetOrderConfirmUrlRequest() {
		super("Trademark", "2019-09-02", "GetOrderConfirmUrl");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOutTraceCode() {
		return this.outTraceCode;
	}

	public void setOutTraceCode(String outTraceCode) {
		this.outTraceCode = outTraceCode;
		if(outTraceCode != null){
			putQueryParameter("OutTraceCode", outTraceCode);
		}
	}

	public String getOutTraceType() {
		return this.outTraceType;
	}

	public void setOutTraceType(String outTraceType) {
		this.outTraceType = outTraceType;
		if(outTraceType != null){
			putQueryParameter("OutTraceType", outTraceType);
		}
	}

	public List<Items> getItemss() {
		return this.itemss;
	}

	public void setItemss(List<Items> itemss) {
		this.itemss = itemss;	
		if (itemss != null) {
			for (int depth1 = 0; depth1 < itemss.size(); depth1++) {
				putQueryParameter("Items." + (depth1 + 1) + ".Quantity" , itemss.get(depth1).getQuantity());
				putQueryParameter("Items." + (depth1 + 1) + ".ItemCode" , itemss.get(depth1).getItemCode());
			}
		}	
	}

	public static class Items {

		private Long quantity;

		private String itemCode;

		public Long getQuantity() {
			return this.quantity;
		}

		public void setQuantity(Long quantity) {
			this.quantity = quantity;
		}

		public String getItemCode() {
			return this.itemCode;
		}

		public void setItemCode(String itemCode) {
			this.itemCode = itemCode;
		}
	}

	@Override
	public Class<GetOrderConfirmUrlResponse> getResponseClass() {
		return GetOrderConfirmUrlResponse.class;
	}

}
