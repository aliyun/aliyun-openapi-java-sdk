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
import com.aliyuncs.rds.transform.v20140815.DescribeSQLReportsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSQLReportsResponse extends AcsResponse {

	private String requestId;

	private Integer totalRecordCount;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private List<Item> items;

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

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public static class Item {

		private String reportTime;

		private List<LatencyTopNItem> latencyTopNItems;

		private List<QPSTopNItem> qPSTopNItems;

		public String getReportTime() {
			return this.reportTime;
		}

		public void setReportTime(String reportTime) {
			this.reportTime = reportTime;
		}

		public List<LatencyTopNItem> getLatencyTopNItems() {
			return this.latencyTopNItems;
		}

		public void setLatencyTopNItems(List<LatencyTopNItem> latencyTopNItems) {
			this.latencyTopNItems = latencyTopNItems;
		}

		public List<QPSTopNItem> getQPSTopNItems() {
			return this.qPSTopNItems;
		}

		public void setQPSTopNItems(List<QPSTopNItem> qPSTopNItems) {
			this.qPSTopNItems = qPSTopNItems;
		}

		public static class LatencyTopNItem {

			private String sQLText;

			private Long avgLatency;

			private Long sQLExecuteTimes;

			public String getSQLText() {
				return this.sQLText;
			}

			public void setSQLText(String sQLText) {
				this.sQLText = sQLText;
			}

			public Long getAvgLatency() {
				return this.avgLatency;
			}

			public void setAvgLatency(Long avgLatency) {
				this.avgLatency = avgLatency;
			}

			public Long getSQLExecuteTimes() {
				return this.sQLExecuteTimes;
			}

			public void setSQLExecuteTimes(Long sQLExecuteTimes) {
				this.sQLExecuteTimes = sQLExecuteTimes;
			}
		}

		public static class QPSTopNItem {

			private String sQLText;

			private Long sQLExecuteTimes;

			public String getSQLText() {
				return this.sQLText;
			}

			public void setSQLText(String sQLText) {
				this.sQLText = sQLText;
			}

			public Long getSQLExecuteTimes() {
				return this.sQLExecuteTimes;
			}

			public void setSQLExecuteTimes(Long sQLExecuteTimes) {
				this.sQLExecuteTimes = sQLExecuteTimes;
			}
		}
	}

	@Override
	public DescribeSQLReportsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSQLReportsResponseUnmarshaller.unmarshall(this, context);
	}
}
