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
import com.aliyuncs.live.transform.v20161101.DescribeRTSNativeSDKVvDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRTSNativeSDKVvDataResponse extends AcsResponse {

	private String requestId;

	private String dataInterval;

	private String startTime;

	private String endTime;

	private List<Data> vvData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDataInterval() {
		return this.dataInterval;
	}

	public void setDataInterval(String dataInterval) {
		this.dataInterval = dataInterval;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public List<Data> getVvData() {
		return this.vvData;
	}

	public void setVvData(List<Data> vvData) {
		this.vvData = vvData;
	}

	public static class Data {

		private String timeStamp;

		private String vvTotal;

		private String vvSuccess;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getVvTotal() {
			return this.vvTotal;
		}

		public void setVvTotal(String vvTotal) {
			this.vvTotal = vvTotal;
		}

		public String getVvSuccess() {
			return this.vvSuccess;
		}

		public void setVvSuccess(String vvSuccess) {
			this.vvSuccess = vvSuccess;
		}
	}

	@Override
	public DescribeRTSNativeSDKVvDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeRTSNativeSDKVvDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
