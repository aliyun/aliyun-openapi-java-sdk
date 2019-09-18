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

package com.aliyuncs.rtc.model.v20180111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rtc.transform.v20180111.DescribeRtcChannelListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRtcChannelListResponse extends AcsResponse {

	private String requestId;

	private Long pageSize;

	private Long pageNo;

	private Long totalCnt;

	private List<ChannelListItem> channelList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getTotalCnt() {
		return this.totalCnt;
	}

	public void setTotalCnt(Long totalCnt) {
		this.totalCnt = totalCnt;
	}

	public List<ChannelListItem> getChannelList() {
		return this.channelList;
	}

	public void setChannelList(List<ChannelListItem> channelList) {
		this.channelList = channelList;
	}

	public static class ChannelListItem {

		private String channelId;

		private String startTime;

		private String endTime;

		private Long totalUserCnt;

		private List<String> callArea;

		public String getChannelId() {
			return this.channelId;
		}

		public void setChannelId(String channelId) {
			this.channelId = channelId;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public Long getTotalUserCnt() {
			return this.totalUserCnt;
		}

		public void setTotalUserCnt(Long totalUserCnt) {
			this.totalUserCnt = totalUserCnt;
		}

		public List<String> getCallArea() {
			return this.callArea;
		}

		public void setCallArea(List<String> callArea) {
			this.callArea = callArea;
		}
	}

	@Override
	public DescribeRtcChannelListResponse getInstance(UnmarshallerContext context) {
		return	DescribeRtcChannelListResponseUnmarshaller.unmarshall(this, context);
	}
}
