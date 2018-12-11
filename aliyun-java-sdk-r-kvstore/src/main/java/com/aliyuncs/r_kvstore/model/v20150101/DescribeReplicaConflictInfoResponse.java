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

package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeReplicaConflictInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeReplicaConflictInfoResponse extends AcsResponse {

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

		private String sourceInstanceId;

		private String destinationInstanceId;

		private String occurTime;

		private String detailInfo;

		private String confictKey;

		private String confictReason;

		private String databaseName;

		private String recoveryMode;

		private String conflictGtid;

		public String getSourceInstanceId() {
			return this.sourceInstanceId;
		}

		public void setSourceInstanceId(String sourceInstanceId) {
			this.sourceInstanceId = sourceInstanceId;
		}

		public String getDestinationInstanceId() {
			return this.destinationInstanceId;
		}

		public void setDestinationInstanceId(String destinationInstanceId) {
			this.destinationInstanceId = destinationInstanceId;
		}

		public String getOccurTime() {
			return this.occurTime;
		}

		public void setOccurTime(String occurTime) {
			this.occurTime = occurTime;
		}

		public String getDetailInfo() {
			return this.detailInfo;
		}

		public void setDetailInfo(String detailInfo) {
			this.detailInfo = detailInfo;
		}

		public String getConfictKey() {
			return this.confictKey;
		}

		public void setConfictKey(String confictKey) {
			this.confictKey = confictKey;
		}

		public String getConfictReason() {
			return this.confictReason;
		}

		public void setConfictReason(String confictReason) {
			this.confictReason = confictReason;
		}

		public String getDatabaseName() {
			return this.databaseName;
		}

		public void setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
		}

		public String getRecoveryMode() {
			return this.recoveryMode;
		}

		public void setRecoveryMode(String recoveryMode) {
			this.recoveryMode = recoveryMode;
		}

		public String getConflictGtid() {
			return this.conflictGtid;
		}

		public void setConflictGtid(String conflictGtid) {
			this.conflictGtid = conflictGtid;
		}
	}

	@Override
	public DescribeReplicaConflictInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeReplicaConflictInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
