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

package com.aliyuncs.fss.model.v20190125;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.fss.transform.v20190125.GetSoftwareFilePatternUrlResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSoftwareFilePatternUrlResponse extends AcsResponse {

	private String requestId;

	private Integer fssCode;

	private String fssMessage;

	private PatternInfo patternInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getFssCode() {
		return this.fssCode;
	}

	public void setFssCode(Integer fssCode) {
		this.fssCode = fssCode;
	}

	public String getFssMessage() {
		return this.fssMessage;
	}

	public void setFssMessage(String fssMessage) {
		this.fssMessage = fssMessage;
	}

	public PatternInfo getPatternInfo() {
		return this.patternInfo;
	}

	public void setPatternInfo(PatternInfo patternInfo) {
		this.patternInfo = patternInfo;
	}

	public static class PatternInfo {

		private String latestUpdateTime;

		private String url;

		private String path;

		public String getLatestUpdateTime() {
			return this.latestUpdateTime;
		}

		public void setLatestUpdateTime(String latestUpdateTime) {
			this.latestUpdateTime = latestUpdateTime;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}
	}

	@Override
	public GetSoftwareFilePatternUrlResponse getInstance(UnmarshallerContext context) {
		return	GetSoftwareFilePatternUrlResponseUnmarshaller.unmarshall(this, context);
	}
}
