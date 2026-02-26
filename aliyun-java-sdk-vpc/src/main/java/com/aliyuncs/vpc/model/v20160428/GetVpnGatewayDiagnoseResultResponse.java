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
import com.aliyuncs.vpc.transform.v20160428.GetVpnGatewayDiagnoseResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetVpnGatewayDiagnoseResultResponse extends AcsResponse {

	private String beginTime;

	private String diagnoseId;

	private String finishTime;

	private Integer finishedCount;

	private String requestId;

	private String resourceInstanceId;

	private String resourceType;

	private Integer totalCount;

	private String vpnGatewayId;

	private List<DiagnoseResultItem> diagnoseResult;

	public String getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getDiagnoseId() {
		return this.diagnoseId;
	}

	public void setDiagnoseId(String diagnoseId) {
		this.diagnoseId = diagnoseId;
	}

	public String getFinishTime() {
		return this.finishTime;
	}

	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}

	public Integer getFinishedCount() {
		return this.finishedCount;
	}

	public void setFinishedCount(Integer finishedCount) {
		this.finishedCount = finishedCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResourceInstanceId() {
		return this.resourceInstanceId;
	}

	public void setResourceInstanceId(String resourceInstanceId) {
		this.resourceInstanceId = resourceInstanceId;
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getVpnGatewayId() {
		return this.vpnGatewayId;
	}

	public void setVpnGatewayId(String vpnGatewayId) {
		this.vpnGatewayId = vpnGatewayId;
	}

	public List<DiagnoseResultItem> getDiagnoseResult() {
		return this.diagnoseResult;
	}

	public void setDiagnoseResult(List<DiagnoseResultItem> diagnoseResult) {
		this.diagnoseResult = diagnoseResult;
	}

	public static class DiagnoseResultItem {

		private String diagnoseName;

		private String diagnoseResultDescription;

		private String diagnoseResultLevel;

		public String getDiagnoseName() {
			return this.diagnoseName;
		}

		public void setDiagnoseName(String diagnoseName) {
			this.diagnoseName = diagnoseName;
		}

		public String getDiagnoseResultDescription() {
			return this.diagnoseResultDescription;
		}

		public void setDiagnoseResultDescription(String diagnoseResultDescription) {
			this.diagnoseResultDescription = diagnoseResultDescription;
		}

		public String getDiagnoseResultLevel() {
			return this.diagnoseResultLevel;
		}

		public void setDiagnoseResultLevel(String diagnoseResultLevel) {
			this.diagnoseResultLevel = diagnoseResultLevel;
		}
	}

	@Override
	public GetVpnGatewayDiagnoseResultResponse getInstance(UnmarshallerContext context) {
		return	GetVpnGatewayDiagnoseResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
