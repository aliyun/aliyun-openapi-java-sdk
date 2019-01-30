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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.DescribePlayUserAvgResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePlayUserAvgResponse extends AcsResponse {

	private String requestId;

	private List<UserPlayStatisAvg> userPlayStatisAvgs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<UserPlayStatisAvg> getUserPlayStatisAvgs() {
		return this.userPlayStatisAvgs;
	}

	public void setUserPlayStatisAvgs(List<UserPlayStatisAvg> userPlayStatisAvgs) {
		this.userPlayStatisAvgs = userPlayStatisAvgs;
	}

	public static class UserPlayStatisAvg {

		private String date;

		private String avgPlayDuration;

		private String avgPlayCount;

		public String getDate() {
			return this.date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getAvgPlayDuration() {
			return this.avgPlayDuration;
		}

		public void setAvgPlayDuration(String avgPlayDuration) {
			this.avgPlayDuration = avgPlayDuration;
		}

		public String getAvgPlayCount() {
			return this.avgPlayCount;
		}

		public void setAvgPlayCount(String avgPlayCount) {
			this.avgPlayCount = avgPlayCount;
		}
	}

	@Override
	public DescribePlayUserAvgResponse getInstance(UnmarshallerContext context) {
		return	DescribePlayUserAvgResponseUnmarshaller.unmarshall(this, context);
	}
}
