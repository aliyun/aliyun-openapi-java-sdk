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
package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeSnatTableEntriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSnatTableEntriesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<SnatTableEntry> snatTableEntries;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<SnatTableEntry> getSnatTableEntries() {
		return this.snatTableEntries;
	}

	public void setSnatTableEntries(List<SnatTableEntry> snatTableEntries) {
		this.snatTableEntries = snatTableEntries;
	}

	public static class SnatTableEntry {

		private String snatTableId;

		private String snatEntryId;

		private String sourceVSwitchId;

		private String sourceCIDR;

		private String snatIp;

		private String status;

		public String getSnatTableId() {
			return this.snatTableId;
		}

		public void setSnatTableId(String snatTableId) {
			this.snatTableId = snatTableId;
		}

		public String getSnatEntryId() {
			return this.snatEntryId;
		}

		public void setSnatEntryId(String snatEntryId) {
			this.snatEntryId = snatEntryId;
		}

		public String getSourceVSwitchId() {
			return this.sourceVSwitchId;
		}

		public void setSourceVSwitchId(String sourceVSwitchId) {
			this.sourceVSwitchId = sourceVSwitchId;
		}

		public String getSourceCIDR() {
			return this.sourceCIDR;
		}

		public void setSourceCIDR(String sourceCIDR) {
			this.sourceCIDR = sourceCIDR;
		}

		public String getSnatIp() {
			return this.snatIp;
		}

		public void setSnatIp(String snatIp) {
			this.snatIp = snatIp;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public DescribeSnatTableEntriesResponse getInstance(UnmarshallerContext context) {
		return	DescribeSnatTableEntriesResponseUnmarshaller.unmarshall(this, context);
	}
}
