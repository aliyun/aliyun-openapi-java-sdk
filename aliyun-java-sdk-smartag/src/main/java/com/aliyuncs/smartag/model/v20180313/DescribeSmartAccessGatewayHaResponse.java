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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeSmartAccessGatewayHaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSmartAccessGatewayHaResponse extends AcsResponse {

	private String requestId;

	private String deviceLevelBackupState;

	private String deviceLevelBackupType;

	private String mainDeviceId;

	private String backupDeviceId;

	private String smartAGId;

	private List<LinkBackupInfoListItem> linkBackupInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDeviceLevelBackupState() {
		return this.deviceLevelBackupState;
	}

	public void setDeviceLevelBackupState(String deviceLevelBackupState) {
		this.deviceLevelBackupState = deviceLevelBackupState;
	}

	public String getDeviceLevelBackupType() {
		return this.deviceLevelBackupType;
	}

	public void setDeviceLevelBackupType(String deviceLevelBackupType) {
		this.deviceLevelBackupType = deviceLevelBackupType;
	}

	public String getMainDeviceId() {
		return this.mainDeviceId;
	}

	public void setMainDeviceId(String mainDeviceId) {
		this.mainDeviceId = mainDeviceId;
	}

	public String getBackupDeviceId() {
		return this.backupDeviceId;
	}

	public void setBackupDeviceId(String backupDeviceId) {
		this.backupDeviceId = backupDeviceId;
	}

	public String getSmartAGId() {
		return this.smartAGId;
	}

	public void setSmartAGId(String smartAGId) {
		this.smartAGId = smartAGId;
	}

	public List<LinkBackupInfoListItem> getLinkBackupInfoList() {
		return this.linkBackupInfoList;
	}

	public void setLinkBackupInfoList(List<LinkBackupInfoListItem> linkBackupInfoList) {
		this.linkBackupInfoList = linkBackupInfoList;
	}

	public static class LinkBackupInfoListItem {

		private String linkLevelBackupState;

		private String linkLevelBackupType;

		private String mainLinkId;

		private String mainLinkState;

		private String backupLinkId;

		private String backupLinkState;

		public String getLinkLevelBackupState() {
			return this.linkLevelBackupState;
		}

		public void setLinkLevelBackupState(String linkLevelBackupState) {
			this.linkLevelBackupState = linkLevelBackupState;
		}

		public String getLinkLevelBackupType() {
			return this.linkLevelBackupType;
		}

		public void setLinkLevelBackupType(String linkLevelBackupType) {
			this.linkLevelBackupType = linkLevelBackupType;
		}

		public String getMainLinkId() {
			return this.mainLinkId;
		}

		public void setMainLinkId(String mainLinkId) {
			this.mainLinkId = mainLinkId;
		}

		public String getMainLinkState() {
			return this.mainLinkState;
		}

		public void setMainLinkState(String mainLinkState) {
			this.mainLinkState = mainLinkState;
		}

		public String getBackupLinkId() {
			return this.backupLinkId;
		}

		public void setBackupLinkId(String backupLinkId) {
			this.backupLinkId = backupLinkId;
		}

		public String getBackupLinkState() {
			return this.backupLinkState;
		}

		public void setBackupLinkState(String backupLinkState) {
			this.backupLinkState = backupLinkState;
		}
	}

	@Override
	public DescribeSmartAccessGatewayHaResponse getInstance(UnmarshallerContext context) {
		return	DescribeSmartAccessGatewayHaResponseUnmarshaller.unmarshall(this, context);
	}
}
