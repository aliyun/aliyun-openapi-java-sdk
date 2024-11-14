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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLiveAIStudioResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveAIStudioResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private Integer pageNumber;

	private Integer pageSize;

	private List<SubtitleConfig> studioConfigs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
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

	public List<SubtitleConfig> getStudioConfigs() {
		return this.studioConfigs;
	}

	public void setStudioConfigs(List<SubtitleConfig> studioConfigs) {
		this.studioConfigs = studioConfigs;
	}

	public static class SubtitleConfig {

		private String mediaType;

		private String mediaLayout;

		private String mediaResourceUrl;

		private String mediaResourceId;

		private String backgroundType;

		private String backgroundResourceUrl;

		private String backgroundResourceId;

		private String description;

		private String templateId;

		private String templateName;

		private String mattingLayout;

		private String mattingType;

		private String height;

		private String width;

		private List<String> ruleIds;

		public String getMediaType() {
			return this.mediaType;
		}

		public void setMediaType(String mediaType) {
			this.mediaType = mediaType;
		}

		public String getMediaLayout() {
			return this.mediaLayout;
		}

		public void setMediaLayout(String mediaLayout) {
			this.mediaLayout = mediaLayout;
		}

		public String getMediaResourceUrl() {
			return this.mediaResourceUrl;
		}

		public void setMediaResourceUrl(String mediaResourceUrl) {
			this.mediaResourceUrl = mediaResourceUrl;
		}

		public String getMediaResourceId() {
			return this.mediaResourceId;
		}

		public void setMediaResourceId(String mediaResourceId) {
			this.mediaResourceId = mediaResourceId;
		}

		public String getBackgroundType() {
			return this.backgroundType;
		}

		public void setBackgroundType(String backgroundType) {
			this.backgroundType = backgroundType;
		}

		public String getBackgroundResourceUrl() {
			return this.backgroundResourceUrl;
		}

		public void setBackgroundResourceUrl(String backgroundResourceUrl) {
			this.backgroundResourceUrl = backgroundResourceUrl;
		}

		public String getBackgroundResourceId() {
			return this.backgroundResourceId;
		}

		public void setBackgroundResourceId(String backgroundResourceId) {
			this.backgroundResourceId = backgroundResourceId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public String getTemplateName() {
			return this.templateName;
		}

		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}

		public String getMattingLayout() {
			return this.mattingLayout;
		}

		public void setMattingLayout(String mattingLayout) {
			this.mattingLayout = mattingLayout;
		}

		public String getMattingType() {
			return this.mattingType;
		}

		public void setMattingType(String mattingType) {
			this.mattingType = mattingType;
		}

		public String getHeight() {
			return this.height;
		}

		public void setHeight(String height) {
			this.height = height;
		}

		public String getWidth() {
			return this.width;
		}

		public void setWidth(String width) {
			this.width = width;
		}

		public List<String> getRuleIds() {
			return this.ruleIds;
		}

		public void setRuleIds(List<String> ruleIds) {
			this.ruleIds = ruleIds;
		}
	}

	@Override
	public DescribeLiveAIStudioResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveAIStudioResponseUnmarshaller.unmarshall(this, context);
	}
}
