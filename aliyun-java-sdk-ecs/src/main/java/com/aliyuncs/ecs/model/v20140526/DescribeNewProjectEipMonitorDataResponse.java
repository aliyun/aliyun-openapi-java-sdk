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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeNewProjectEipMonitorDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNewProjectEipMonitorDataResponse extends AcsResponse {

	private String requestId;

	private List<EipMonitorData> eipMonitorDatas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EipMonitorData> getEipMonitorDatas() {
		return this.eipMonitorDatas;
	}

	public void setEipMonitorDatas(List<EipMonitorData> eipMonitorDatas) {
		this.eipMonitorDatas = eipMonitorDatas;
	}

	public static class EipMonitorData {

		private Integer eipRX;

		private Integer eipTX;

		private Integer eipFlow;

		private Integer eipBandwidth;

		private Integer eipPackets;

		private String timeStamp;

		public Integer getEipRX() {
			return this.eipRX;
		}

		public void setEipRX(Integer eipRX) {
			this.eipRX = eipRX;
		}

		public Integer getEipTX() {
			return this.eipTX;
		}

		public void setEipTX(Integer eipTX) {
			this.eipTX = eipTX;
		}

		public Integer getEipFlow() {
			return this.eipFlow;
		}

		public void setEipFlow(Integer eipFlow) {
			this.eipFlow = eipFlow;
		}

		public Integer getEipBandwidth() {
			return this.eipBandwidth;
		}

		public void setEipBandwidth(Integer eipBandwidth) {
			this.eipBandwidth = eipBandwidth;
		}

		public Integer getEipPackets() {
			return this.eipPackets;
		}

		public void setEipPackets(Integer eipPackets) {
			this.eipPackets = eipPackets;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}
	}

	@Override
	public DescribeNewProjectEipMonitorDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeNewProjectEipMonitorDataResponseUnmarshaller.unmarshall(this, context);
	}
}
