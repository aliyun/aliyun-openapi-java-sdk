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

package com.aliyuncs.wss.model.v20211221;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.wss.transform.v20211221.DescribePackageDeductionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePackageDeductionsResponse extends AcsResponse {

	private Integer pageNum;

	private String requestId;

	private Integer pageSize;

	private Long totalCount;

	private Long totalUsedTime;

	private Float totalUsedCoreTime;

	private List<Deduction> deductions;

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getTotalUsedTime() {
		return this.totalUsedTime;
	}

	public void setTotalUsedTime(Long totalUsedTime) {
		this.totalUsedTime = totalUsedTime;
	}

	public Float getTotalUsedCoreTime() {
		return this.totalUsedCoreTime;
	}

	public void setTotalUsedCoreTime(Float totalUsedCoreTime) {
		this.totalUsedCoreTime = totalUsedCoreTime;
	}

	public List<Deduction> getDeductions() {
		return this.deductions;
	}

	public void setDeductions(List<Deduction> deductions) {
		this.deductions = deductions;
	}

	public static class Deduction {

		private String desktopName;

		private String desktopId;

		private String regionId;

		private String desktopType;

		private String osType;

		private String staTime;

		private String endTime;

		private String resourceType;

		private Long usedTime;

		private Float usedCoreTime;

		private String instanceState;

		private Long memory;

		private Integer cpu;

		private String gpu;

		public String getDesktopName() {
			return this.desktopName;
		}

		public void setDesktopName(String desktopName) {
			this.desktopName = desktopName;
		}

		public String getDesktopId() {
			return this.desktopId;
		}

		public void setDesktopId(String desktopId) {
			this.desktopId = desktopId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getDesktopType() {
			return this.desktopType;
		}

		public void setDesktopType(String desktopType) {
			this.desktopType = desktopType;
		}

		public String getOsType() {
			return this.osType;
		}

		public void setOsType(String osType) {
			this.osType = osType;
		}

		public String getStaTime() {
			return this.staTime;
		}

		public void setStaTime(String staTime) {
			this.staTime = staTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public Long getUsedTime() {
			return this.usedTime;
		}

		public void setUsedTime(Long usedTime) {
			this.usedTime = usedTime;
		}

		public Float getUsedCoreTime() {
			return this.usedCoreTime;
		}

		public void setUsedCoreTime(Float usedCoreTime) {
			this.usedCoreTime = usedCoreTime;
		}

		public String getInstanceState() {
			return this.instanceState;
		}

		public void setInstanceState(String instanceState) {
			this.instanceState = instanceState;
		}

		public Long getMemory() {
			return this.memory;
		}

		public void setMemory(Long memory) {
			this.memory = memory;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public String getGpu() {
			return this.gpu;
		}

		public void setGpu(String gpu) {
			this.gpu = gpu;
		}
	}

	@Override
	public DescribePackageDeductionsResponse getInstance(UnmarshallerContext context) {
		return	DescribePackageDeductionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
