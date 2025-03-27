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
import com.aliyuncs.live.transform.v20161101.QueryLiveDomainMultiStreamListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLiveDomainMultiStreamListResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<OnlineStreamsItem> onlineStreams;

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

	public List<OnlineStreamsItem> getOnlineStreams() {
		return this.onlineStreams;
	}

	public void setOnlineStreams(List<OnlineStreamsItem> onlineStreams) {
		this.onlineStreams = onlineStreams;
	}

	public static class OnlineStreamsItem {

		private String domain;

		private String appName;

		private String streamName;

		private String optimalMode;

		private List<UpstreamListItem> upstreamList;

		private List<ChangeLogsItem> changeLogs;

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getStreamName() {
			return this.streamName;
		}

		public void setStreamName(String streamName) {
			this.streamName = streamName;
		}

		public String getOptimalMode() {
			return this.optimalMode;
		}

		public void setOptimalMode(String optimalMode) {
			this.optimalMode = optimalMode;
		}

		public List<UpstreamListItem> getUpstreamList() {
			return this.upstreamList;
		}

		public void setUpstreamList(List<UpstreamListItem> upstreamList) {
			this.upstreamList = upstreamList;
		}

		public List<ChangeLogsItem> getChangeLogs() {
			return this.changeLogs;
		}

		public void setChangeLogs(List<ChangeLogsItem> changeLogs) {
			this.changeLogs = changeLogs;
		}

		public static class UpstreamListItem {

			private String upstreamSequence;

			private String upstreamIp;

			private String upstreamTime;

			private Boolean masterFlag;

			public String getUpstreamSequence() {
				return this.upstreamSequence;
			}

			public void setUpstreamSequence(String upstreamSequence) {
				this.upstreamSequence = upstreamSequence;
			}

			public String getUpstreamIp() {
				return this.upstreamIp;
			}

			public void setUpstreamIp(String upstreamIp) {
				this.upstreamIp = upstreamIp;
			}

			public String getUpstreamTime() {
				return this.upstreamTime;
			}

			public void setUpstreamTime(String upstreamTime) {
				this.upstreamTime = upstreamTime;
			}

			public Boolean getMasterFlag() {
				return this.masterFlag;
			}

			public void setMasterFlag(Boolean masterFlag) {
				this.masterFlag = masterFlag;
			}
		}

		public static class ChangeLogsItem {

			private String changeTime;

			private String changeReason;

			private String masterUpstream;

			private String upstreamSequence;

			private String upstreamIp;

			public String getChangeTime() {
				return this.changeTime;
			}

			public void setChangeTime(String changeTime) {
				this.changeTime = changeTime;
			}

			public String getChangeReason() {
				return this.changeReason;
			}

			public void setChangeReason(String changeReason) {
				this.changeReason = changeReason;
			}

			public String getMasterUpstream() {
				return this.masterUpstream;
			}

			public void setMasterUpstream(String masterUpstream) {
				this.masterUpstream = masterUpstream;
			}

			public String getUpstreamSequence() {
				return this.upstreamSequence;
			}

			public void setUpstreamSequence(String upstreamSequence) {
				this.upstreamSequence = upstreamSequence;
			}

			public String getUpstreamIp() {
				return this.upstreamIp;
			}

			public void setUpstreamIp(String upstreamIp) {
				this.upstreamIp = upstreamIp;
			}
		}
	}

	@Override
	public QueryLiveDomainMultiStreamListResponse getInstance(UnmarshallerContext context) {
		return	QueryLiveDomainMultiStreamListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
