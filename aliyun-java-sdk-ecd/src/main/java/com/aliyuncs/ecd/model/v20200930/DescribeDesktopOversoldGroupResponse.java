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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeDesktopOversoldGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDesktopOversoldGroupResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private String nextToken;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String directoryId;

		private String oversoldGroupId;

		private String name;

		private String desktopType;

		private Integer systemDiskSize;

		private Integer dataDiskSize;

		private String imageId;

		private String policyGroupId;

		private Integer concurrenceCount;

		private Integer oversoldUserCount;

		private Long stopDuration;

		private Integer oversoldWarn;

		private String status;

		private String saleStatus;

		private String expireTime;

		private String description;

		private Integer curConcurrenceCount;

		private String keepDuration;

		private String idleDisconnectDuration;

		public String getDirectoryId() {
			return this.directoryId;
		}

		public void setDirectoryId(String directoryId) {
			this.directoryId = directoryId;
		}

		public String getOversoldGroupId() {
			return this.oversoldGroupId;
		}

		public void setOversoldGroupId(String oversoldGroupId) {
			this.oversoldGroupId = oversoldGroupId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDesktopType() {
			return this.desktopType;
		}

		public void setDesktopType(String desktopType) {
			this.desktopType = desktopType;
		}

		public Integer getSystemDiskSize() {
			return this.systemDiskSize;
		}

		public void setSystemDiskSize(Integer systemDiskSize) {
			this.systemDiskSize = systemDiskSize;
		}

		public Integer getDataDiskSize() {
			return this.dataDiskSize;
		}

		public void setDataDiskSize(Integer dataDiskSize) {
			this.dataDiskSize = dataDiskSize;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getPolicyGroupId() {
			return this.policyGroupId;
		}

		public void setPolicyGroupId(String policyGroupId) {
			this.policyGroupId = policyGroupId;
		}

		public Integer getConcurrenceCount() {
			return this.concurrenceCount;
		}

		public void setConcurrenceCount(Integer concurrenceCount) {
			this.concurrenceCount = concurrenceCount;
		}

		public Integer getOversoldUserCount() {
			return this.oversoldUserCount;
		}

		public void setOversoldUserCount(Integer oversoldUserCount) {
			this.oversoldUserCount = oversoldUserCount;
		}

		public Long getStopDuration() {
			return this.stopDuration;
		}

		public void setStopDuration(Long stopDuration) {
			this.stopDuration = stopDuration;
		}

		public Integer getOversoldWarn() {
			return this.oversoldWarn;
		}

		public void setOversoldWarn(Integer oversoldWarn) {
			this.oversoldWarn = oversoldWarn;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSaleStatus() {
			return this.saleStatus;
		}

		public void setSaleStatus(String saleStatus) {
			this.saleStatus = saleStatus;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getCurConcurrenceCount() {
			return this.curConcurrenceCount;
		}

		public void setCurConcurrenceCount(Integer curConcurrenceCount) {
			this.curConcurrenceCount = curConcurrenceCount;
		}

		public String getKeepDuration() {
			return this.keepDuration;
		}

		public void setKeepDuration(String keepDuration) {
			this.keepDuration = keepDuration;
		}

		public String getIdleDisconnectDuration() {
			return this.idleDisconnectDuration;
		}

		public void setIdleDisconnectDuration(String idleDisconnectDuration) {
			this.idleDisconnectDuration = idleDisconnectDuration;
		}
	}

	@Override
	public DescribeDesktopOversoldGroupResponse getInstance(UnmarshallerContext context) {
		return	DescribeDesktopOversoldGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
