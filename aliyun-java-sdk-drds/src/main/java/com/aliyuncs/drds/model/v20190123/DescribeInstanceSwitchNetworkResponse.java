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

package com.aliyuncs.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeInstanceSwitchNetworkResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceSwitchNetworkResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<VpcInfo> vpcInfos;

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

	public List<VpcInfo> getVpcInfos() {
		return this.vpcInfos;
	}

	public void setVpcInfos(List<VpcInfo> vpcInfos) {
		this.vpcInfos = vpcInfos;
	}

	public static class VpcInfo {

		private String vpcId;

		private String regionId;

		private String vpcName;

		private List<VswitchInfo> vswitchInfos;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getBizRegionId() {
			return this.regionId;
		}

		public void setBizRegionId(String regionId) {
			this.regionId = regionId;
		}

		/**
		 * @deprecated use getBizRegionId instead of this.
		 */
		@Deprecated
		public String getRegionId() {
			return this.regionId;
		}

		/**
		 * @deprecated use setBizRegionId instead of this.
		 */
		@Deprecated
		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getVpcName() {
			return this.vpcName;
		}

		public void setVpcName(String vpcName) {
			this.vpcName = vpcName;
		}

		public List<VswitchInfo> getVswitchInfos() {
			return this.vswitchInfos;
		}

		public void setVswitchInfos(List<VswitchInfo> vswitchInfos) {
			this.vswitchInfos = vswitchInfos;
		}

		public static class VswitchInfo {

			private String vswitchId;

			private String vpcId;

			private String vswitchName;

			private String azoneId;

			private Boolean drdsSupported;

			public String getVswitchId() {
				return this.vswitchId;
			}

			public void setVswitchId(String vswitchId) {
				this.vswitchId = vswitchId;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getVswitchName() {
				return this.vswitchName;
			}

			public void setVswitchName(String vswitchName) {
				this.vswitchName = vswitchName;
			}

			public String getAzoneId() {
				return this.azoneId;
			}

			public void setAzoneId(String azoneId) {
				this.azoneId = azoneId;
			}

			public Boolean getDrdsSupported() {
				return this.drdsSupported;
			}

			public void setDrdsSupported(Boolean drdsSupported) {
				this.drdsSupported = drdsSupported;
			}
		}
	}

	@Override
	public DescribeInstanceSwitchNetworkResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceSwitchNetworkResponseUnmarshaller.unmarshall(this, context);
	}
}
