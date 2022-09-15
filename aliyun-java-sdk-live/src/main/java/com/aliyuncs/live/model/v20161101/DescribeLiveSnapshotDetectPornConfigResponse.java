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
import com.aliyuncs.live.transform.v20161101.DescribeLiveSnapshotDetectPornConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveSnapshotDetectPornConfigResponse extends AcsResponse {

	private Integer pageNum;

	private String requestId;

	private String order;

	private Integer totalPage;

	private Integer pageSize;

	private Integer totalNum;

	private List<LiveSnapshotDetectPornConfig> liveSnapshotDetectPornConfigList;

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

	public List<LiveSnapshotDetectPornConfig> getLiveSnapshotDetectPornConfigList() {
		return this.liveSnapshotDetectPornConfigList;
	}

	public void setLiveSnapshotDetectPornConfigList(List<LiveSnapshotDetectPornConfig> liveSnapshotDetectPornConfigList) {
		this.liveSnapshotDetectPornConfigList = liveSnapshotDetectPornConfigList;
	}

	public static class LiveSnapshotDetectPornConfig {

		private String ossObject;

		private String appName;

		private Integer interval;

		private String ossBucket;

		private String domainName;

		private String ossEndpoint;

		private List<String> scenes;

		public String getOssObject() {
			return this.ossObject;
		}

		public void setOssObject(String ossObject) {
			this.ossObject = ossObject;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public Integer getInterval() {
			return this.interval;
		}

		public void setInterval(Integer interval) {
			this.interval = interval;
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

		public String getOssEndpoint() {
			return this.ossEndpoint;
		}

		public void setOssEndpoint(String ossEndpoint) {
			this.ossEndpoint = ossEndpoint;
		}

		public List<String> getScenes() {
			return this.scenes;
		}

		public void setScenes(List<String> scenes) {
			this.scenes = scenes;
		}
	}

	@Override
	public DescribeLiveSnapshotDetectPornConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveSnapshotDetectPornConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
