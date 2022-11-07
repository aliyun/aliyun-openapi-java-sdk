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
import com.aliyuncs.dataworks_public.transform.v20200518.GetDeploymentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDeploymentResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String errorMessage;

	private String requestId;

	private String errorCode;

	private Boolean success;

	private Data data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
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

		private List<DeployedItem> deployedItems;

		private Deployment deployment;

		public List<DeployedItem> getDeployedItems() {
			return this.deployedItems;
		}

		public void setDeployedItems(List<DeployedItem> deployedItems) {
			this.deployedItems = deployedItems;
		}

		public Deployment getDeployment() {
			return this.deployment;
		}

		public void setDeployment(Deployment deployment) {
			this.deployment = deployment;
		}

		public static class DeployedItem {

			private Long fileId;

			private Long fileVersion;

			private Integer status;

			public Long getFileId() {
				return this.fileId;
			}

			public void setFileId(Long fileId) {
				this.fileId = fileId;
			}

			public Long getFileVersion() {
				return this.fileVersion;
			}

			public void setFileVersion(Long fileVersion) {
				this.fileVersion = fileVersion;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}
		}

		public static class Deployment {

			private Integer status;

			private String errorMessage;

			private Integer fromEnvironment;

			private Integer toEnvironment;

			private Integer checkingStatus;

			private Long createTime;

			private String handlerId;

			private String creatorId;

			private Long executeTime;

			private String name;

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public Integer getFromEnvironment() {
				return this.fromEnvironment;
			}

			public void setFromEnvironment(Integer fromEnvironment) {
				this.fromEnvironment = fromEnvironment;
			}

			public Integer getToEnvironment() {
				return this.toEnvironment;
			}

			public void setToEnvironment(Integer toEnvironment) {
				this.toEnvironment = toEnvironment;
			}

			public Integer getCheckingStatus() {
				return this.checkingStatus;
			}

			public void setCheckingStatus(Integer checkingStatus) {
				this.checkingStatus = checkingStatus;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public String getHandlerId() {
				return this.handlerId;
			}

			public void setHandlerId(String handlerId) {
				this.handlerId = handlerId;
			}

			public String getCreatorId() {
				return this.creatorId;
			}

			public void setCreatorId(String creatorId) {
				this.creatorId = creatorId;
			}

			public Long getExecuteTime() {
				return this.executeTime;
			}

			public void setExecuteTime(Long executeTime) {
				this.executeTime = executeTime;
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
	public GetDeploymentResponse getInstance(UnmarshallerContext context) {
		return	GetDeploymentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
