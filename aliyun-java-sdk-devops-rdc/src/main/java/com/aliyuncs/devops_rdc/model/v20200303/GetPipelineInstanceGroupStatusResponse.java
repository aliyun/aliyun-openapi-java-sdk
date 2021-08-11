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

package com.aliyuncs.devops_rdc.model.v20200303;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops_rdc.transform.v20200303.GetPipelineInstanceGroupStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPipelineInstanceGroupStatusResponse extends AcsResponse {

	private String requestId;

	private String errorMessage;

	private Boolean success;

	private String errorCode;

	private Object object;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Object getObject() {
		return this.object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public static class Object {

		private String status;

		private List<Group> groups;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<Group> getGroups() {
			return this.groups;
		}

		public void setGroups(List<Group> groups) {
			this.groups = groups;
		}

		public static class Group {

			private String status;

			private String name;

			private List<Stage> stages;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public List<Stage> getStages() {
				return this.stages;
			}

			public void setStages(List<Stage> stages) {
				this.stages = stages;
			}

			public static class Stage {

				private String status;

				private String sign;

				private List<Component> components;

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getSign() {
					return this.sign;
				}

				public void setSign(String sign) {
					this.sign = sign;
				}

				public List<Component> getComponents() {
					return this.components;
				}

				public void setComponents(List<Component> components) {
					this.components = components;
				}

				public static class Component {

					private String status;

					private String name;

					private String jobId;

					public String getStatus() {
						return this.status;
					}

					public void setStatus(String status) {
						this.status = status;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getJobId() {
						return this.jobId;
					}

					public void setJobId(String jobId) {
						this.jobId = jobId;
					}
				}
			}
		}
	}

	@Override
	public GetPipelineInstanceGroupStatusResponse getInstance(UnmarshallerContext context) {
		return	GetPipelineInstanceGroupStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
