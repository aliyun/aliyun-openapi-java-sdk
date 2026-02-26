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
import com.aliyuncs.dbfs.transform.v20200418.ListDbfsAttachableEcsInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDbfsAttachableEcsInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<LabelInfo> ecsLabelInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<LabelInfo> getEcsLabelInfo() {
		return this.ecsLabelInfo;
	}

	public void setEcsLabelInfo(List<LabelInfo> ecsLabelInfo) {
		this.ecsLabelInfo = ecsLabelInfo;
	}

	public static class LabelInfo {

		private String value;

		private String label;

		private String instanceTypeFamily;

		private String oSName;

		private String status;

		private String zoneId;

		private String imageId;

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

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}
	}

	@Override
	public ListDbfsAttachableEcsInstancesResponse getInstance(UnmarshallerContext context) {
		return	ListDbfsAttachableEcsInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
