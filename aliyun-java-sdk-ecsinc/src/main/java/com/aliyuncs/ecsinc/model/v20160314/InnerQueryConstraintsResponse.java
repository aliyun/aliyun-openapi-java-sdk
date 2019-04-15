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

package com.aliyuncs.ecsinc.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsinc.transform.v20160314.InnerQueryConstraintsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerQueryConstraintsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private String entityType;

	private String entityKey;

	private ImageConstraintsModel imageConstraintsModel;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getEntityType() {
		return this.entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getEntityKey() {
		return this.entityKey;
	}

	public void setEntityKey(String entityKey) {
		this.entityKey = entityKey;
	}

	public ImageConstraintsModel getImageConstraintsModel() {
		return this.imageConstraintsModel;
	}

	public void setImageConstraintsModel(ImageConstraintsModel imageConstraintsModel) {
		this.imageConstraintsModel = imageConstraintsModel;
	}

	public static class ImageConstraintsModel {

		private String imageId;

		private Boolean supportIoOptimized;

		private String networkType;

		private Cpu cpu;

		private Mem mem;

		private SysDisk sysDisk;

		private DataDisk dataDisk;

		private InstanceTypeFamily instanceTypeFamily;

		private GpuAmount gpuAmount;

		private EniQuantity eniQuantity;

		private TcpPortRange tcpPortRange;

		private UdpPortRange udpPortRange;

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public Boolean getSupportIoOptimized() {
			return this.supportIoOptimized;
		}

		public void setSupportIoOptimized(Boolean supportIoOptimized) {
			this.supportIoOptimized = supportIoOptimized;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public Cpu getCpu() {
			return this.cpu;
		}

		public void setCpu(Cpu cpu) {
			this.cpu = cpu;
		}

		public Mem getMem() {
			return this.mem;
		}

		public void setMem(Mem mem) {
			this.mem = mem;
		}

		public SysDisk getSysDisk() {
			return this.sysDisk;
		}

		public void setSysDisk(SysDisk sysDisk) {
			this.sysDisk = sysDisk;
		}

		public DataDisk getDataDisk() {
			return this.dataDisk;
		}

		public void setDataDisk(DataDisk dataDisk) {
			this.dataDisk = dataDisk;
		}

		public InstanceTypeFamily getInstanceTypeFamily() {
			return this.instanceTypeFamily;
		}

		public void setInstanceTypeFamily(InstanceTypeFamily instanceTypeFamily) {
			this.instanceTypeFamily = instanceTypeFamily;
		}

		public GpuAmount getGpuAmount() {
			return this.gpuAmount;
		}

		public void setGpuAmount(GpuAmount gpuAmount) {
			this.gpuAmount = gpuAmount;
		}

		public EniQuantity getEniQuantity() {
			return this.eniQuantity;
		}

		public void setEniQuantity(EniQuantity eniQuantity) {
			this.eniQuantity = eniQuantity;
		}

		public TcpPortRange getTcpPortRange() {
			return this.tcpPortRange;
		}

		public void setTcpPortRange(TcpPortRange tcpPortRange) {
			this.tcpPortRange = tcpPortRange;
		}

		public UdpPortRange getUdpPortRange() {
			return this.udpPortRange;
		}

		public void setUdpPortRange(UdpPortRange udpPortRange) {
			this.udpPortRange = udpPortRange;
		}

		public static class Cpu {

			private Long minValue;

			private Long maxValue;

			public Long getMinValue() {
				return this.minValue;
			}

			public void setMinValue(Long minValue) {
				this.minValue = minValue;
			}

			public Long getMaxValue() {
				return this.maxValue;
			}

			public void setMaxValue(Long maxValue) {
				this.maxValue = maxValue;
			}
		}

		public static class Mem {

			private Long minValue;

			private Long maxValue;

			public Long getMinValue() {
				return this.minValue;
			}

			public void setMinValue(Long minValue) {
				this.minValue = minValue;
			}

			public Long getMaxValue() {
				return this.maxValue;
			}

			public void setMaxValue(Long maxValue) {
				this.maxValue = maxValue;
			}
		}

		public static class SysDisk {

			private Long minValue;

			private Long maxValue;

			public Long getMinValue() {
				return this.minValue;
			}

			public void setMinValue(Long minValue) {
				this.minValue = minValue;
			}

			public Long getMaxValue() {
				return this.maxValue;
			}

			public void setMaxValue(Long maxValue) {
				this.maxValue = maxValue;
			}
		}

		public static class DataDisk {

			private Long minValue;

			private Long maxValue;

			public Long getMinValue() {
				return this.minValue;
			}

			public void setMinValue(Long minValue) {
				this.minValue = minValue;
			}

			public Long getMaxValue() {
				return this.maxValue;
			}

			public void setMaxValue(Long maxValue) {
				this.maxValue = maxValue;
			}
		}

		public static class InstanceTypeFamily {

			private List<String> includeList;

			private List<String> excludeList;

			public List<String> getIncludeList() {
				return this.includeList;
			}

			public void setIncludeList(List<String> includeList) {
				this.includeList = includeList;
			}

			public List<String> getExcludeList() {
				return this.excludeList;
			}

			public void setExcludeList(List<String> excludeList) {
				this.excludeList = excludeList;
			}
		}

		public static class GpuAmount {

			private Long minValue;

			private Long maxValue;

			public Long getMinValue() {
				return this.minValue;
			}

			public void setMinValue(Long minValue) {
				this.minValue = minValue;
			}

			public Long getMaxValue() {
				return this.maxValue;
			}

			public void setMaxValue(Long maxValue) {
				this.maxValue = maxValue;
			}
		}

		public static class EniQuantity {

			private Long minValue;

			private Long maxValue;

			public Long getMinValue() {
				return this.minValue;
			}

			public void setMinValue(Long minValue) {
				this.minValue = minValue;
			}

			public Long getMaxValue() {
				return this.maxValue;
			}

			public void setMaxValue(Long maxValue) {
				this.maxValue = maxValue;
			}
		}

		public static class TcpPortRange {

			private List<String> includeList1;

			private List<String> excludeList2;

			public List<String> getIncludeList1() {
				return this.includeList1;
			}

			public void setIncludeList1(List<String> includeList1) {
				this.includeList1 = includeList1;
			}

			public List<String> getExcludeList2() {
				return this.excludeList2;
			}

			public void setExcludeList2(List<String> excludeList2) {
				this.excludeList2 = excludeList2;
			}
		}

		public static class UdpPortRange {

			private List<String> includeList3;

			private List<String> excludeList4;

			public List<String> getIncludeList3() {
				return this.includeList3;
			}

			public void setIncludeList3(List<String> includeList3) {
				this.includeList3 = includeList3;
			}

			public List<String> getExcludeList4() {
				return this.excludeList4;
			}

			public void setExcludeList4(List<String> excludeList4) {
				this.excludeList4 = excludeList4;
			}
		}
	}

	@Override
	public InnerQueryConstraintsResponse getInstance(UnmarshallerContext context) {
		return	InnerQueryConstraintsResponseUnmarshaller.unmarshall(this, context);
	}
}
