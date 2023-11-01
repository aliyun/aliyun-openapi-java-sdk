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

package com.aliyuncs.cloud_siem.model.v20220616;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.DescribeAlertsCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAlertsCountResponse extends AcsResponse {

	private Boolean success;

	private Integer code;

	private String message;

	private String requestId;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long high;

		private Long medium;

		private Long low;

		private Long all;

		private Integer productNum;

		public Long getHigh() {
			return this.high;
		}

		public void setHigh(Long high) {
			this.high = high;
		}

		public Long getMedium() {
			return this.medium;
		}

		public void setMedium(Long medium) {
			this.medium = medium;
		}

		public Long getLow() {
			return this.low;
		}

		public void setLow(Long low) {
			this.low = low;
		}

		public Long getAll() {
			return this.all;
		}

		public void setAll(Long all) {
			this.all = all;
		}

		public Integer getProductNum() {
			return this.productNum;
		}

		public void setProductNum(Integer productNum) {
			this.productNum = productNum;
		}
	}

	@Override
	public DescribeAlertsCountResponse getInstance(UnmarshallerContext context) {
		return	DescribeAlertsCountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
