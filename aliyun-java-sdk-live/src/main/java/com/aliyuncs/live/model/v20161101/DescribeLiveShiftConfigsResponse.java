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
import com.aliyuncs.live.transform.v20161101.DescribeLiveShiftConfigsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveShiftConfigsResponse extends AcsResponse {

	private String requestId;

	private List<Config> content;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Config> getContent() {
		return this.content;
	}

	public void setContent(List<Config> content) {
		this.content = content;
	}

	public static class Config {

		private String domainName;

		private String appName;

		private String streamName;

		private Integer vision;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getStreamName() {
			return this.streamName;
		}

		public void setStreamName(String streamName) {
			this.streamName = streamName;
		}

		public Integer getVision() {
			return this.vision;
		}

		public void setVision(Integer vision) {
			this.vision = vision;
		}
	}

	@Override
	public DescribeLiveShiftConfigsResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveShiftConfigsResponseUnmarshaller.unmarshall(this, context);
	}
}
