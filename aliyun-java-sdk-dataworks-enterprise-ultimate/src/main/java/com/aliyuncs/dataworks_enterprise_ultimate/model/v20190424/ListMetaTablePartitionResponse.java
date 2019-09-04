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
import com.aliyuncs.dataworks_enterprise_ultimate.transform.v20190424.ListMetaTablePartitionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMetaTablePartitionResponse extends AcsResponse {

	private String requestId;

	private Long errCode;

	private String errMsg;

	private Integer pageNum;

	private Integer pageSize;

	private Integer totalNum;

	private List<Partition> partitionList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getErrCode() {
		return this.errCode;
	}

	public void setErrCode(Long errCode) {
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

	public List<Partition> getPartitionList() {
		return this.partitionList;
	}

	public void setPartitionList(List<Partition> partitionList) {
		this.partitionList = partitionList;
	}

	public static class Partition {

		private String appGuid;

		private String tableGuid;

		private String tableName;

		private Long id;

		private String partitionGuid;

		private String partitionName;

		private String createTime;

		private String type;

		private String modifyTime;

		private String extraAttributes;

		private Long dataSize;

		private Long records;

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

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getPartitionGuid() {
			return this.partitionGuid;
		}

		public void setPartitionGuid(String partitionGuid) {
			this.partitionGuid = partitionGuid;
		}

		public String getPartitionName() {
			return this.partitionName;
		}

		public void setPartitionName(String partitionName) {
			this.partitionName = partitionName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getExtraAttributes() {
			return this.extraAttributes;
		}

		public void setExtraAttributes(String extraAttributes) {
			this.extraAttributes = extraAttributes;
		}

		public Long getDataSize() {
			return this.dataSize;
		}

		public void setDataSize(Long dataSize) {
			this.dataSize = dataSize;
		}

		public Long getRecords() {
			return this.records;
		}

		public void setRecords(Long records) {
			this.records = records;
		}
	}

	@Override
	public ListMetaTablePartitionResponse getInstance(UnmarshallerContext context) {
		return	ListMetaTablePartitionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
