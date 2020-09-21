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
import com.aliyuncs.vpc.transform.v20160428.GetNatGatewayConvertStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetNatGatewayConvertStatusResponse extends AcsResponse {

	private String requestId;

	private String natGatewayId;

	private String bid;

	private Long aliUid;

	private String dstNatType;

	private List<ConvertStep> convertSteps;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNatGatewayId() {
		return this.natGatewayId;
	}

	public void setNatGatewayId(String natGatewayId) {
		this.natGatewayId = natGatewayId;
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
	}

	public String getDstNatType() {
		return this.dstNatType;
	}

	public void setDstNatType(String dstNatType) {
		this.dstNatType = dstNatType;
	}

	public List<ConvertStep> getConvertSteps() {
		return this.convertSteps;
	}

	public void setConvertSteps(List<ConvertStep> convertSteps) {
		this.convertSteps = convertSteps;
	}

	public static class ConvertStep {

		private String stepName;

		private String stepStatus;

		private String stepStartTime;

		public String getStepName() {
			return this.stepName;
		}

		public void setStepName(String stepName) {
			this.stepName = stepName;
		}

		public String getStepStatus() {
			return this.stepStatus;
		}

		public void setStepStatus(String stepStatus) {
			this.stepStatus = stepStatus;
		}

		public String getStepStartTime() {
			return this.stepStartTime;
		}

		public void setStepStartTime(String stepStartTime) {
			this.stepStartTime = stepStartTime;
		}
	}

	@Override
	public GetNatGatewayConvertStatusResponse getInstance(UnmarshallerContext context) {
		return	GetNatGatewayConvertStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
