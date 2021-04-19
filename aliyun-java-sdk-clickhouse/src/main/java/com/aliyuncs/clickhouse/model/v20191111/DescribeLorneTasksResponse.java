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

package com.aliyuncs.clickhouse.model.v20191111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.clickhouse.transform.v20191111.DescribeLorneTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLorneTasksResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private Integer pageSize;

	private List<TaskDetail> taskDetails;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<TaskDetail> getTaskDetails() {
		return this.taskDetails;
	}

	public void setTaskDetails(List<TaskDetail> taskDetails) {
		this.taskDetails = taskDetails;
	}

	public static class TaskDetail {

		private String id;

		private String name;

		private String description;

		private String sourceType;

		private String sourceProject;

		private String sourceTopic;

		private String sourceRegion;

		private String sinkType;

		private String sinkInstance;

		private String sinkSchema;

		private String sinkTable;

		private String sinkUser;

		private String sinkRegion;

		private String sinkVpcId;

		private String state;

		private String strict;

		private String columnMapper;

		private String checkpoint;

		private String createTime;

		private String message;

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

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getSourceProject() {
			return this.sourceProject;
		}

		public void setSourceProject(String sourceProject) {
			this.sourceProject = sourceProject;
		}

		public String getSourceTopic() {
			return this.sourceTopic;
		}

		public void setSourceTopic(String sourceTopic) {
			this.sourceTopic = sourceTopic;
		}

		public String getSourceRegion() {
			return this.sourceRegion;
		}

		public void setSourceRegion(String sourceRegion) {
			this.sourceRegion = sourceRegion;
		}

		public String getSinkType() {
			return this.sinkType;
		}

		public void setSinkType(String sinkType) {
			this.sinkType = sinkType;
		}

		public String getSinkInstance() {
			return this.sinkInstance;
		}

		public void setSinkInstance(String sinkInstance) {
			this.sinkInstance = sinkInstance;
		}

		public String getSinkSchema() {
			return this.sinkSchema;
		}

		public void setSinkSchema(String sinkSchema) {
			this.sinkSchema = sinkSchema;
		}

		public String getSinkTable() {
			return this.sinkTable;
		}

		public void setSinkTable(String sinkTable) {
			this.sinkTable = sinkTable;
		}

		public String getSinkUser() {
			return this.sinkUser;
		}

		public void setSinkUser(String sinkUser) {
			this.sinkUser = sinkUser;
		}

		public String getSinkRegion() {
			return this.sinkRegion;
		}

		public void setSinkRegion(String sinkRegion) {
			this.sinkRegion = sinkRegion;
		}

		public String getSinkVpcId() {
			return this.sinkVpcId;
		}

		public void setSinkVpcId(String sinkVpcId) {
			this.sinkVpcId = sinkVpcId;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getStrict() {
			return this.strict;
		}

		public void setStrict(String strict) {
			this.strict = strict;
		}

		public String getColumnMapper() {
			return this.columnMapper;
		}

		public void setColumnMapper(String columnMapper) {
			this.columnMapper = columnMapper;
		}

		public String getCheckpoint() {
			return this.checkpoint;
		}

		public void setCheckpoint(String checkpoint) {
			this.checkpoint = checkpoint;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}

	@Override
	public DescribeLorneTasksResponse getInstance(UnmarshallerContext context) {
		return	DescribeLorneTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
