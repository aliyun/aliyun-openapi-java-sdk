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

package com.aliyuncs.antiddos_public.model.v20170518;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.antiddos_public.transform.v20170518.DescribeIpDdosThresholdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeIpDdosThresholdResponse extends AcsResponse {

	private String requestId;

	private Threshold threshold;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Threshold getThreshold() {
		return this.threshold;
	}

	public void setThreshold(Threshold threshold) {
		this.threshold = threshold;
	}

	public static class Threshold {

		private String ddosType;

		private Boolean isAuto;

		private Integer maxBps;

		private Integer elasticBps;

		private String instanceId;

		private Integer bps;

		private Integer pps;

		private Integer maxPps;

		private String internetIp;

		public String getDdosType() {
			return this.ddosType;
		}

		public void setDdosType(String ddosType) {
			this.ddosType = ddosType;
		}

		public Boolean getIsAuto() {
			return this.isAuto;
		}

		public void setIsAuto(Boolean isAuto) {
			this.isAuto = isAuto;
		}

		public Integer getMaxBps() {
			return this.maxBps;
		}

		public void setMaxBps(Integer maxBps) {
			this.maxBps = maxBps;
		}

		public Integer getElasticBps() {
			return this.elasticBps;
		}

		public void setElasticBps(Integer elasticBps) {
			this.elasticBps = elasticBps;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getBps() {
			return this.bps;
		}

		public void setBps(Integer bps) {
			this.bps = bps;
		}

		public Integer getPps() {
			return this.pps;
		}

		public void setPps(Integer pps) {
			this.pps = pps;
		}

		public Integer getMaxPps() {
			return this.maxPps;
		}

		public void setMaxPps(Integer maxPps) {
			this.maxPps = maxPps;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}
	}

	@Override
	public DescribeIpDdosThresholdResponse getInstance(UnmarshallerContext context) {
		return	DescribeIpDdosThresholdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
