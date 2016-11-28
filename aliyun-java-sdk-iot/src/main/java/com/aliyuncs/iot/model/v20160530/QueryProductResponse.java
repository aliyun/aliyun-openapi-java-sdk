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
package com.aliyuncs.iot.model.v20160530;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20160530.QueryProductResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryProductResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private ProductInfo productInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public ProductInfo getProductInfo() {
		return this.productInfo;
	}

	public void setProductInfo(ProductInfo productInfo) {
		this.productInfo = productInfo;
	}

	public static class ProductInfo {

		private String productKey;

		private String productName;

		private Long catId;

		private Long createUserId;

		private String productDesc;

		private String productSecret;

		private String securePolicy;

		private String fromSource;

		private String extProps;

		private String gmtCreate;

		private String gmtModified;

		public String getProductKey() {
			return this.productKey;
		}

		public void setProductKey(String productKey) {
			this.productKey = productKey;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public Long getCatId() {
			return this.catId;
		}

		public void setCatId(Long catId) {
			this.catId = catId;
		}

		public Long getCreateUserId() {
			return this.createUserId;
		}

		public void setCreateUserId(Long createUserId) {
			this.createUserId = createUserId;
		}

		public String getProductDesc() {
			return this.productDesc;
		}

		public void setProductDesc(String productDesc) {
			this.productDesc = productDesc;
		}

		public String getProductSecret() {
			return this.productSecret;
		}

		public void setProductSecret(String productSecret) {
			this.productSecret = productSecret;
		}

		public String getSecurePolicy() {
			return this.securePolicy;
		}

		public void setSecurePolicy(String securePolicy) {
			this.securePolicy = securePolicy;
		}

		public String getFromSource() {
			return this.fromSource;
		}

		public void setFromSource(String fromSource) {
			this.fromSource = fromSource;
		}

		public String getExtProps() {
			return this.extProps;
		}

		public void setExtProps(String extProps) {
			this.extProps = extProps;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}
	}

	@Override
	public QueryProductResponse getInstance(UnmarshallerContext context) {
		return	QueryProductResponseUnmarshaller.unmarshall(this, context);
	}
}
