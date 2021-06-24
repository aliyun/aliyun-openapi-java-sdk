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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsSlsDescribeProjectResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsSlsDescribeProjectResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private String success;

	private Long pageSize;

	private Long total;

	private Long pageNo;

	private List<Projects> data;

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

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public List<Projects> getData() {
		return this.data;
	}

	public void setData(List<Projects> data) {
		this.data = data;
	}

	public static class Projects {

		private String projectName;

		private String projectStatus;

		private String projectOwner;

		private String projectDesc;

		private String region;

		private String createTime;

		private String lastModifyTime;

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getProjectStatus() {
			return this.projectStatus;
		}

		public void setProjectStatus(String projectStatus) {
			this.projectStatus = projectStatus;
		}

		public String getProjectOwner() {
			return this.projectOwner;
		}

		public void setProjectOwner(String projectOwner) {
			this.projectOwner = projectOwner;
		}

		public String getProjectDesc() {
			return this.projectDesc;
		}

		public void setProjectDesc(String projectDesc) {
			this.projectDesc = projectDesc;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getLastModifyTime() {
			return this.lastModifyTime;
		}

		public void setLastModifyTime(String lastModifyTime) {
			this.lastModifyTime = lastModifyTime;
		}
	}

	@Override
	public OpsSlsDescribeProjectResponse getInstance(UnmarshallerContext context) {
		return	OpsSlsDescribeProjectResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
