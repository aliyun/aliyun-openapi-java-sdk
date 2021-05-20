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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeSagOnlineClientStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSagOnlineClientStatisticsResponse extends AcsResponse {

	private String requestId;

	private List<Statistics> sagStatistics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Statistics> getSagStatistics() {
		return this.sagStatistics;
	}

	public void setSagStatistics(List<Statistics> sagStatistics) {
		this.sagStatistics = sagStatistics;
	}

	public static class Statistics {

		private String onlineCount;

		private String smartAGId;

		public String getOnlineCount() {
			return this.onlineCount;
		}

		public void setOnlineCount(String onlineCount) {
			this.onlineCount = onlineCount;
		}

		public String getSmartAGId() {
			return this.smartAGId;
		}

		public void setSmartAGId(String smartAGId) {
			this.smartAGId = smartAGId;
		}
	}

	@Override
	public DescribeSagOnlineClientStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSagOnlineClientStatisticsResponseUnmarshaller.unmarshall(this, context);
	}
}
