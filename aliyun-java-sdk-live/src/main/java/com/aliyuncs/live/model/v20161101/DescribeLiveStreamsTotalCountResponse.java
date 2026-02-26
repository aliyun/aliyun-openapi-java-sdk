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
import com.aliyuncs.live.transform.v20161101.DescribeLiveStreamsTotalCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamsTotalCountResponse extends AcsResponse {

	private String requestId;

	private List<StreamCountInfos> streamCountList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<StreamCountInfos> getStreamCountList() {
		return this.streamCountList;
	}

	public void setStreamCountList(List<StreamCountInfos> streamCountList) {
		this.streamCountList = streamCountList;
	}

	public static class StreamCountInfos {

		private Integer count;

		private String timestamp;

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public String getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}
	}

	@Override
	public DescribeLiveStreamsTotalCountResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamsTotalCountResponseUnmarshaller.unmarshall(this, context);
	}
}
