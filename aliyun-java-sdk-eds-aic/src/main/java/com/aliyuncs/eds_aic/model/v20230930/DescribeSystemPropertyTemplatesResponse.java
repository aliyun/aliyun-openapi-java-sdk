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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_aic.transform.v20230930.DescribeSystemPropertyTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSystemPropertyTemplatesResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Integer totalCount;

	private List<Data> systemPropertyTemplateModel;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Data> getSystemPropertyTemplateModel() {
		return this.systemPropertyTemplateModel;
	}

	public void setSystemPropertyTemplateModel(List<Data> systemPropertyTemplateModel) {
		this.systemPropertyTemplateModel = systemPropertyTemplateModel;
	}

	public static class Data {

		private String gmtCreate;

		private String gmtModified;

		private String templateId;

		private String templateName;

		private String status;

		private String filePath;

		private Boolean enableAuto;

		private SystemPropertyInfo systemPropertyInfo;

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public String getTemplateName() {
			return this.templateName;
		}

		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getFilePath() {
			return this.filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public Boolean getEnableAuto() {
			return this.enableAuto;
		}

		public void setEnableAuto(Boolean enableAuto) {
			this.enableAuto = enableAuto;
		}

		public SystemPropertyInfo getSystemPropertyInfo() {
			return this.systemPropertyInfo;
		}

		public void setSystemPropertyInfo(SystemPropertyInfo systemPropertyInfo) {
			this.systemPropertyInfo = systemPropertyInfo;
		}

		public static class SystemPropertyInfo {

			private String roBuildFingerprint;

			private String roProductModel;

			private String roProductManufacturer;

			private String roProductBrand;

			private String roBuildUser;

			private String roBuildId;

			private String roBootloader;

			private String roBuildTags;

			private String roProductBoard;

			private String roProductDevice;

			private String roBuildProduct;

			private String roBuildType;

			private String roBuildHost;

			private String roBuildDisplayId;

			private String rwRoSerialNo;

			private List<CustomPropertyInfosItem> customPropertyInfos;

			public String getRoBuildFingerprint() {
				return this.roBuildFingerprint;
			}

			public void setRoBuildFingerprint(String roBuildFingerprint) {
				this.roBuildFingerprint = roBuildFingerprint;
			}

			public String getRoProductModel() {
				return this.roProductModel;
			}

			public void setRoProductModel(String roProductModel) {
				this.roProductModel = roProductModel;
			}

			public String getRoProductManufacturer() {
				return this.roProductManufacturer;
			}

			public void setRoProductManufacturer(String roProductManufacturer) {
				this.roProductManufacturer = roProductManufacturer;
			}

			public String getRoProductBrand() {
				return this.roProductBrand;
			}

			public void setRoProductBrand(String roProductBrand) {
				this.roProductBrand = roProductBrand;
			}

			public String getRoBuildUser() {
				return this.roBuildUser;
			}

			public void setRoBuildUser(String roBuildUser) {
				this.roBuildUser = roBuildUser;
			}

			public String getRoBuildId() {
				return this.roBuildId;
			}

			public void setRoBuildId(String roBuildId) {
				this.roBuildId = roBuildId;
			}

			public String getRoBootloader() {
				return this.roBootloader;
			}

			public void setRoBootloader(String roBootloader) {
				this.roBootloader = roBootloader;
			}

			public String getRoBuildTags() {
				return this.roBuildTags;
			}

			public void setRoBuildTags(String roBuildTags) {
				this.roBuildTags = roBuildTags;
			}

			public String getRoProductBoard() {
				return this.roProductBoard;
			}

			public void setRoProductBoard(String roProductBoard) {
				this.roProductBoard = roProductBoard;
			}

			public String getRoProductDevice() {
				return this.roProductDevice;
			}

			public void setRoProductDevice(String roProductDevice) {
				this.roProductDevice = roProductDevice;
			}

			public String getRoBuildProduct() {
				return this.roBuildProduct;
			}

			public void setRoBuildProduct(String roBuildProduct) {
				this.roBuildProduct = roBuildProduct;
			}

			public String getRoBuildType() {
				return this.roBuildType;
			}

			public void setRoBuildType(String roBuildType) {
				this.roBuildType = roBuildType;
			}

			public String getRoBuildHost() {
				return this.roBuildHost;
			}

			public void setRoBuildHost(String roBuildHost) {
				this.roBuildHost = roBuildHost;
			}

			public String getRoBuildDisplayId() {
				return this.roBuildDisplayId;
			}

			public void setRoBuildDisplayId(String roBuildDisplayId) {
				this.roBuildDisplayId = roBuildDisplayId;
			}

			public String getRwRoSerialNo() {
				return this.rwRoSerialNo;
			}

			public void setRwRoSerialNo(String rwRoSerialNo) {
				this.rwRoSerialNo = rwRoSerialNo;
			}

			public List<CustomPropertyInfosItem> getCustomPropertyInfos() {
				return this.customPropertyInfos;
			}

			public void setCustomPropertyInfos(List<CustomPropertyInfosItem> customPropertyInfos) {
				this.customPropertyInfos = customPropertyInfos;
			}

			public static class CustomPropertyInfosItem {

				private String propertyName;

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
	}

	@Override
	public DescribeSystemPropertyTemplatesResponse getInstance(UnmarshallerContext context) {
		return	DescribeSystemPropertyTemplatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
