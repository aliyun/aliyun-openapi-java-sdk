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

package com.aliyuncs.rtc.model.v20180111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rtc.transform.v20180111.DescribeMPURuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMPURuleResponse extends AcsResponse {

	private String requestId;

	private List<Rule> rules;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Rule> getRules() {
		return this.rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}

	public static class Rule {

		private Long ruleId;

		private String channelPrefix;

		private Integer mediaEncode;

		private Integer backgroudColor;

		private Integer cropMode;

		private String taskProfile;

		private String playDomain;

		private String callBack;

		private Integer isEnable;

		private List<String> layoutIds;

		public Long getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(Long ruleId) {
			this.ruleId = ruleId;
		}

		public String getChannelPrefix() {
			return this.channelPrefix;
		}

		public void setChannelPrefix(String channelPrefix) {
			this.channelPrefix = channelPrefix;
		}

		public Integer getMediaEncode() {
			return this.mediaEncode;
		}

		public void setMediaEncode(Integer mediaEncode) {
			this.mediaEncode = mediaEncode;
		}

		public Integer getBackgroudColor() {
			return this.backgroudColor;
		}

		public void setBackgroudColor(Integer backgroudColor) {
			this.backgroudColor = backgroudColor;
		}

		public Integer getCropMode() {
			return this.cropMode;
		}

		public void setCropMode(Integer cropMode) {
			this.cropMode = cropMode;
		}

		public String getTaskProfile() {
			return this.taskProfile;
		}

		public void setTaskProfile(String taskProfile) {
			this.taskProfile = taskProfile;
		}

		public String getPlayDomain() {
			return this.playDomain;
		}

		public void setPlayDomain(String playDomain) {
			this.playDomain = playDomain;
		}

		public String getCallBack() {
			return this.callBack;
		}

		public void setCallBack(String callBack) {
			this.callBack = callBack;
		}

		public Integer getIsEnable() {
			return this.isEnable;
		}

		public void setIsEnable(Integer isEnable) {
			this.isEnable = isEnable;
		}

		public List<String> getLayoutIds() {
			return this.layoutIds;
		}

		public void setLayoutIds(List<String> layoutIds) {
			this.layoutIds = layoutIds;
		}
	}

	@Override
	public DescribeMPURuleResponse getInstance(UnmarshallerContext context) {
		return	DescribeMPURuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
