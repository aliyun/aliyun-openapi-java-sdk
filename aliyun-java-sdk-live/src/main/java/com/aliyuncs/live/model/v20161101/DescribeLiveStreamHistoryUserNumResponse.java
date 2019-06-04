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
import com.aliyuncs.live.transform.v20161101.DescribeLiveStreamHistoryUserNumResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamHistoryUserNumResponse extends AcsResponse {

	private String requestId;

	private List<LiveStreamUserNumInfo> liveStreamUserNumInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<LiveStreamUserNumInfo> getLiveStreamUserNumInfos() {
		return this.liveStreamUserNumInfos;
	}

	public void setLiveStreamUserNumInfos(List<LiveStreamUserNumInfo> liveStreamUserNumInfos) {
		this.liveStreamUserNumInfos = liveStreamUserNumInfos;
	}

	public static class LiveStreamUserNumInfo {

		private String streamTime;

		private String userNum;

		public String getStreamTime() {
			return this.streamTime;
		}

		public void setStreamTime(String streamTime) {
			this.streamTime = streamTime;
		}

		public String getUserNum() {
			return this.userNum;
		}

		public void setUserNum(String userNum) {
			this.userNum = userNum;
		}
	}

	@Override
	public DescribeLiveStreamHistoryUserNumResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamHistoryUserNumResponseUnmarshaller.unmarshall(this, context);
	}
}
