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
import com.aliyuncs.dataphin_public.transform.v20230630.GetSourceTableMetaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSourceTableMetaResponse extends AcsResponse {

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

		private String tableName;

		private String tableComment;

		private String guid;

		private List<ColumnsItem> columns;

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getTableComment() {
			return this.tableComment;
		}

		public void setTableComment(String tableComment) {
			this.tableComment = tableComment;
		}

		public String getGuid() {
			return this.guid;
		}

		public void setGuid(String guid) {
			this.guid = guid;
		}

		public List<ColumnsItem> getColumns() {
			return this.columns;
		}

		public void setColumns(List<ColumnsItem> columns) {
			this.columns = columns;
		}

		public static class ColumnsItem {

			private String comment;

			private Boolean pt;

			private String dataType;

			private Boolean pk;

			private Integer seqNumber;

			private String rawDataType;

			private String name;

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public Boolean getPt() {
				return this.pt;
			}

			public void setPt(Boolean pt) {
				this.pt = pt;
			}

			public String getDataType() {
				return this.dataType;
			}

			public void setDataType(String dataType) {
				this.dataType = dataType;
			}

			public Boolean getPk() {
				return this.pk;
			}

			public void setPk(Boolean pk) {
				this.pk = pk;
			}

			public Integer getSeqNumber() {
				return this.seqNumber;
			}

			public void setSeqNumber(Integer seqNumber) {
				this.seqNumber = seqNumber;
			}

			public String getRawDataType() {
				return this.rawDataType;
			}

			public void setRawDataType(String rawDataType) {
				this.rawDataType = rawDataType;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public GetSourceTableMetaResponse getInstance(UnmarshallerContext context) {
		return	GetSourceTableMetaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
