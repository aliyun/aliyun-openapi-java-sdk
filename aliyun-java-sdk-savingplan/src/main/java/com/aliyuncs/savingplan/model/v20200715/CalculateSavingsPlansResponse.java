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

package com.aliyuncs.savingplan.model.v20200715;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.savingplan.transform.v20200715.CalculateSavingsPlansResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CalculateSavingsPlansResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private List<SpnInstanceDTO> data;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<SpnInstanceDTO> getData() {
		return this.data;
	}

	public void setData(List<SpnInstanceDTO> data) {
		this.data = data;
	}

	public static class SpnInstanceDTO {

		private String commodityCode;

		private String instanceFamily;

		private String region;

		private String cycle;

		private Long userId;

		private String spnType;

		private Float poolValue;

		private String currency;

		private String payMode;

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getInstanceFamily() {
			return this.instanceFamily;
		}

		public void setInstanceFamily(String instanceFamily) {
			this.instanceFamily = instanceFamily;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getCycle() {
			return this.cycle;
		}

		public void setCycle(String cycle) {
			this.cycle = cycle;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getSpnType() {
			return this.spnType;
		}

		public void setSpnType(String spnType) {
			this.spnType = spnType;
		}

		public Float getPoolValue() {
			return this.poolValue;
		}

		public void setPoolValue(Float poolValue) {
			this.poolValue = poolValue;
		}

		public String getCurrency() {
			return this.currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public String getPayMode() {
			return this.payMode;
		}

		public void setPayMode(String payMode) {
			this.payMode = payMode;
		}
	}

	@Override
	public CalculateSavingsPlansResponse getInstance(UnmarshallerContext context) {
		return	CalculateSavingsPlansResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
