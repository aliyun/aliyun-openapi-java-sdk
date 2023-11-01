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

package com.aliyuncs.cloud_siem.model.v20220616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.DescribeAttackTimeLineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAttackTimeLineResponse extends AcsResponse {

	private Boolean success;

	private Integer code;

	private String message;

	private String requestId;

	private List<DataItem> data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String assetName;

		private Long alertTime;

		private String assetId;

		private String incidentUuid;

		private String alertUuid;

		private String logTime;

		private String alertSrcProd;

		private String alertTitle;

		private String alertLevel;

		private String assetList;

		private String alertSrcProdModule;

		private String attCk;

		private String cloudCode;

		private String alertTitleEn;

		private String alertType;

		private String alertTypeEn;

		private String alertTypeCode;

		private String alertName;

		private String alertNameEn;

		private String alertNameCode;

		public String getAssetName() {
			return this.assetName;
		}

		public void setAssetName(String assetName) {
			this.assetName = assetName;
		}

		public Long getAlertTime() {
			return this.alertTime;
		}

		public void setAlertTime(Long alertTime) {
			this.alertTime = alertTime;
		}

		public String getAssetId() {
			return this.assetId;
		}

		public void setAssetId(String assetId) {
			this.assetId = assetId;
		}

		public String getIncidentUuid() {
			return this.incidentUuid;
		}

		public void setIncidentUuid(String incidentUuid) {
			this.incidentUuid = incidentUuid;
		}

		public String getAlertUuid() {
			return this.alertUuid;
		}

		public void setAlertUuid(String alertUuid) {
			this.alertUuid = alertUuid;
		}

		public String getLogTime() {
			return this.logTime;
		}

		public void setLogTime(String logTime) {
			this.logTime = logTime;
		}

		public String getAlertSrcProd() {
			return this.alertSrcProd;
		}

		public void setAlertSrcProd(String alertSrcProd) {
			this.alertSrcProd = alertSrcProd;
		}

		public String getAlertTitle() {
			return this.alertTitle;
		}

		public void setAlertTitle(String alertTitle) {
			this.alertTitle = alertTitle;
		}

		public String getAlertLevel() {
			return this.alertLevel;
		}

		public void setAlertLevel(String alertLevel) {
			this.alertLevel = alertLevel;
		}

		public String getAssetList() {
			return this.assetList;
		}

		public void setAssetList(String assetList) {
			this.assetList = assetList;
		}

		public String getAlertSrcProdModule() {
			return this.alertSrcProdModule;
		}

		public void setAlertSrcProdModule(String alertSrcProdModule) {
			this.alertSrcProdModule = alertSrcProdModule;
		}

		public String getAttCk() {
			return this.attCk;
		}

		public void setAttCk(String attCk) {
			this.attCk = attCk;
		}

		public String getCloudCode() {
			return this.cloudCode;
		}

		public void setCloudCode(String cloudCode) {
			this.cloudCode = cloudCode;
		}

		public String getAlertTitleEn() {
			return this.alertTitleEn;
		}

		public void setAlertTitleEn(String alertTitleEn) {
			this.alertTitleEn = alertTitleEn;
		}

		public String getAlertType() {
			return this.alertType;
		}

		public void setAlertType(String alertType) {
			this.alertType = alertType;
		}

		public String getAlertTypeEn() {
			return this.alertTypeEn;
		}

		public void setAlertTypeEn(String alertTypeEn) {
			this.alertTypeEn = alertTypeEn;
		}

		public String getAlertTypeCode() {
			return this.alertTypeCode;
		}

		public void setAlertTypeCode(String alertTypeCode) {
			this.alertTypeCode = alertTypeCode;
		}

		public String getAlertName() {
			return this.alertName;
		}

		public void setAlertName(String alertName) {
			this.alertName = alertName;
		}

		public String getAlertNameEn() {
			return this.alertNameEn;
		}

		public void setAlertNameEn(String alertNameEn) {
			this.alertNameEn = alertNameEn;
		}

		public String getAlertNameCode() {
			return this.alertNameCode;
		}

		public void setAlertNameCode(String alertNameCode) {
			this.alertNameCode = alertNameCode;
		}
	}

	@Override
	public DescribeAttackTimeLineResponse getInstance(UnmarshallerContext context) {
		return	DescribeAttackTimeLineResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
