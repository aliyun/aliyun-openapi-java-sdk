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
package com.aliyuncs.httpdns.model.v20160201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.httpdns.transform.v20160201.ListDomainsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDomainsResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private Long pageNumber;

	private Long pageSize;

	private List<DomainInfo> domainInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<DomainInfo> getDomainInfos() {
		return this.domainInfos;
	}

	public void setDomainInfos(List<DomainInfo> domainInfos) {
		this.domainInfos = domainInfos;
	}

	public static class DomainInfo {

		private String domainName;

		private Long resolved;

		private Long resolvedHttps;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public Long getResolved() {
			return this.resolved;
		}

		public void setResolved(Long resolved) {
			this.resolved = resolved;
		}

		public Long getResolvedHttps() {
			return this.resolvedHttps;
		}

		public void setResolvedHttps(Long resolvedHttps) {
			this.resolvedHttps = resolvedHttps;
		}
	}

	@Override
	public ListDomainsResponse getInstance(UnmarshallerContext context) {
		return	ListDomainsResponseUnmarshaller.unmarshall(this, context);
	}
}
