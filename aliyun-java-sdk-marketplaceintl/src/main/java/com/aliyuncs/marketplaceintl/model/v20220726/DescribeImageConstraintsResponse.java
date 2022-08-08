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

package com.aliyuncs.marketplaceintl.model.v20220726;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.marketplaceintl.transform.v20220726.DescribeImageConstraintsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageConstraintsResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private Integer code;

	private String msg;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String trackId;

		private List<CpuMemoryRangeItem> cpuMemoryRange;

		private Bandwidth bandwidth;

		private SystemDisk systemDisk;

		private DataDisk dataDisk;

		public String getTrackId() {
			return this.trackId;
		}

		public void setTrackId(String trackId) {
			this.trackId = trackId;
		}

		public List<CpuMemoryRangeItem> getCpuMemoryRange() {
			return this.cpuMemoryRange;
		}

		public void setCpuMemoryRange(List<CpuMemoryRangeItem> cpuMemoryRange) {
			this.cpuMemoryRange = cpuMemoryRange;
		}

		public Bandwidth getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Bandwidth bandwidth) {
			this.bandwidth = bandwidth;
		}

		public SystemDisk getSystemDisk() {
			return this.systemDisk;
		}

		public void setSystemDisk(SystemDisk systemDisk) {
			this.systemDisk = systemDisk;
		}

		public DataDisk getDataDisk() {
			return this.dataDisk;
		}

		public void setDataDisk(DataDisk dataDisk) {
			this.dataDisk = dataDisk;
		}

		public static class CpuMemoryRangeItem {

			private Integer cpuCoreCount;

			private List<Float> memorySizeList;

			public Integer getCpuCoreCount() {
				return this.cpuCoreCount;
			}

			public void setCpuCoreCount(Integer cpuCoreCount) {
				this.cpuCoreCount = cpuCoreCount;
			}

			public List<Float> getMemorySizeList() {
				return this.memorySizeList;
			}

			public void setMemorySizeList(List<Float> memorySizeList) {
				this.memorySizeList = memorySizeList;
			}
		}

		public static class Bandwidth {

			private Integer min;

			private Integer max;

			private Integer step;

			private String unit;

			public Integer getMin() {
				return this.min;
			}

			public void setMin(Integer min) {
				this.min = min;
			}

			public Integer getMax() {
				return this.max;
			}

			public void setMax(Integer max) {
				this.max = max;
			}

			public Integer getStep() {
				return this.step;
			}

			public void setStep(Integer step) {
				this.step = step;
			}

			public String getUnit() {
				return this.unit;
			}

			public void setUnit(String unit) {
				this.unit = unit;
			}
		}

		public static class SystemDisk {

			private Integer min;

			private Integer max;

			private Integer step;

			private String unit;

			public Integer getMin() {
				return this.min;
			}

			public void setMin(Integer min) {
				this.min = min;
			}

			public Integer getMax() {
				return this.max;
			}

			public void setMax(Integer max) {
				this.max = max;
			}

			public Integer getStep() {
				return this.step;
			}

			public void setStep(Integer step) {
				this.step = step;
			}

			public String getUnit() {
				return this.unit;
			}

			public void setUnit(String unit) {
				this.unit = unit;
			}
		}

		public static class DataDisk {

			private Integer min;

			private Integer max;

			private Integer step;

			private String unit;

			public Integer getMin() {
				return this.min;
			}

			public void setMin(Integer min) {
				this.min = min;
			}

			public Integer getMax() {
				return this.max;
			}

			public void setMax(Integer max) {
				this.max = max;
			}

			public Integer getStep() {
				return this.step;
			}

			public void setStep(Integer step) {
				this.step = step;
			}

			public String getUnit() {
				return this.unit;
			}

			public void setUnit(String unit) {
				this.unit = unit;
			}
		}
	}

	@Override
	public DescribeImageConstraintsResponse getInstance(UnmarshallerContext context) {
		return	DescribeImageConstraintsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
