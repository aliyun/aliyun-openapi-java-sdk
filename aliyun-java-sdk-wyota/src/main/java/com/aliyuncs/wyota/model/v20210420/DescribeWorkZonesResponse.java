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
import com.aliyuncs.wyota.transform.v20210420.DescribeWorkZonesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWorkZonesResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long totalCount;

		private List<WorkZoneDTOListItem> workZoneDTOList;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<WorkZoneDTOListItem> getWorkZoneDTOList() {
			return this.workZoneDTOList;
		}

		public void setWorkZoneDTOList(List<WorkZoneDTOListItem> workZoneDTOList) {
			this.workZoneDTOList = workZoneDTOList;
		}

		public static class WorkZoneDTOListItem {

			private String zoneId;

			private String zoneName;

			private Integer seatCol;

			private Integer seatRow;

			private String tenantId;

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getZoneName() {
				return this.zoneName;
			}

			public void setZoneName(String zoneName) {
				this.zoneName = zoneName;
			}

			public Integer getSeatCol() {
				return this.seatCol;
			}

			public void setSeatCol(Integer seatCol) {
				this.seatCol = seatCol;
			}

			public Integer getSeatRow() {
				return this.seatRow;
			}

			public void setSeatRow(Integer seatRow) {
				this.seatRow = seatRow;
			}

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}
		}
	}

	@Override
	public DescribeWorkZonesResponse getInstance(UnmarshallerContext context) {
		return	DescribeWorkZonesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
