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

package com.aliyuncs.webplus.model.v20190320;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.webplus.transform.v20190320.DescribeConfigTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeConfigTemplatesResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<ConfigTemplate> configTemplates;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ConfigTemplate> getConfigTemplates() {
		return this.configTemplates;
	}

	public void setConfigTemplates(List<ConfigTemplate> configTemplates) {
		this.configTemplates = configTemplates;
	}

	public static class ConfigTemplate {

		private String templateId;

		private String appId;

		private String stackId;

		private String pkgVersionId;

		private String templateName;

		private String appName;

		private Long createTime;

		private Long updateTime;

		private String stackName;

		private String pkgVersionLabel;

		private String templateDescription;

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getStackId() {
			return this.stackId;
		}

		public void setStackId(String stackId) {
			this.stackId = stackId;
		}

		public String getPkgVersionId() {
			return this.pkgVersionId;
		}

		public void setPkgVersionId(String pkgVersionId) {
			this.pkgVersionId = pkgVersionId;
		}

		public String getTemplateName() {
			return this.templateName;
		}

		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getStackName() {
			return this.stackName;
		}

		public void setStackName(String stackName) {
			this.stackName = stackName;
		}

		public String getPkgVersionLabel() {
			return this.pkgVersionLabel;
		}

		public void setPkgVersionLabel(String pkgVersionLabel) {
			this.pkgVersionLabel = pkgVersionLabel;
		}

		public String getTemplateDescription() {
			return this.templateDescription;
		}

		public void setTemplateDescription(String templateDescription) {
			this.templateDescription = templateDescription;
		}
	}

	@Override
	public DescribeConfigTemplatesResponse getInstance(UnmarshallerContext context) {
		return	DescribeConfigTemplatesResponseUnmarshaller.unmarshall(this, context);
	}
}
