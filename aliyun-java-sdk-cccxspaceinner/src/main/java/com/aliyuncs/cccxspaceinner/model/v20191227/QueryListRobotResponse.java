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

package com.aliyuncs.cccxspaceinner.model.v20191227;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cccxspaceinner.transform.v20191227.QueryListRobotResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryListRobotResponse extends AcsResponse {

	private String message;

	private Integer code;

	private Boolean success;

	private Data data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
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

		private Integer pageNo;

		private Integer pageSize;

		private Integer rowCount;

		private List<ResultItem> result;

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

		public Integer getRowCount() {
			return this.rowCount;
		}

		public void setRowCount(Integer rowCount) {
			this.rowCount = rowCount;
		}

		public List<ResultItem> getResult() {
			return this.result;
		}

		public void setResult(List<ResultItem> result) {
			this.result = result;
		}

		public static class ResultItem {

			private String name;

			private String introduction;

			private String secret;

			private Long accountId;

			private Integer accountType;

			private String source;

			private Integer appType;

			private String ext;

			private Integer status;

			private String appKey;

			private String buKey;

			private String buName;

			private String corpId;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getIntroduction() {
				return this.introduction;
			}

			public void setIntroduction(String introduction) {
				this.introduction = introduction;
			}

			public String getSecret() {
				return this.secret;
			}

			public void setSecret(String secret) {
				this.secret = secret;
			}

			public Long getAccountId() {
				return this.accountId;
			}

			public void setAccountId(Long accountId) {
				this.accountId = accountId;
			}

			public Integer getAccountType() {
				return this.accountType;
			}

			public void setAccountType(Integer accountType) {
				this.accountType = accountType;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}

			public Integer getAppType() {
				return this.appType;
			}

			public void setAppType(Integer appType) {
				this.appType = appType;
			}

			public String getExt() {
				return this.ext;
			}

			public void setExt(String ext) {
				this.ext = ext;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getAppKey() {
				return this.appKey;
			}

			public void setAppKey(String appKey) {
				this.appKey = appKey;
			}

			public String getBuKey() {
				return this.buKey;
			}

			public void setBuKey(String buKey) {
				this.buKey = buKey;
			}

			public String getBuName() {
				return this.buName;
			}

			public void setBuName(String buName) {
				this.buName = buName;
			}

			public String getCorpId() {
				return this.corpId;
			}

			public void setCorpId(String corpId) {
				this.corpId = corpId;
			}
		}
	}

	@Override
	public QueryListRobotResponse getInstance(UnmarshallerContext context) {
		return	QueryListRobotResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
