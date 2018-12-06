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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeRoomListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRoomListResponse extends AcsResponse {

	private String requestId;

	private Integer totalNum;

	private Integer totalPage;

	private List<Room> roomList;

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

	public List<Room> getRoomList() {
		return this.roomList;
	}

	public void setRoomList(List<Room> roomList) {
		this.roomList = roomList;
	}

	public static class Room {

		private String roomId;

		private String anchorId;

		private Integer roomStatus;

		private String forbidStream;

		private String createTime;

		public String getRoomId() {
			return this.roomId;
		}

		public void setRoomId(String roomId) {
			this.roomId = roomId;
		}

		public String getAnchorId() {
			return this.anchorId;
		}

		public void setAnchorId(String anchorId) {
			this.anchorId = anchorId;
		}

		public Integer getRoomStatus() {
			return this.roomStatus;
		}

		public void setRoomStatus(Integer roomStatus) {
			this.roomStatus = roomStatus;
		}

		public String getForbidStream() {
			return this.forbidStream;
		}

		public void setForbidStream(String forbidStream) {
			this.forbidStream = forbidStream;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public DescribeRoomListResponse getInstance(UnmarshallerContext context) {
		return	DescribeRoomListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
