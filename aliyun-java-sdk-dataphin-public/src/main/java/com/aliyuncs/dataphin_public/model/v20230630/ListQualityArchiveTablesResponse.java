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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.ListQualityArchiveTablesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListQualityArchiveTablesResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

		private Long totalCount;

		private List<ArchiveTable> archiveTableList;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<ArchiveTable> getArchiveTableList() {
			return this.archiveTableList;
		}

		public void setArchiveTableList(List<ArchiveTable> archiveTableList) {
			this.archiveTableList = archiveTableList;
		}

		public static class ArchiveTable {

			private String archiveTableName;

			private Boolean isDefault;

			private Long maxArchiveCount;

			private Integer lifecycle;

			private Long archiveTableId;

			private String ddl;

			public String getArchiveTableName() {
				return this.archiveTableName;
			}

			public void setArchiveTableName(String archiveTableName) {
				this.archiveTableName = archiveTableName;
			}

			public Boolean getIsDefault() {
				return this.isDefault;
			}

			public void setIsDefault(Boolean isDefault) {
				this.isDefault = isDefault;
			}

			public Long getMaxArchiveCount() {
				return this.maxArchiveCount;
			}

			public void setMaxArchiveCount(Long maxArchiveCount) {
				this.maxArchiveCount = maxArchiveCount;
			}

			public Integer getLifecycle() {
				return this.lifecycle;
			}

			public void setLifecycle(Integer lifecycle) {
				this.lifecycle = lifecycle;
			}

			public Long getArchiveTableId() {
				return this.archiveTableId;
			}

			public void setArchiveTableId(Long archiveTableId) {
				this.archiveTableId = archiveTableId;
			}

			public String getDdl() {
				return this.ddl;
			}

			public void setDdl(String ddl) {
				this.ddl = ddl;
			}
		}
	}

	@Override
	public ListQualityArchiveTablesResponse getInstance(UnmarshallerContext context) {
		return	ListQualityArchiveTablesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
