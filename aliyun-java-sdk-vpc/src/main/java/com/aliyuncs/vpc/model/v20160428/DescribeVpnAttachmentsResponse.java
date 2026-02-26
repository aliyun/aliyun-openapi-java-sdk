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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeVpnAttachmentsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVpnAttachmentsResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer totalCount;

	private List<VpnAttachment> vpnAttachments;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<VpnAttachment> getVpnAttachments() {
		return this.vpnAttachments;
	}

	public void setVpnAttachments(List<VpnAttachment> vpnAttachments) {
		this.vpnAttachments = vpnAttachments;
	}

	public static class VpnAttachment {

		private String instanceId;

		private String name;

		private String description;

		private String attachType;

		private String transitRouterId;

		private String transitRouterName;

		private Boolean crossAccountAuthorized;

		private String tag;

		private String tunnelBandwidth;

		private List<Tag> tags;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
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

		public String getAttachType() {
			return this.attachType;
		}

		public void setAttachType(String attachType) {
			this.attachType = attachType;
		}

		public String getTransitRouterId() {
			return this.transitRouterId;
		}

		public void setTransitRouterId(String transitRouterId) {
			this.transitRouterId = transitRouterId;
		}

		public String getTransitRouterName() {
			return this.transitRouterName;
		}

		public void setTransitRouterName(String transitRouterName) {
			this.transitRouterName = transitRouterName;
		}

		public Boolean getCrossAccountAuthorized() {
			return this.crossAccountAuthorized;
		}

		public void setCrossAccountAuthorized(Boolean crossAccountAuthorized) {
			this.crossAccountAuthorized = crossAccountAuthorized;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getTunnelBandwidth() {
			return this.tunnelBandwidth;
		}

		public void setTunnelBandwidth(String tunnelBandwidth) {
			this.tunnelBandwidth = tunnelBandwidth;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
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
	}

	@Override
	public DescribeVpnAttachmentsResponse getInstance(UnmarshallerContext context) {
		return	DescribeVpnAttachmentsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
