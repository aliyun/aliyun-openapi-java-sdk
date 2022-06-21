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
import com.aliyuncs.live.transform.v20161101.DescribeLiveDomainStreamTranscodeDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveDomainStreamTranscodeDataResponse extends AcsResponse {

	private String requestId;

	private List<TranscodeData> transcodeDataList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TranscodeData> getTranscodeDataList() {
		return this.transcodeDataList;
	}

	public void setTranscodeDataList(List<TranscodeData> transcodeDataList) {
		this.transcodeDataList = transcodeDataList;
	}

	public static class TranscodeData {

		private String timeStamp;

		private String domain;

		private String region;

		private String tanscodeType;

		private String resolution;

		private String fps;

		private Integer duration;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getTanscodeType() {
			return this.tanscodeType;
		}

		public void setTanscodeType(String tanscodeType) {
			this.tanscodeType = tanscodeType;
		}

		public String getResolution() {
			return this.resolution;
		}

		public void setResolution(String resolution) {
			this.resolution = resolution;
		}

		public String getFps() {
			return this.fps;
		}

		public void setFps(String fps) {
			this.fps = fps;
		}

		public Integer getDuration() {
			return this.duration;
		}

		public void setDuration(Integer duration) {
			this.duration = duration;
		}
	}

	@Override
	public DescribeLiveDomainStreamTranscodeDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveDomainStreamTranscodeDataResponseUnmarshaller.unmarshall(this, context);
	}
}
