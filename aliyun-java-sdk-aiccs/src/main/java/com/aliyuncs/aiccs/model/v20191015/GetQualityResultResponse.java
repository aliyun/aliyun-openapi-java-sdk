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

package com.aliyuncs.aiccs.model.v20191015;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aiccs.transform.v20191015.GetQualityResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetQualityResultResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private String channelTypeName;

	private Boolean success;

	private Data data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getChannelTypeName() {
		return this.channelTypeName;
	}

	public void setChannelTypeName(String channelTypeName) {
		this.channelTypeName = channelTypeName;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNo;

		private Integer pageSize;

		private Integer totalNum;

		private List<QualityResultResponseListItem> qualityResultResponseList;

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalNum() {
			return this.totalNum;
		}

		public void setTotalNum(Integer totalNum) {
			this.totalNum = totalNum;
		}

		public List<QualityResultResponseListItem> getQualityResultResponseList() {
			return this.qualityResultResponseList;
		}

		public void setQualityResultResponseList(List<QualityResultResponseListItem> qualityResultResponseList) {
			this.qualityResultResponseList = qualityResultResponseList;
		}

		public static class QualityResultResponseListItem {

			private String touchId;

			private String servicerName;

			private String memberName;

			private String projectName;

			private String projectId;

			private String channelType;

			private String channelTypeName;

			private String touchStartTime;

			private String servicerId;

			private String ruleName;

			private String ruleId;

			private String groupName;

			private String groupId;

			private String instanceName;

			private Boolean hitStatus;

			private String hitDetail;

			public String getTouchId() {
				return this.touchId;
			}

			public void setTouchId(String touchId) {
				this.touchId = touchId;
			}

			public String getServicerName() {
				return this.servicerName;
			}

			public void setServicerName(String servicerName) {
				this.servicerName = servicerName;
			}

			public String getMemberName() {
				return this.memberName;
			}

			public void setMemberName(String memberName) {
				this.memberName = memberName;
			}

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public String getProjectId() {
				return this.projectId;
			}

			public void setProjectId(String projectId) {
				this.projectId = projectId;
			}

			public String getChannelType() {
				return this.channelType;
			}

			public void setChannelType(String channelType) {
				this.channelType = channelType;
			}

			public String getChannelTypeName() {
				return this.channelTypeName;
			}

			public void setChannelTypeName(String channelTypeName) {
				this.channelTypeName = channelTypeName;
			}

			public String getTouchStartTime() {
				return this.touchStartTime;
			}

			public void setTouchStartTime(String touchStartTime) {
				this.touchStartTime = touchStartTime;
			}

			public String getServicerId() {
				return this.servicerId;
			}

			public void setServicerId(String servicerId) {
				this.servicerId = servicerId;
			}

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}

			public String getRuleId() {
				return this.ruleId;
			}

			public void setRuleId(String ruleId) {
				this.ruleId = ruleId;
			}

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
			}

			public Boolean getHitStatus() {
				return this.hitStatus;
			}

			public void setHitStatus(Boolean hitStatus) {
				this.hitStatus = hitStatus;
			}

			public String getHitDetail() {
				return this.hitDetail;
			}

			public void setHitDetail(String hitDetail) {
				this.hitDetail = hitDetail;
			}
		}
	}

	@Override
	public GetQualityResultResponse getInstance(UnmarshallerContext context) {
		return	GetQualityResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
