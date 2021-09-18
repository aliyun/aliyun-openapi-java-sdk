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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.ListLetterSendJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLetterSendJobResponse extends AcsResponse {

	private String requestId;

	private List<LetterJob> letterJobList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<LetterJob> getLetterJobList() {
		return this.letterJobList;
	}

	public void setLetterJobList(List<LetterJob> letterJobList) {
		this.letterJobList = letterJobList;
	}

	public static class LetterJob {

		private String ccAddress;

		private String createTime;

		private Long userId;

		private String sendTime;

		private String toAddress;

		private String body;

		private String detectionId;

		private String bccAddress;

		private String jobId;

		private String title;

		private String templateId;

		private String modifyTime;

		public String getCcAddress() {
			return this.ccAddress;
		}

		public void setCcAddress(String ccAddress) {
			this.ccAddress = ccAddress;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getSendTime() {
			return this.sendTime;
		}

		public void setSendTime(String sendTime) {
			this.sendTime = sendTime;
		}

		public String getToAddress() {
			return this.toAddress;
		}

		public void setToAddress(String toAddress) {
			this.toAddress = toAddress;
		}

		public String getBody() {
			return this.body;
		}

		public void setBody(String body) {
			this.body = body;
		}

		public String getDetectionId() {
			return this.detectionId;
		}

		public void setDetectionId(String detectionId) {
			this.detectionId = detectionId;
		}

		public String getBccAddress() {
			return this.bccAddress;
		}

		public void setBccAddress(String bccAddress) {
			this.bccAddress = bccAddress;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}
	}

	@Override
	public ListLetterSendJobResponse getInstance(UnmarshallerContext context) {
		return	ListLetterSendJobResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
