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

package com.aliyuncs.dyplsapi.model.v20170525;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dyplsapi.transform.v20170525.ListXTelephonesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListXTelephonesResponse extends AcsResponse {

	private String accessDeniedDetail;

	private String message;

	private String code;

	private Boolean success;

	private Data data;

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long pageSize;

		private Long total;

		private Long pageNo;

		private List<ListItem> list;

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public Long getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Long pageNo) {
			this.pageNo = pageNo;
		}

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private String buyTime;

			private String telephoneStatus;

			private String customerPoolKey;

			private String bindTime;

			private String customerPoolName;

			private String telephone;

			private String smsStatus;

			private String releaseTime;

			private String authMsg;

			private String unbindTime;

			public String getBuyTime() {
				return this.buyTime;
			}

			public void setBuyTime(String buyTime) {
				this.buyTime = buyTime;
			}

			public String getTelephoneStatus() {
				return this.telephoneStatus;
			}

			public void setTelephoneStatus(String telephoneStatus) {
				this.telephoneStatus = telephoneStatus;
			}

			public String getCustomerPoolKey() {
				return this.customerPoolKey;
			}

			public void setCustomerPoolKey(String customerPoolKey) {
				this.customerPoolKey = customerPoolKey;
			}

			public String getBindTime() {
				return this.bindTime;
			}

			public void setBindTime(String bindTime) {
				this.bindTime = bindTime;
			}

			public String getCustomerPoolName() {
				return this.customerPoolName;
			}

			public void setCustomerPoolName(String customerPoolName) {
				this.customerPoolName = customerPoolName;
			}

			public String getTelephone() {
				return this.telephone;
			}

			public void setTelephone(String telephone) {
				this.telephone = telephone;
			}

			public String getSmsStatus() {
				return this.smsStatus;
			}

			public void setSmsStatus(String smsStatus) {
				this.smsStatus = smsStatus;
			}

			public String getReleaseTime() {
				return this.releaseTime;
			}

			public void setReleaseTime(String releaseTime) {
				this.releaseTime = releaseTime;
			}

			public String getAuthMsg() {
				return this.authMsg;
			}

			public void setAuthMsg(String authMsg) {
				this.authMsg = authMsg;
			}

			public String getUnbindTime() {
				return this.unbindTime;
			}

			public void setUnbindTime(String unbindTime) {
				this.unbindTime = unbindTime;
			}
		}
	}

	@Override
	public ListXTelephonesResponse getInstance(UnmarshallerContext context) {
		return	ListXTelephonesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
