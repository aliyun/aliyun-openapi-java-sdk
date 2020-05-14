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

package com.aliyuncs.qualitycheck.model.v20190115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20190115.ListWarningConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListWarningConfigResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private List<WarningConfigInfo> data;

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

	public List<WarningConfigInfo> getData() {
		return this.data;
	}

	public void setData(List<WarningConfigInfo> data) {
		this.data = data;
	}

	public static class WarningConfigInfo {

		private Long configId;

		private String configName;

		private Integer status;

		private String createTime;

		private String updateTime;

		private List<WarningRule> ruleList;

		private List<Channel> channels;

		private List<String> ridList;

		public Long getConfigId() {
			return this.configId;
		}

		public void setConfigId(Long configId) {
			this.configId = configId;
		}

		public String getConfigName() {
			return this.configName;
		}

		public void setConfigName(String configName) {
			this.configName = configName;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public List<WarningRule> getRuleList() {
			return this.ruleList;
		}

		public void setRuleList(List<WarningRule> ruleList) {
			this.ruleList = ruleList;
		}

		public List<Channel> getChannels() {
			return this.channels;
		}

		public void setChannels(List<Channel> channels) {
			this.channels = channels;
		}

		public List<String> getRidList() {
			return this.ridList;
		}

		public void setRidList(List<String> ridList) {
			this.ridList = ridList;
		}

		public static class WarningRule {

			private Long rid;

			private String ruleName;

			public Long getRid() {
				return this.rid;
			}

			public void setRid(Long rid) {
				this.rid = rid;
			}

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}
		}

		public static class Channel {

			private Integer type;

			private String url;

			public Integer getType() {
				return this.type;
			}

			public void setType(Integer type) {
				this.type = type;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}
		}
	}

	@Override
	public ListWarningConfigResponse getInstance(UnmarshallerContext context) {
		return	ListWarningConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
