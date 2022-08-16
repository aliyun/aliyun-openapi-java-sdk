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

package com.aliyuncs.dbfs.model.v20200418;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dbfs.transform.v20200418.ListDbfsAttachedEcsInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDbfsAttachedEcsInstancesResponse extends AcsResponse {

	private String requestId;

	private List<LabelInfo> ecsLabelInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<LabelInfo> getEcsLabelInfo() {
		return this.ecsLabelInfo;
	}

	public void setEcsLabelInfo(List<LabelInfo> ecsLabelInfo) {
		this.ecsLabelInfo = ecsLabelInfo;
	}

	public static class LabelInfo {

		private String mountPoint;

		private String value;

		private String label;

		private String mountedTime;

		private String instanceTypeFamily;

		private String oSName;

		public String getMountPoint() {
			return this.mountPoint;
		}

		public void setMountPoint(String mountPoint) {
			this.mountPoint = mountPoint;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getLabel() {
			return this.label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public String getMountedTime() {
			return this.mountedTime;
		}

		public void setMountedTime(String mountedTime) {
			this.mountedTime = mountedTime;
		}

		public String getInstanceTypeFamily() {
			return this.instanceTypeFamily;
		}

		public void setInstanceTypeFamily(String instanceTypeFamily) {
			this.instanceTypeFamily = instanceTypeFamily;
		}

		public String getOSName() {
			return this.oSName;
		}

		public void setOSName(String oSName) {
			this.oSName = oSName;
		}
	}

	@Override
	public ListDbfsAttachedEcsInstancesResponse getInstance(UnmarshallerContext context) {
		return	ListDbfsAttachedEcsInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
