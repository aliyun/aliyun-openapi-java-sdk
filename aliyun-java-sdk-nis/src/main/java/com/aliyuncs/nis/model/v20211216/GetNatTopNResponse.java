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

package com.aliyuncs.nis.model.v20211216;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nis.transform.v20211216.GetNatTopNResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetNatTopNResponse extends AcsResponse {

	private String requestId;

	private Boolean isTopNOpen;

	private List<NatGatewayTopNItem> natGatewayTopN;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getIsTopNOpen() {
		return this.isTopNOpen;
	}

	public void setIsTopNOpen(Boolean isTopNOpen) {
		this.isTopNOpen = isTopNOpen;
	}

	public List<NatGatewayTopNItem> getNatGatewayTopN() {
		return this.natGatewayTopN;
	}

	public void setNatGatewayTopN(List<NatGatewayTopNItem> natGatewayTopN) {
		this.natGatewayTopN = natGatewayTopN;
	}

	public static class NatGatewayTopNItem {

		private String ip;

		private Float inBps;

		private Float outBps;

		private Float inPps;

		private Float outPps;

		private Float inFlowPerMinute;

		private Float outFlowPerMinute;

		private Float newSessionPerSecond;

		private Float activeSessionCount;

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public Float getInBps() {
			return this.inBps;
		}

		public void setInBps(Float inBps) {
			this.inBps = inBps;
		}

		public Float getOutBps() {
			return this.outBps;
		}

		public void setOutBps(Float outBps) {
			this.outBps = outBps;
		}

		public Float getInPps() {
			return this.inPps;
		}

		public void setInPps(Float inPps) {
			this.inPps = inPps;
		}

		public Float getOutPps() {
			return this.outPps;
		}

		public void setOutPps(Float outPps) {
			this.outPps = outPps;
		}

		public Float getInFlowPerMinute() {
			return this.inFlowPerMinute;
		}

		public void setInFlowPerMinute(Float inFlowPerMinute) {
			this.inFlowPerMinute = inFlowPerMinute;
		}

		public Float getOutFlowPerMinute() {
			return this.outFlowPerMinute;
		}

		public void setOutFlowPerMinute(Float outFlowPerMinute) {
			this.outFlowPerMinute = outFlowPerMinute;
		}

		public Float getNewSessionPerSecond() {
			return this.newSessionPerSecond;
		}

		public void setNewSessionPerSecond(Float newSessionPerSecond) {
			this.newSessionPerSecond = newSessionPerSecond;
		}

		public Float getActiveSessionCount() {
			return this.activeSessionCount;
		}

		public void setActiveSessionCount(Float activeSessionCount) {
			this.activeSessionCount = activeSessionCount;
		}
	}

	@Override
	public GetNatTopNResponse getInstance(UnmarshallerContext context) {
		return	GetNatTopNResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
