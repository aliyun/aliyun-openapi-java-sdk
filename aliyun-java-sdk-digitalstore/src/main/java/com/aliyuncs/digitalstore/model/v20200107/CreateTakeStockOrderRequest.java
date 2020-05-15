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
public class CreateTakeStockOrderRequest extends RpcAcsRequest<CreateTakeStockOrderResponse> {
	   

	private List<ImportSnapBizs> importSnapBizss;

	private String description;

	private String sourceOrderCode;

	private String warehouseId;

	private String status;
	public CreateTakeStockOrderRequest() {
		super("digitalstore", "2020-01-07", "CreateTakeStockOrder", "digitalstore");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<ImportSnapBizs> getImportSnapBizss() {
		return this.importSnapBizss;
	}

	public void setImportSnapBizss(List<ImportSnapBizs> importSnapBizss) {
		this.importSnapBizss = importSnapBizss;	
		if (importSnapBizss != null) {
			for (int depth1 = 0; depth1 < importSnapBizss.size(); depth1++) {
				putBodyParameter("ImportSnapBizs." + (depth1 + 1) + ".SnapQuantity" , importSnapBizss.get(depth1).getSnapQuantity());
				putBodyParameter("ImportSnapBizs." + (depth1 + 1) + ".Barcode" , importSnapBizss.get(depth1).getBarcode());
			}
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

	public String getSourceOrderCode() {
		return this.sourceOrderCode;
	}

	public void setSourceOrderCode(String sourceOrderCode) {
		this.sourceOrderCode = sourceOrderCode;
		if(sourceOrderCode != null){
			putBodyParameter("SourceOrderCode", sourceOrderCode);
		}
	}

	public String getWarehouseId() {
		return this.warehouseId;
	}

	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
		if(warehouseId != null){
			putBodyParameter("WarehouseId", warehouseId);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	public static class ImportSnapBizs {

		private Integer snapQuantity;

		private String barcode;

		public Integer getSnapQuantity() {
			return this.snapQuantity;
		}

		public void setSnapQuantity(Integer snapQuantity) {
			this.snapQuantity = snapQuantity;
		}

		public String getBarcode() {
			return this.barcode;
		}

		public void setBarcode(String barcode) {
			this.barcode = barcode;
		}
	}

	@Override
	public Class<CreateTakeStockOrderResponse> getResponseClass() {
		return CreateTakeStockOrderResponse.class;
	}

}
