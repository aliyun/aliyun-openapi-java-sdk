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
import com.aliyuncs.cbn.transform.v20170912.ListTransitRouterCidrResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTransitRouterCidrResponse extends AcsResponse {

	private String requestId;

	private List<CidrListsItem> cidrLists;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CidrListsItem> getCidrLists() {
		return this.cidrLists;
	}

	public void setCidrLists(List<CidrListsItem> cidrLists) {
		this.cidrLists = cidrLists;
	}

	public static class CidrListsItem {

		private String transitRouterCidrId;

		private String family;

		private String name;

		private String description;

		private String cidr;

		private Boolean publishCidrRoute;

		private String transitRouterId;

		public String getTransitRouterCidrId() {
			return this.transitRouterCidrId;
		}

		public void setTransitRouterCidrId(String transitRouterCidrId) {
			this.transitRouterCidrId = transitRouterCidrId;
		}

		public String getFamily() {
			return this.family;
		}

		public void setFamily(String family) {
			this.family = family;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCidr() {
			return this.cidr;
		}

		public void setCidr(String cidr) {
			this.cidr = cidr;
		}

		public Boolean getPublishCidrRoute() {
			return this.publishCidrRoute;
		}

		public void setPublishCidrRoute(Boolean publishCidrRoute) {
			this.publishCidrRoute = publishCidrRoute;
		}

		public String getTransitRouterId() {
			return this.transitRouterId;
		}

		public void setTransitRouterId(String transitRouterId) {
			this.transitRouterId = transitRouterId;
		}
	}

	@Override
	public ListTransitRouterCidrResponse getInstance(UnmarshallerContext context) {
		return	ListTransitRouterCidrResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
