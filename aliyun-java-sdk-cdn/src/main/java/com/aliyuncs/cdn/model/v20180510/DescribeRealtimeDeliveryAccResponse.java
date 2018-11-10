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

package com.aliyuncs.cdn.model.v20180510;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20180510.DescribeRealtimeDeliveryAccResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRealtimeDeliveryAccResponse extends AcsResponse {

	private String requestId;

	private List<AccData> reatTimeDeliveryAccData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AccData> getReatTimeDeliveryAccData() {
		return this.reatTimeDeliveryAccData;
	}

	public void setReatTimeDeliveryAccData(List<AccData> reatTimeDeliveryAccData) {
		this.reatTimeDeliveryAccData = reatTimeDeliveryAccData;
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
	public DescribeRealtimeDeliveryAccResponse getInstance(UnmarshallerContext context) {
		return	DescribeRealtimeDeliveryAccResponseUnmarshaller.unmarshall(this, context);
	}
}
