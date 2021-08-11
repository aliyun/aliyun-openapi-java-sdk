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

package com.aliyuncs.vcs.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.ListCorpsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCorpsResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Data data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer totalPage;

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<Record> records;

		public Integer getTotalPage() {
			return this.totalPage;
		}

		public void setTotalPage(Integer totalPage) {
			this.totalPage = totalPage;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<Record> getRecords() {
			return this.records;
		}

		public void setRecords(List<Record> records) {
			this.records = records;
		}

		public static class Record {

			private String parentCorpId;

			private String appName;

			private String isvSubId;

			private String description;

			private String corpName;

			private String corpId;

			private Integer acuUsed;

			private String createDate;

			private String iconPath;

			private Integer deviceCount;

			public String getParentCorpId() {
				return this.parentCorpId;
			}

			public void setParentCorpId(String parentCorpId) {
				this.parentCorpId = parentCorpId;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getIsvSubId() {
				return this.isvSubId;
			}

			public void setIsvSubId(String isvSubId) {
				this.isvSubId = isvSubId;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getCorpName() {
				return this.corpName;
			}

			public void setCorpName(String corpName) {
				this.corpName = corpName;
			}

			public String getCorpId() {
				return this.corpId;
			}

			public void setCorpId(String corpId) {
				this.corpId = corpId;
			}

			public Integer getAcuUsed() {
				return this.acuUsed;
			}

			public void setAcuUsed(Integer acuUsed) {
				this.acuUsed = acuUsed;
			}

			public String getCreateDate() {
				return this.createDate;
			}

			public void setCreateDate(String createDate) {
				this.createDate = createDate;
			}

			public String getIconPath() {
				return this.iconPath;
			}

			public void setIconPath(String iconPath) {
				this.iconPath = iconPath;
			}

			public Integer getDeviceCount() {
				return this.deviceCount;
			}

			public void setDeviceCount(Integer deviceCount) {
				this.deviceCount = deviceCount;
			}
		}
	}

	@Override
	public ListCorpsResponse getInstance(UnmarshallerContext context) {
		return	ListCorpsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
