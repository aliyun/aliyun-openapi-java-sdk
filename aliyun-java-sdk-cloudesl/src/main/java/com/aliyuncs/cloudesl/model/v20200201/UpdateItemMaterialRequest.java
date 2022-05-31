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

package com.aliyuncs.cloudesl.model.v20200201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudesl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateItemMaterialRequest extends RpcAcsRequest<UpdateItemMaterialResponse> {
	   

	private String materialId;

	private String barCode;

	private String itemName;

	private String materialFeatureA;

	private String materialFeatureB;

	private String materialFeatureC;

	private String materialFeatureD;
	public UpdateItemMaterialRequest() {
		super("cloudesl", "2020-02-01", "UpdateItemMaterial");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMaterialId() {
		return this.materialId;
	}

	public void setMaterialId(String materialId) {
		this.materialId = materialId;
		if(materialId != null){
			putBodyParameter("MaterialId", materialId);
		}
	}

	public String getBarCode() {
		return this.barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
		if(barCode != null){
			putBodyParameter("BarCode", barCode);
		}
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
		if(itemName != null){
			putBodyParameter("ItemName", itemName);
		}
	}

	public String getMaterialFeatureA() {
		return this.materialFeatureA;
	}

	public void setMaterialFeatureA(String materialFeatureA) {
		this.materialFeatureA = materialFeatureA;
		if(materialFeatureA != null){
			putBodyParameter("MaterialFeatureA", materialFeatureA);
		}
	}

	public String getMaterialFeatureB() {
		return this.materialFeatureB;
	}

	public void setMaterialFeatureB(String materialFeatureB) {
		this.materialFeatureB = materialFeatureB;
		if(materialFeatureB != null){
			putBodyParameter("MaterialFeatureB", materialFeatureB);
		}
	}

	public String getMaterialFeatureC() {
		return this.materialFeatureC;
	}

	public void setMaterialFeatureC(String materialFeatureC) {
		this.materialFeatureC = materialFeatureC;
		if(materialFeatureC != null){
			putBodyParameter("MaterialFeatureC", materialFeatureC);
		}
	}

	public String getMaterialFeatureD() {
		return this.materialFeatureD;
	}

	public void setMaterialFeatureD(String materialFeatureD) {
		this.materialFeatureD = materialFeatureD;
		if(materialFeatureD != null){
			putBodyParameter("MaterialFeatureD", materialFeatureD);
		}
	}

	@Override
	public Class<UpdateItemMaterialResponse> getResponseClass() {
		return UpdateItemMaterialResponse.class;
	}

}
