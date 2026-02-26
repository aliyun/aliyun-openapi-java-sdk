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
import com.aliyuncs.live.transform.v20161101.DescribeLiveSnapshotConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveSnapshotConfigResponse extends AcsResponse {

	private Integer pageNum;

	private String requestId;

	private String order;

	private Integer totalPage;

	private Integer pageSize;

	private Integer totalNum;

	private List<LiveStreamSnapshotConfig> liveStreamSnapshotConfigList;

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public Integer getTotalPage() {
		return this.totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public List<LiveStreamSnapshotConfig> getLiveStreamSnapshotConfigList() {
		return this.liveStreamSnapshotConfigList;
	}

	public void setLiveStreamSnapshotConfigList(List<LiveStreamSnapshotConfig> liveStreamSnapshotConfigList) {
		this.liveStreamSnapshotConfigList = liveStreamSnapshotConfigList;
	}

	public static class LiveStreamSnapshotConfig {

		private String overwriteOssObject;

		private Integer timeInterval;

		private String appName;

		private String createTime;

		private String ossBucket;

		private String domainName;

		private String callback;

		private String sequenceOssObject;

		private String ossEndpoint;

		public String getOverwriteOssObject() {
			return this.overwriteOssObject;
		}

		public void setOverwriteOssObject(String overwriteOssObject) {
			this.overwriteOssObject = overwriteOssObject;
		}

		public Integer getTimeInterval() {
			return this.timeInterval;
		}

		public void setTimeInterval(Integer timeInterval) {
			this.timeInterval = timeInterval;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getOssBucket() {
			return this.ossBucket;
		}

		public void setOssBucket(String ossBucket) {
			this.ossBucket = ossBucket;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getCallback() {
			return this.callback;
		}

		public void setCallback(String callback) {
			this.callback = callback;
		}

		public String getSequenceOssObject() {
			return this.sequenceOssObject;
		}

		public void setSequenceOssObject(String sequenceOssObject) {
			this.sequenceOssObject = sequenceOssObject;
		}

		public String getOssEndpoint() {
			return this.ossEndpoint;
		}

		public void setOssEndpoint(String ossEndpoint) {
			this.ossEndpoint = ossEndpoint;
		}
	}

	@Override
	public DescribeLiveSnapshotConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveSnapshotConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
