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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeSystemLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSystemLogResponse extends AcsResponse {

	private String requestId;

	private Long total;

	private List<SystemLogItem> systemLog;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<SystemLogItem> getSystemLog() {
		return this.systemLog;
	}

	public void setSystemLog(List<SystemLogItem> systemLog) {
		this.systemLog = systemLog;
	}

	public static class SystemLogItem {

		private Long gmtCreate;

		private Long gmtModified;

		private Integer entityType;

		private String entityObject;

		private Integer opAction;

		private String opAccount;

		private String opDesc;

		private Integer status;

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Integer getEntityType() {
			return this.entityType;
		}

		public void setEntityType(Integer entityType) {
			this.entityType = entityType;
		}

		public String getEntityObject() {
			return this.entityObject;
		}

		public void setEntityObject(String entityObject) {
			this.entityObject = entityObject;
		}

		public Integer getOpAction() {
			return this.opAction;
		}

		public void setOpAction(Integer opAction) {
			this.opAction = opAction;
		}

		public String getOpAccount() {
			return this.opAccount;
		}

		public void setOpAccount(String opAccount) {
			this.opAccount = opAccount;
		}

		public String getOpDesc() {
			return this.opDesc;
		}

		public void setOpDesc(String opDesc) {
			this.opDesc = opDesc;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
	}

	@Override
	public DescribeSystemLogResponse getInstance(UnmarshallerContext context) {
		return	DescribeSystemLogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
