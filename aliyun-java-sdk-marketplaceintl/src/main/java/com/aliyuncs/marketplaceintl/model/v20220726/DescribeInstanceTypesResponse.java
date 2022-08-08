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

package com.aliyuncs.marketplaceintl.model.v20220726;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.marketplaceintl.transform.v20220726.DescribeInstanceTypesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceTypesResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private Integer code;

	private String msg;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
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

		private String trackId;

		private List<InstanceType> instanceTypes;

		private List<CustomizeFamilyItem> customizeFamily;

		public String getTrackId() {
			return this.trackId;
		}

		public void setTrackId(String trackId) {
			this.trackId = trackId;
		}

		public List<InstanceType> getInstanceTypes() {
			return this.instanceTypes;
		}

		public void setInstanceTypes(List<InstanceType> instanceTypes) {
			this.instanceTypes = instanceTypes;
		}

		public List<CustomizeFamilyItem> getCustomizeFamily() {
			return this.customizeFamily;
		}

		public void setCustomizeFamily(List<CustomizeFamilyItem> customizeFamily) {
			this.customizeFamily = customizeFamily;
		}

		public static class InstanceType {

			private String text;

			private String value;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class CustomizeFamilyItem {

			private String globalKey;

			private String text;

			private String value;

			public String getGlobalKey() {
				return this.globalKey;
			}

			public void setGlobalKey(String globalKey) {
				this.globalKey = globalKey;
			}

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public DescribeInstanceTypesResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceTypesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
