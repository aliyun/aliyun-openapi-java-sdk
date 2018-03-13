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
package com.aliyuncs.cdn.model.v20141111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeDomainOnlineUserNumberResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainOnlineUserNumberResponse extends AcsResponse {

	private String requestId;

	private List<LiveStreamOnlineUserNumInfo> liveStreamOnlineUserNumInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<LiveStreamOnlineUserNumInfo> getLiveStreamOnlineUserNumInfos() {
		return this.liveStreamOnlineUserNumInfos;
	}

	public void setLiveStreamOnlineUserNumInfos(List<LiveStreamOnlineUserNumInfo> liveStreamOnlineUserNumInfos) {
		this.liveStreamOnlineUserNumInfos = liveStreamOnlineUserNumInfos;
	}

	public static class LiveStreamOnlineUserNumInfo {

		private String time;

		private Long userNumber;

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public Long getUserNumber() {
			return this.userNumber;
		}

		public void setUserNumber(Long userNumber) {
			this.userNumber = userNumber;
		}
	}

	@Override
	public DescribeDomainOnlineUserNumberResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainOnlineUserNumberResponseUnmarshaller.unmarshall(this, context);
	}
}
