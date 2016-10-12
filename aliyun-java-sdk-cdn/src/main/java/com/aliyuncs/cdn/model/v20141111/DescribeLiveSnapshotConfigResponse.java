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
import com.aliyuncs.cdn.transform.v20141111.DescribeLiveSnapshotConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveSnapshotConfigResponse extends AcsResponse {

	private String requestId;

	private Integer pageNum;

	private Integer pageSize;

	private String order;

	private Integer totalNum;

	private Integer totalPage;

	private List<LiveStreamSnapshotConfig> liveStreamSnapshotConfigList;

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

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public Integer getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public Integer getTotalPage() {
		return this.totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public List<LiveStreamSnapshotConfig> getLiveStreamSnapshotConfigList() {
		return this.liveStreamSnapshotConfigList;
	}

	public void setLiveStreamSnapshotConfigList(List<LiveStreamSnapshotConfig> liveStreamSnapshotConfigList) {
		this.liveStreamSnapshotConfigList = liveStreamSnapshotConfigList;
	}

	public static class LiveStreamSnapshotConfig {

		private String domainName;

		private String appName;

		private Integer timeInterval;

		private String ossEndpoint;

		private String ossBucket;

		private String overwriteOssObject;

		private String sequenceOssObject;

		private String createTime;

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

		public Integer getTimeInterval() {
			return this.timeInterval;
		}

		public void setTimeInterval(Integer timeInterval) {
			this.timeInterval = timeInterval;
		}

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

		public String getOverwriteOssObject() {
			return this.overwriteOssObject;
		}

		public void setOverwriteOssObject(String overwriteOssObject) {
			this.overwriteOssObject = overwriteOssObject;
		}

		public String getSequenceOssObject() {
			return this.sequenceOssObject;
		}

		public void setSequenceOssObject(String sequenceOssObject) {
			this.sequenceOssObject = sequenceOssObject;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public DescribeLiveSnapshotConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveSnapshotConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
