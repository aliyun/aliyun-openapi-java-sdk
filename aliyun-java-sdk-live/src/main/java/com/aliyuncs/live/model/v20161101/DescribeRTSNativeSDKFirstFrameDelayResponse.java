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
import com.aliyuncs.live.transform.v20161101.DescribeRTSNativeSDKFirstFrameDelayResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRTSNativeSDKFirstFrameDelayResponse extends AcsResponse {

	private String dataInterval;

	private String endTime;

	private String requestId;

	private String startTime;

	private List<Data> frameDelayData;

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

	public List<Data> getFrameDelayData() {
		return this.frameDelayData;
	}

	public void setFrameDelayData(List<Data> frameDelayData) {
		this.frameDelayData = frameDelayData;
	}

	public static class Data {

		private String frameDelay;

		private String timeStamp;

		public String getFrameDelay() {
			return this.frameDelay;
		}

		public void setFrameDelay(String frameDelay) {
			this.frameDelay = frameDelay;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}
	}

	@Override
	public DescribeRTSNativeSDKFirstFrameDelayResponse getInstance(UnmarshallerContext context) {
		return	DescribeRTSNativeSDKFirstFrameDelayResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
