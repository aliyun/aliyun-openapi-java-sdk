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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLiveRealtimeDeliveryAccResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveRealtimeDeliveryAccResponse extends AcsResponse {

	private String requestId;

	private List<AccData> realTimeDeliveryAccData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AccData> getRealTimeDeliveryAccData() {
		return this.realTimeDeliveryAccData;
	}

	public void setRealTimeDeliveryAccData(List<AccData> realTimeDeliveryAccData) {
		this.realTimeDeliveryAccData = realTimeDeliveryAccData;
	}

	public static class AccData {

		private String timeStamp;

		private Integer successNum;

		private Integer failedNum;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public Integer getSuccessNum() {
			return this.successNum;
		}

		public void setSuccessNum(Integer successNum) {
			this.successNum = successNum;
		}

		public Integer getFailedNum() {
			return this.failedNum;
		}

		public void setFailedNum(Integer failedNum) {
			this.failedNum = failedNum;
		}
	}

	@Override
	public DescribeLiveRealtimeDeliveryAccResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveRealtimeDeliveryAccResponseUnmarshaller.unmarshall(this, context);
	}
}
