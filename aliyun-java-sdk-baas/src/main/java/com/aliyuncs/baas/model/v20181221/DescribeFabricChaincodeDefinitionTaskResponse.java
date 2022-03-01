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

package com.aliyuncs.baas.model.v20181221;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20181221.DescribeFabricChaincodeDefinitionTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFabricChaincodeDefinitionTaskResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer errorCode;

	private Result result;

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

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String status;

		private String type;

		private String channelName;

		private String description;

		private Long createTime;

		private String taskId;

		private String creator;

		private List<String> approvers;

		private Content content;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getChannelName() {
			return this.channelName;
		}

		public void setChannelName(String channelName) {
			this.channelName = channelName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public List<String> getApprovers() {
			return this.approvers;
		}

		public void setApprovers(List<String> approvers) {
			this.approvers = approvers;
		}

		public Content getContent() {
			return this.content;
		}

		public void setContent(Content content) {
			this.content = content;
		}

		public static class Content {

			private ChaincodeDefinition chaincodeDefinition;

			public ChaincodeDefinition getChaincodeDefinition() {
				return this.chaincodeDefinition;
			}

			public void setChaincodeDefinition(ChaincodeDefinition chaincodeDefinition) {
				this.chaincodeDefinition = chaincodeDefinition;
			}

			public static class ChaincodeDefinition {

				private String endorsementPolicy;

				private Long sequence;

				private String version;

				private String chaincodePackageId;

				private String name;

				private Boolean initRequired;

				private String collectionConfig;

				private String uid;

				public String getEndorsementPolicy() {
					return this.endorsementPolicy;
				}

				public void setEndorsementPolicy(String endorsementPolicy) {
					this.endorsementPolicy = endorsementPolicy;
				}

				public Long getSequence() {
					return this.sequence;
				}

				public void setSequence(Long sequence) {
					this.sequence = sequence;
				}

				public String getVersion() {
					return this.version;
				}

				public void setVersion(String version) {
					this.version = version;
				}

				public String getChaincodePackageId() {
					return this.chaincodePackageId;
				}

				public void setChaincodePackageId(String chaincodePackageId) {
					this.chaincodePackageId = chaincodePackageId;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Boolean getInitRequired() {
					return this.initRequired;
				}

				public void setInitRequired(Boolean initRequired) {
					this.initRequired = initRequired;
				}

				public String getCollectionConfig() {
					return this.collectionConfig;
				}

				public void setCollectionConfig(String collectionConfig) {
					this.collectionConfig = collectionConfig;
				}

				public String getUid() {
					return this.uid;
				}

				public void setUid(String uid) {
					this.uid = uid;
				}
			}
		}
	}

	@Override
	public DescribeFabricChaincodeDefinitionTaskResponse getInstance(UnmarshallerContext context) {
		return	DescribeFabricChaincodeDefinitionTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
