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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.GetCDNStatisSumResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCDNStatisSumResponse extends AcsResponse {

	private String requestId;

	private Long sumFlowDataValue;

	private Long maxBpsDataValue;

	private List<CDNMetric> cDNStatisList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getSumFlowDataValue() {
		return this.sumFlowDataValue;
	}

	public void setSumFlowDataValue(Long sumFlowDataValue) {
		this.sumFlowDataValue = sumFlowDataValue;
	}

	public Long getMaxBpsDataValue() {
		return this.maxBpsDataValue;
	}

	public void setMaxBpsDataValue(Long maxBpsDataValue) {
		this.maxBpsDataValue = maxBpsDataValue;
	}

	public List<CDNMetric> getCDNStatisList() {
		return this.cDNStatisList;
	}

	public void setCDNStatisList(List<CDNMetric> cDNStatisList) {
		this.cDNStatisList = cDNStatisList;
	}

	public static class CDNMetric {

		private String statTime;

		private Long flowDataDomesticValue;

		private Long flowDataOverseasValue;

		private Long flowDataValue;

		private Long bpsDataDomesticValue;

		private Long bpsDataOverseasValue;

		private Long bpsDataValue;

		public String getStatTime() {
			return this.statTime;
		}

		public void setStatTime(String statTime) {
			this.statTime = statTime;
		}

		public Long getFlowDataDomesticValue() {
			return this.flowDataDomesticValue;
		}

		public void setFlowDataDomesticValue(Long flowDataDomesticValue) {
			this.flowDataDomesticValue = flowDataDomesticValue;
		}

		public Long getFlowDataOverseasValue() {
			return this.flowDataOverseasValue;
		}

		public void setFlowDataOverseasValue(Long flowDataOverseasValue) {
			this.flowDataOverseasValue = flowDataOverseasValue;
		}

		public Long getFlowDataValue() {
			return this.flowDataValue;
		}

		public void setFlowDataValue(Long flowDataValue) {
			this.flowDataValue = flowDataValue;
		}

		public Long getBpsDataDomesticValue() {
			return this.bpsDataDomesticValue;
		}

		public void setBpsDataDomesticValue(Long bpsDataDomesticValue) {
			this.bpsDataDomesticValue = bpsDataDomesticValue;
		}

		public Long getBpsDataOverseasValue() {
			return this.bpsDataOverseasValue;
		}

		public void setBpsDataOverseasValue(Long bpsDataOverseasValue) {
			this.bpsDataOverseasValue = bpsDataOverseasValue;
		}

		public Long getBpsDataValue() {
			return this.bpsDataValue;
		}

		public void setBpsDataValue(Long bpsDataValue) {
			this.bpsDataValue = bpsDataValue;
		}
	}

	@Override
	public GetCDNStatisSumResponse getInstance(UnmarshallerContext context) {
		return	GetCDNStatisSumResponseUnmarshaller.unmarshall(this, context);
	}
}
