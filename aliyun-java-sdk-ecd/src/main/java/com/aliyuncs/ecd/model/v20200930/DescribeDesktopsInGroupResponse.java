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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeDesktopsInGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDesktopsInGroupResponse extends AcsResponse {

	private String requestId;

	private Integer paidDesktopsCount;

	private Integer postPaidDesktopsCount;

	private Integer postPaidDesktopsTotalAmount;

	private String nextToken;

	private List<PaidDesktop> paidDesktops;

	private List<PostPaidDesktop> postPaidDesktops;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPaidDesktopsCount() {
		return this.paidDesktopsCount;
	}

	public void setPaidDesktopsCount(Integer paidDesktopsCount) {
		this.paidDesktopsCount = paidDesktopsCount;
	}

	public Integer getPostPaidDesktopsCount() {
		return this.postPaidDesktopsCount;
	}

	public void setPostPaidDesktopsCount(Integer postPaidDesktopsCount) {
		this.postPaidDesktopsCount = postPaidDesktopsCount;
	}

	public Integer getPostPaidDesktopsTotalAmount() {
		return this.postPaidDesktopsTotalAmount;
	}

	public void setPostPaidDesktopsTotalAmount(Integer postPaidDesktopsTotalAmount) {
		this.postPaidDesktopsTotalAmount = postPaidDesktopsTotalAmount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<PaidDesktop> getPaidDesktops() {
		return this.paidDesktops;
	}

	public void setPaidDesktops(List<PaidDesktop> paidDesktops) {
		this.paidDesktops = paidDesktops;
	}

	public List<PostPaidDesktop> getPostPaidDesktops() {
		return this.postPaidDesktops;
	}

	public void setPostPaidDesktops(List<PostPaidDesktop> postPaidDesktops) {
		this.postPaidDesktops = postPaidDesktops;
	}

	public static class PaidDesktop {

		private String desktopId;

		private String desktopName;

		private String desktopStatus;

		private String connectionStatus;

		private String endUserId;

		private String endUserName;

		public String getDesktopId() {
			return this.desktopId;
		}

		public void setDesktopId(String desktopId) {
			this.desktopId = desktopId;
		}

		public String getDesktopName() {
			return this.desktopName;
		}

		public void setDesktopName(String desktopName) {
			this.desktopName = desktopName;
		}

		public String getDesktopStatus() {
			return this.desktopStatus;
		}

		public void setDesktopStatus(String desktopStatus) {
			this.desktopStatus = desktopStatus;
		}

		public String getConnectionStatus() {
			return this.connectionStatus;
		}

		public void setConnectionStatus(String connectionStatus) {
			this.connectionStatus = connectionStatus;
		}

		public String getEndUserId() {
			return this.endUserId;
		}

		public void setEndUserId(String endUserId) {
			this.endUserId = endUserId;
		}

		public String getEndUserName() {
			return this.endUserName;
		}

		public void setEndUserName(String endUserName) {
			this.endUserName = endUserName;
		}
	}

	public static class PostPaidDesktop {

		private String desktopId;

		private String desktopName;

		private String desktopStatus;

		private String connectionStatus;

		private String endUserId;

		private String endUserName;

		private String createTime;

		private String releaseTime;

		private String createDuration;

		public String getDesktopId() {
			return this.desktopId;
		}

		public void setDesktopId(String desktopId) {
			this.desktopId = desktopId;
		}

		public String getDesktopName() {
			return this.desktopName;
		}

		public void setDesktopName(String desktopName) {
			this.desktopName = desktopName;
		}

		public String getDesktopStatus() {
			return this.desktopStatus;
		}

		public void setDesktopStatus(String desktopStatus) {
			this.desktopStatus = desktopStatus;
		}

		public String getConnectionStatus() {
			return this.connectionStatus;
		}

		public void setConnectionStatus(String connectionStatus) {
			this.connectionStatus = connectionStatus;
		}

		public String getEndUserId() {
			return this.endUserId;
		}

		public void setEndUserId(String endUserId) {
			this.endUserId = endUserId;
		}

		public String getEndUserName() {
			return this.endUserName;
		}

		public void setEndUserName(String endUserName) {
			this.endUserName = endUserName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getReleaseTime() {
			return this.releaseTime;
		}

		public void setReleaseTime(String releaseTime) {
			this.releaseTime = releaseTime;
		}

		public String getCreateDuration() {
			return this.createDuration;
		}

		public void setCreateDuration(String createDuration) {
			this.createDuration = createDuration;
		}
	}

	@Override
	public DescribeDesktopsInGroupResponse getInstance(UnmarshallerContext context) {
		return	DescribeDesktopsInGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
