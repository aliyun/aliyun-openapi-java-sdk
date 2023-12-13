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
import com.aliyuncs.cloud_siem.transform.v20220616.ListAccountsByLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAccountsByLogResponse extends AcsResponse {

	private String requestId;

	private List<DataItem> data;

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

		private Long mainUserId;

		private String accountId;

		private String accountName;

		private Integer imported;

		private String logCode;

		private String prodCode;

		public Long getSubUserId() {
			return this.subUserId;
		}

		public void setSubUserId(Long subUserId) {
			this.subUserId = subUserId;
		}

		public Long getMainUserId() {
			return this.mainUserId;
		}

		public void setMainUserId(Long mainUserId) {
			this.mainUserId = mainUserId;
		}

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public Integer getImported() {
			return this.imported;
		}

		public void setImported(Integer imported) {
			this.imported = imported;
		}

		public String getLogCode() {
			return this.logCode;
		}

		public void setLogCode(String logCode) {
			this.logCode = logCode;
		}

		public String getProdCode() {
			return this.prodCode;
		}

		public void setProdCode(String prodCode) {
			this.prodCode = prodCode;
		}
	}

	@Override
	public ListAccountsByLogResponse getInstance(UnmarshallerContext context) {
		return	ListAccountsByLogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
