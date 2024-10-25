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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeDiskIopsListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDiskIopsListResponse extends AcsResponse {

	private String requestId;

	private List<DiskIops> diskIopsList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DiskIops> getDiskIopsList() {
		return this.diskIopsList;
	}

	public void setDiskIopsList(List<DiskIops> diskIopsList) {
		this.diskIopsList = diskIopsList;
	}

	public static class DiskIops {

		private String diskId;

		private String regionId;

		private Long readBytes;

		private Long readLatency;

		private Long readOps;

		private Long writeBytes;

		private Long writeLatency;

		private Long writeOps;

		private String bizTime;

		public String getDiskId() {
			return this.diskId;
		}

		public void setDiskId(String diskId) {
			this.diskId = diskId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Long getReadBytes() {
			return this.readBytes;
		}

		public void setReadBytes(Long readBytes) {
			this.readBytes = readBytes;
		}

		public Long getReadLatency() {
			return this.readLatency;
		}

		public void setReadLatency(Long readLatency) {
			this.readLatency = readLatency;
		}

		public Long getReadOps() {
			return this.readOps;
		}

		public void setReadOps(Long readOps) {
			this.readOps = readOps;
		}

		public Long getWriteBytes() {
			return this.writeBytes;
		}

		public void setWriteBytes(Long writeBytes) {
			this.writeBytes = writeBytes;
		}

		public Long getWriteLatency() {
			return this.writeLatency;
		}

		public void setWriteLatency(Long writeLatency) {
			this.writeLatency = writeLatency;
		}

		public Long getWriteOps() {
			return this.writeOps;
		}

		public void setWriteOps(Long writeOps) {
			this.writeOps = writeOps;
		}

		public String getBizTime() {
			return this.bizTime;
		}

		public void setBizTime(String bizTime) {
			this.bizTime = bizTime;
		}
	}

	@Override
	public DescribeDiskIopsListResponse getInstance(UnmarshallerContext context) {
		return	DescribeDiskIopsListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
