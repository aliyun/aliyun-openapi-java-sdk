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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListClusterServiceConfigHistoryForAdminResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClusterServiceConfigHistoryForAdminResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<ConfigHistory> configHistoryList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<ConfigHistory> getConfigHistoryList() {
		return this.configHistoryList;
	}

	public void setConfigHistoryList(List<ConfigHistory> configHistoryList) {
		this.configHistoryList = configHistoryList;
	}

	public static class ConfigHistory {

		private String serviceName;

		private String configVersion;

		private String configFileName;

		private String configItemName;

		private String newValue;

		private String oldValue;

		private Boolean applied;

		private Long createTime;

		private String author;

		private String comment;

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getConfigVersion() {
			return this.configVersion;
		}

		public void setConfigVersion(String configVersion) {
			this.configVersion = configVersion;
		}

		public String getConfigFileName() {
			return this.configFileName;
		}

		public void setConfigFileName(String configFileName) {
			this.configFileName = configFileName;
		}

		public String getConfigItemName() {
			return this.configItemName;
		}

		public void setConfigItemName(String configItemName) {
			this.configItemName = configItemName;
		}

		public String getNewValue() {
			return this.newValue;
		}

		public void setNewValue(String newValue) {
			this.newValue = newValue;
		}

		public String getOldValue() {
			return this.oldValue;
		}

		public void setOldValue(String oldValue) {
			this.oldValue = oldValue;
		}

		public Boolean getApplied() {
			return this.applied;
		}

		public void setApplied(Boolean applied) {
			this.applied = applied;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getAuthor() {
			return this.author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}
	}

	@Override
	public ListClusterServiceConfigHistoryForAdminResponse getInstance(UnmarshallerContext context) {
		return	ListClusterServiceConfigHistoryForAdminResponseUnmarshaller.unmarshall(this, context);
	}
}
