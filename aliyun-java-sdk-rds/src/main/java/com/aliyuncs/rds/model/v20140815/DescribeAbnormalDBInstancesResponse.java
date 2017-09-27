/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeAbnormalDBInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAbnormalDBInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer totalRecordCount;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private List<InstanceResult> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public List<InstanceResult> getItems() {
		return this.items;
	}

	public void setItems(List<InstanceResult> items) {
		this.items = items;
	}

	public static class InstanceResult {

		private String dBInstanceDescription;

		private String dBInstanceId;

		private List<AbnormalItem> abnormalItems;

		public String getDBInstanceDescription() {
			return this.dBInstanceDescription;
		}

		public void setDBInstanceDescription(String dBInstanceDescription) {
			this.dBInstanceDescription = dBInstanceDescription;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public List<AbnormalItem> getAbnormalItems() {
			return this.abnormalItems;
		}

		public void setAbnormalItems(List<AbnormalItem> abnormalItems) {
			this.abnormalItems = abnormalItems;
		}

		public static class AbnormalItem {

			private String checkTime;

			private String checkItem;

			private String abnormalReason;

			private String abnormalValue;

			private String abnormalDetail;

			private String adviceKey;

			private List<String> adviseValue;

			public String getCheckTime() {
				return this.checkTime;
			}

			public void setCheckTime(String checkTime) {
				this.checkTime = checkTime;
			}

			public String getCheckItem() {
				return this.checkItem;
			}

			public void setCheckItem(String checkItem) {
				this.checkItem = checkItem;
			}

			public String getAbnormalReason() {
				return this.abnormalReason;
			}

			public void setAbnormalReason(String abnormalReason) {
				this.abnormalReason = abnormalReason;
			}

			public String getAbnormalValue() {
				return this.abnormalValue;
			}

			public void setAbnormalValue(String abnormalValue) {
				this.abnormalValue = abnormalValue;
			}

			public String getAbnormalDetail() {
				return this.abnormalDetail;
			}

			public void setAbnormalDetail(String abnormalDetail) {
				this.abnormalDetail = abnormalDetail;
			}

			public String getAdviceKey() {
				return this.adviceKey;
			}

			public void setAdviceKey(String adviceKey) {
				this.adviceKey = adviceKey;
			}

			public List<String> getAdviseValue() {
				return this.adviseValue;
			}

			public void setAdviseValue(List<String> adviseValue) {
				this.adviseValue = adviseValue;
			}
		}
	}

	@Override
	public DescribeAbnormalDBInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeAbnormalDBInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
