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

package com.aliyuncs.vs.model.v20181212;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vs.transform.v20181212.DescribeVsDevicesDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVsDevicesDataResponse extends AcsResponse {

	private String requestId;

	private List<DataModule> devicesDataPerInterval;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataModule> getDevicesDataPerInterval() {
		return this.devicesDataPerInterval;
	}

	public void setDevicesDataPerInterval(List<DataModule> devicesDataPerInterval) {
		this.devicesDataPerInterval = devicesDataPerInterval;
	}

	public static class DataModule {

		private String timeStamp;

		private String devicesDataValue;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getDevicesDataValue() {
			return this.devicesDataValue;
		}

		public void setDevicesDataValue(String devicesDataValue) {
			this.devicesDataValue = devicesDataValue;
		}
	}

	@Override
	public DescribeVsDevicesDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeVsDevicesDataResponseUnmarshaller.unmarshall(this, context);
	}
}
