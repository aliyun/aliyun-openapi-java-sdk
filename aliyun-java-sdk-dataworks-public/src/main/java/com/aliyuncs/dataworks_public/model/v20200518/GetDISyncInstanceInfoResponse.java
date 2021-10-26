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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.GetDISyncInstanceInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDISyncInstanceInfoResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String status;

		private String message;

		private String name;

		private SolutionInfo solutionInfo;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public SolutionInfo getSolutionInfo() {
			return this.solutionInfo;
		}

		public void setSolutionInfo(SolutionInfo solutionInfo) {
			this.solutionInfo = solutionInfo;
		}

		public static class SolutionInfo {

			private String status;

			private Long id;

			private String creatorName;

			private List<StepDetailItem> stepDetail;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getCreatorName() {
				return this.creatorName;
			}

			public void setCreatorName(String creatorName) {
				this.creatorName = creatorName;
			}

			public List<StepDetailItem> getStepDetail() {
				return this.stepDetail;
			}

			public void setStepDetail(List<StepDetailItem> stepDetail) {
				this.stepDetail = stepDetail;
			}

			public static class StepDetailItem {

				private String status;

				private Long stepId;

				private String stepName;

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public Long getStepId() {
					return this.stepId;
				}

				public void setStepId(Long stepId) {
					this.stepId = stepId;
				}

				public String getStepName() {
					return this.stepName;
				}

				public void setStepName(String stepName) {
					this.stepName = stepName;
				}
			}
		}
	}

	@Override
	public GetDISyncInstanceInfoResponse getInstance(UnmarshallerContext context) {
		return	GetDISyncInstanceInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
