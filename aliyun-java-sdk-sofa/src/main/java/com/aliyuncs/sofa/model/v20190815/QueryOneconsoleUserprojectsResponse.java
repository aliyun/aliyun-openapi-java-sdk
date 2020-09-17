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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryOneconsoleUserprojectsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryOneconsoleUserprojectsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String businessOwnerId;

		private String description;

		private String displayName;

		private String id;

		private String masterId;

		private String name;

		private String tenantId;

		private String uniqueId;

		private String utcCreate;

		private String utcModified;

		public String getBusinessOwnerId() {
			return this.businessOwnerId;
		}

		public void setBusinessOwnerId(String businessOwnerId) {
			this.businessOwnerId = businessOwnerId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getMasterId() {
			return this.masterId;
		}

		public void setMasterId(String masterId) {
			this.masterId = masterId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getUniqueId() {
			return this.uniqueId;
		}

		public void setUniqueId(String uniqueId) {
			this.uniqueId = uniqueId;
		}

		public String getUtcCreate() {
			return this.utcCreate;
		}

		public void setUtcCreate(String utcCreate) {
			this.utcCreate = utcCreate;
		}

		public String getUtcModified() {
			return this.utcModified;
		}

		public void setUtcModified(String utcModified) {
			this.utcModified = utcModified;
		}
	}

	@Override
	public QueryOneconsoleUserprojectsResponse getInstance(UnmarshallerContext context) {
		return	QueryOneconsoleUserprojectsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
