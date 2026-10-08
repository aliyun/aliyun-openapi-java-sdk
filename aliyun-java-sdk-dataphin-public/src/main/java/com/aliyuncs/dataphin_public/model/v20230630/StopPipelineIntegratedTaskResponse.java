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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.StopPipelineIntegratedTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class StopPipelineIntegratedTaskResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long success;

		private Long fail;

		private List<DevOpsActionResDTO> devOpsActionResDTOList;

		public Long getSuccess() {
			return this.success;
		}

		public void setSuccess(Long success) {
			this.success = success;
		}

		public Long getFail() {
			return this.fail;
		}

		public void setFail(Long fail) {
			this.fail = fail;
		}

		public List<DevOpsActionResDTO> getDevOpsActionResDTOList() {
			return this.devOpsActionResDTOList;
		}

		public void setDevOpsActionResDTOList(List<DevOpsActionResDTO> devOpsActionResDTOList) {
			this.devOpsActionResDTOList = devOpsActionResDTOList;
		}

		public static class DevOpsActionResDTO {

			private String status;

			private String owner;

			private String jobName;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public String getJobName() {
				return this.jobName;
			}

			public void setJobName(String jobName) {
				this.jobName = jobName;
			}
		}
	}

	@Override
	public StopPipelineIntegratedTaskResponse getInstance(UnmarshallerContext context) {
		return	StopPipelineIntegratedTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
