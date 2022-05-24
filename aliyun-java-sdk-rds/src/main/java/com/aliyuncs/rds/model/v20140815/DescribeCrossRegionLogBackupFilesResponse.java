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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeCrossRegionLogBackupFilesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCrossRegionLogBackupFilesResponse extends AcsResponse {

	private String endTime;

	private String startTime;

	private String requestId;

	private Integer pageRecordCount;

	private Integer totalRecordCount;

	private String dBInstanceId;

	private Integer pageNumber;

	private String regionId;

	private List<Item> items;

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public static class Item {

		private String logBeginTime;

		private String linkExpiredTime;

		private String crossIntranetDownloadLink;

		private String logFileName;

		private String crossBackupRegion;

		private String crossDownloadLink;

		private Long crossLogBackupSize;

		private Integer instanceId;

		private Integer crossLogBackupId;

		private String logEndTime;

		public String getLogBeginTime() {
			return this.logBeginTime;
		}

		public void setLogBeginTime(String logBeginTime) {
			this.logBeginTime = logBeginTime;
		}

		public String getLinkExpiredTime() {
			return this.linkExpiredTime;
		}

		public void setLinkExpiredTime(String linkExpiredTime) {
			this.linkExpiredTime = linkExpiredTime;
		}

		public String getCrossIntranetDownloadLink() {
			return this.crossIntranetDownloadLink;
		}

		public void setCrossIntranetDownloadLink(String crossIntranetDownloadLink) {
			this.crossIntranetDownloadLink = crossIntranetDownloadLink;
		}

		public String getLogFileName() {
			return this.logFileName;
		}

		public void setLogFileName(String logFileName) {
			this.logFileName = logFileName;
		}

		public String getCrossBackupRegion() {
			return this.crossBackupRegion;
		}

		public void setCrossBackupRegion(String crossBackupRegion) {
			this.crossBackupRegion = crossBackupRegion;
		}

		public String getCrossDownloadLink() {
			return this.crossDownloadLink;
		}

		public void setCrossDownloadLink(String crossDownloadLink) {
			this.crossDownloadLink = crossDownloadLink;
		}

		public Long getCrossLogBackupSize() {
			return this.crossLogBackupSize;
		}

		public void setCrossLogBackupSize(Long crossLogBackupSize) {
			this.crossLogBackupSize = crossLogBackupSize;
		}

		public Integer getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(Integer instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getCrossLogBackupId() {
			return this.crossLogBackupId;
		}

		public void setCrossLogBackupId(Integer crossLogBackupId) {
			this.crossLogBackupId = crossLogBackupId;
		}

		public String getLogEndTime() {
			return this.logEndTime;
		}

		public void setLogEndTime(String logEndTime) {
			this.logEndTime = logEndTime;
		}
	}

	@Override
	public DescribeCrossRegionLogBackupFilesResponse getInstance(UnmarshallerContext context) {
		return	DescribeCrossRegionLogBackupFilesResponseUnmarshaller.unmarshall(this, context);
	}
}
