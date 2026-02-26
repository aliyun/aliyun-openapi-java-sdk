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
import com.aliyuncs.advisor_share.transform.v20180608.ListAppInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAppInfoResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNo;

		private Integer pageSize;

		private Integer total;

		private List<Resource> result;

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public List<Resource> getResult() {
			return this.result;
		}

		public void setResult(List<Resource> result) {
			this.result = result;
		}

		public static class Resource {

			private Long appId;

			private String appName;

			private Integer resourceCount;

			private String contactName;

			private String contactMobile;

			public Long getAppId() {
				return this.appId;
			}

			public void setAppId(Long appId) {
				this.appId = appId;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public Integer getResourceCount() {
				return this.resourceCount;
			}

			public void setResourceCount(Integer resourceCount) {
				this.resourceCount = resourceCount;
			}

			public String getContactName() {
				return this.contactName;
			}

			public void setContactName(String contactName) {
				this.contactName = contactName;
			}

			public String getContactMobile() {
				return this.contactMobile;
			}

			public void setContactMobile(String contactMobile) {
				this.contactMobile = contactMobile;
			}
		}
	}

	@Override
	public ListAppInfoResponse getInstance(UnmarshallerContext context) {
		return	ListAppInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
