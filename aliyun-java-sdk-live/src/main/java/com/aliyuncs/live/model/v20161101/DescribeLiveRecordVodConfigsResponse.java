/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLiveRecordVodConfigsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveRecordVodConfigsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNum;

	private Integer pageSize;

	private String total;

	private List<LiveRecordVodConfig> liveRecordVodConfigs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getTotal() {
		return this.total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public List<LiveRecordVodConfig> getLiveRecordVodConfigs() {
		return this.liveRecordVodConfigs;
	}

	public void setLiveRecordVodConfigs(List<LiveRecordVodConfig> liveRecordVodConfigs) {
		this.liveRecordVodConfigs = liveRecordVodConfigs;
	}

	public static class LiveRecordVodConfig {

		private String createTime;

		private String domainName;

		private String appName;

		private String streamName;

		private String vodTranscodeGroupId;

		private Integer cycleDuration;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
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

		public String getVodTranscodeGroupId() {
			return this.vodTranscodeGroupId;
		}

		public void setVodTranscodeGroupId(String vodTranscodeGroupId) {
			this.vodTranscodeGroupId = vodTranscodeGroupId;
		}

		public Integer getCycleDuration() {
			return this.cycleDuration;
		}

		public void setCycleDuration(Integer cycleDuration) {
			this.cycleDuration = cycleDuration;
		}
	}

	@Override
	public DescribeLiveRecordVodConfigsResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveRecordVodConfigsResponseUnmarshaller.unmarshall(this, context);
	}
}
