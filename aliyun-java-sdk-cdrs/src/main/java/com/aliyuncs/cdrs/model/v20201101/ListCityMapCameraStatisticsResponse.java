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

package com.aliyuncs.cdrs.model.v20201101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdrs.transform.v20201101.ListCityMapCameraStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCityMapCameraStatisticsResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Long pageNumber;

	private Long pageSize;

	private Long totalCount;

	private List<Datas> data;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<Datas> getData() {
		return this.data;
	}

	public void setData(List<Datas> data) {
		this.data = data;
	}

	public static class Datas {

		private String dataSourceId;

		private String latitude;

		private String longitude;

		private String dataSourceName;

		private String corpId;

		private String adultValue;

		private String womanValue;

		private String motorValue;

		private String manValue;

		private String oldValue;

		private String childValue;

		private String statisticTime;

		public String getDataSourceId() {
			return this.dataSourceId;
		}

		public void setDataSourceId(String dataSourceId) {
			this.dataSourceId = dataSourceId;
		}

		public String getLatitude() {
			return this.latitude;
		}

		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}

		public String getLongitude() {
			return this.longitude;
		}

		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}

		public String getDataSourceName() {
			return this.dataSourceName;
		}

		public void setDataSourceName(String dataSourceName) {
			this.dataSourceName = dataSourceName;
		}

		public String getCorpId() {
			return this.corpId;
		}

		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}

		public String getAdultValue() {
			return this.adultValue;
		}

		public void setAdultValue(String adultValue) {
			this.adultValue = adultValue;
		}

		public String getWomanValue() {
			return this.womanValue;
		}

		public void setWomanValue(String womanValue) {
			this.womanValue = womanValue;
		}

		public String getMotorValue() {
			return this.motorValue;
		}

		public void setMotorValue(String motorValue) {
			this.motorValue = motorValue;
		}

		public String getManValue() {
			return this.manValue;
		}

		public void setManValue(String manValue) {
			this.manValue = manValue;
		}

		public String getOldValue() {
			return this.oldValue;
		}

		public void setOldValue(String oldValue) {
			this.oldValue = oldValue;
		}

		public String getChildValue() {
			return this.childValue;
		}

		public void setChildValue(String childValue) {
			this.childValue = childValue;
		}

		public String getStatisticTime() {
			return this.statisticTime;
		}

		public void setStatisticTime(String statisticTime) {
			this.statisticTime = statisticTime;
		}
	}

	@Override
	public ListCityMapCameraStatisticsResponse getInstance(UnmarshallerContext context) {
		return	ListCityMapCameraStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
