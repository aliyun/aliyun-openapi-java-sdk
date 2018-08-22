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

package com.aliyuncs.dds.model.v20151201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeVerificationListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVerificationListResponse extends AcsResponse {

	private String requestId;

	private String replicaId;

	private Integer pagNumber;

	private Integer pageRecordCount;

	private Integer totalRecordCount;

	private List<ItemsItem> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getReplicaId() {
		return this.replicaId;
	}

	public void setReplicaId(String replicaId) {
		this.replicaId = replicaId;
	}

	public Integer getPagNumber() {
		return this.pagNumber;
	}

	public void setPagNumber(Integer pagNumber) {
		this.pagNumber = pagNumber;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public List<ItemsItem> getItems() {
		return this.items;
	}

	public void setItems(List<ItemsItem> items) {
		this.items = items;
	}

	public static class ItemsItem {

		private String instanceIdA;

		private String instanceIdB;

		private String key;

		private String keyType;

		private String inconsistentType;

		private String occurTime;

		private String schema;

		private String inconsistentFields;

		public String getInstanceIdA() {
			return this.instanceIdA;
		}

		public void setInstanceIdA(String instanceIdA) {
			this.instanceIdA = instanceIdA;
		}

		public String getInstanceIdB() {
			return this.instanceIdB;
		}

		public void setInstanceIdB(String instanceIdB) {
			this.instanceIdB = instanceIdB;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getKeyType() {
			return this.keyType;
		}

		public void setKeyType(String keyType) {
			this.keyType = keyType;
		}

		public String getInconsistentType() {
			return this.inconsistentType;
		}

		public void setInconsistentType(String inconsistentType) {
			this.inconsistentType = inconsistentType;
		}

		public String getOccurTime() {
			return this.occurTime;
		}

		public void setOccurTime(String occurTime) {
			this.occurTime = occurTime;
		}

		public String getSchema() {
			return this.schema;
		}

		public void setSchema(String schema) {
			this.schema = schema;
		}

		public String getInconsistentFields() {
			return this.inconsistentFields;
		}

		public void setInconsistentFields(String inconsistentFields) {
			this.inconsistentFields = inconsistentFields;
		}
	}

	@Override
	public DescribeVerificationListResponse getInstance(UnmarshallerContext context) {
		return	DescribeVerificationListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
