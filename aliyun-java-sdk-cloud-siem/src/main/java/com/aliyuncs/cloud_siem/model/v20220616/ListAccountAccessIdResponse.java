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

package com.aliyuncs.cloud_siem.model.v20220616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.ListAccountAccessIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAccountAccessIdResponse extends AcsResponse {

	private Boolean success;

	private Integer code;

	private String message;

	private String requestId;

	private List<DataItem> data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Long subUserId;

		private String accessIdMd5;

		private String accountStr;

		private Integer bound;

		private String accessId;

		private String accountId;

		private String cloudCode;

		public Long getSubUserId() {
			return this.subUserId;
		}

		public void setSubUserId(Long subUserId) {
			this.subUserId = subUserId;
		}

		public String getAccessIdMd5() {
			return this.accessIdMd5;
		}

		public void setAccessIdMd5(String accessIdMd5) {
			this.accessIdMd5 = accessIdMd5;
		}

		public String getAccountStr() {
			return this.accountStr;
		}

		public void setAccountStr(String accountStr) {
			this.accountStr = accountStr;
		}

		public Integer getBound() {
			return this.bound;
		}

		public void setBound(Integer bound) {
			this.bound = bound;
		}

		public String getAccessId() {
			return this.accessId;
		}

		public void setAccessId(String accessId) {
			this.accessId = accessId;
		}

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		public String getCloudCode() {
			return this.cloudCode;
		}

		public void setCloudCode(String cloudCode) {
			this.cloudCode = cloudCode;
		}
	}

	@Override
	public ListAccountAccessIdResponse getInstance(UnmarshallerContext context) {
		return	ListAccountAccessIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
