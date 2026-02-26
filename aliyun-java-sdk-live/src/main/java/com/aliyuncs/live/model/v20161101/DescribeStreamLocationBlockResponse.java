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
import com.aliyuncs.live.transform.v20161101.DescribeStreamLocationBlockResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStreamLocationBlockResponse extends AcsResponse {

	private Integer count;

	private Integer pageNum;

	private Integer pageSize;

	private String requestId;

	private Integer totalPage;

	private List<StreamBlock> streamBlockList;

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
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

	public Integer getTotalPage() {
		return this.totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public List<StreamBlock> getStreamBlockList() {
		return this.streamBlockList;
	}

	public void setStreamBlockList(List<StreamBlock> streamBlockList) {
		this.streamBlockList = streamBlockList;
	}

	public static class StreamBlock {

		private String appName;

		private String blockType;

		private String domainName;

		private String locationList;

		private String releaseTime;

		private Integer status;

		private String streamName;

		private String updateTime;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getBlockType() {
			return this.blockType;
		}

		public void setBlockType(String blockType) {
			this.blockType = blockType;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getLocationList() {
			return this.locationList;
		}

		public void setLocationList(String locationList) {
			this.locationList = locationList;
		}

		public String getReleaseTime() {
			return this.releaseTime;
		}

		public void setReleaseTime(String releaseTime) {
			this.releaseTime = releaseTime;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getStreamName() {
			return this.streamName;
		}

		public void setStreamName(String streamName) {
			this.streamName = streamName;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}
	}

	@Override
	public DescribeStreamLocationBlockResponse getInstance(UnmarshallerContext context) {
		return	DescribeStreamLocationBlockResponseUnmarshaller.unmarshall(this, context);
	}
}
