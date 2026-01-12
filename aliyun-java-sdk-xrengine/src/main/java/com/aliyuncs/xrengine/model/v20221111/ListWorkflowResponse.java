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

package com.aliyuncs.xrengine.model.v20221111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.xrengine.transform.v20221111.ListWorkflowResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListWorkflowResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String message;

	private Long httpCode;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(Long httpCode) {
		this.httpCode = httpCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<Workflow> object;

		private List<Workflow> objectGeneration;

		private List<Workflow> mannequins;

		private List<Workflow> scene;

		private List<Workflow> humanPose;

		public List<Workflow> getObject() {
			return this.object;
		}

		public void setObject(List<Workflow> object) {
			this.object = object;
		}

		public List<Workflow> getObjectGeneration() {
			return this.objectGeneration;
		}

		public void setObjectGeneration(List<Workflow> objectGeneration) {
			this.objectGeneration = objectGeneration;
		}

		public List<Workflow> getMannequins() {
			return this.mannequins;
		}

		public void setMannequins(List<Workflow> mannequins) {
			this.mannequins = mannequins;
		}

		public List<Workflow> getScene() {
			return this.scene;
		}

		public void setScene(List<Workflow> scene) {
			this.scene = scene;
		}

		public List<Workflow> getHumanPose() {
			return this.humanPose;
		}

		public void setHumanPose(List<Workflow> humanPose) {
			this.humanPose = humanPose;
		}

		public static class Workflow {

			private String bizUsage;

			private Long id;

			private String objectType;

			private Long status;

			private String name;

			public String getBizUsage() {
				return this.bizUsage;
			}

			public void setBizUsage(String bizUsage) {
				this.bizUsage = bizUsage;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getObjectType() {
				return this.objectType;
			}

			public void setObjectType(String objectType) {
				this.objectType = objectType;
			}

			public Long getStatus() {
				return this.status;
			}

			public void setStatus(Long status) {
				this.status = status;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public ListWorkflowResponse getInstance(UnmarshallerContext context) {
		return	ListWorkflowResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
