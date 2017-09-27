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
import com.aliyuncs.rds.transform.v20140815.DescibeImportsFromDatabaseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescibeImportsFromDatabaseResponse extends AcsResponse {

	private String requestId;

	private Integer totalRecordCount;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private List<ImportResultFromDB> items;

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

	public List<ImportResultFromDB> getItems() {
		return this.items;
	}

	public void setItems(List<ImportResultFromDB> items) {
		this.items = items;
	}

	public static class ImportResultFromDB {

		private Integer importId;

		private String importDataType;

		private String importDataStatus;

		private String importDataStatusDescription;

		private String incrementalImportingTime;

		public Integer getImportId() {
			return this.importId;
		}

		public void setImportId(Integer importId) {
			this.importId = importId;
		}

		public String getImportDataType() {
			return this.importDataType;
		}

		public void setImportDataType(String importDataType) {
			this.importDataType = importDataType;
		}

		public String getImportDataStatus() {
			return this.importDataStatus;
		}

		public void setImportDataStatus(String importDataStatus) {
			this.importDataStatus = importDataStatus;
		}

		public String getImportDataStatusDescription() {
			return this.importDataStatusDescription;
		}

		public void setImportDataStatusDescription(String importDataStatusDescription) {
			this.importDataStatusDescription = importDataStatusDescription;
		}

		public String getIncrementalImportingTime() {
			return this.incrementalImportingTime;
		}

		public void setIncrementalImportingTime(String incrementalImportingTime) {
			this.incrementalImportingTime = incrementalImportingTime;
		}
	}

	@Override
	public DescibeImportsFromDatabaseResponse getInstance(UnmarshallerContext context) {
		return	DescibeImportsFromDatabaseResponseUnmarshaller.unmarshall(this, context);
	}
}
