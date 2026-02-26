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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.Describe95TrafficResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class Describe95TrafficResponse extends AcsResponse {

	private String requestId;

	private Traffic95Summary traffic95Summary;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Traffic95Summary getTraffic95Summary() {
		return this.traffic95Summary;
	}

	public void setTraffic95Summary(Traffic95Summary traffic95Summary) {
		this.traffic95Summary = traffic95Summary;
	}

	public static class Traffic95Summary {

		private String internetChargeType;

		private String instanceId;

		private Long bandwidth;

		private String fifthPeakBandwidth;

		private String minimumConsumeBandwidth;

		private List<Traffic95Detail> traffic95DetailList;

		public String getInternetChargeType() {
			return this.internetChargeType;
		}

		public void setInternetChargeType(String internetChargeType) {
			this.internetChargeType = internetChargeType;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Long bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getFifthPeakBandwidth() {
			return this.fifthPeakBandwidth;
		}

		public void setFifthPeakBandwidth(String fifthPeakBandwidth) {
			this.fifthPeakBandwidth = fifthPeakBandwidth;
		}

		public String getMinimumConsumeBandwidth() {
			return this.minimumConsumeBandwidth;
		}

		public void setMinimumConsumeBandwidth(String minimumConsumeBandwidth) {
			this.minimumConsumeBandwidth = minimumConsumeBandwidth;
		}

		public List<Traffic95Detail> getTraffic95DetailList() {
			return this.traffic95DetailList;
		}

		public void setTraffic95DetailList(List<Traffic95Detail> traffic95DetailList) {
			this.traffic95DetailList = traffic95DetailList;
		}

		public static class Traffic95Detail {

			private String time;

			private String billBandwidth;

			private String outBandwidth;

			private String inBandwidth;

			public String getTime() {
				return this.time;
			}

			public void setTime(String time) {
				this.time = time;
			}

			public String getBillBandwidth() {
				return this.billBandwidth;
			}

			public void setBillBandwidth(String billBandwidth) {
				this.billBandwidth = billBandwidth;
			}

			public String getOutBandwidth() {
				return this.outBandwidth;
			}

			public void setOutBandwidth(String outBandwidth) {
				this.outBandwidth = outBandwidth;
			}

			public String getInBandwidth() {
				return this.inBandwidth;
			}

			public void setInBandwidth(String inBandwidth) {
				this.inBandwidth = inBandwidth;
			}
		}
	}

	@Override
	public Describe95TrafficResponse getInstance(UnmarshallerContext context) {
		return	Describe95TrafficResponseUnmarshaller.unmarshall(this, context);
	}
}
