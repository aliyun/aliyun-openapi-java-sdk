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

package com.aliyuncs.nas.model.v20170626;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.DescribeFilesystemsAssociatedHpnZonesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFilesystemsAssociatedHpnZonesResponse extends AcsResponse {

	private String requestId;

	private List<Filesystem> filesystems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Filesystem> getFilesystems() {
		return this.filesystems;
	}

	public void setFilesystems(List<Filesystem> filesystems) {
		this.filesystems = filesystems;
	}

	public static class Filesystem {

		private String zoneId;

		private String fileSystemId;

		private List<String> associatedHpnZones;

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getFileSystemId() {
			return this.fileSystemId;
		}

		public void setFileSystemId(String fileSystemId) {
			this.fileSystemId = fileSystemId;
		}

		public List<String> getAssociatedHpnZones() {
			return this.associatedHpnZones;
		}

		public void setAssociatedHpnZones(List<String> associatedHpnZones) {
			this.associatedHpnZones = associatedHpnZones;
		}
	}

	@Override
	public DescribeFilesystemsAssociatedHpnZonesResponse getInstance(UnmarshallerContext context) {
		return	DescribeFilesystemsAssociatedHpnZonesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
