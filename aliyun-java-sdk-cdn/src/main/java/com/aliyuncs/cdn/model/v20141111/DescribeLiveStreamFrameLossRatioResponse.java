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
import com.aliyuncs.cdn.transform.v20141111.DescribeLiveStreamFrameLossRatioResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamFrameLossRatioResponse extends AcsResponse {

	private String requestId;

	private List<FrameLossRatioInfo> frameLossRatioInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FrameLossRatioInfo> getFrameLossRatioInfos() {
		return this.frameLossRatioInfos;
	}

	public void setFrameLossRatioInfos(List<FrameLossRatioInfo> frameLossRatioInfos) {
		this.frameLossRatioInfos = frameLossRatioInfos;
	}

	public static class FrameLossRatioInfo {

		private String streamUrl;

		private Float frameLossRatio;

		private String time;

		public String getStreamUrl() {
			return this.streamUrl;
		}

		public void setStreamUrl(String streamUrl) {
			this.streamUrl = streamUrl;
		}

		public Float getFrameLossRatio() {
			return this.frameLossRatio;
		}

		public void setFrameLossRatio(Float frameLossRatio) {
			this.frameLossRatio = frameLossRatio;
		}

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}
	}

	@Override
	public DescribeLiveStreamFrameLossRatioResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamFrameLossRatioResponseUnmarshaller.unmarshall(this, context);
	}
}
