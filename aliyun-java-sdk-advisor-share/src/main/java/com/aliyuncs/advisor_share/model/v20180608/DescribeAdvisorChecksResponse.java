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
import com.aliyuncs.advisor_share.transform.v20180608.DescribeAdvisorChecksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAdvisorChecksResponse extends AcsResponse {

	private String code;

	private String requestId;

	private List<AdvisorCheck> data;

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

	public List<AdvisorCheck> getData() {
		return this.data;
	}

	public void setData(List<AdvisorCheck> data) {
		this.data = data;
	}

	public static class AdvisorCheck {

		private String status;

		private String product;

		private String operateColumn;

		private String gmtModified;

		private String viewColumn;

		private String gmtCreated;

		private String description;

		private String tips;

		private String code;

		private String category;

		private String name;

		private Long id;

		private Boolean configSupport;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public String getOperateColumn() {
			return this.operateColumn;
		}

		public void setOperateColumn(String operateColumn) {
			this.operateColumn = operateColumn;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getViewColumn() {
			return this.viewColumn;
		}

		public void setViewColumn(String viewColumn) {
			this.viewColumn = viewColumn;
		}

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getTips() {
			return this.tips;
		}

		public void setTips(String tips) {
			this.tips = tips;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Boolean getConfigSupport() {
			return this.configSupport;
		}

		public void setConfigSupport(Boolean configSupport) {
			this.configSupport = configSupport;
		}
	}

	@Override
	public DescribeAdvisorChecksResponse getInstance(UnmarshallerContext context) {
		return	DescribeAdvisorChecksResponseUnmarshaller.unmarshall(this, context);
	}
}
