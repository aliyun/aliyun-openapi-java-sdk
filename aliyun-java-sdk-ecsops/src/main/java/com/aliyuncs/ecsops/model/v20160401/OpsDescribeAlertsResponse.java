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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeAlertsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeAlertsResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<Alert> alerts;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Alert> getAlerts() {
		return this.alerts;
	}

	public void setAlerts(List<Alert> alerts) {
		this.alerts = alerts;
	}

	public static class Alert {

		private String owner;

		private String createTime;

		private String alertTitle;

		private String alertSource;

		private String extra;

		private String alertLevel;

		private String alertStatus;

		private String alertItem;

		private String alertTime;

		private String diagnosisResult;

		private String diagnosisTemplate;

		private String belongTeam;

		private String alertDetail;

		private Long alertId;

		private String modifyTime;

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getAlertTitle() {
			return this.alertTitle;
		}

		public void setAlertTitle(String alertTitle) {
			this.alertTitle = alertTitle;
		}

		public String getAlertSource() {
			return this.alertSource;
		}

		public void setAlertSource(String alertSource) {
			this.alertSource = alertSource;
		}

		public String getExtra() {
			return this.extra;
		}

		public void setExtra(String extra) {
			this.extra = extra;
		}

		public String getAlertLevel() {
			return this.alertLevel;
		}

		public void setAlertLevel(String alertLevel) {
			this.alertLevel = alertLevel;
		}

		public String getAlertStatus() {
			return this.alertStatus;
		}

		public void setAlertStatus(String alertStatus) {
			this.alertStatus = alertStatus;
		}

		public String getAlertItem() {
			return this.alertItem;
		}

		public void setAlertItem(String alertItem) {
			this.alertItem = alertItem;
		}

		public String getAlertTime() {
			return this.alertTime;
		}

		public void setAlertTime(String alertTime) {
			this.alertTime = alertTime;
		}

		public String getDiagnosisResult() {
			return this.diagnosisResult;
		}

		public void setDiagnosisResult(String diagnosisResult) {
			this.diagnosisResult = diagnosisResult;
		}

		public String getDiagnosisTemplate() {
			return this.diagnosisTemplate;
		}

		public void setDiagnosisTemplate(String diagnosisTemplate) {
			this.diagnosisTemplate = diagnosisTemplate;
		}

		public String getBelongTeam() {
			return this.belongTeam;
		}

		public void setBelongTeam(String belongTeam) {
			this.belongTeam = belongTeam;
		}

		public String getAlertDetail() {
			return this.alertDetail;
		}

		public void setAlertDetail(String alertDetail) {
			this.alertDetail = alertDetail;
		}

		public Long getAlertId() {
			return this.alertId;
		}

		public void setAlertId(Long alertId) {
			this.alertId = alertId;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}
	}

	@Override
	public OpsDescribeAlertsResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeAlertsResponseUnmarshaller.unmarshall(this, context);
	}
}
