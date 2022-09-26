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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeDataShareInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataShareInstancesResponse extends AcsResponse {

	private Integer totalRecordCount;

	private Integer pageRecordCount;

	private String requestId;

	private Integer pageNumber;

	private List<DBInstance> items;

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<DBInstance> getItems() {
		return this.items;
	}

	public void setItems(List<DBInstance> items) {
		this.items = items;
	}

	public static class DBInstance {

		private String regionId;

		private String zoneId;

		private String dBInstanceId;

		private String dBInstanceMode;

		private String description;

		private String dataShareStatus;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getDBInstanceMode() {
			return this.dBInstanceMode;
		}

		public void setDBInstanceMode(String dBInstanceMode) {
			this.dBInstanceMode = dBInstanceMode;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDataShareStatus() {
			return this.dataShareStatus;
		}

		public void setDataShareStatus(String dataShareStatus) {
			this.dataShareStatus = dataShareStatus;
		}
	}

	@Override
	public DescribeDataShareInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataShareInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
