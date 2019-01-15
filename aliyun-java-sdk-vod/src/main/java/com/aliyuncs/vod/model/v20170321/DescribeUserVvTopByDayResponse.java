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
import com.aliyuncs.vod.transform.v20170321.DescribeUserVvTopByDayResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserVvTopByDayResponse extends AcsResponse {

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

		private String count;

		private String videoid;

		private String videoName;

		public String getCount() {
			return this.count;
		}

		public void setCount(String count) {
			this.count = count;
		}

		public String getVideoid() {
			return this.videoid;
		}

		public void setVideoid(String videoid) {
			this.videoid = videoid;
		}

		public String getVideoName() {
			return this.videoName;
		}

		public void setVideoName(String videoName) {
			this.videoName = videoName;
		}
	}

	@Override
	public DescribeUserVvTopByDayResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserVvTopByDayResponseUnmarshaller.unmarshall(this, context);
	}
}
