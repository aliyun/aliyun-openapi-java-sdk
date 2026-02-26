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
import com.aliyuncs.iot.transform.v20180120.ListPowerStationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPowerStationResponse extends AcsResponse {

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

		private Integer pageNo;

		private Long total;

		private Integer pageSize;

		private List<DataListItem> dataList;

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<DataListItem> getDataList() {
			return this.dataList;
		}

		public void setDataList(List<DataListItem> dataList) {
			this.dataList = dataList;
		}

		public static class DataListItem {

			private String powerStationUid;

			private String algoInstanceUid;

			private String name;

			private String description;

			private Integer ratedPower;

			public String getPowerStationUid() {
				return this.powerStationUid;
			}

			public void setPowerStationUid(String powerStationUid) {
				this.powerStationUid = powerStationUid;
			}

			public String getAlgoInstanceUid() {
				return this.algoInstanceUid;
			}

			public void setAlgoInstanceUid(String algoInstanceUid) {
				this.algoInstanceUid = algoInstanceUid;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Integer getRatedPower() {
				return this.ratedPower;
			}

			public void setRatedPower(Integer ratedPower) {
				this.ratedPower = ratedPower;
			}
		}
	}

	@Override
	public ListPowerStationResponse getInstance(UnmarshallerContext context) {
		return	ListPowerStationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
