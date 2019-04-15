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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeWhiteListAssetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWhiteListAssetResponse extends AcsResponse {

	private String requestId;

	private List<Asset> assets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Asset> getAssets() {
		return this.assets;
	}

	public void setAssets(List<Asset> assets) {
		this.assets = assets;
	}

	public static class Asset {

		private Long id;

		private String uuid;

		private Long groupId;

		private String machineName;

		private String machineIp;

		private Integer selected;

		private Integer allowSelected;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public Long getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}

		public String getMachineName() {
			return this.machineName;
		}

		public void setMachineName(String machineName) {
			this.machineName = machineName;
		}

		public String getMachineIp() {
			return this.machineIp;
		}

		public void setMachineIp(String machineIp) {
			this.machineIp = machineIp;
		}

		public Integer getSelected() {
			return this.selected;
		}

		public void setSelected(Integer selected) {
			this.selected = selected;
		}

		public Integer getAllowSelected() {
			return this.allowSelected;
		}

		public void setAllowSelected(Integer allowSelected) {
			this.allowSelected = allowSelected;
		}
	}

	@Override
	public DescribeWhiteListAssetResponse getInstance(UnmarshallerContext context) {
		return	DescribeWhiteListAssetResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
