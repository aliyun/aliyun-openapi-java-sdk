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
package com.aliyuncs.qualitycheck.model.v20160801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20160801.GetBusinessCategoryListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBusinessCategoryListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<BusinessCategoryBasicInfo> businessCategorys;

		public List<BusinessCategoryBasicInfo> getBusinessCategorys() {
			return this.businessCategorys;
		}

		public void setBusinessCategorys(List<BusinessCategoryBasicInfo> businessCategorys) {
			this.businessCategorys = businessCategorys;
		}

		public static class BusinessCategoryBasicInfo {

			private Integer bid;

			private Integer serviceType;

			private String name;

			private Integer originalId;

			public Integer getBid() {
				return this.bid;
			}

			public void setBid(Integer bid) {
				this.bid = bid;
			}

			public Integer getServiceType() {
				return this.serviceType;
			}

			public void setServiceType(Integer serviceType) {
				this.serviceType = serviceType;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getOriginalId() {
				return this.originalId;
			}

			public void setOriginalId(Integer originalId) {
				this.originalId = originalId;
			}
		}
	}

	@Override
	public GetBusinessCategoryListResponse getInstance(UnmarshallerContext context) {
		return	GetBusinessCategoryListResponseUnmarshaller.unmarshall(this, context);
	}
}
