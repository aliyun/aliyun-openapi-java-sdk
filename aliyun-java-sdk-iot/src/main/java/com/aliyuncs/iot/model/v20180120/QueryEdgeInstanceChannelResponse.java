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

package com.aliyuncs.iot.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.QueryEdgeInstanceChannelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryEdgeInstanceChannelResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private Data data;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer total;

		private Integer pageSize;

		private Integer currentPage;

		private List<Channel> channelList;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public List<Channel> getChannelList() {
			return this.channelList;
		}

		public void setChannelList(List<Channel> channelList) {
			this.channelList = channelList;
		}

		public static class Channel {

			private String channelId;

			private String channelName;

			private String gmtCreate;

			private String gmtModified;

			private Long gmtCreateTimestamp;

			private Long gmtModifiedTimestamp;

			private List<Config> configList;

			public String getChannelId() {
				return this.channelId;
			}

			public void setChannelId(String channelId) {
				this.channelId = channelId;
			}

			public String getChannelName() {
				return this.channelName;
			}

			public void setChannelName(String channelName) {
				this.channelName = channelName;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public Long getGmtCreateTimestamp() {
				return this.gmtCreateTimestamp;
			}

			public void setGmtCreateTimestamp(Long gmtCreateTimestamp) {
				this.gmtCreateTimestamp = gmtCreateTimestamp;
			}

			public Long getGmtModifiedTimestamp() {
				return this.gmtModifiedTimestamp;
			}

			public void setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
				this.gmtModifiedTimestamp = gmtModifiedTimestamp;
			}

			public List<Config> getConfigList() {
				return this.configList;
			}

			public void setConfigList(List<Config> configList) {
				this.configList = configList;
			}

			public static class Config {

				private String configId;

				private String format;

				private String content;

				private String key;

				public String getConfigId() {
					return this.configId;
				}

				public void setConfigId(String configId) {
					this.configId = configId;
				}

				public String getFormat() {
					return this.format;
				}

				public void setFormat(String format) {
					this.format = format;
				}

				public String getContent() {
					return this.content;
				}

				public void setContent(String content) {
					this.content = content;
				}

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}
			}
		}
	}

	@Override
	public QueryEdgeInstanceChannelResponse getInstance(UnmarshallerContext context) {
		return	QueryEdgeInstanceChannelResponseUnmarshaller.unmarshall(this, context);
	}
}
