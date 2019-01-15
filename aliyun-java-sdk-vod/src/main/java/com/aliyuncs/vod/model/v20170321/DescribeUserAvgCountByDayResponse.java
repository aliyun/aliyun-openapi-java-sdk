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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.DescribeUserAvgCountByDayResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserAvgCountByDayResponse extends AcsResponse {

	private String requestId;

	private List<UserPlayStatisticsInfo> userPlayStatisticsInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<UserPlayStatisticsInfo> getUserPlayStatisticsInfos() {
		return this.userPlayStatisticsInfos;
	}

	public void setUserPlayStatisticsInfos(List<UserPlayStatisticsInfo> userPlayStatisticsInfos) {
		this.userPlayStatisticsInfos = userPlayStatisticsInfos;
	}

	public static class UserPlayStatisticsInfo {

		private String date;

		private String all;

		public String getDate() {
			return this.date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getAll() {
			return this.all;
		}

		public void setAll(String all) {
			this.all = all;
		}
	}

	@Override
	public DescribeUserAvgCountByDayResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserAvgCountByDayResponseUnmarshaller.unmarshall(this, context);
	}
}
