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
import com.aliyuncs.rds.transform.v20140815.DescribeSQLDiagnosisListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSQLDiagnosisListResponse extends AcsResponse {

	private String requestId;

	private List<SQLDiag> sQLDiagList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SQLDiag> getSQLDiagList() {
		return this.sQLDiagList;
	}

	public void setSQLDiagList(List<SQLDiag> sQLDiagList) {
		this.sQLDiagList = sQLDiagList;
	}

	public static class SQLDiag {

		private String sQLDiagId;

		private String startTime;

		private String endTime;

		private Integer status;

		private Integer progress;

		public String getSQLDiagId() {
			return this.sQLDiagId;
		}

		public void setSQLDiagId(String sQLDiagId) {
			this.sQLDiagId = sQLDiagId;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getProgress() {
			return this.progress;
		}

		public void setProgress(Integer progress) {
			this.progress = progress;
		}
	}

	@Override
	public DescribeSQLDiagnosisListResponse getInstance(UnmarshallerContext context) {
		return	DescribeSQLDiagnosisListResponseUnmarshaller.unmarshall(this, context);
	}
}
