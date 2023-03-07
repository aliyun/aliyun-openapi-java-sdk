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

package com.aliyuncs.bssopenapi.model.v20171214;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.QueryResellerUserAlarmThresholdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryResellerUserAlarmThresholdResponse extends AcsResponse {

	private Integer count;

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private List<DataItem> data;

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Integer thresholdType;

		private String thresholdAmount;

		private Integer numerator;

		private Integer denominator;

		public Integer getThresholdType() {
			return this.thresholdType;
		}

		public void setThresholdType(Integer thresholdType) {
			this.thresholdType = thresholdType;
		}

		public String getThresholdAmount() {
			return this.thresholdAmount;
		}

		public void setThresholdAmount(String thresholdAmount) {
			this.thresholdAmount = thresholdAmount;
		}

		public Integer getNumerator() {
			return this.numerator;
		}

		public void setNumerator(Integer numerator) {
			this.numerator = numerator;
		}

		public Integer getDenominator() {
			return this.denominator;
		}

		public void setDenominator(Integer denominator) {
			this.denominator = denominator;
		}
	}

	@Override
	public QueryResellerUserAlarmThresholdResponse getInstance(UnmarshallerContext context) {
		return	QueryResellerUserAlarmThresholdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
