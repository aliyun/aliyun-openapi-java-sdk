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

package com.aliyuncs.cr.model.v20181201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cr.transform.v20181201.ListInstanceEndpointResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInstanceEndpointResponse extends AcsResponse {

	private Boolean isSuccess;

	private String code;

	private String requestId;

	private List<EndpointsItem> endpoints;

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EndpointsItem> getEndpoints() {
		return this.endpoints;
	}

	public void setEndpoints(List<EndpointsItem> endpoints) {
		this.endpoints = endpoints;
	}

	public static class EndpointsItem {

		private String endpointType;

		private Boolean enable;

		private Boolean aclEnable;

		private String status;

		private List<DomainsItem> domains;

		private List<LinkedVpcsItem> linkedVpcs;

		private List<AclEntriesItem> aclEntries;

		public String getEndpointType() {
			return this.endpointType;
		}

		public void setEndpointType(String endpointType) {
			this.endpointType = endpointType;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public Boolean getAclEnable() {
			return this.aclEnable;
		}

		public void setAclEnable(Boolean aclEnable) {
			this.aclEnable = aclEnable;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<DomainsItem> getDomains() {
			return this.domains;
		}

		public void setDomains(List<DomainsItem> domains) {
			this.domains = domains;
		}

		public List<LinkedVpcsItem> getLinkedVpcs() {
			return this.linkedVpcs;
		}

		public void setLinkedVpcs(List<LinkedVpcsItem> linkedVpcs) {
			this.linkedVpcs = linkedVpcs;
		}

		public List<AclEntriesItem> getAclEntries() {
			return this.aclEntries;
		}

		public void setAclEntries(List<AclEntriesItem> aclEntries) {
			this.aclEntries = aclEntries;
		}

		public static class DomainsItem {

			private String domain;

			private String type;

			public String getDomain() {
				return this.domain;
			}

			public void setDomain(String domain) {
				this.domain = domain;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}

		public static class LinkedVpcsItem {

			private String vpcId;

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}
		}

		public static class AclEntriesItem {

			private String entry;

			public String getEntry() {
				return this.entry;
			}

			public void setEntry(String entry) {
				this.entry = entry;
			}
		}
	}

	@Override
	public ListInstanceEndpointResponse getInstance(UnmarshallerContext context) {
		return	ListInstanceEndpointResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
