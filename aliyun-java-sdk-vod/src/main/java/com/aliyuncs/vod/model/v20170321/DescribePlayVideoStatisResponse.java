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
import com.aliyuncs.vod.transform.v20170321.DescribePlayVideoStatisResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePlayVideoStatisResponse extends AcsResponse {

	private String requestId;

	private List<VideoPlayStatisDetail> videoPlayStatisDetails;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<VideoPlayStatisDetail> getVideoPlayStatisDetails() {
		return this.videoPlayStatisDetails;
	}

	public void setVideoPlayStatisDetails(List<VideoPlayStatisDetail> videoPlayStatisDetails) {
		this.videoPlayStatisDetails = videoPlayStatisDetails;
	}

	public static class VideoPlayStatisDetail {

		private String date;

		private String playDuration;

		private String vV;

		private String uV;

		private String playRange;

		private String title;

		public String getDate() {
			return this.date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getPlayDuration() {
			return this.playDuration;
		}

		public void setPlayDuration(String playDuration) {
			this.playDuration = playDuration;
		}

		public String getVV() {
			return this.vV;
		}

		public void setVV(String vV) {
			this.vV = vV;
		}

		public String getUV() {
			return this.uV;
		}

		public void setUV(String uV) {
			this.uV = uV;
		}

		public String getPlayRange() {
			return this.playRange;
		}

		public void setPlayRange(String playRange) {
			this.playRange = playRange;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
	}

	@Override
	public DescribePlayVideoStatisResponse getInstance(UnmarshallerContext context) {
		return	DescribePlayVideoStatisResponseUnmarshaller.unmarshall(this, context);
	}
}
