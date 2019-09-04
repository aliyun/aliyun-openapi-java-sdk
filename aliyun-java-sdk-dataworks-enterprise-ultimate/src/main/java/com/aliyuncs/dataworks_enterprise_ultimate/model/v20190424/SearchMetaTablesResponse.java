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

package com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_enterprise_ultimate.transform.v20190424.SearchMetaTablesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchMetaTablesResponse extends AcsResponse {

	private String requestId;

	private String errCode;

	private String errMsg;

	private Integer pageNum;

	private Integer pageSize;

	private Integer totalNum;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return this.errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String appGuid;

		private String tableGuid;

		private String tableName;

		private String createTime;

		private String lastModifyTime;

		private String lastDdlTime;

		private String lastAccessTime;

		private String ownerId;

		public String getAppGuid() {
			return this.appGuid;
		}

		public void setAppGuid(String appGuid) {
			this.appGuid = appGuid;
		}

		public String getTableGuid() {
			return this.tableGuid;
		}

		public void setTableGuid(String tableGuid) {
			this.tableGuid = tableGuid;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getLastModifyTime() {
			return this.lastModifyTime;
		}

		public void setLastModifyTime(String lastModifyTime) {
			this.lastModifyTime = lastModifyTime;
		}

		public String getLastDdlTime() {
			return this.lastDdlTime;
		}

		public void setLastDdlTime(String lastDdlTime) {
			this.lastDdlTime = lastDdlTime;
		}

		public String getLastAccessTime() {
			return this.lastAccessTime;
		}

		public void setLastAccessTime(String lastAccessTime) {
			this.lastAccessTime = lastAccessTime;
		}

		public String getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(String ownerId) {
			this.ownerId = ownerId;
		}
	}

	@Override
	public SearchMetaTablesResponse getInstance(UnmarshallerContext context) {
		return	SearchMetaTablesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
