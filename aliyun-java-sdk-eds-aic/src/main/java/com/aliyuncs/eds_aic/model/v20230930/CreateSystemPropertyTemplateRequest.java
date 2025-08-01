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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateSystemPropertyTemplateRequest extends RpcAcsRequest<CreateSystemPropertyTemplateResponse> {
	   

	@SerializedName("systemPropertyInfo")
	private SystemPropertyInfo systemPropertyInfo;

	private Boolean enableAuto;

	private String filePath;

	private String templateName;
	public CreateSystemPropertyTemplateRequest() {
		super("eds-aic", "2023-09-30", "CreateSystemPropertyTemplate");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public SystemPropertyInfo getSystemPropertyInfo() {
		return this.systemPropertyInfo;
	}

	public void setSystemPropertyInfo(SystemPropertyInfo systemPropertyInfo) {
		this.systemPropertyInfo = systemPropertyInfo;	
		if (systemPropertyInfo != null) {
			putQueryParameter("SystemPropertyInfo" , new Gson().toJson(systemPropertyInfo));
		}	
	}

	public Boolean getEnableAuto() {
		return this.enableAuto;
	}

	public void setEnableAuto(Boolean enableAuto) {
		this.enableAuto = enableAuto;
		if(enableAuto != null){
			putQueryParameter("EnableAuto", enableAuto.toString());
		}
	}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
		if(filePath != null){
			putQueryParameter("FilePath", filePath);
		}
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
		if(templateName != null){
			putQueryParameter("TemplateName", templateName);
		}
	}

	public static class SystemPropertyInfo {

		@SerializedName("RoProductBrand")
		private String roProductBrand;

		@SerializedName("RoProductBoard")
		private String roProductBoard;

		@SerializedName("RoBuildUser")
		private String roBuildUser;

		@SerializedName("RoBuildProduct")
		private String roBuildProduct;

		@SerializedName("RoBuildDisplayId")
		private String roBuildDisplayId;

		@SerializedName("RoProductDevice")
		private String roProductDevice;

		@SerializedName("RoBuildHost")
		private String roBuildHost;

		@SerializedName("CustomPropertyInfos")
		private List<CustomPropertyInfosItem> customPropertyInfos;

		@SerializedName("RoBuildFingerprint")
		private String roBuildFingerprint;

		@SerializedName("RwRoSerialNo")
		private String rwRoSerialNo;

		@SerializedName("RoBuildId")
		private String roBuildId;

		@SerializedName("RoProductManufacturer")
		private String roProductManufacturer;

		@SerializedName("RoBuildTags")
		private String roBuildTags;

		@SerializedName("RoBuildType")
		private String roBuildType;

		@SerializedName("RoProductModel")
		private String roProductModel;

		@SerializedName("RoBootloader")
		private String roBootloader;

		public String getRoProductBrand() {
			return this.roProductBrand;
		}

		public void setRoProductBrand(String roProductBrand) {
			this.roProductBrand = roProductBrand;
		}

		public String getRoProductBoard() {
			return this.roProductBoard;
		}

		public void setRoProductBoard(String roProductBoard) {
			this.roProductBoard = roProductBoard;
		}

		public String getRoBuildUser() {
			return this.roBuildUser;
		}

		public void setRoBuildUser(String roBuildUser) {
			this.roBuildUser = roBuildUser;
		}

		public String getRoBuildProduct() {
			return this.roBuildProduct;
		}

		public void setRoBuildProduct(String roBuildProduct) {
			this.roBuildProduct = roBuildProduct;
		}

		public String getRoBuildDisplayId() {
			return this.roBuildDisplayId;
		}

		public void setRoBuildDisplayId(String roBuildDisplayId) {
			this.roBuildDisplayId = roBuildDisplayId;
		}

		public String getRoProductDevice() {
			return this.roProductDevice;
		}

		public void setRoProductDevice(String roProductDevice) {
			this.roProductDevice = roProductDevice;
		}

		public String getRoBuildHost() {
			return this.roBuildHost;
		}

		public void setRoBuildHost(String roBuildHost) {
			this.roBuildHost = roBuildHost;
		}

		public List<CustomPropertyInfosItem> getCustomPropertyInfos() {
			return this.customPropertyInfos;
		}

		public void setCustomPropertyInfos(List<CustomPropertyInfosItem> customPropertyInfos) {
			this.customPropertyInfos = customPropertyInfos;
		}

		public String getRoBuildFingerprint() {
			return this.roBuildFingerprint;
		}

		public void setRoBuildFingerprint(String roBuildFingerprint) {
			this.roBuildFingerprint = roBuildFingerprint;
		}

		public String getRwRoSerialNo() {
			return this.rwRoSerialNo;
		}

		public void setRwRoSerialNo(String rwRoSerialNo) {
			this.rwRoSerialNo = rwRoSerialNo;
		}

		public String getRoBuildId() {
			return this.roBuildId;
		}

		public void setRoBuildId(String roBuildId) {
			this.roBuildId = roBuildId;
		}

		public String getRoProductManufacturer() {
			return this.roProductManufacturer;
		}

		public void setRoProductManufacturer(String roProductManufacturer) {
			this.roProductManufacturer = roProductManufacturer;
		}

		public String getRoBuildTags() {
			return this.roBuildTags;
		}

		public void setRoBuildTags(String roBuildTags) {
			this.roBuildTags = roBuildTags;
		}

		public String getRoBuildType() {
			return this.roBuildType;
		}

		public void setRoBuildType(String roBuildType) {
			this.roBuildType = roBuildType;
		}

		public String getRoProductModel() {
			return this.roProductModel;
		}

		public void setRoProductModel(String roProductModel) {
			this.roProductModel = roProductModel;
		}

		public String getRoBootloader() {
			return this.roBootloader;
		}

		public void setRoBootloader(String roBootloader) {
			this.roBootloader = roBootloader;
		}

		public static class CustomPropertyInfosItem {

			@SerializedName("PropertyName")
			private String propertyName;

			@SerializedName("PropertyValue")
			private String propertyValue;

			public String getPropertyName() {
				return this.propertyName;
			}

			public void setPropertyName(String propertyName) {
				this.propertyName = propertyName;
			}

			public String getPropertyValue() {
				return this.propertyValue;
			}

			public void setPropertyValue(String propertyValue) {
				this.propertyValue = propertyValue;
			}
		}
	}

	@Override
	public Class<CreateSystemPropertyTemplateResponse> getResponseClass() {
		return CreateSystemPropertyTemplateResponse.class;
	}

}
