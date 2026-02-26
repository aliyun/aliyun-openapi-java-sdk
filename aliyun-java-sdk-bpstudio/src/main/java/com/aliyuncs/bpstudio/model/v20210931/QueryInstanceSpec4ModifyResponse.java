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

package com.aliyuncs.bpstudio.model.v20210931;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bpstudio.transform.v20210931.QueryInstanceSpec4ModifyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryInstanceSpec4ModifyResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private String accessDeniedDetail;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<Item> optionalValues;

		public List<Item> getOptionalValues() {
			return this.optionalValues;
		}

		public void setOptionalValues(List<Item> optionalValues) {
			this.optionalValues = optionalValues;
		}

		public static class Item {

			private String label;

			private String value;

			private Double min;

			private Double max;

			private Double step;

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public Double getMin() {
				return this.min;
			}

			public void setMin(Double min) {
				this.min = min;
			}

			public Double getMax() {
				return this.max;
			}

			public void setMax(Double max) {
				this.max = max;
			}

			public Double getStep() {
				return this.step;
			}

			public void setStep(Double step) {
				this.step = step;
			}
		}
	}

	@Override
	public QueryInstanceSpec4ModifyResponse getInstance(UnmarshallerContext context) {
		return	QueryInstanceSpec4ModifyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
