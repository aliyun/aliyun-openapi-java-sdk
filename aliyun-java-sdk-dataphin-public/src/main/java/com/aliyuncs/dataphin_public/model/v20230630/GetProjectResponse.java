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
import com.aliyuncs.dataphin_public.transform.v20230630.GetProjectResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetProjectResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private ProjectInfo projectInfo;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ProjectInfo getProjectInfo() {
		return this.projectInfo;
	}

	public void setProjectInfo(ProjectInfo projectInfo) {
		this.projectInfo = projectInfo;
	}

	public static class ProjectInfo {

		private Long bizUnitId;

		private String bizUnitDisplayName;

		private Long computeSourceId;

		private String computeSourceName;

		private Long streamComputeSourceId;

		private String streamComputeSourceName;

		private String nameSpaceTag;

		private String env;

		private String mode;

		private String type;

		private Long id;

		private String name;

		private String displayName;

		private String description;

		private String gmtCreate;

		private String gmtModified;

		private String owner;

		private String ownerName;

		private List<WhiteList> whiteLists;

		public Long getBizUnitId() {
			return this.bizUnitId;
		}

		public void setBizUnitId(Long bizUnitId) {
			this.bizUnitId = bizUnitId;
		}

		public String getBizUnitDisplayName() {
			return this.bizUnitDisplayName;
		}

		public void setBizUnitDisplayName(String bizUnitDisplayName) {
			this.bizUnitDisplayName = bizUnitDisplayName;
		}

		public Long getComputeSourceId() {
			return this.computeSourceId;
		}

		public void setComputeSourceId(Long computeSourceId) {
			this.computeSourceId = computeSourceId;
		}

		public String getComputeSourceName() {
			return this.computeSourceName;
		}

		public void setComputeSourceName(String computeSourceName) {
			this.computeSourceName = computeSourceName;
		}

		public Long getStreamComputeSourceId() {
			return this.streamComputeSourceId;
		}

		public void setStreamComputeSourceId(Long streamComputeSourceId) {
			this.streamComputeSourceId = streamComputeSourceId;
		}

		public String getStreamComputeSourceName() {
			return this.streamComputeSourceName;
		}

		public void setStreamComputeSourceName(String streamComputeSourceName) {
			this.streamComputeSourceName = streamComputeSourceName;
		}

		public String getNameSpaceTag() {
			return this.nameSpaceTag;
		}

		public void setNameSpaceTag(String nameSpaceTag) {
			this.nameSpaceTag = nameSpaceTag;
		}

		public String getEnv() {
			return this.env;
		}

		public void setEnv(String env) {
			this.env = env;
		}

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getOwnerName() {
			return this.ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}

		public List<WhiteList> getWhiteLists() {
			return this.whiteLists;
		}

		public void setWhiteLists(List<WhiteList> whiteLists) {
			this.whiteLists = whiteLists;
		}

		public static class WhiteList {

			private String description;

			private String ip;

			private String port;

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public String getPort() {
				return this.port;
			}

			public void setPort(String port) {
				this.port = port;
			}
		}
	}

	@Override
	public GetProjectResponse getInstance(UnmarshallerContext context) {
		return	GetProjectResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
