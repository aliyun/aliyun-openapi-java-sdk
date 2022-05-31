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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudesl.transform.v20200201.GetItemMaterialResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetItemMaterialResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String message;

	private String errorCode;

	private String errorMessage;

	private String code;

	private String dynamicCode;

	private String dynamicMessage;

	private MaterialInfo materialInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public MaterialInfo getMaterialInfo() {
		return this.materialInfo;
	}

	public void setMaterialInfo(MaterialInfo materialInfo) {
		this.materialInfo = materialInfo;
	}

	public static class MaterialInfo {

		private String itemName;

		private String barCode;

		private String gmtCreate;

		private String materialName;

		private String materialId;

		private String materialFeatureA;

		private String materialFeatureB;

		private String materialFeatureC;

		private String materialFeatureD;

		public String getItemName() {
			return this.itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public String getBarCode() {
			return this.barCode;
		}

		public void setBarCode(String barCode) {
			this.barCode = barCode;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getMaterialName() {
			return this.materialName;
		}

		public void setMaterialName(String materialName) {
			this.materialName = materialName;
		}

		public String getMaterialId() {
			return this.materialId;
		}

		public void setMaterialId(String materialId) {
			this.materialId = materialId;
		}

		public String getMaterialFeatureA() {
			return this.materialFeatureA;
		}

		public void setMaterialFeatureA(String materialFeatureA) {
			this.materialFeatureA = materialFeatureA;
		}

		public String getMaterialFeatureB() {
			return this.materialFeatureB;
		}

		public void setMaterialFeatureB(String materialFeatureB) {
			this.materialFeatureB = materialFeatureB;
		}

		public String getMaterialFeatureC() {
			return this.materialFeatureC;
		}

		public void setMaterialFeatureC(String materialFeatureC) {
			this.materialFeatureC = materialFeatureC;
		}

		public String getMaterialFeatureD() {
			return this.materialFeatureD;
		}

		public void setMaterialFeatureD(String materialFeatureD) {
			this.materialFeatureD = materialFeatureD;
		}
	}

	@Override
	public GetItemMaterialResponse getInstance(UnmarshallerContext context) {
		return	GetItemMaterialResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
