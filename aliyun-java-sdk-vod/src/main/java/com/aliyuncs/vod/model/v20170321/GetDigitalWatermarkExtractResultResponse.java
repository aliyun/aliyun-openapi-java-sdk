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
import com.aliyuncs.vod.transform.v20170321.GetDigitalWatermarkExtractResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDigitalWatermarkExtractResultResponse extends AcsResponse {

	private String requestId;

	private List<AiExtractResult> aiExtractResultList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AiExtractResult> getAiExtractResultList() {
		return this.aiExtractResultList;
	}

	public void setAiExtractResultList(List<AiExtractResult> aiExtractResultList) {
		this.aiExtractResultList = aiExtractResultList;
	}

	public static class AiExtractResult {

		private String jobId;

		private String createTime;

		private String modifyTime;

		private String status;

		private String errorMessage;

		private String waterMarkText;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getWaterMarkText() {
			return this.waterMarkText;
		}

		public void setWaterMarkText(String waterMarkText) {
			this.waterMarkText = waterMarkText;
		}
	}

	@Override
	public GetDigitalWatermarkExtractResultResponse getInstance(UnmarshallerContext context) {
		return	GetDigitalWatermarkExtractResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
