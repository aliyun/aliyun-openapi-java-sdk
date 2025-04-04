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

package com.aliyuncs.push.model.v20160801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.push.transform.v20160801.QueryUniqueDeviceStatResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryUniqueDeviceStatResponse extends AcsResponse {

	private String requestId;

	private List<AppDeviceStat> appDeviceStats;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AppDeviceStat> getAppDeviceStats() {
		return this.appDeviceStats;
	}

	public void setAppDeviceStats(List<AppDeviceStat> appDeviceStats) {
		this.appDeviceStats = appDeviceStats;
	}

	public static class AppDeviceStat {

		private Long count;

		private String time;

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}
	}

	@Override
	public QueryUniqueDeviceStatResponse getInstance(UnmarshallerContext context) {
		return	QueryUniqueDeviceStatResponseUnmarshaller.unmarshall(this, context);
	}
}
