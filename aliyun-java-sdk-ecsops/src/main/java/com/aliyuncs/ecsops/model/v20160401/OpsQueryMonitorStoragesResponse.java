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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryMonitorStoragesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryMonitorStoragesResponse extends AcsResponse {

	private String requestId;

	private List<MonitorStorage> monitorStorageList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MonitorStorage> getMonitorStorageList() {
		return this.monitorStorageList;
	}

	public void setMonitorStorageList(List<MonitorStorage> monitorStorageList) {
		this.monitorStorageList = monitorStorageList;
	}

	public static class MonitorStorage {

		private String shipperTable;

		private String packageName;

		private String shipperName;

		private String regionNo;

		private String projectName;

		private String fileName;

		private String logtailName;

		private String isCenter;

		private String endpoint;

		private String packageId;

		private String logstoreName;

		private String accountName;

		public String getShipperTable() {
			return this.shipperTable;
		}

		public void setShipperTable(String shipperTable) {
			this.shipperTable = shipperTable;
		}

		public String getPackageName() {
			return this.packageName;
		}

		public void setPackageName(String packageName) {
			this.packageName = packageName;
		}

		public String getShipperName() {
			return this.shipperName;
		}

		public void setShipperName(String shipperName) {
			this.shipperName = shipperName;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getLogtailName() {
			return this.logtailName;
		}

		public void setLogtailName(String logtailName) {
			this.logtailName = logtailName;
		}

		public String getIsCenter() {
			return this.isCenter;
		}

		public void setIsCenter(String isCenter) {
			this.isCenter = isCenter;
		}

		public String getEndpoint() {
			return this.endpoint;
		}

		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
		}

		public String getPackageId() {
			return this.packageId;
		}

		public void setPackageId(String packageId) {
			this.packageId = packageId;
		}

		public String getLogstoreName() {
			return this.logstoreName;
		}

		public void setLogstoreName(String logstoreName) {
			this.logstoreName = logstoreName;
		}

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}
	}

	@Override
	public OpsQueryMonitorStoragesResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryMonitorStoragesResponseUnmarshaller.unmarshall(this, context);
	}
}
