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
public class DescribeItemMaterialsRequest extends RpcAcsRequest<DescribeItemMaterialsResponse> {
	   

	private String materialName;

	private String materialId;

	private Integer pageNumber;

	private Integer pageSize;

	private String barCode;

	private String itemName;
	public DescribeItemMaterialsRequest() {
		super("cloudesl", "2020-02-01", "DescribeItemMaterials");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMaterialName() {
		return this.materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
		if(materialName != null){
			putBodyParameter("MaterialName", materialName);
		}
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
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

	@Override
	public Class<DescribeItemMaterialsResponse> getResponseClass() {
		return DescribeItemMaterialsResponse.class;
	}

}
