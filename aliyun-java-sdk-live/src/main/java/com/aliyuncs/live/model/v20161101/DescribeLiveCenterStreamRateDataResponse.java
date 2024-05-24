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
import com.aliyuncs.live.transform.v20161101.DescribeLiveCenterStreamRateDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveCenterStreamRateDataResponse extends AcsResponse {

	private String requestId;

	private List<Data> rateDatas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getRateDatas() {
		return this.rateDatas;
	}

	public void setRateDatas(List<Data> rateDatas) {
		this.rateDatas = rateDatas;
	}

	public static class Data {

		private String audioFps;

		private String audioRate;

		private String time;

		private String videoFps;

		private String videoRate;

		public String getAudioFps() {
			return this.audioFps;
		}

		public void setAudioFps(String audioFps) {
			this.audioFps = audioFps;
		}

		public String getAudioRate() {
			return this.audioRate;
		}

		public void setAudioRate(String audioRate) {
			this.audioRate = audioRate;
		}

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public String getVideoFps() {
			return this.videoFps;
		}

		public void setVideoFps(String videoFps) {
			this.videoFps = videoFps;
		}

		public String getVideoRate() {
			return this.videoRate;
		}

		public void setVideoRate(String videoRate) {
			this.videoRate = videoRate;
		}
	}

	@Override
	public DescribeLiveCenterStreamRateDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveCenterStreamRateDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
