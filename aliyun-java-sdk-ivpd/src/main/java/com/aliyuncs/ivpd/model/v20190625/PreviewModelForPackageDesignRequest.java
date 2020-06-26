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

package com.aliyuncs.ivpd.model.v20190625;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ivpd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PreviewModelForPackageDesignRequest extends RpcAcsRequest<PreviewModelForPackageDesignResponse> {
	   

	private String materialName;

	private List<ElementList> elementLists;

	private String dataId;

	private String materialType;

	private String modelType;

	private String category;
	public PreviewModelForPackageDesignRequest() {
		super("ivpd", "2019-06-25", "PreviewModelForPackageDesign", "ivpd");
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

	public List<ElementList> getElementLists() {
		return this.elementLists;
	}

	public void setElementLists(List<ElementList> elementLists) {
		this.elementLists = elementLists;	
		if (elementLists != null) {
			for (int depth1 = 0; depth1 < elementLists.size(); depth1++) {
				putBodyParameter("ElementList." + (depth1 + 1) + ".ImageUrl" , elementLists.get(depth1).getImageUrl());
				putBodyParameter("ElementList." + (depth1 + 1) + ".SideName" , elementLists.get(depth1).getSideName());
			}
		}	
	}

	public String getDataId() {
		return this.dataId;
	}

	public void setDataId(String dataId) {
		this.dataId = dataId;
		if(dataId != null){
			putBodyParameter("DataId", dataId);
		}
	}

	public String getMaterialType() {
		return this.materialType;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
		if(materialType != null){
			putBodyParameter("MaterialType", materialType);
		}
	}

	public String getModelType() {
		return this.modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
		if(modelType != null){
			putBodyParameter("ModelType", modelType);
		}
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putBodyParameter("Category", category);
		}
	}

	public static class ElementList {

		private String imageUrl;

		private String sideName;

		public String getImageUrl() {
			return this.imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public String getSideName() {
			return this.sideName;
		}

		public void setSideName(String sideName) {
			this.sideName = sideName;
		}
	}

	@Override
	public Class<PreviewModelForPackageDesignResponse> getResponseClass() {
		return PreviewModelForPackageDesignResponse.class;
	}

}
