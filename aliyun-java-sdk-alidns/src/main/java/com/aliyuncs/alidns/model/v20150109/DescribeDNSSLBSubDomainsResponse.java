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

package com.aliyuncs.alidns.model.v20150109;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeDNSSLBSubDomainsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDNSSLBSubDomainsResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private Long pageNumber;

	private Long pageSize;

	private List<SlbSubDomain> slbSubDomains;

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

	public List<SlbSubDomain> getSlbSubDomains() {
		return this.slbSubDomains;
	}

	public void setSlbSubDomains(List<SlbSubDomain> slbSubDomains) {
		this.slbSubDomains = slbSubDomains;
	}

	public static class SlbSubDomain {

		private String subDomain;

		private Long recordCount;

		private Boolean open;

		private String type;

		private List<LineAlgorithm> lineAlgorithms;

		public String getSubDomain() {
			return this.subDomain;
		}

		public void setSubDomain(String subDomain) {
			this.subDomain = subDomain;
		}

		public Long getRecordCount() {
			return this.recordCount;
		}

		public void setRecordCount(Long recordCount) {
			this.recordCount = recordCount;
		}

		public Boolean getOpen() {
			return this.open;
		}

		public void setOpen(Boolean open) {
			this.open = open;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<LineAlgorithm> getLineAlgorithms() {
			return this.lineAlgorithms;
		}

		public void setLineAlgorithms(List<LineAlgorithm> lineAlgorithms) {
			this.lineAlgorithms = lineAlgorithms;
		}

		public static class LineAlgorithm {

			private String line;

			private Boolean open;

			public String getLine() {
				return this.line;
			}

			public void setLine(String line) {
				this.line = line;
			}

			public Boolean getOpen() {
				return this.open;
			}

			public void setOpen(Boolean open) {
				this.open = open;
			}
		}
	}

	@Override
	public DescribeDNSSLBSubDomainsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDNSSLBSubDomainsResponseUnmarshaller.unmarshall(this, context);
	}
}
