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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudesl.transform.v20200201.DescribePlanogramEslDevicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePlanogramEslDevicesResponse extends AcsResponse {

	private String code;

	private String dynamicCode;

	private String dynamicMessage;

	private String errorCode;

	private String errorMessage;

	private String message;

	private String requestId;

	private String shelf;

	private String storeId;

	private Boolean success;

	private List<EslDeviceLayerInfo> eslDeviceLayerInfos;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getShelf() {
		return this.shelf;
	}

	public void setShelf(String shelf) {
		this.shelf = shelf;
	}

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<EslDeviceLayerInfo> getEslDeviceLayerInfos() {
		return this.eslDeviceLayerInfos;
	}

	public void setEslDeviceLayerInfos(List<EslDeviceLayerInfo> eslDeviceLayerInfos) {
		this.eslDeviceLayerInfos = eslDeviceLayerInfos;
	}

	public static class EslDeviceLayerInfo {

		private Integer layer;

		private List<EslDevicePositionInfo> eslDevicePositionInfos;

		public Integer getLayer() {
			return this.layer;
		}

		public void setLayer(Integer layer) {
			this.layer = layer;
		}

		public List<EslDevicePositionInfo> getEslDevicePositionInfos() {
			return this.eslDevicePositionInfos;
		}

		public void setEslDevicePositionInfos(List<EslDevicePositionInfo> eslDevicePositionInfos) {
			this.eslDevicePositionInfos = eslDevicePositionInfos;
		}

		public static class EslDevicePositionInfo {

			private String column;

			private List<EslDevicePlanogramInfo> eslDevicePlanogramInfos;

			public String getColumn() {
				return this.column;
			}

			public void setColumn(String column) {
				this.column = column;
			}

			public List<EslDevicePlanogramInfo> getEslDevicePlanogramInfos() {
				return this.eslDevicePlanogramInfos;
			}

			public void setEslDevicePlanogramInfos(List<EslDevicePlanogramInfo> eslDevicePlanogramInfos) {
				this.eslDevicePlanogramInfos = eslDevicePlanogramInfos;
			}

			public static class EslDevicePlanogramInfo {

				private String eslBarCode;

				private String eslModel;

				private String itemBarCode;

				private String itemTitle;

				public String getEslBarCode() {
					return this.eslBarCode;
				}

				public void setEslBarCode(String eslBarCode) {
					this.eslBarCode = eslBarCode;
				}

				public String getEslModel() {
					return this.eslModel;
				}

				public void setEslModel(String eslModel) {
					this.eslModel = eslModel;
				}

				public String getItemBarCode() {
					return this.itemBarCode;
				}

				public void setItemBarCode(String itemBarCode) {
					this.itemBarCode = itemBarCode;
				}

				public String getItemTitle() {
					return this.itemTitle;
				}

				public void setItemTitle(String itemTitle) {
					this.itemTitle = itemTitle;
				}
			}
		}
	}

	@Override
	public DescribePlanogramEslDevicesResponse getInstance(UnmarshallerContext context) {
		return	DescribePlanogramEslDevicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
