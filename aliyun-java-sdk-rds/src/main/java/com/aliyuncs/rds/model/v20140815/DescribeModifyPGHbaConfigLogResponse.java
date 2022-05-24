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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeModifyPGHbaConfigLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeModifyPGHbaConfigLogResponse extends AcsResponse {

	private String dBInstanceId;

	private String requestId;

	private Integer logItemCount;

	private List<HbaLogItem> hbaLogItems;

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getLogItemCount() {
		return this.logItemCount;
	}

	public void setLogItemCount(Integer logItemCount) {
		this.logItemCount = logItemCount;
	}

	public List<HbaLogItem> getHbaLogItems() {
		return this.hbaLogItems;
	}

	public void setHbaLogItems(List<HbaLogItem> hbaLogItems) {
		this.hbaLogItems = hbaLogItems;
	}

	public static class HbaLogItem {

		private String modifyStatus;

		private String statusReason;

		private String modifyTime;

		private List<HbaItem> beforeHbaItems;

		private List<HbaItem> afterHbaItems;

		public String getModifyStatus() {
			return this.modifyStatus;
		}

		public void setModifyStatus(String modifyStatus) {
			this.modifyStatus = modifyStatus;
		}

		public String getStatusReason() {
			return this.statusReason;
		}

		public void setStatusReason(String statusReason) {
			this.statusReason = statusReason;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public List<HbaItem> getBeforeHbaItems() {
			return this.beforeHbaItems;
		}

		public void setBeforeHbaItems(List<HbaItem> beforeHbaItems) {
			this.beforeHbaItems = beforeHbaItems;
		}

		public List<HbaItem> getAfterHbaItems() {
			return this.afterHbaItems;
		}

		public void setAfterHbaItems(List<HbaItem> afterHbaItems) {
			this.afterHbaItems = afterHbaItems;
		}

		public static class HbaItem {

			private String type;

			private String mask;

			private String database;

			private Integer priorityId;

			private String address;

			private String option;

			private String method;

			private String user;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getMask() {
				return this.mask;
			}

			public void setMask(String mask) {
				this.mask = mask;
			}

			public String getDatabase() {
				return this.database;
			}

			public void setDatabase(String database) {
				this.database = database;
			}

			public Integer getPriorityId() {
				return this.priorityId;
			}

			public void setPriorityId(Integer priorityId) {
				this.priorityId = priorityId;
			}

			public String getAddress() {
				return this.address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public String getOption() {
				return this.option;
			}

			public void setOption(String option) {
				this.option = option;
			}

			public String getBizMethod() {
				return this.method;
			}

			public void setBizMethod(String method) {
				this.method = method;
			}

			public String getUser() {
				return this.user;
			}

			public void setUser(String user) {
				this.user = user;
			}
		}
	}

	@Override
	public DescribeModifyPGHbaConfigLogResponse getInstance(UnmarshallerContext context) {
		return	DescribeModifyPGHbaConfigLogResponseUnmarshaller.unmarshall(this, context);
	}
}
