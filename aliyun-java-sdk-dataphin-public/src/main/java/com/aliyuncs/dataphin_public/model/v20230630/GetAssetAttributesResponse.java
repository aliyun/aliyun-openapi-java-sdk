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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetAssetAttributesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAssetAttributesResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<AssetAttribute> assetAttributeList;

		public List<AssetAttribute> getAssetAttributeList() {
			return this.assetAttributeList;
		}

		public void setAssetAttributeList(List<AssetAttribute> assetAttributeList) {
			this.assetAttributeList = assetAttributeList;
		}

		public static class AssetAttribute {

			private String assetType;

			private String lastModifiedTime;

			private String guid;

			private String assetName;

			private List<Attribute> attributeList;

			public String getAssetType() {
				return this.assetType;
			}

			public void setAssetType(String assetType) {
				this.assetType = assetType;
			}

			public String getLastModifiedTime() {
				return this.lastModifiedTime;
			}

			public void setLastModifiedTime(String lastModifiedTime) {
				this.lastModifiedTime = lastModifiedTime;
			}

			public String getGuid() {
				return this.guid;
			}

			public void setGuid(String guid) {
				this.guid = guid;
			}

			public String getAssetName() {
				return this.assetName;
			}

			public void setAssetName(String assetName) {
				this.assetName = assetName;
			}

			public List<Attribute> getAttributeList() {
				return this.attributeList;
			}

			public void setAttributeList(List<Attribute> attributeList) {
				this.attributeList = attributeList;
			}

			public static class Attribute {

				private String attributeCode;

				private Boolean required;

				private String attributeName;

				private List<String> values;

				public String getAttributeCode() {
					return this.attributeCode;
				}

				public void setAttributeCode(String attributeCode) {
					this.attributeCode = attributeCode;
				}

				public Boolean getRequired() {
					return this.required;
				}

				public void setRequired(Boolean required) {
					this.required = required;
				}

				public String getAttributeName() {
					return this.attributeName;
				}

				public void setAttributeName(String attributeName) {
					this.attributeName = attributeName;
				}

				public List<String> getValues() {
					return this.values;
				}

				public void setValues(List<String> values) {
					this.values = values;
				}
			}
		}
	}

	@Override
	public GetAssetAttributesResponse getInstance(UnmarshallerContext context) {
		return	GetAssetAttributesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
