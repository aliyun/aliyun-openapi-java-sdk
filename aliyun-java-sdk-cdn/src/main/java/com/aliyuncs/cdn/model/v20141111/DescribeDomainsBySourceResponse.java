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
package com.aliyuncs.cdn.model.v20141111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeDomainsBySourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainsBySourceResponse extends AcsResponse {

	private String requestId;

	private String sources;

	private List<DomainsData> domainsList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSources() {
		return this.sources;
	}

	public void setSources(String sources) {
		this.sources = sources;
	}

	public List<DomainsData> getDomainsList() {
		return this.domainsList;
	}

	public void setDomainsList(List<DomainsData> domainsList) {
		this.domainsList = domainsList;
	}

	public static class DomainsData {

		private String source;

		private List<DomainInfo> domainInfos;

		private List<String> domains;

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public List<DomainInfo> getDomainInfos() {
			return this.domainInfos;
		}

		public void setDomainInfos(List<DomainInfo> domainInfos) {
			this.domainInfos = domainInfos;
		}

		public List<String> getDomains() {
			return this.domains;
		}

		public void setDomains(List<String> domains) {
			this.domains = domains;
		}

		public static class DomainInfo {

			private String domainName;

			private String domainCname;

			private String createTime;

			private String updateTime;

			private String status;

			public String getDomainName() {
				return this.domainName;
			}

			public void setDomainName(String domainName) {
				this.domainName = domainName;
			}

			public String getDomainCname() {
				return this.domainCname;
			}

			public void setDomainCname(String domainCname) {
				this.domainCname = domainCname;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(String updateTime) {
				this.updateTime = updateTime;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	@Override
	public DescribeDomainsBySourceResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainsBySourceResponseUnmarshaller.unmarshall(this, context);
	}
}
