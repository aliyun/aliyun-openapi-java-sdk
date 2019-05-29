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
import com.aliyuncs.smartag.transform.v20180313.DescribeUserOnlineClientStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserOnlineClientStatisticsResponse extends AcsResponse {

	private String requestId;

	private List<Statistics> userStatistics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Statistics> getUserStatistics() {
		return this.userStatistics;
	}

	public void setUserStatistics(List<Statistics> userStatistics) {
		this.userStatistics = userStatistics;
	}

	public static class Statistics {

		private String userName;

		private String onlineCount;

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getOnlineCount() {
			return this.onlineCount;
		}

		public void setOnlineCount(String onlineCount) {
			this.onlineCount = onlineCount;
		}
	}

	@Override
	public DescribeUserOnlineClientStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserOnlineClientStatisticsResponseUnmarshaller.unmarshall(this, context);
	}
}
