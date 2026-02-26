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

package com.aliyuncs.cbn.model.v20170912;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cbn.transform.v20170912.ListTransitRouterMulticastDomainsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTransitRouterMulticastDomainsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer maxResults;

	private String nextToken;

	private List<TransitRouterMulticastDomain> transitRouterMulticastDomains;

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

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<TransitRouterMulticastDomain> getTransitRouterMulticastDomains() {
		return this.transitRouterMulticastDomains;
	}

	public void setTransitRouterMulticastDomains(List<TransitRouterMulticastDomain> transitRouterMulticastDomains) {
		this.transitRouterMulticastDomains = transitRouterMulticastDomains;
	}

	public static class TransitRouterMulticastDomain {

		private String transitRouterMulticastDomainId;

		private String transitRouterMulticastDomainName;

		private String transitRouterMulticastDomainDescription;

		private String status;

		private String transitRouterId;

		private String regionId;

		private String cenId;

		private List<Tag> tags;

		private Options options;

		public String getTransitRouterMulticastDomainId() {
			return this.transitRouterMulticastDomainId;
		}

		public void setTransitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
			this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
		}

		public String getTransitRouterMulticastDomainName() {
			return this.transitRouterMulticastDomainName;
		}

		public void setTransitRouterMulticastDomainName(String transitRouterMulticastDomainName) {
			this.transitRouterMulticastDomainName = transitRouterMulticastDomainName;
		}

		public String getTransitRouterMulticastDomainDescription() {
			return this.transitRouterMulticastDomainDescription;
		}

		public void setTransitRouterMulticastDomainDescription(String transitRouterMulticastDomainDescription) {
			this.transitRouterMulticastDomainDescription = transitRouterMulticastDomainDescription;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTransitRouterId() {
			return this.transitRouterId;
		}

		public void setTransitRouterId(String transitRouterId) {
			this.transitRouterId = transitRouterId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getCenId() {
			return this.cenId;
		}

		public void setCenId(String cenId) {
			this.cenId = cenId;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public Options getOptions() {
			return this.options;
		}

		public void setOptions(Options options) {
			this.options = options;
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class Options {

			private String igmpv2Support;

			private String strictSourceControl;

			public String getIgmpv2Support() {
				return this.igmpv2Support;
			}

			public void setIgmpv2Support(String igmpv2Support) {
				this.igmpv2Support = igmpv2Support;
			}

			public String getStrictSourceControl() {
				return this.strictSourceControl;
			}

			public void setStrictSourceControl(String strictSourceControl) {
				this.strictSourceControl = strictSourceControl;
			}
		}
	}

	@Override
	public ListTransitRouterMulticastDomainsResponse getInstance(UnmarshallerContext context) {
		return	ListTransitRouterMulticastDomainsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
