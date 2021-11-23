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
import com.aliyuncs.rtc.transform.v20180111.DescribeAutoLiveStreamRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAutoLiveStreamRuleResponse extends AcsResponse {

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

		private String status;

		private Integer mediaEncode;

		private String playDomain;

		private String callBack;

		private String createTime;

		private Long ruleId;

		private String ruleName;

		private List<String> channelIds;

		private List<String> channelIdPrefixes;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getMediaEncode() {
			return this.mediaEncode;
		}

		public void setMediaEncode(Integer mediaEncode) {
			this.mediaEncode = mediaEncode;
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

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(Long ruleId) {
			this.ruleId = ruleId;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public List<String> getChannelIds() {
			return this.channelIds;
		}

		public void setChannelIds(List<String> channelIds) {
			this.channelIds = channelIds;
		}

		public List<String> getChannelIdPrefixes() {
			return this.channelIdPrefixes;
		}

		public void setChannelIdPrefixes(List<String> channelIdPrefixes) {
			this.channelIdPrefixes = channelIdPrefixes;
		}
	}

	@Override
	public DescribeAutoLiveStreamRuleResponse getInstance(UnmarshallerContext context) {
		return	DescribeAutoLiveStreamRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
