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
import com.aliyuncs.live.transform.v20161101.DescribeRTSNativeSDKPlayFailStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRTSNativeSDKPlayFailStatusResponse extends AcsResponse {

	private String dataInterval;

	private String endTime;

	private String requestId;

	private String startTime;

	private List<Data> playFailStatus;

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

	public List<Data> getPlayFailStatus() {
		return this.playFailStatus;
	}

	public void setPlayFailStatus(List<Data> playFailStatus) {
		this.playFailStatus = playFailStatus;
	}

	public static class Data {

		private String timeStamp;

		private String v20001;

		private String v20002;

		private String v20011;

		private String v20012;

		private String v20013;

		private String v20052;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getV20001() {
			return this.v20001;
		}

		public void setV20001(String v20001) {
			this.v20001 = v20001;
		}

		public String getV20002() {
			return this.v20002;
		}

		public void setV20002(String v20002) {
			this.v20002 = v20002;
		}

		public String getV20011() {
			return this.v20011;
		}

		public void setV20011(String v20011) {
			this.v20011 = v20011;
		}

		public String getV20012() {
			return this.v20012;
		}

		public void setV20012(String v20012) {
			this.v20012 = v20012;
		}

		public String getV20013() {
			return this.v20013;
		}

		public void setV20013(String v20013) {
			this.v20013 = v20013;
		}

		public String getV20052() {
			return this.v20052;
		}

		public void setV20052(String v20052) {
			this.v20052 = v20052;
		}
	}

	@Override
	public DescribeRTSNativeSDKPlayFailStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeRTSNativeSDKPlayFailStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
