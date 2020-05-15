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
public class ImportSKUTagRequest extends RpcAcsRequest<ImportSKUTagResponse> {
	   

	private String tagValue;

	private String uniqueCode;

	private String tid;

	private String flowNumber;

	private String warehouseCode;

	private String barcode;
	public ImportSKUTagRequest() {
		super("digitalstore", "2020-01-07", "ImportSKUTag", "digitalstore");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTagValue() {
		return this.tagValue;
	}

	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
		if(tagValue != null){
			putBodyParameter("TagValue", tagValue);
		}
	}

	public String getUniqueCode() {
		return this.uniqueCode;
	}

	public void setUniqueCode(String uniqueCode) {
		this.uniqueCode = uniqueCode;
		if(uniqueCode != null){
			putBodyParameter("UniqueCode", uniqueCode);
		}
	}

	public String getTid() {
		return this.tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
		if(tid != null){
			putBodyParameter("Tid", tid);
		}
	}

	public String getFlowNumber() {
		return this.flowNumber;
	}

	public void setFlowNumber(String flowNumber) {
		this.flowNumber = flowNumber;
		if(flowNumber != null){
			putBodyParameter("FlowNumber", flowNumber);
		}
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
		if(warehouseCode != null){
			putBodyParameter("WarehouseCode", warehouseCode);
		}
	}

	public String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
		if(barcode != null){
			putBodyParameter("Barcode", barcode);
		}
	}

	@Override
	public Class<ImportSKUTagResponse> getResponseClass() {
		return ImportSKUTagResponse.class;
	}

}
