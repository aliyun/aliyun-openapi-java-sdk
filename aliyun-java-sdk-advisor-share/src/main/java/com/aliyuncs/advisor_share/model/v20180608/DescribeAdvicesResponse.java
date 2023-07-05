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

package com.aliyuncs.advisor_share.model.v20180608;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.advisor_share.transform.v20180608.DescribeAdvicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAdvicesResponse extends AcsResponse {

	private String requestId;

	private List<Advice> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Advice> getData() {
		return this.data;
	}

	public void setData(List<Advice> data) {
		this.data = data;
	}

	public static class Advice {

		private Integer severity;

		private String action;

		private String product;

		private String gmtModified;

		private String details;

		private Boolean isExpired;

		private String gmtCreated;

		private String resource;

		private String description;

		private String links;

		private String checkId;

		private Long aliyunId;

		private String resourceId;

		private String content;

		private String reason;

		private Long id;

		private String checkName;

		public Integer getSeverity() {
			return this.severity;
		}

		public void setSeverity(Integer severity) {
			this.severity = severity;
		}

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getDetails() {
			return this.details;
		}

		public void setDetails(String details) {
			this.details = details;
		}

		public Boolean getIsExpired() {
			return this.isExpired;
		}

		public void setIsExpired(Boolean isExpired) {
			this.isExpired = isExpired;
		}

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getResource() {
			return this.resource;
		}

		public void setResource(String resource) {
			this.resource = resource;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getLinks() {
			return this.links;
		}

		public void setLinks(String links) {
			this.links = links;
		}

		public String getCheckId() {
			return this.checkId;
		}

		public void setCheckId(String checkId) {
			this.checkId = checkId;
		}

		public Long getAliyunId() {
			return this.aliyunId;
		}

		public void setAliyunId(Long aliyunId) {
			this.aliyunId = aliyunId;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCheckName() {
			return this.checkName;
		}

		public void setCheckName(String checkName) {
			this.checkName = checkName;
		}
	}

	@Override
	public DescribeAdvicesResponse getInstance(UnmarshallerContext context) {
		return	DescribeAdvicesResponseUnmarshaller.unmarshall(this, context);
	}
}
