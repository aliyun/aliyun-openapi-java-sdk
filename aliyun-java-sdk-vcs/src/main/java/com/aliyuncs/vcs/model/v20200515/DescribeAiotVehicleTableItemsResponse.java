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
import com.aliyuncs.vcs.transform.v20200515.DescribeAiotVehicleTableItemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAiotVehicleTableItemsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private VehicleTableItems vehicleTableItems;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public VehicleTableItems getVehicleTableItems() {
		return this.vehicleTableItems;
	}

	public void setVehicleTableItems(VehicleTableItems vehicleTableItems) {
		this.vehicleTableItems = vehicleTableItems;
	}

	public static class VehicleTableItems {

		private Long pageNum;

		private Long pageSize;

		private Long totalNum;

		private List<VehicleTableItemType> vehicleTableItemList;

		public Long getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Long pageNum) {
			this.pageNum = pageNum;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotalNum() {
			return this.totalNum;
		}

		public void setTotalNum(Long totalNum) {
			this.totalNum = totalNum;
		}

		public List<VehicleTableItemType> getVehicleTableItemList() {
			return this.vehicleTableItemList;
		}

		public void setVehicleTableItemList(List<VehicleTableItemType> vehicleTableItemList) {
			this.vehicleTableItemList = vehicleTableItemList;
		}

		public static class VehicleTableItemType {

			private String vehicleTableItemId;

			private String vehicleTableId;

			private String plateNo;

			private String ownerName;

			private String phoneNo;

			private String beginTime;

			private String endTime;

			private String remarks;

			public String getVehicleTableItemId() {
				return this.vehicleTableItemId;
			}

			public void setVehicleTableItemId(String vehicleTableItemId) {
				this.vehicleTableItemId = vehicleTableItemId;
			}

			public String getVehicleTableId() {
				return this.vehicleTableId;
			}

			public void setVehicleTableId(String vehicleTableId) {
				this.vehicleTableId = vehicleTableId;
			}

			public String getPlateNo() {
				return this.plateNo;
			}

			public void setPlateNo(String plateNo) {
				this.plateNo = plateNo;
			}

			public String getOwnerName() {
				return this.ownerName;
			}

			public void setOwnerName(String ownerName) {
				this.ownerName = ownerName;
			}

			public String getPhoneNo() {
				return this.phoneNo;
			}

			public void setPhoneNo(String phoneNo) {
				this.phoneNo = phoneNo;
			}

			public String getBeginTime() {
				return this.beginTime;
			}

			public void setBeginTime(String beginTime) {
				this.beginTime = beginTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getRemarks() {
				return this.remarks;
			}

			public void setRemarks(String remarks) {
				this.remarks = remarks;
			}
		}
	}

	@Override
	public DescribeAiotVehicleTableItemsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAiotVehicleTableItemsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
