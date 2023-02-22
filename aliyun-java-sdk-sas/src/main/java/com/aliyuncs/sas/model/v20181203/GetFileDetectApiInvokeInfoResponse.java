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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.GetFileDetectApiInvokeInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFileDetectApiInvokeInfoResponse extends AcsResponse {

	private String requestId;

	private Data data;

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

		private Long authCount;

		private Long remainAuthCount;

		private Integer flowRate;

		private String timeUnit;

		private Long expire;

		private Integer saleVersion;

		public Long getAuthCount() {
			return this.authCount;
		}

		public void setAuthCount(Long authCount) {
			this.authCount = authCount;
		}

		public Long getRemainAuthCount() {
			return this.remainAuthCount;
		}

		public void setRemainAuthCount(Long remainAuthCount) {
			this.remainAuthCount = remainAuthCount;
		}

		public Integer getFlowRate() {
			return this.flowRate;
		}

		public void setFlowRate(Integer flowRate) {
			this.flowRate = flowRate;
		}

		public String getTimeUnit() {
			return this.timeUnit;
		}

		public void setTimeUnit(String timeUnit) {
			this.timeUnit = timeUnit;
		}

		public Long getExpire() {
			return this.expire;
		}

		public void setExpire(Long expire) {
			this.expire = expire;
		}

		public Integer getSaleVersion() {
			return this.saleVersion;
		}

		public void setSaleVersion(Integer saleVersion) {
			this.saleVersion = saleVersion;
		}
	}

	@Override
	public GetFileDetectApiInvokeInfoResponse getInstance(UnmarshallerContext context) {
		return	GetFileDetectApiInvokeInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
