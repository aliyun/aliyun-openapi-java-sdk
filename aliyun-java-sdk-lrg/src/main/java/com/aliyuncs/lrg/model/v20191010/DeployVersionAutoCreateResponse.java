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

package com.aliyuncs.lrg.model.v20191010;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.lrg.transform.v20191010.DeployVersionAutoCreateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DeployVersionAutoCreateResponse extends AcsResponse {

	private String status;

	private String details;

	private String reason;

	private String errorCode;

	private String requestId;

	private String errorCode1;

	private Data data;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode1() {
		return this.errorCode1;
	}

	public void setErrorCode1(String errorCode1) {
		this.errorCode1 = errorCode1;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer id;

		private String versionName;

		private String name;

		private String description;

		private Integer productId;

		private String productName;

		private String gmtCreate;

		private String creator;

		private String creatorName;

		private String gmtModified;

		private Boolean related;

		private Integer baseVersionId;

		private String baseVersionName;

		private Integer productReleaseId;

		private String versionUrl;

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getVersionName() {
			return this.versionName;
		}

		public void setVersionName(String versionName) {
			this.versionName = versionName;
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

		public Integer getProductId() {
			return this.productId;
		}

		public void setProductId(Integer productId) {
			this.productId = productId;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getCreatorName() {
			return this.creatorName;
		}

		public void setCreatorName(String creatorName) {
			this.creatorName = creatorName;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Boolean getRelated() {
			return this.related;
		}

		public void setRelated(Boolean related) {
			this.related = related;
		}

		public Integer getBaseVersionId() {
			return this.baseVersionId;
		}

		public void setBaseVersionId(Integer baseVersionId) {
			this.baseVersionId = baseVersionId;
		}

		public String getBaseVersionName() {
			return this.baseVersionName;
		}

		public void setBaseVersionName(String baseVersionName) {
			this.baseVersionName = baseVersionName;
		}

		public Integer getProductReleaseId() {
			return this.productReleaseId;
		}

		public void setProductReleaseId(Integer productReleaseId) {
			this.productReleaseId = productReleaseId;
		}

		public String getVersionUrl() {
			return this.versionUrl;
		}

		public void setVersionUrl(String versionUrl) {
			this.versionUrl = versionUrl;
		}
	}

	@Override
	public DeployVersionAutoCreateResponse getInstance(UnmarshallerContext context) {
		return	DeployVersionAutoCreateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
