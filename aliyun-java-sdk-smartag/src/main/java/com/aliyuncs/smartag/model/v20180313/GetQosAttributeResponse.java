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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.GetQosAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetQosAttributeResponse extends AcsResponse {

	private String requestId;

	private Integer errorConfigSmartAGCount;

	private String qosName;

	private String qosDescription;

	private List<QosPolicy> qosPolicies;

	private List<QosCar> qosCars;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getErrorConfigSmartAGCount() {
		return this.errorConfigSmartAGCount;
	}

	public void setErrorConfigSmartAGCount(Integer errorConfigSmartAGCount) {
		this.errorConfigSmartAGCount = errorConfigSmartAGCount;
	}

	public String getQosName() {
		return this.qosName;
	}

	public void setQosName(String qosName) {
		this.qosName = qosName;
	}

	public String getQosDescription() {
		return this.qosDescription;
	}

	public void setQosDescription(String qosDescription) {
		this.qosDescription = qosDescription;
	}

	public List<QosPolicy> getQosPolicies() {
		return this.qosPolicies;
	}

	public void setQosPolicies(List<QosPolicy> qosPolicies) {
		this.qosPolicies = qosPolicies;
	}

	public List<QosCar> getQosCars() {
		return this.qosCars;
	}

	public void setQosCars(List<QosCar> qosCars) {
		this.qosCars = qosCars;
	}

	public static class QosPolicy {

		private String destCidr;

		private String sourcePortRange;

		private Long endTime;

		private String sourceCidr;

		private Integer priority;

		private String qosPolicieName;

		private String qosPolicieDescription;

		private Long startTime;

		private String ipProtocol;

		private String destPortRange;

		public String getDestCidr() {
			return this.destCidr;
		}

		public void setDestCidr(String destCidr) {
			this.destCidr = destCidr;
		}

		public String getSourcePortRange() {
			return this.sourcePortRange;
		}

		public void setSourcePortRange(String sourcePortRange) {
			this.sourcePortRange = sourcePortRange;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getSourceCidr() {
			return this.sourceCidr;
		}

		public void setSourceCidr(String sourceCidr) {
			this.sourceCidr = sourceCidr;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getQosPolicieName() {
			return this.qosPolicieName;
		}

		public void setQosPolicieName(String qosPolicieName) {
			this.qosPolicieName = qosPolicieName;
		}

		public String getQosPolicieDescription() {
			return this.qosPolicieDescription;
		}

		public void setQosPolicieDescription(String qosPolicieDescription) {
			this.qosPolicieDescription = qosPolicieDescription;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public String getIpProtocol() {
			return this.ipProtocol;
		}

		public void setIpProtocol(String ipProtocol) {
			this.ipProtocol = ipProtocol;
		}

		public String getDestPortRange() {
			return this.destPortRange;
		}

		public void setDestPortRange(String destPortRange) {
			this.destPortRange = destPortRange;
		}
	}

	public static class QosCar {

		private Integer minBandwidthAbs;

		private String qosCarId;

		private Integer priority;

		private String qosCarDescription;

		private Integer maxBandwidthPercent;

		private Integer maxBandwidthAbs;

		private String qosCarName;

		private String percentSourceType;

		private Integer minBandwidthPercent;

		private String limitType;

		public Integer getMinBandwidthAbs() {
			return this.minBandwidthAbs;
		}

		public void setMinBandwidthAbs(Integer minBandwidthAbs) {
			this.minBandwidthAbs = minBandwidthAbs;
		}

		public String getQosCarId() {
			return this.qosCarId;
		}

		public void setQosCarId(String qosCarId) {
			this.qosCarId = qosCarId;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getQosCarDescription() {
			return this.qosCarDescription;
		}

		public void setQosCarDescription(String qosCarDescription) {
			this.qosCarDescription = qosCarDescription;
		}

		public Integer getMaxBandwidthPercent() {
			return this.maxBandwidthPercent;
		}

		public void setMaxBandwidthPercent(Integer maxBandwidthPercent) {
			this.maxBandwidthPercent = maxBandwidthPercent;
		}

		public Integer getMaxBandwidthAbs() {
			return this.maxBandwidthAbs;
		}

		public void setMaxBandwidthAbs(Integer maxBandwidthAbs) {
			this.maxBandwidthAbs = maxBandwidthAbs;
		}

		public String getQosCarName() {
			return this.qosCarName;
		}

		public void setQosCarName(String qosCarName) {
			this.qosCarName = qosCarName;
		}

		public String getPercentSourceType() {
			return this.percentSourceType;
		}

		public void setPercentSourceType(String percentSourceType) {
			this.percentSourceType = percentSourceType;
		}

		public Integer getMinBandwidthPercent() {
			return this.minBandwidthPercent;
		}

		public void setMinBandwidthPercent(Integer minBandwidthPercent) {
			this.minBandwidthPercent = minBandwidthPercent;
		}

		public String getLimitType() {
			return this.limitType;
		}

		public void setLimitType(String limitType) {
			this.limitType = limitType;
		}
	}

	@Override
	public GetQosAttributeResponse getInstance(UnmarshallerContext context) {
		return	GetQosAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
