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
import com.aliyuncs.cms.transform.v20190101.DescribeSiteMonitorListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSiteMonitorListResponse extends AcsResponse {

	private String code;

	private String message;

	private String success;

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<SiteMonitor> siteMonitors;

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

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public List<SiteMonitor> getSiteMonitors() {
		return this.siteMonitors;
	}

	public void setSiteMonitors(List<SiteMonitor> siteMonitors) {
		this.siteMonitors = siteMonitors;
	}

	public static class SiteMonitor {

		private String taskId;

		private String taskType;

		private String address;

		private String taskState;

		private String createTime;

		private String taskName;

		private String interval;

		private String updateTime;

		private String endTime;

		private OptionsJson optionsJson;

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getTaskState() {
			return this.taskState;
		}

		public void setTaskState(String taskState) {
			this.taskState = taskState;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public String getInterval() {
			return this.interval;
		}

		public void setInterval(String interval) {
			this.interval = interval;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public OptionsJson getOptionsJson() {
			return this.optionsJson;
		}

		public void setOptionsJson(OptionsJson optionsJson) {
			this.optionsJson = optionsJson;
		}

		public static class OptionsJson {

			private String dns_type;

			private String dns_server;

			private String group_id;

			private String expect_value;

			private String http_method;

			private String response_content;

			private Integer match_rule;

			private String request_content;

			private String cookie;

			private String header;

			private String username;

			private String password;

			private Long time_out;

			private Integer ping_num;

			private Float failure_rate;

			private String request_format;

			private String response_format;

			private Integer port;

			private Integer authentication;

			private Long traceroute;

			public String getDns_type() {
				return this.dns_type;
			}

			public void setDns_type(String dns_type) {
				this.dns_type = dns_type;
			}

			public String getDns_server() {
				return this.dns_server;
			}

			public void setDns_server(String dns_server) {
				this.dns_server = dns_server;
			}

			public String getGroup_id() {
				return this.group_id;
			}

			public void setGroup_id(String group_id) {
				this.group_id = group_id;
			}

			public String getExpect_value() {
				return this.expect_value;
			}

			public void setExpect_value(String expect_value) {
				this.expect_value = expect_value;
			}

			public String getHttp_method() {
				return this.http_method;
			}

			public void setHttp_method(String http_method) {
				this.http_method = http_method;
			}

			public String getResponse_content() {
				return this.response_content;
			}

			public void setResponse_content(String response_content) {
				this.response_content = response_content;
			}

			public Integer getMatch_rule() {
				return this.match_rule;
			}

			public void setMatch_rule(Integer match_rule) {
				this.match_rule = match_rule;
			}

			public String getRequest_content() {
				return this.request_content;
			}

			public void setRequest_content(String request_content) {
				this.request_content = request_content;
			}

			public String getCookie() {
				return this.cookie;
			}

			public void setCookie(String cookie) {
				this.cookie = cookie;
			}

			public String getHeader() {
				return this.header;
			}

			public void setHeader(String header) {
				this.header = header;
			}

			public String getUsername() {
				return this.username;
			}

			public void setUsername(String username) {
				this.username = username;
			}

			public String getPassword() {
				return this.password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public Long getTime_out() {
				return this.time_out;
			}

			public void setTime_out(Long time_out) {
				this.time_out = time_out;
			}

			public Integer getPing_num() {
				return this.ping_num;
			}

			public void setPing_num(Integer ping_num) {
				this.ping_num = ping_num;
			}

			public Float getFailure_rate() {
				return this.failure_rate;
			}

			public void setFailure_rate(Float failure_rate) {
				this.failure_rate = failure_rate;
			}

			public String getRequest_format() {
				return this.request_format;
			}

			public void setRequest_format(String request_format) {
				this.request_format = request_format;
			}

			public String getResponse_format() {
				return this.response_format;
			}

			public void setResponse_format(String response_format) {
				this.response_format = response_format;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public Integer getAuthentication() {
				return this.authentication;
			}

			public void setAuthentication(Integer authentication) {
				this.authentication = authentication;
			}

			public Long getTraceroute() {
				return this.traceroute;
			}

			public void setTraceroute(Long traceroute) {
				this.traceroute = traceroute;
			}
		}
	}

	@Override
	public DescribeSiteMonitorListResponse getInstance(UnmarshallerContext context) {
		return	DescribeSiteMonitorListResponseUnmarshaller.unmarshall(this, context);
	}
}
