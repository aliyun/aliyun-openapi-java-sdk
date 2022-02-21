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

package com.aliyuncs.cms.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.DescribeMetricRuleTemplateListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMetricRuleTemplateListResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Long total;

	private Boolean success;

	private List<Template> templates;

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

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Template> getTemplates() {
		return this.templates;
	}

	public void setTemplates(List<Template> templates) {
		this.templates = templates;
	}

	public static class Template {

		private String description;

		private Long gmtCreate;

		private String name;

		private Long restVersion;

		private Long gmtModified;

		private Long templateId;

		private List<ApplyHistory> applyHistories;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getRestVersion() {
			return this.restVersion;
		}

		public void setRestVersion(Long restVersion) {
			this.restVersion = restVersion;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(Long templateId) {
			this.templateId = templateId;
		}

		public List<ApplyHistory> getApplyHistories() {
			return this.applyHistories;
		}

		public void setApplyHistories(List<ApplyHistory> applyHistories) {
			this.applyHistories = applyHistories;
		}

		public static class ApplyHistory {

			private Long groupId;

			private String groupName;

			private Long applyTime;

			public Long getGroupId() {
				return this.groupId;
			}

			public void setGroupId(Long groupId) {
				this.groupId = groupId;
			}

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}

			public Long getApplyTime() {
				return this.applyTime;
			}

			public void setApplyTime(Long applyTime) {
				this.applyTime = applyTime;
			}
		}
	}

	@Override
	public DescribeMetricRuleTemplateListResponse getInstance(UnmarshallerContext context) {
		return	DescribeMetricRuleTemplateListResponseUnmarshaller.unmarshall(this, context);
	}
}
