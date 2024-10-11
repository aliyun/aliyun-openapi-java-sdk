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
import com.aliyuncs.dataphin_public.transform.v20230630.ListNodesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListNodesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private PageResult pageResult;

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

	public PageResult getPageResult() {
		return this.pageResult;
	}

	public void setPageResult(PageResult pageResult) {
		this.pageResult = pageResult;
	}

	public static class PageResult {

		private Integer totalCount;

		private List<NodeInfo> nodeList;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<NodeInfo> getNodeList() {
			return this.nodeList;
		}

		public void setNodeList(List<NodeInfo> nodeList) {
			this.nodeList = nodeList;
		}

		public static class NodeInfo {

			private String description;

			private String createTime;

			private Boolean dryRun;

			private String from;

			private String subDetailType;

			private String name;

			private Boolean hasProd;

			private String type;

			private Boolean hasDev;

			private Boolean schedulePaused;

			private String lastModifiedTime;

			private String bizUnitName;

			private String id;

			private String extendInfo;

			private List<User> ownerList;

			private List<String> priorityList;

			private List<String> schedulePeriodList;

			private Creator creator;

			private ProjectInfo projectInfo;

			private Modifier modifier;

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public Boolean getDryRun() {
				return this.dryRun;
			}

			public void setDryRun(Boolean dryRun) {
				this.dryRun = dryRun;
			}

			public String getFrom() {
				return this.from;
			}

			public void setFrom(String from) {
				this.from = from;
			}

			public String getSubDetailType() {
				return this.subDetailType;
			}

			public void setSubDetailType(String subDetailType) {
				this.subDetailType = subDetailType;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Boolean getHasProd() {
				return this.hasProd;
			}

			public void setHasProd(Boolean hasProd) {
				this.hasProd = hasProd;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Boolean getHasDev() {
				return this.hasDev;
			}

			public void setHasDev(Boolean hasDev) {
				this.hasDev = hasDev;
			}

			public Boolean getSchedulePaused() {
				return this.schedulePaused;
			}

			public void setSchedulePaused(Boolean schedulePaused) {
				this.schedulePaused = schedulePaused;
			}

			public String getLastModifiedTime() {
				return this.lastModifiedTime;
			}

			public void setLastModifiedTime(String lastModifiedTime) {
				this.lastModifiedTime = lastModifiedTime;
			}

			public String getBizUnitName() {
				return this.bizUnitName;
			}

			public void setBizUnitName(String bizUnitName) {
				this.bizUnitName = bizUnitName;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getExtendInfo() {
				return this.extendInfo;
			}

			public void setExtendInfo(String extendInfo) {
				this.extendInfo = extendInfo;
			}

			public List<User> getOwnerList() {
				return this.ownerList;
			}

			public void setOwnerList(List<User> ownerList) {
				this.ownerList = ownerList;
			}

			public List<String> getPriorityList() {
				return this.priorityList;
			}

			public void setPriorityList(List<String> priorityList) {
				this.priorityList = priorityList;
			}

			public List<String> getSchedulePeriodList() {
				return this.schedulePeriodList;
			}

			public void setSchedulePeriodList(List<String> schedulePeriodList) {
				this.schedulePeriodList = schedulePeriodList;
			}

			public Creator getCreator() {
				return this.creator;
			}

			public void setCreator(Creator creator) {
				this.creator = creator;
			}

			public ProjectInfo getProjectInfo() {
				return this.projectInfo;
			}

			public void setProjectInfo(ProjectInfo projectInfo) {
				this.projectInfo = projectInfo;
			}

			public Modifier getModifier() {
				return this.modifier;
			}

			public void setModifier(Modifier modifier) {
				this.modifier = modifier;
			}

			public static class User {

				private String id;

				private String name;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}

			public static class Creator {

				private String id;

				private String name;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}

			public static class ProjectInfo {

				private String id;

				private String name;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}

			public static class Modifier {

				private String id;

				private String name;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
		}
	}

	@Override
	public ListNodesResponse getInstance(UnmarshallerContext context) {
		return	ListNodesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
