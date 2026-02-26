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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetQualityAlertOfAllRuleScopeByWatchIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetQualityAlertOfAllRuleScopeByWatchIdResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private QualityAlertInfo qualityAlertInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public QualityAlertInfo getQualityAlertInfo() {
		return this.qualityAlertInfo;
	}

	public void setQualityAlertInfo(QualityAlertInfo qualityAlertInfo) {
		this.qualityAlertInfo = qualityAlertInfo;
	}

	public static class QualityAlertInfo {

		private Long watchId;

		private Boolean enableAlertQualityOwner;

		private List<AlertUser> alertUserList;

		private List<AlertDuty> alertDutyList;

		private List<String> alertUserChannelList;

		private List<String> alertDutyChannelList;

		private List<String> alertQualityOwnerChannelList;

		public Long getWatchId() {
			return this.watchId;
		}

		public void setWatchId(Long watchId) {
			this.watchId = watchId;
		}

		public Boolean getEnableAlertQualityOwner() {
			return this.enableAlertQualityOwner;
		}

		public void setEnableAlertQualityOwner(Boolean enableAlertQualityOwner) {
			this.enableAlertQualityOwner = enableAlertQualityOwner;
		}

		public List<AlertUser> getAlertUserList() {
			return this.alertUserList;
		}

		public void setAlertUserList(List<AlertUser> alertUserList) {
			this.alertUserList = alertUserList;
		}

		public List<AlertDuty> getAlertDutyList() {
			return this.alertDutyList;
		}

		public void setAlertDutyList(List<AlertDuty> alertDutyList) {
			this.alertDutyList = alertDutyList;
		}

		public List<String> getAlertUserChannelList() {
			return this.alertUserChannelList;
		}

		public void setAlertUserChannelList(List<String> alertUserChannelList) {
			this.alertUserChannelList = alertUserChannelList;
		}

		public List<String> getAlertDutyChannelList() {
			return this.alertDutyChannelList;
		}

		public void setAlertDutyChannelList(List<String> alertDutyChannelList) {
			this.alertDutyChannelList = alertDutyChannelList;
		}

		public List<String> getAlertQualityOwnerChannelList() {
			return this.alertQualityOwnerChannelList;
		}

		public void setAlertQualityOwnerChannelList(List<String> alertQualityOwnerChannelList) {
			this.alertQualityOwnerChannelList = alertQualityOwnerChannelList;
		}

		public static class AlertUser {

			private String id;

			private String name;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class AlertDuty {

			private String id;

			private String name;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public GetQualityAlertOfAllRuleScopeByWatchIdResponse getInstance(UnmarshallerContext context) {
		return	GetQualityAlertOfAllRuleScopeByWatchIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
