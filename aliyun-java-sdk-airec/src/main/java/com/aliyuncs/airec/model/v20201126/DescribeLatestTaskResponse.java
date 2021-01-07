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

package com.aliyuncs.airec.model.v20201126;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20201126.DescribeLatestTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLatestTaskResponse extends AcsResponse {

	private String requestId;

	private List<IndexVersion> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<IndexVersion> getResult() {
		return this.result;
	}

	public void setResult(List<IndexVersion> result) {
		this.result = result;
	}

	public static class IndexVersion {

		private String versionId;

		private String status;

		private String builtTime;

		private String switchedTime;

		private Boolean rollbackEnabled;

		private Integer costSeconds;

		private Long size;

		private Integer progress;

		private String flowType;

		private String code;

		private String message;

		public String getVersionId() {
			return this.versionId;
		}

		public void setVersionId(String versionId) {
			this.versionId = versionId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getBuiltTime() {
			return this.builtTime;
		}

		public void setBuiltTime(String builtTime) {
			this.builtTime = builtTime;
		}

		public String getSwitchedTime() {
			return this.switchedTime;
		}

		public void setSwitchedTime(String switchedTime) {
			this.switchedTime = switchedTime;
		}

		public Boolean getRollbackEnabled() {
			return this.rollbackEnabled;
		}

		public void setRollbackEnabled(Boolean rollbackEnabled) {
			this.rollbackEnabled = rollbackEnabled;
		}

		public Integer getCostSeconds() {
			return this.costSeconds;
		}

		public void setCostSeconds(Integer costSeconds) {
			this.costSeconds = costSeconds;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public Integer getProgress() {
			return this.progress;
		}

		public void setProgress(Integer progress) {
			this.progress = progress;
		}

		public String getFlowType() {
			return this.flowType;
		}

		public void setFlowType(String flowType) {
			this.flowType = flowType;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}

	@Override
	public DescribeLatestTaskResponse getInstance(UnmarshallerContext context) {
		return	DescribeLatestTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
