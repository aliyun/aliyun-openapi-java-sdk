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
import com.aliyuncs.live.transform.v20161101.DescribeLiveStreamCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamCountResponse extends AcsResponse {

	private String requestId;

	private List<StreamCountInfo> streamCountInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<StreamCountInfo> getStreamCountInfos() {
		return this.streamCountInfos;
	}

	public void setStreamCountInfos(List<StreamCountInfo> streamCountInfos) {
		this.streamCountInfos = streamCountInfos;
	}

	public static class StreamCountInfo {

		private Long count;

		private Long limit;

		private String type;

		private List<StreamCountDetail> streamCountDetails;

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public Long getLimit() {
			return this.limit;
		}

		public void setLimit(Long limit) {
			this.limit = limit;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<StreamCountDetail> getStreamCountDetails() {
			return this.streamCountDetails;
		}

		public void setStreamCountDetails(List<StreamCountDetail> streamCountDetails) {
			this.streamCountDetails = streamCountDetails;
		}

		public static class StreamCountDetail {

			private String format;

			private Long videoDataRate;

			private Long count;

			public String getFormat() {
				return this.format;
			}

			public void setFormat(String format) {
				this.format = format;
			}

			public Long getVideoDataRate() {
				return this.videoDataRate;
			}

			public void setVideoDataRate(Long videoDataRate) {
				this.videoDataRate = videoDataRate;
			}

			public Long getCount() {
				return this.count;
			}

			public void setCount(Long count) {
				this.count = count;
			}
		}
	}

	@Override
	public DescribeLiveStreamCountResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamCountResponseUnmarshaller.unmarshall(this, context);
	}
}
