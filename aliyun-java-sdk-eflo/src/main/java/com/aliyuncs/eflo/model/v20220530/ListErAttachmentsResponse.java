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

package com.aliyuncs.eflo.model.v20220530;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eflo.transform.v20220530.ListErAttachmentsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListErAttachmentsResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Content content;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Content getContent() {
		return this.content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public static class Content {

		private Long total;

		private List<DataItem> data;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public List<DataItem> getData() {
			return this.data;
		}

		public void setData(List<DataItem> data) {
			this.data = data;
		}

		public static class DataItem {

			private String createTime;

			private String gmtModified;

			private String message;

			private String status;

			private String regionId;

			private String tenantId;

			private String erAttachmentName;

			private String erAttachmentId;

			private String erId;

			private String instanceType;

			private String instanceId;

			private String instanceName;

			private Boolean autoReceiveAllRoute;

			private Boolean across;

			private String resourceTenantId;

			private String resourceGroupId;

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}

			public String getErAttachmentName() {
				return this.erAttachmentName;
			}

			public void setErAttachmentName(String erAttachmentName) {
				this.erAttachmentName = erAttachmentName;
			}

			public String getErAttachmentId() {
				return this.erAttachmentId;
			}

			public void setErAttachmentId(String erAttachmentId) {
				this.erAttachmentId = erAttachmentId;
			}

			public String getErId() {
				return this.erId;
			}

			public void setErId(String erId) {
				this.erId = erId;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
			}

			public Boolean getAutoReceiveAllRoute() {
				return this.autoReceiveAllRoute;
			}

			public void setAutoReceiveAllRoute(Boolean autoReceiveAllRoute) {
				this.autoReceiveAllRoute = autoReceiveAllRoute;
			}

			public Boolean getAcross() {
				return this.across;
			}

			public void setAcross(Boolean across) {
				this.across = across;
			}

			public String getResourceTenantId() {
				return this.resourceTenantId;
			}

			public void setResourceTenantId(String resourceTenantId) {
				this.resourceTenantId = resourceTenantId;
			}

			public String getResourceGroupId() {
				return this.resourceGroupId;
			}

			public void setResourceGroupId(String resourceGroupId) {
				this.resourceGroupId = resourceGroupId;
			}
		}
	}

	@Override
	public ListErAttachmentsResponse getInstance(UnmarshallerContext context) {
		return	ListErAttachmentsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
