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

package com.aliyuncs.unimkt.model.v20181212;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.unimkt.transform.v20181212.GetMainPartListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMainPartListResponse extends AcsResponse {

	private Long code;

	private Boolean success;

	private String requestId;

	private Data data;

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

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

		private Long count;

		private List<MainPartBizs> list;

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public List<MainPartBizs> getList() {
			return this.list;
		}

		public void setList(List<MainPartBizs> list) {
			this.list = list;
		}

		public static class MainPartBizs {

			private String accountNo;

			private String accountType;

			private Long brandUserId;

			private String brandUserNick;

			private Long mainId;

			private String mainName;

			private Long proxyUserId;

			public String getAccountNo() {
				return this.accountNo;
			}

			public void setAccountNo(String accountNo) {
				this.accountNo = accountNo;
			}

			public String getAccountType() {
				return this.accountType;
			}

			public void setAccountType(String accountType) {
				this.accountType = accountType;
			}

			public Long getBrandUserId() {
				return this.brandUserId;
			}

			public void setBrandUserId(Long brandUserId) {
				this.brandUserId = brandUserId;
			}

			public String getBrandUserNick() {
				return this.brandUserNick;
			}

			public void setBrandUserNick(String brandUserNick) {
				this.brandUserNick = brandUserNick;
			}

			public Long getMainId() {
				return this.mainId;
			}

			public void setMainId(Long mainId) {
				this.mainId = mainId;
			}

			public String getMainName() {
				return this.mainName;
			}

			public void setMainName(String mainName) {
				this.mainName = mainName;
			}

			public Long getProxyUserId() {
				return this.proxyUserId;
			}

			public void setProxyUserId(Long proxyUserId) {
				this.proxyUserId = proxyUserId;
			}
		}
	}

	@Override
	public GetMainPartListResponse getInstance(UnmarshallerContext context) {
		return	GetMainPartListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
