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

package com.aliyuncs.iot.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.ListSourceReplicaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSourceReplicaResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long total;

		private Long totalPage;

		private Integer pageSize;

		private Integer pageNo;

		private List<DataListItem> dataList;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public Long getTotalPage() {
			return this.totalPage;
		}

		public void setTotalPage(Long totalPage) {
			this.totalPage = totalPage;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public List<DataListItem> getDataList() {
			return this.dataList;
		}

		public void setDataList(List<DataListItem> dataList) {
			this.dataList = dataList;
		}

		public static class DataListItem {

			private String replicaUid;

			private String name;

			private String code;

			private String sourceUid;

			private String tableUid;

			private String sourceType;

			private Integer timeCycle;

			private String timeUnit;

			private Integer region;

			private Long beginLatest;

			private Long endLatest;

			private String extraProperty;

			private Integer status;

			private Long storageSize;

			private Long productCreateTime;

			private Integer nodeType;

			private Boolean needTips;

			private String longJobUid;

			private String desc;

			private Long gmtCreate;

			public String getReplicaUid() {
				return this.replicaUid;
			}

			public void setReplicaUid(String replicaUid) {
				this.replicaUid = replicaUid;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getSourceUid() {
				return this.sourceUid;
			}

			public void setSourceUid(String sourceUid) {
				this.sourceUid = sourceUid;
			}

			public String getTableUid() {
				return this.tableUid;
			}

			public void setTableUid(String tableUid) {
				this.tableUid = tableUid;
			}

			public String getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(String sourceType) {
				this.sourceType = sourceType;
			}

			public Integer getTimeCycle() {
				return this.timeCycle;
			}

			public void setTimeCycle(Integer timeCycle) {
				this.timeCycle = timeCycle;
			}

			public String getTimeUnit() {
				return this.timeUnit;
			}

			public void setTimeUnit(String timeUnit) {
				this.timeUnit = timeUnit;
			}

			public Integer getRegion() {
				return this.region;
			}

			public void setRegion(Integer region) {
				this.region = region;
			}

			public Long getBeginLatest() {
				return this.beginLatest;
			}

			public void setBeginLatest(Long beginLatest) {
				this.beginLatest = beginLatest;
			}

			public Long getEndLatest() {
				return this.endLatest;
			}

			public void setEndLatest(Long endLatest) {
				this.endLatest = endLatest;
			}

			public String getExtraProperty() {
				return this.extraProperty;
			}

			public void setExtraProperty(String extraProperty) {
				this.extraProperty = extraProperty;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Long getStorageSize() {
				return this.storageSize;
			}

			public void setStorageSize(Long storageSize) {
				this.storageSize = storageSize;
			}

			public Long getProductCreateTime() {
				return this.productCreateTime;
			}

			public void setProductCreateTime(Long productCreateTime) {
				this.productCreateTime = productCreateTime;
			}

			public Integer getNodeType() {
				return this.nodeType;
			}

			public void setNodeType(Integer nodeType) {
				this.nodeType = nodeType;
			}

			public Boolean getNeedTips() {
				return this.needTips;
			}

			public void setNeedTips(Boolean needTips) {
				this.needTips = needTips;
			}

			public String getLongJobUid() {
				return this.longJobUid;
			}

			public void setLongJobUid(String longJobUid) {
				this.longJobUid = longJobUid;
			}

			public String getDesc() {
				return this.desc;
			}

			public void setDesc(String desc) {
				this.desc = desc;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}
		}
	}

	@Override
	public ListSourceReplicaResponse getInstance(UnmarshallerContext context) {
		return	ListSourceReplicaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
