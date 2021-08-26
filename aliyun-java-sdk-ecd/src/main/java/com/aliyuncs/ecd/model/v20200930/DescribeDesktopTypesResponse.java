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
import com.aliyuncs.ecd.transform.v20200930.DescribeDesktopTypesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDesktopTypesResponse extends AcsResponse {

	private String requestId;

	private List<DesktopType> desktopTypes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DesktopType> getDesktopTypes() {
		return this.desktopTypes;
	}

	public void setDesktopTypes(List<DesktopType> desktopTypes) {
		this.desktopTypes = desktopTypes;
	}

	public static class DesktopType {

		private String systemDiskSize;

		private String desktopTypeId;

		private String dataDiskSize;

		private String cpuCount;

		private Float gpuCount;

		private String gpuSpec;

		private String instanceTypeFamily;

		private String memorySize;

		private List<AllowDiskSizeItem> allowDiskSize;

		public String getSystemDiskSize() {
			return this.systemDiskSize;
		}

		public void setSystemDiskSize(String systemDiskSize) {
			this.systemDiskSize = systemDiskSize;
		}

		public String getDesktopTypeId() {
			return this.desktopTypeId;
		}

		public void setDesktopTypeId(String desktopTypeId) {
			this.desktopTypeId = desktopTypeId;
		}

		public String getDataDiskSize() {
			return this.dataDiskSize;
		}

		public void setDataDiskSize(String dataDiskSize) {
			this.dataDiskSize = dataDiskSize;
		}

		public String getCpuCount() {
			return this.cpuCount;
		}

		public void setCpuCount(String cpuCount) {
			this.cpuCount = cpuCount;
		}

		public Float getGpuCount() {
			return this.gpuCount;
		}

		public void setGpuCount(Float gpuCount) {
			this.gpuCount = gpuCount;
		}

		public String getGpuSpec() {
			return this.gpuSpec;
		}

		public void setGpuSpec(String gpuSpec) {
			this.gpuSpec = gpuSpec;
		}

		public String getInstanceTypeFamily() {
			return this.instanceTypeFamily;
		}

		public void setInstanceTypeFamily(String instanceTypeFamily) {
			this.instanceTypeFamily = instanceTypeFamily;
		}

		public String getMemorySize() {
			return this.memorySize;
		}

		public void setMemorySize(String memorySize) {
			this.memorySize = memorySize;
		}

		public List<AllowDiskSizeItem> getAllowDiskSize() {
			return this.allowDiskSize;
		}

		public void setAllowDiskSize(List<AllowDiskSizeItem> allowDiskSize) {
			this.allowDiskSize = allowDiskSize;
		}

		public static class AllowDiskSizeItem {

			private Integer dataDiskSize;

			private Integer systemDiskSize;

			public Integer getDataDiskSize() {
				return this.dataDiskSize;
			}

			public void setDataDiskSize(Integer dataDiskSize) {
				this.dataDiskSize = dataDiskSize;
			}

			public Integer getSystemDiskSize() {
				return this.systemDiskSize;
			}

			public void setSystemDiskSize(Integer systemDiskSize) {
				this.systemDiskSize = systemDiskSize;
			}
		}
	}

	@Override
	public DescribeDesktopTypesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDesktopTypesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
