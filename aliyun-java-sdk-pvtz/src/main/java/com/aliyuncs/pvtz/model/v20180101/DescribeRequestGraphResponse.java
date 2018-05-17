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

package com.aliyuncs.pvtz.model.v20180101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pvtz.transform.v20180101.DescribeRequestGraphResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRequestGraphResponse extends AcsResponse {

	private String requestId;

	private List<ZoneRequestTop> requestDetails;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ZoneRequestTop> getRequestDetails() {
		return this.requestDetails;
	}

	public void setRequestDetails(List<ZoneRequestTop> requestDetails) {
		this.requestDetails = requestDetails;
	}

	public static class ZoneRequestTop {

		private String time;

		private Long timestamp;

		private Long requestCount;

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}

		public Long getRequestCount() {
			return this.requestCount;
		}

		public void setRequestCount(Long requestCount) {
			this.requestCount = requestCount;
		}
	}

	@Override
	public DescribeRequestGraphResponse getInstance(UnmarshallerContext context) {
		return	DescribeRequestGraphResponseUnmarshaller.unmarshall(this, context);
	}
}
