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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.GetClusterInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetClusterInfoResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean isFlink;

		private String getClusterInfo;

		private String checkType;

		private Boolean needRetry;

		private Boolean armsDBNotExist;

		private Boolean nodeSizeIsZero;

		private Boolean agentHelmNotExist;

		private Boolean agentServiceNotExist;

		private Boolean needIntervention;

		private Boolean haveAgentNodeIsNotReady;

		private Boolean ackNotRunning;

		private Boolean podIsNotRestart;

		public Boolean getIsFlink() {
			return this.isFlink;
		}

		public void setIsFlink(Boolean isFlink) {
			this.isFlink = isFlink;
		}

		public String getGetClusterInfo() {
			return this.getClusterInfo;
		}

		public void setGetClusterInfo(String getClusterInfo) {
			this.getClusterInfo = getClusterInfo;
		}

		public String getCheckType() {
			return this.checkType;
		}

		public void setCheckType(String checkType) {
			this.checkType = checkType;
		}

		public Boolean getNeedRetry() {
			return this.needRetry;
		}

		public void setNeedRetry(Boolean needRetry) {
			this.needRetry = needRetry;
		}

		public Boolean getArmsDBNotExist() {
			return this.armsDBNotExist;
		}

		public void setArmsDBNotExist(Boolean armsDBNotExist) {
			this.armsDBNotExist = armsDBNotExist;
		}

		public Boolean getNodeSizeIsZero() {
			return this.nodeSizeIsZero;
		}

		public void setNodeSizeIsZero(Boolean nodeSizeIsZero) {
			this.nodeSizeIsZero = nodeSizeIsZero;
		}

		public Boolean getAgentHelmNotExist() {
			return this.agentHelmNotExist;
		}

		public void setAgentHelmNotExist(Boolean agentHelmNotExist) {
			this.agentHelmNotExist = agentHelmNotExist;
		}

		public Boolean getAgentServiceNotExist() {
			return this.agentServiceNotExist;
		}

		public void setAgentServiceNotExist(Boolean agentServiceNotExist) {
			this.agentServiceNotExist = agentServiceNotExist;
		}

		public Boolean getNeedIntervention() {
			return this.needIntervention;
		}

		public void setNeedIntervention(Boolean needIntervention) {
			this.needIntervention = needIntervention;
		}

		public Boolean getHaveAgentNodeIsNotReady() {
			return this.haveAgentNodeIsNotReady;
		}

		public void setHaveAgentNodeIsNotReady(Boolean haveAgentNodeIsNotReady) {
			this.haveAgentNodeIsNotReady = haveAgentNodeIsNotReady;
		}

		public Boolean getAckNotRunning() {
			return this.ackNotRunning;
		}

		public void setAckNotRunning(Boolean ackNotRunning) {
			this.ackNotRunning = ackNotRunning;
		}

		public Boolean getPodIsNotRestart() {
			return this.podIsNotRestart;
		}

		public void setPodIsNotRestart(Boolean podIsNotRestart) {
			this.podIsNotRestart = podIsNotRestart;
		}
	}

	@Override
	public GetClusterInfoResponse getInstance(UnmarshallerContext context) {
		return	GetClusterInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
