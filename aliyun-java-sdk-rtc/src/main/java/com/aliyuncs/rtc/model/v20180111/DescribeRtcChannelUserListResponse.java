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
import com.aliyuncs.rtc.transform.v20180111.DescribeRtcChannelUserListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRtcChannelUserListResponse extends AcsResponse {

	private String requestId;

	private Long pageSize;

	private Long pageNo;

	private Long totalCnt;

	private List<UserListItem> userList;

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

	public List<UserListItem> getUserList() {
		return this.userList;
	}

	public void setUserList(List<UserListItem> userList) {
		this.userList = userList;
	}

	public static class UserListItem {

		private String channelId;

		private String userId;

		private String startTime;

		private String endTime;

		private String serviceArea;

		private Integer subAudio;

		private Integer pubAudio;

		private Integer subVideo360;

		private Integer pubVideo360;

		private Integer subVideo720;

		private Integer pubVideo720;

		private Integer subVideo1080;

		private Integer pubVideo1080;

		private Integer subContent;

		private Integer pubContent;

		public String getChannelId() {
			return this.channelId;
		}

		public void setChannelId(String channelId) {
			this.channelId = channelId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
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

		public String getServiceArea() {
			return this.serviceArea;
		}

		public void setServiceArea(String serviceArea) {
			this.serviceArea = serviceArea;
		}

		public Integer getSubAudio() {
			return this.subAudio;
		}

		public void setSubAudio(Integer subAudio) {
			this.subAudio = subAudio;
		}

		public Integer getPubAudio() {
			return this.pubAudio;
		}

		public void setPubAudio(Integer pubAudio) {
			this.pubAudio = pubAudio;
		}

		public Integer getSubVideo360() {
			return this.subVideo360;
		}

		public void setSubVideo360(Integer subVideo360) {
			this.subVideo360 = subVideo360;
		}

		public Integer getPubVideo360() {
			return this.pubVideo360;
		}

		public void setPubVideo360(Integer pubVideo360) {
			this.pubVideo360 = pubVideo360;
		}

		public Integer getSubVideo720() {
			return this.subVideo720;
		}

		public void setSubVideo720(Integer subVideo720) {
			this.subVideo720 = subVideo720;
		}

		public Integer getPubVideo720() {
			return this.pubVideo720;
		}

		public void setPubVideo720(Integer pubVideo720) {
			this.pubVideo720 = pubVideo720;
		}

		public Integer getSubVideo1080() {
			return this.subVideo1080;
		}

		public void setSubVideo1080(Integer subVideo1080) {
			this.subVideo1080 = subVideo1080;
		}

		public Integer getPubVideo1080() {
			return this.pubVideo1080;
		}

		public void setPubVideo1080(Integer pubVideo1080) {
			this.pubVideo1080 = pubVideo1080;
		}

		public Integer getSubContent() {
			return this.subContent;
		}

		public void setSubContent(Integer subContent) {
			this.subContent = subContent;
		}

		public Integer getPubContent() {
			return this.pubContent;
		}

		public void setPubContent(Integer pubContent) {
			this.pubContent = pubContent;
		}
	}

	@Override
	public DescribeRtcChannelUserListResponse getInstance(UnmarshallerContext context) {
		return	DescribeRtcChannelUserListResponseUnmarshaller.unmarshall(this, context);
	}
}
