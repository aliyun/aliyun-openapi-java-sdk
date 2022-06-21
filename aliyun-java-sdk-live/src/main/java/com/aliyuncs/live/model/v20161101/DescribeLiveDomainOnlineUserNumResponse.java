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
import com.aliyuncs.live.transform.v20161101.DescribeLiveDomainOnlineUserNumResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveDomainOnlineUserNumResponse extends AcsResponse {

	private String requestId;

	private Integer streamCount;

	private Integer userCount;

	private List<LiveStreamOnlineUserNumInfo> onlineUserInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getStreamCount() {
		return this.streamCount;
	}

	public void setStreamCount(Integer streamCount) {
		this.streamCount = streamCount;
	}

	public Integer getUserCount() {
		return this.userCount;
	}

	public void setUserCount(Integer userCount) {
		this.userCount = userCount;
	}

	public List<LiveStreamOnlineUserNumInfo> getOnlineUserInfo() {
		return this.onlineUserInfo;
	}

	public void setOnlineUserInfo(List<LiveStreamOnlineUserNumInfo> onlineUserInfo) {
		this.onlineUserInfo = onlineUserInfo;
	}

	public static class LiveStreamOnlineUserNumInfo {

		private String streamName;

		private List<Info> infos;

		public String getStreamName() {
			return this.streamName;
		}

		public void setStreamName(String streamName) {
			this.streamName = streamName;
		}

		public List<Info> getInfos() {
			return this.infos;
		}

		public void setInfos(List<Info> infos) {
			this.infos = infos;
		}

		public static class Info {

			private String transcodeTemplate;

			private Long userNumber;

			public String getTranscodeTemplate() {
				return this.transcodeTemplate;
			}

			public void setTranscodeTemplate(String transcodeTemplate) {
				this.transcodeTemplate = transcodeTemplate;
			}

			public Long getUserNumber() {
				return this.userNumber;
			}

			public void setUserNumber(Long userNumber) {
				this.userNumber = userNumber;
			}
		}
	}

	@Override
	public DescribeLiveDomainOnlineUserNumResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveDomainOnlineUserNumResponseUnmarshaller.unmarshall(this, context);
	}
}
