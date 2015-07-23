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
package com.aliyuncs.crm.model.v20150324;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.crm.transform.v20150324.FindBizCategoryConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindBizCategoryConfigResponse extends AcsResponse {

	private Boolean success;

	private String resultCode;

	private String resultMessage;

	private List<BizCategory> data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public List<BizCategory> getData() {
		return this.data;
	}

	public void setData(List<BizCategory> data) {
		this.data = data;
	}

	public static class BizCategory {

		private String name;

		private String code;

		private Boolean isCheck;

		private Boolean mainBiz;

		private String other;

		private List<BizSubCategory> subConfigs;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public Boolean getIsCheck() {
			return this.isCheck;
		}

		public void setIsCheck(Boolean isCheck) {
			this.isCheck = isCheck;
		}

		public Boolean getMainBiz() {
			return this.mainBiz;
		}

		public void setMainBiz(Boolean mainBiz) {
			this.mainBiz = mainBiz;
		}

		public String getOther() {
			return this.other;
		}

		public void setOther(String other) {
			this.other = other;
		}

		public List<BizSubCategory> getSubConfigs() {
			return this.subConfigs;
		}

		public void setSubConfigs(List<BizSubCategory> subConfigs) {
			this.subConfigs = subConfigs;
		}

		public static class BizSubCategory {

			private String name;

			private String code;

			private Boolean isCheck;

			private Boolean mainBiz;

			private String other;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public Boolean getIsCheck() {
				return this.isCheck;
			}

			public void setIsCheck(Boolean isCheck) {
				this.isCheck = isCheck;
			}

			public Boolean getMainBiz() {
				return this.mainBiz;
			}

			public void setMainBiz(Boolean mainBiz) {
				this.mainBiz = mainBiz;
			}

			public String getOther() {
				return this.other;
			}

			public void setOther(String other) {
				this.other = other;
			}
		}
	}

	@Override
	public FindBizCategoryConfigResponse getInstance(UnmarshallerContext context) {
		return	FindBizCategoryConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
