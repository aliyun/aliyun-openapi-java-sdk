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
import com.aliyuncs.live.transform.v20161101.DescribeLiveGrtnDurationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveGrtnDurationResponse extends AcsResponse {

	private String requestId;

	private List<StreamData> streamDetailData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<StreamData> getStreamDetailData() {
		return this.streamDetailData;
	}

	public void setStreamDetailData(List<StreamData> streamDetailData) {
		this.streamDetailData = streamDetailData;
	}

	public static class StreamData {

		private Long duration;

		private String timeStamp;

		private String mediaProfile;

		private String mediaType;

		private String appId;

		public Long getDuration() {
			return this.duration;
		}

		public void setDuration(Long duration) {
			this.duration = duration;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getMediaProfile() {
			return this.mediaProfile;
		}

		public void setMediaProfile(String mediaProfile) {
			this.mediaProfile = mediaProfile;
		}

		public String getMediaType() {
			return this.mediaType;
		}

		public void setMediaType(String mediaType) {
			this.mediaType = mediaType;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}
	}

	@Override
	public DescribeLiveGrtnDurationResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveGrtnDurationResponseUnmarshaller.unmarshall(this, context);
	}
}
