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
import com.aliyuncs.rds.transform.v20140815.DescribeDBInstancesByPerformanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstancesByPerformanceResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer totalRecordCount;

	private Integer pageRecordCount;

	private List<DBInstancePerformance> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public List<DBInstancePerformance> getItems() {
		return this.items;
	}

	public void setItems(List<DBInstancePerformance> items) {
		this.items = items;
	}

	public static class DBInstancePerformance {

		private String cPUUsage;

		private String iOPSUsage;

		private String diskUsage;

		private String sessionUsage;

		private String dBInstanceId;

		private String dBInstanceDescription;

		public String getCPUUsage() {
			return this.cPUUsage;
		}

		public void setCPUUsage(String cPUUsage) {
			this.cPUUsage = cPUUsage;
		}

		public String getIOPSUsage() {
			return this.iOPSUsage;
		}

		public void setIOPSUsage(String iOPSUsage) {
			this.iOPSUsage = iOPSUsage;
		}

		public String getDiskUsage() {
			return this.diskUsage;
		}

		public void setDiskUsage(String diskUsage) {
			this.diskUsage = diskUsage;
		}

		public String getSessionUsage() {
			return this.sessionUsage;
		}

		public void setSessionUsage(String sessionUsage) {
			this.sessionUsage = sessionUsage;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getDBInstanceDescription() {
			return this.dBInstanceDescription;
		}

		public void setDBInstanceDescription(String dBInstanceDescription) {
			this.dBInstanceDescription = dBInstanceDescription;
		}
	}

	@Override
	public DescribeDBInstancesByPerformanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstancesByPerformanceResponseUnmarshaller.unmarshall(this, context);
	}
}
