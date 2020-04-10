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
public class ImportOutBoundOrderRequest extends RpcAcsRequest<ImportOutBoundOrderResponse> {
	   

	private String code;

	private String fromWarehouseCode;

	private String description;

	private List<DetailList> detailLists;

	private String sourceOrderCode;

	private String toWarehouseCode;

	private String name;
	public ImportOutBoundOrderRequest() {
		super("digitalstore", "2020-01-07", "ImportOutBoundOrder", "digitalstore");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getFromWarehouseCode() {
		return this.fromWarehouseCode;
	}

	public void setFromWarehouseCode(String fromWarehouseCode) {
		this.fromWarehouseCode = fromWarehouseCode;
		if(fromWarehouseCode != null){
			putBodyParameter("FromWarehouseCode", fromWarehouseCode);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public List<DetailList> getDetailLists() {
		return this.detailLists;
	}

	public void setDetailLists(List<DetailList> detailLists) {
		this.detailLists = detailLists;	
		if (detailLists != null) {
			for (int depth1 = 0; depth1 < detailLists.size(); depth1++) {
				putBodyParameter("DetailList." + (depth1 + 1) + ".Quantity" , detailLists.get(depth1).getQuantity());
				putBodyParameter("DetailList." + (depth1 + 1) + ".Barcode" , detailLists.get(depth1).getBarcode());
			}
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

	public String getToWarehouseCode() {
		return this.toWarehouseCode;
	}

	public void setToWarehouseCode(String toWarehouseCode) {
		this.toWarehouseCode = toWarehouseCode;
		if(toWarehouseCode != null){
			putBodyParameter("ToWarehouseCode", toWarehouseCode);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public static class DetailList {

		private Integer quantity;

		private String barcode;

		public Integer getQuantity() {
			return this.quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public String getBarcode() {
			return this.barcode;
		}

		public void setBarcode(String barcode) {
			this.barcode = barcode;
		}
	}

	@Override
	public Class<ImportOutBoundOrderResponse> getResponseClass() {
		return ImportOutBoundOrderResponse.class;
	}

}
