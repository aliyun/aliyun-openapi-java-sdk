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
import com.aliyuncs.live.transform.v20161101.DescribeLiveAIProduceRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveAIProduceRulesResponse extends AcsResponse {

	private String requestId;

	private List<RuleInfo> ruleInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RuleInfo> getRuleInfoList() {
		return this.ruleInfoList;
	}

	public void setRuleInfoList(List<RuleInfo> ruleInfoList) {
		this.ruleInfoList = ruleInfoList;
	}

	public static class RuleInfo {

		private String domain;

		private String app;

		private String subtitleName;

		private Boolean isLazy;

		private Boolean isOrigin;

		private String rulesId;

		private String liveTemplate;

		private String gmtModifyTime;

		private String suffixName;

		private String studioName;

		private String description;

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getApp() {
			return this.app;
		}

		public void setApp(String app) {
			this.app = app;
		}

		public String getSubtitleName() {
			return this.subtitleName;
		}

		public void setSubtitleName(String subtitleName) {
			this.subtitleName = subtitleName;
		}

		public Boolean getIsLazy() {
			return this.isLazy;
		}

		public void setIsLazy(Boolean isLazy) {
			this.isLazy = isLazy;
		}

		public Boolean getIsOrigin() {
			return this.isOrigin;
		}

		public void setIsOrigin(Boolean isOrigin) {
			this.isOrigin = isOrigin;
		}

		public String getRulesId() {
			return this.rulesId;
		}

		public void setRulesId(String rulesId) {
			this.rulesId = rulesId;
		}

		public String getLiveTemplate() {
			return this.liveTemplate;
		}

		public void setLiveTemplate(String liveTemplate) {
			this.liveTemplate = liveTemplate;
		}

		public String getGmtModifyTime() {
			return this.gmtModifyTime;
		}

		public void setGmtModifyTime(String gmtModifyTime) {
			this.gmtModifyTime = gmtModifyTime;
		}

		public String getSuffixName() {
			return this.suffixName;
		}

		public void setSuffixName(String suffixName) {
			this.suffixName = suffixName;
		}

		public String getStudioName() {
			return this.studioName;
		}

		public void setStudioName(String studioName) {
			this.studioName = studioName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public DescribeLiveAIProduceRulesResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveAIProduceRulesResponseUnmarshaller.unmarshall(this, context);
	}
}
