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

package com.aliyuncs.aiccs.model.v20191015;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aiccs.transform.v20191015.GetQualityProjectListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetQualityProjectListResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

		private Integer pageSize;

		private Long total;

		private Integer pageNo;

		private List<QualityProjectListItem> qualityProjectList;

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public List<QualityProjectListItem> getQualityProjectList() {
			return this.qualityProjectList;
		}

		public void setQualityProjectList(List<QualityProjectListItem> qualityProjectList) {
			this.qualityProjectList = qualityProjectList;
		}

		public static class QualityProjectListItem {

			private Integer status;

			private String modifyTime;

			private Integer qualityType;

			private Integer version;

			private String projectName;

			private String createTime;

			private Long id;

			private Integer checkFreqType;

			private List<Long> servicerList;

			private List<Long> depList;

			private List<Long> groupList;

			private List<Long> qualityRuleIds;

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getModifyTime() {
				return this.modifyTime;
			}

			public void setModifyTime(String modifyTime) {
				this.modifyTime = modifyTime;
			}

			public Integer getQualityType() {
				return this.qualityType;
			}

			public void setQualityType(Integer qualityType) {
				this.qualityType = qualityType;
			}

			public Integer getVersion() {
				return this.version;
			}

			public void setVersion(Integer version) {
				this.version = version;
			}

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Integer getCheckFreqType() {
				return this.checkFreqType;
			}

			public void setCheckFreqType(Integer checkFreqType) {
				this.checkFreqType = checkFreqType;
			}

			public List<Long> getServicerList() {
				return this.servicerList;
			}

			public void setServicerList(List<Long> servicerList) {
				this.servicerList = servicerList;
			}

			public List<Long> getDepList() {
				return this.depList;
			}

			public void setDepList(List<Long> depList) {
				this.depList = depList;
			}

			public List<Long> getGroupList() {
				return this.groupList;
			}

			public void setGroupList(List<Long> groupList) {
				this.groupList = groupList;
			}

			public List<Long> getQualityRuleIds() {
				return this.qualityRuleIds;
			}

			public void setQualityRuleIds(List<Long> qualityRuleIds) {
				this.qualityRuleIds = qualityRuleIds;
			}
		}
	}

	@Override
	public GetQualityProjectListResponse getInstance(UnmarshallerContext context) {
		return	GetQualityProjectListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
