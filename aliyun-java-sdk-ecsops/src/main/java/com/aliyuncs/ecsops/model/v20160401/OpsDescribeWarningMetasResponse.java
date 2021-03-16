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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeWarningMetasResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeWarningMetasResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String success;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<WarningMetas> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
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

	public List<WarningMetas> getData() {
		return this.data;
	}

	public void setData(List<WarningMetas> data) {
		this.data = data;
	}

	public static class WarningMetas {

		private Long id;

		private String gmtCreate;

		private String gmtModified;

		private String warningMetaId;

		private String productName;

		private String sourceSystem;

		private String app;

		private String level;

		private String ownerTeam;

		private String owner;

		private String ownerName;

		private String phoneNumber;

		private String diagnoseCategory;

		private String monitorTitle;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
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

		public String getWarningMetaId() {
			return this.warningMetaId;
		}

		public void setWarningMetaId(String warningMetaId) {
			this.warningMetaId = warningMetaId;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getSourceSystem() {
			return this.sourceSystem;
		}

		public void setSourceSystem(String sourceSystem) {
			this.sourceSystem = sourceSystem;
		}

		public String getApp() {
			return this.app;
		}

		public void setApp(String app) {
			this.app = app;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public String getOwnerTeam() {
			return this.ownerTeam;
		}

		public void setOwnerTeam(String ownerTeam) {
			this.ownerTeam = ownerTeam;
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

		public String getPhoneNumber() {
			return this.phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getDiagnoseCategory() {
			return this.diagnoseCategory;
		}

		public void setDiagnoseCategory(String diagnoseCategory) {
			this.diagnoseCategory = diagnoseCategory;
		}

		public String getMonitorTitle() {
			return this.monitorTitle;
		}

		public void setMonitorTitle(String monitorTitle) {
			this.monitorTitle = monitorTitle;
		}
	}

	@Override
	public OpsDescribeWarningMetasResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeWarningMetasResponseUnmarshaller.unmarshall(this, context);
	}
}
