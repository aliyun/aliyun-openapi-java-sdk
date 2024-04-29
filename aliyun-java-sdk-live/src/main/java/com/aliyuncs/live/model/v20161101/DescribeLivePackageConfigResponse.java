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
import com.aliyuncs.live.transform.v20161101.DescribeLivePackageConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLivePackageConfigResponse extends AcsResponse {

	private String order;

	private Integer pageNum;

	private Integer pageSize;

	private String requestId;

	private Integer totalNum;

	private Integer totalPage;

	private List<LivePackageConfig> livePackageConfigList;

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public List<LivePackageConfig> getLivePackageConfigList() {
		return this.livePackageConfigList;
	}

	public void setLivePackageConfigList(List<LivePackageConfig> livePackageConfigList) {
		this.livePackageConfigList = livePackageConfigList;
	}

	public static class LivePackageConfig {

		private String appName;

		private String domainName;

		private Boolean ignoreTranscode;

		private Integer partDuration;

		private String protocol;

		private Integer segmentDuration;

		private Integer segmentNum;

		private String streamName;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public Boolean getIgnoreTranscode() {
			return this.ignoreTranscode;
		}

		public void setIgnoreTranscode(Boolean ignoreTranscode) {
			this.ignoreTranscode = ignoreTranscode;
		}

		public Integer getPartDuration() {
			return this.partDuration;
		}

		public void setPartDuration(Integer partDuration) {
			this.partDuration = partDuration;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public Integer getSegmentDuration() {
			return this.segmentDuration;
		}

		public void setSegmentDuration(Integer segmentDuration) {
			this.segmentDuration = segmentDuration;
		}

		public Integer getSegmentNum() {
			return this.segmentNum;
		}

		public void setSegmentNum(Integer segmentNum) {
			this.segmentNum = segmentNum;
		}

		public String getStreamName() {
			return this.streamName;
		}

		public void setStreamName(String streamName) {
			this.streamName = streamName;
		}
	}

	@Override
	public DescribeLivePackageConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeLivePackageConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
