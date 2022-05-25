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

package com.aliyuncs.cms.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.DescribeHybridMonitorSLSGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHybridMonitorSLSGroupResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private String success;

	private Long pageSize;

	private Long pageNumber;

	private Long total;

	private List<Data> list;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<Data> getList() {
		return this.list;
	}

	public void setList(List<Data> list) {
		this.list = list;
	}

	public static class Data {

		private Long sLSGroupName;

		private String sLSGroupDescription;

		private String createTime;

		private String updateTime;

		private List<SLS> sLSGroupConfig;

		public Long getSLSGroupName() {
			return this.sLSGroupName;
		}

		public void setSLSGroupName(Long sLSGroupName) {
			this.sLSGroupName = sLSGroupName;
		}

		public String getSLSGroupDescription() {
			return this.sLSGroupDescription;
		}

		public void setSLSGroupDescription(String sLSGroupDescription) {
			this.sLSGroupDescription = sLSGroupDescription;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public List<SLS> getSLSGroupConfig() {
			return this.sLSGroupConfig;
		}

		public void setSLSGroupConfig(List<SLS> sLSGroupConfig) {
			this.sLSGroupConfig = sLSGroupConfig;
		}

		public static class SLS {

			private String sLSRegion;

			private String sLSProject;

			private String sLSLogstore;

			private String sLSUserId;

			public String getSLSRegion() {
				return this.sLSRegion;
			}

			public void setSLSRegion(String sLSRegion) {
				this.sLSRegion = sLSRegion;
			}

			public String getSLSProject() {
				return this.sLSProject;
			}

			public void setSLSProject(String sLSProject) {
				this.sLSProject = sLSProject;
			}

			public String getSLSLogstore() {
				return this.sLSLogstore;
			}

			public void setSLSLogstore(String sLSLogstore) {
				this.sLSLogstore = sLSLogstore;
			}

			public String getSLSUserId() {
				return this.sLSUserId;
			}

			public void setSLSUserId(String sLSUserId) {
				this.sLSUserId = sLSUserId;
			}
		}
	}

	@Override
	public DescribeHybridMonitorSLSGroupResponse getInstance(UnmarshallerContext context) {
		return	DescribeHybridMonitorSLSGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
