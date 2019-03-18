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

package com.aliyuncs.afs.model.v20180112;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.afs.transform.v20180112.DescribeEarlyWarningResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEarlyWarningResponse extends AcsResponse {

	private String requestId;

	private Boolean hasWarning;

	private String bizCode;

	private List<EarlyWarning> earlyWarnings;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getHasWarning() {
		return this.hasWarning;
	}

	public void setHasWarning(Boolean hasWarning) {
		this.hasWarning = hasWarning;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public List<EarlyWarning> getEarlyWarnings() {
		return this.earlyWarnings;
	}

	public void setEarlyWarnings(List<EarlyWarning> earlyWarnings) {
		this.earlyWarnings = earlyWarnings;
	}

	public static class EarlyWarning {

		private Boolean warnOpen;

		private String title;

		private String content;

		private String frequency;

		private Boolean timeOpen;

		private String timeBegin;

		private String timeEnd;

		private String channel;

		public Boolean getWarnOpen() {
			return this.warnOpen;
		}

		public void setWarnOpen(Boolean warnOpen) {
			this.warnOpen = warnOpen;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getFrequency() {
			return this.frequency;
		}

		public void setFrequency(String frequency) {
			this.frequency = frequency;
		}

		public Boolean getTimeOpen() {
			return this.timeOpen;
		}

		public void setTimeOpen(Boolean timeOpen) {
			this.timeOpen = timeOpen;
		}

		public String getTimeBegin() {
			return this.timeBegin;
		}

		public void setTimeBegin(String timeBegin) {
			this.timeBegin = timeBegin;
		}

		public String getTimeEnd() {
			return this.timeEnd;
		}

		public void setTimeEnd(String timeEnd) {
			this.timeEnd = timeEnd;
		}

		public String getChannel() {
			return this.channel;
		}

		public void setChannel(String channel) {
			this.channel = channel;
		}
	}

	@Override
	public DescribeEarlyWarningResponse getInstance(UnmarshallerContext context) {
		return	DescribeEarlyWarningResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
