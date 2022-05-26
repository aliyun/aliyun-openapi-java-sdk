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

package com.aliyuncs.account_crm.model.v20160606;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.account_crm.transform.v20160606.FindBizCategoryConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindBizCategoryConfigResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private List<BizCategory> data;

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

	public List<BizCategory> getData() {
		return this.data;
	}

	public void setData(List<BizCategory> data) {
		this.data = data;
	}

	public static class BizCategory {

		private String code;

		private Boolean mainBiz;

		private String name;

		private String other;

		private Boolean isCheck;

		private List<BizSubCategory> subConfigs;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public Boolean getMainBiz() {
			return this.mainBiz;
		}

		public void setMainBiz(Boolean mainBiz) {
			this.mainBiz = mainBiz;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOther() {
			return this.other;
		}

		public void setOther(String other) {
			this.other = other;
		}

		public Boolean getIsCheck() {
			return this.isCheck;
		}

		public void setIsCheck(Boolean isCheck) {
			this.isCheck = isCheck;
		}

		public List<BizSubCategory> getSubConfigs() {
			return this.subConfigs;
		}

		public void setSubConfigs(List<BizSubCategory> subConfigs) {
			this.subConfigs = subConfigs;
		}

		public static class BizSubCategory {

			private String code;

			private Boolean mainBiz;

			private String name;

			private String other;

			private Boolean isCheck;

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public Boolean getMainBiz() {
				return this.mainBiz;
			}

			public void setMainBiz(Boolean mainBiz) {
				this.mainBiz = mainBiz;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getOther() {
				return this.other;
			}

			public void setOther(String other) {
				this.other = other;
			}

			public Boolean getIsCheck() {
				return this.isCheck;
			}

			public void setIsCheck(Boolean isCheck) {
				this.isCheck = isCheck;
			}
		}
	}

	@Override
	public FindBizCategoryConfigResponse getInstance(UnmarshallerContext context) {
		return	FindBizCategoryConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
