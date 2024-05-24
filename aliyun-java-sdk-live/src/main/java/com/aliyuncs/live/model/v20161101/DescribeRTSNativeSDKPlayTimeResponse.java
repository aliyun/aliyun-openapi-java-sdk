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
import com.aliyuncs.live.transform.v20161101.DescribeRTSNativeSDKPlayTimeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRTSNativeSDKPlayTimeResponse extends AcsResponse {

	private String dataInterval;

	private String endTime;

	private String requestId;

	private String startTime;

	private List<Data> playTimeData;

	public String getDataInterval() {
		return this.dataInterval;
	}

	public void setDataInterval(String dataInterval) {
		this.dataInterval = dataInterval;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public List<Data> getPlayTimeData() {
		return this.playTimeData;
	}

	public void setPlayTimeData(List<Data> playTimeData) {
		this.playTimeData = playTimeData;
	}

	public static class Data {

		private String playTime;

		private String stallTime;

		private String timeStamp;

		public String getPlayTime() {
			return this.playTime;
		}

		public void setPlayTime(String playTime) {
			this.playTime = playTime;
		}

		public String getStallTime() {
			return this.stallTime;
		}

		public void setStallTime(String stallTime) {
			this.stallTime = stallTime;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}
	}

	@Override
	public DescribeRTSNativeSDKPlayTimeResponse getInstance(UnmarshallerContext context) {
		return	DescribeRTSNativeSDKPlayTimeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
