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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeWebCcProtectSwitchResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWebCcProtectSwitchResponse extends AcsResponse {

	private String requestId;

	private List<ProtectSwitch> protectSwitchList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ProtectSwitch> getProtectSwitchList() {
		return this.protectSwitchList;
	}

	public void setProtectSwitchList(List<ProtectSwitch> protectSwitchList) {
		this.protectSwitchList = protectSwitchList;
	}

	public static class ProtectSwitch {

		private Integer blackWhiteListEnable;

		private String aiTemplate;

		private Integer preciseRuleEnable;

		private String domain;

		private String aiMode;

		private Integer aiRuleEnable;

		private Integer regionBlockEnable;

		private String ccTemplate;

		private Integer ccCustomRuleEnable;

		private Integer ccEnable;

		public Integer getBlackWhiteListEnable() {
			return this.blackWhiteListEnable;
		}

		public void setBlackWhiteListEnable(Integer blackWhiteListEnable) {
			this.blackWhiteListEnable = blackWhiteListEnable;
		}

		public String getAiTemplate() {
			return this.aiTemplate;
		}

		public void setAiTemplate(String aiTemplate) {
			this.aiTemplate = aiTemplate;
		}

		public Integer getPreciseRuleEnable() {
			return this.preciseRuleEnable;
		}

		public void setPreciseRuleEnable(Integer preciseRuleEnable) {
			this.preciseRuleEnable = preciseRuleEnable;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getAiMode() {
			return this.aiMode;
		}

		public void setAiMode(String aiMode) {
			this.aiMode = aiMode;
		}

		public Integer getAiRuleEnable() {
			return this.aiRuleEnable;
		}

		public void setAiRuleEnable(Integer aiRuleEnable) {
			this.aiRuleEnable = aiRuleEnable;
		}

		public Integer getRegionBlockEnable() {
			return this.regionBlockEnable;
		}

		public void setRegionBlockEnable(Integer regionBlockEnable) {
			this.regionBlockEnable = regionBlockEnable;
		}

		public String getCcTemplate() {
			return this.ccTemplate;
		}

		public void setCcTemplate(String ccTemplate) {
			this.ccTemplate = ccTemplate;
		}

		public Integer getCcCustomRuleEnable() {
			return this.ccCustomRuleEnable;
		}

		public void setCcCustomRuleEnable(Integer ccCustomRuleEnable) {
			this.ccCustomRuleEnable = ccCustomRuleEnable;
		}

		public Integer getCcEnable() {
			return this.ccEnable;
		}

		public void setCcEnable(Integer ccEnable) {
			this.ccEnable = ccEnable;
		}
	}

	@Override
	public DescribeWebCcProtectSwitchResponse getInstance(UnmarshallerContext context) {
		return	DescribeWebCcProtectSwitchResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
