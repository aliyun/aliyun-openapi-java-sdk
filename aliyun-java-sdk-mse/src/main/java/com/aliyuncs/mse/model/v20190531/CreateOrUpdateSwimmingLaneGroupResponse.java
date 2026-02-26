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

package com.aliyuncs.mse.model.v20190531;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.CreateOrUpdateSwimmingLaneGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateOrUpdateSwimmingLaneGroupResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorCode;

	private String message;

	private Data data;

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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String name;

		private String name1;

		private String dbGrayEnable;

		private String dbGrayEnable2;

		private String source;

		private String source3;

		private String userId;

		private String userId4;

		private String messageQueueFilterSide;

		private String messageQueueFilterSide5;

		private String appIds;

		private String appIds6;

		private String enable;

		private String enable7;

		private String namespace;

		private String namespace8;

		private Boolean recordCanaryDetail;

		private Long id;

		private Long id9;

		private String entryApp;

		private String entryApp10;

		private String region;

		private String region11;

		private Boolean messageQueueGrayEnable;

		private Boolean messageQueueGrayEnable12;

		private Integer status;

		private Integer status13;

		private List<String> applicationList;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getName1() {
			return this.name1;
		}

		public void setName1(String name1) {
			this.name1 = name1;
		}

		public String getDbGrayEnable() {
			return this.dbGrayEnable;
		}

		public void setDbGrayEnable(String dbGrayEnable) {
			this.dbGrayEnable = dbGrayEnable;
		}

		public String getDbGrayEnable2() {
			return this.dbGrayEnable2;
		}

		public void setDbGrayEnable2(String dbGrayEnable2) {
			this.dbGrayEnable2 = dbGrayEnable2;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getSource3() {
			return this.source3;
		}

		public void setSource3(String source3) {
			this.source3 = source3;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUserId4() {
			return this.userId4;
		}

		public void setUserId4(String userId4) {
			this.userId4 = userId4;
		}

		public String getMessageQueueFilterSide() {
			return this.messageQueueFilterSide;
		}

		public void setMessageQueueFilterSide(String messageQueueFilterSide) {
			this.messageQueueFilterSide = messageQueueFilterSide;
		}

		public String getMessageQueueFilterSide5() {
			return this.messageQueueFilterSide5;
		}

		public void setMessageQueueFilterSide5(String messageQueueFilterSide5) {
			this.messageQueueFilterSide5 = messageQueueFilterSide5;
		}

		public String getAppIds() {
			return this.appIds;
		}

		public void setAppIds(String appIds) {
			this.appIds = appIds;
		}

		public String getAppIds6() {
			return this.appIds6;
		}

		public void setAppIds6(String appIds6) {
			this.appIds6 = appIds6;
		}

		public String getEnable() {
			return this.enable;
		}

		public void setEnable(String enable) {
			this.enable = enable;
		}

		public String getEnable7() {
			return this.enable7;
		}

		public void setEnable7(String enable7) {
			this.enable7 = enable7;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getNamespace8() {
			return this.namespace8;
		}

		public void setNamespace8(String namespace8) {
			this.namespace8 = namespace8;
		}

		public Boolean getRecordCanaryDetail() {
			return this.recordCanaryDetail;
		}

		public void setRecordCanaryDetail(Boolean recordCanaryDetail) {
			this.recordCanaryDetail = recordCanaryDetail;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getId9() {
			return this.id9;
		}

		public void setId9(Long id9) {
			this.id9 = id9;
		}

		public String getEntryApp() {
			return this.entryApp;
		}

		public void setEntryApp(String entryApp) {
			this.entryApp = entryApp;
		}

		public String getEntryApp10() {
			return this.entryApp10;
		}

		public void setEntryApp10(String entryApp10) {
			this.entryApp10 = entryApp10;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getRegion11() {
			return this.region11;
		}

		public void setRegion11(String region11) {
			this.region11 = region11;
		}

		public Boolean getMessageQueueGrayEnable() {
			return this.messageQueueGrayEnable;
		}

		public void setMessageQueueGrayEnable(Boolean messageQueueGrayEnable) {
			this.messageQueueGrayEnable = messageQueueGrayEnable;
		}

		public Boolean getMessageQueueGrayEnable12() {
			return this.messageQueueGrayEnable12;
		}

		public void setMessageQueueGrayEnable12(Boolean messageQueueGrayEnable12) {
			this.messageQueueGrayEnable12 = messageQueueGrayEnable12;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getStatus13() {
			return this.status13;
		}

		public void setStatus13(Integer status13) {
			this.status13 = status13;
		}

		public List<String> getApplicationList() {
			return this.applicationList;
		}

		public void setApplicationList(List<String> applicationList) {
			this.applicationList = applicationList;
		}
	}

	@Override
	public CreateOrUpdateSwimmingLaneGroupResponse getInstance(UnmarshallerContext context) {
		return	CreateOrUpdateSwimmingLaneGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
