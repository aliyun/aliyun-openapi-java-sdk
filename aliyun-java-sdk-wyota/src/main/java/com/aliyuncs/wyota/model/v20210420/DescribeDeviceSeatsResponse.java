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

package com.aliyuncs.wyota.model.v20210420;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.wyota.transform.v20210420.DescribeDeviceSeatsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDeviceSeatsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Long totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<DeviceSeats> data;

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

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<DeviceSeats> getData() {
		return this.data;
	}

	public void setData(List<DeviceSeats> data) {
		this.data = data;
	}

	public static class DeviceSeats {

		private String serialNo;

		private String siteId;

		private String siteName;

		private String seatNo;

		private Integer seatRow;

		private Integer seatCol;

		private String seatName;

		public String getSerialNo() {
			return this.serialNo;
		}

		public void setSerialNo(String serialNo) {
			this.serialNo = serialNo;
		}

		public String getSiteId() {
			return this.siteId;
		}

		public void setSiteId(String siteId) {
			this.siteId = siteId;
		}

		public String getSiteName() {
			return this.siteName;
		}

		public void setSiteName(String siteName) {
			this.siteName = siteName;
		}

		public String getSeatNo() {
			return this.seatNo;
		}

		public void setSeatNo(String seatNo) {
			this.seatNo = seatNo;
		}

		public Integer getSeatRow() {
			return this.seatRow;
		}

		public void setSeatRow(Integer seatRow) {
			this.seatRow = seatRow;
		}

		public Integer getSeatCol() {
			return this.seatCol;
		}

		public void setSeatCol(Integer seatCol) {
			this.seatCol = seatCol;
		}

		public String getSeatName() {
			return this.seatName;
		}

		public void setSeatName(String seatName) {
			this.seatName = seatName;
		}
	}

	@Override
	public DescribeDeviceSeatsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDeviceSeatsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
