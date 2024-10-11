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
import com.aliyuncs.dataphin_public.transform.v20230630.GetPhysicalInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPhysicalInstanceResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private Instance instance;

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

	public Instance getInstance() {
		return this.instance;
	}

	public void setInstance(Instance instance) {
		this.instance = instance;
	}

	public static class Instance {

		private String id;

		private String bizDate;

		private String dueTime;

		private Long startExecuteTime;

		private Long endExecuteTime;

		private String duration;

		private Integer index;

		private String extendInfo;

		private List<String> statusList;

		private NodeInfo nodeInfo;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getBizDate() {
			return this.bizDate;
		}

		public void setBizDate(String bizDate) {
			this.bizDate = bizDate;
		}

		public String getDueTime() {
			return this.dueTime;
		}

		public void setDueTime(String dueTime) {
			this.dueTime = dueTime;
		}

		public Long getStartExecuteTime() {
			return this.startExecuteTime;
		}

		public void setStartExecuteTime(Long startExecuteTime) {
			this.startExecuteTime = startExecuteTime;
		}

		public Long getEndExecuteTime() {
			return this.endExecuteTime;
		}

		public void setEndExecuteTime(Long endExecuteTime) {
			this.endExecuteTime = endExecuteTime;
		}

		public String getDuration() {
			return this.duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public Integer getIndex() {
			return this.index;
		}

		public void setIndex(Integer index) {
			this.index = index;
		}

		public String getExtendInfo() {
			return this.extendInfo;
		}

		public void setExtendInfo(String extendInfo) {
			this.extendInfo = extendInfo;
		}

		public List<String> getStatusList() {
			return this.statusList;
		}

		public void setStatusList(List<String> statusList) {
			this.statusList = statusList;
		}

		public NodeInfo getNodeInfo() {
			return this.nodeInfo;
		}

		public void setNodeInfo(NodeInfo nodeInfo) {
			this.nodeInfo = nodeInfo;
		}

		public static class NodeInfo {

			private String id;

			private String from;

			private String type;

			private String name;

			private String subDetailType;

			private String description;

			private Boolean dryRun;

			private Boolean schedulePaused;

			private Boolean hasProd;

			private Boolean hasDev;

			private String bizUnitName;

			private String createTime;

			private String lastModifiedTime;

			private List<User> ownerList;

			private List<String> priorityList;

			private List<String> resourceGroupList;

			private List<String> schedulePeriodList;

			private Creator creator;

			private Modifier modifier;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getFrom() {
				return this.from;
			}

			public void setFrom(String from) {
				this.from = from;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getSubDetailType() {
				return this.subDetailType;
			}

			public void setSubDetailType(String subDetailType) {
				this.subDetailType = subDetailType;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Boolean getDryRun() {
				return this.dryRun;
			}

			public void setDryRun(Boolean dryRun) {
				this.dryRun = dryRun;
			}

			public Boolean getSchedulePaused() {
				return this.schedulePaused;
			}

			public void setSchedulePaused(Boolean schedulePaused) {
				this.schedulePaused = schedulePaused;
			}

			public Boolean getHasProd() {
				return this.hasProd;
			}

			public void setHasProd(Boolean hasProd) {
				this.hasProd = hasProd;
			}

			public Boolean getHasDev() {
				return this.hasDev;
			}

			public void setHasDev(Boolean hasDev) {
				this.hasDev = hasDev;
			}

			public String getBizUnitName() {
				return this.bizUnitName;
			}

			public void setBizUnitName(String bizUnitName) {
				this.bizUnitName = bizUnitName;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getLastModifiedTime() {
				return this.lastModifiedTime;
			}

			public void setLastModifiedTime(String lastModifiedTime) {
				this.lastModifiedTime = lastModifiedTime;
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

			public List<String> getResourceGroupList() {
				return this.resourceGroupList;
			}

			public void setResourceGroupList(List<String> resourceGroupList) {
				this.resourceGroupList = resourceGroupList;
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
	public GetPhysicalInstanceResponse getInstance(UnmarshallerContext context) {
		return	GetPhysicalInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
