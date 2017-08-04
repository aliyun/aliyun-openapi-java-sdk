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
package com.aliyuncs.cdn.model.v20141111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeLiveStreamSnapshotInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamSnapshotInfoResponse extends AcsResponse {

	private String requestId;

	private String nextStartTime;

	private List<LiveStreamSnapshotInfo> liveStreamSnapshotInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextStartTime() {
		return this.nextStartTime;
	}

	public void setNextStartTime(String nextStartTime) {
		this.nextStartTime = nextStartTime;
	}

	public List<LiveStreamSnapshotInfo> getLiveStreamSnapshotInfoList() {
		return this.liveStreamSnapshotInfoList;
	}

	public void setLiveStreamSnapshotInfoList(List<LiveStreamSnapshotInfo> liveStreamSnapshotInfoList) {
		this.liveStreamSnapshotInfoList = liveStreamSnapshotInfoList;
	}

	public static class LiveStreamSnapshotInfo {

		private String ossEndpoint;

		private String ossBucket;

		private String ossObject;

		private String createTime;

		public String getOssEndpoint() {
			return this.ossEndpoint;
		}

		public void setOssEndpoint(String ossEndpoint) {
			this.ossEndpoint = ossEndpoint;
		}

		public String getOssBucket() {
			return this.ossBucket;
		}

		public void setOssBucket(String ossBucket) {
			this.ossBucket = ossBucket;
		}

		public String getOssObject() {
			return this.ossObject;
		}

		public void setOssObject(String ossObject) {
			this.ossObject = ossObject;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public DescribeLiveStreamSnapshotInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamSnapshotInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
