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
import com.aliyuncs.mse.transform.v20190531.QueryAllSwimmingLaneResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAllSwimmingLaneResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorCode;

	private String message;

	private List<SwimmingLaneGroup> data;

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

	public List<SwimmingLaneGroup> getData() {
		return this.data;
	}

	public void setData(List<SwimmingLaneGroup> data) {
		this.data = data;
	}

	public static class SwimmingLaneGroup {

		private String name;

		private String name1;

		private String userId;

		private String userId2;

		private String messageQueueFilterSide;

		private String enable;

		private String enable3;

		private String namespace;

		private Boolean recordCanaryDetail;

		private Long id;

		private Long id4;

		private String regionId;

		private String regionId5;

		private Boolean messageQueueGrayEnable;

		private Integer status;

		private Boolean enableRules;

		private String entryRule;

		private String gmtCreate;

		private String gmtModified;

		private String groupId;

		private String tag;

		private String tag6;

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

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUserId2() {
			return this.userId2;
		}

		public void setUserId2(String userId2) {
			this.userId2 = userId2;
		}

		public String getMessageQueueFilterSide() {
			return this.messageQueueFilterSide;
		}

		public void setMessageQueueFilterSide(String messageQueueFilterSide) {
			this.messageQueueFilterSide = messageQueueFilterSide;
		}

		public String getEnable() {
			return this.enable;
		}

		public void setEnable(String enable) {
			this.enable = enable;
		}

		public String getEnable3() {
			return this.enable3;
		}

		public void setEnable3(String enable3) {
			this.enable3 = enable3;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
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

		public Long getId4() {
			return this.id4;
		}

		public void setId4(Long id4) {
			this.id4 = id4;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getRegionId5() {
			return this.regionId5;
		}

		public void setRegionId5(String regionId5) {
			this.regionId5 = regionId5;
		}

		public Boolean getMessageQueueGrayEnable() {
			return this.messageQueueGrayEnable;
		}

		public void setMessageQueueGrayEnable(Boolean messageQueueGrayEnable) {
			this.messageQueueGrayEnable = messageQueueGrayEnable;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Boolean getEnableRules() {
			return this.enableRules;
		}

		public void setEnableRules(Boolean enableRules) {
			this.enableRules = enableRules;
		}

		public String getEntryRule() {
			return this.entryRule;
		}

		public void setEntryRule(String entryRule) {
			this.entryRule = entryRule;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getTag6() {
			return this.tag6;
		}

		public void setTag6(String tag6) {
			this.tag6 = tag6;
		}
	}

	@Override
	public QueryAllSwimmingLaneResponse getInstance(UnmarshallerContext context) {
		return	QueryAllSwimmingLaneResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
