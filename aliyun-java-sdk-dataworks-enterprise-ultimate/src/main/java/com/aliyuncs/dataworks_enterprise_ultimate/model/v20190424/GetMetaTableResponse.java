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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_enterprise_ultimate.transform.v20190424.GetMetaTableResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMetaTableResponse extends AcsResponse {

	private String requestId;

	private String errCode;

	private String errMsg;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String appGuid;

		private String tableGuid;

		private String tableName;

		private String ownerId;

		private String ownerYunAccount;

		private String tableDesc;

		private Integer hasPart;

		private Long dataSize;

		private String createTime;

		private String lastDdlTime;

		private String lastModifyTime;

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

		public String getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(String ownerId) {
			this.ownerId = ownerId;
		}

		public String getOwnerYunAccount() {
			return this.ownerYunAccount;
		}

		public void setOwnerYunAccount(String ownerYunAccount) {
			this.ownerYunAccount = ownerYunAccount;
		}

		public String getTableDesc() {
			return this.tableDesc;
		}

		public void setTableDesc(String tableDesc) {
			this.tableDesc = tableDesc;
		}

		public Integer getHasPart() {
			return this.hasPart;
		}

		public void setHasPart(Integer hasPart) {
			this.hasPart = hasPart;
		}

		public Long getDataSize() {
			return this.dataSize;
		}

		public void setDataSize(Long dataSize) {
			this.dataSize = dataSize;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getLastDdlTime() {
			return this.lastDdlTime;
		}

		public void setLastDdlTime(String lastDdlTime) {
			this.lastDdlTime = lastDdlTime;
		}

		public String getLastModifyTime() {
			return this.lastModifyTime;
		}

		public void setLastModifyTime(String lastModifyTime) {
			this.lastModifyTime = lastModifyTime;
		}
	}

	@Override
	public GetMetaTableResponse getInstance(UnmarshallerContext context) {
		return	GetMetaTableResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
