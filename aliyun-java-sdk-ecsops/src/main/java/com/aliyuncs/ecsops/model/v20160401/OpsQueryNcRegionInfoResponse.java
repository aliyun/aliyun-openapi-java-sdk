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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryNcRegionInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryNcRegionInfoResponse extends AcsResponse {

	private String requestId;

	private List<HighRiskMetricData> ncRegionInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<HighRiskMetricData> getNcRegionInfoList() {
		return this.ncRegionInfoList;
	}

	public void setNcRegionInfoList(List<HighRiskMetricData> ncRegionInfoList) {
		this.ncRegionInfoList = ncRegionInfoList;
	}

	public static class HighRiskMetricData {

		private String ncIp;

		private String ncId;

		private String sn;

		private String region;

		private Boolean isDragonBox;

		public String getNcIp() {
			return this.ncIp;
		}

		public void setNcIp(String ncIp) {
			this.ncIp = ncIp;
		}

		public String getNcId() {
			return this.ncId;
		}

		public void setNcId(String ncId) {
			this.ncId = ncId;
		}

		public String getSn() {
			return this.sn;
		}

		public void setSn(String sn) {
			this.sn = sn;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public Boolean getIsDragonBox() {
			return this.isDragonBox;
		}

		public void setIsDragonBox(Boolean isDragonBox) {
			this.isDragonBox = isDragonBox;
		}
	}

	@Override
	public OpsQueryNcRegionInfoResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryNcRegionInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
