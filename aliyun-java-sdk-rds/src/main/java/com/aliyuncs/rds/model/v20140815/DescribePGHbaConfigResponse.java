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
import com.aliyuncs.rds.transform.v20140815.DescribePGHbaConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePGHbaConfigResponse extends AcsResponse {

	private String hbaModifyTime;

	private String modifyStatusReason;

	private String requestId;

	private String lastModifyStatus;

	private List<HbaItem> defaultHbaItems;

	private List<HbaItem> runningHbaItems;

	public String getHbaModifyTime() {
		return this.hbaModifyTime;
	}

	public void setHbaModifyTime(String hbaModifyTime) {
		this.hbaModifyTime = hbaModifyTime;
	}

	public String getModifyStatusReason() {
		return this.modifyStatusReason;
	}

	public void setModifyStatusReason(String modifyStatusReason) {
		this.modifyStatusReason = modifyStatusReason;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLastModifyStatus() {
		return this.lastModifyStatus;
	}

	public void setLastModifyStatus(String lastModifyStatus) {
		this.lastModifyStatus = lastModifyStatus;
	}

	public List<HbaItem> getDefaultHbaItems() {
		return this.defaultHbaItems;
	}

	public void setDefaultHbaItems(List<HbaItem> defaultHbaItems) {
		this.defaultHbaItems = defaultHbaItems;
	}

	public List<HbaItem> getRunningHbaItems() {
		return this.runningHbaItems;
	}

	public void setRunningHbaItems(List<HbaItem> runningHbaItems) {
		this.runningHbaItems = runningHbaItems;
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

	@Override
	public DescribePGHbaConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribePGHbaConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
