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
import com.aliyuncs.live.transform.v20161101.DescribeBoardsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBoardsResponse extends AcsResponse {

	private String requestId;

	private List<Event> boards;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Event> getBoards() {
		return this.boards;
	}

	public void setBoards(List<Event> boards) {
		this.boards = boards;
	}

	public static class Event {

		private String boardId;

		private String topic;

		private Integer state;

		private String userId;

		public String getBoardId() {
			return this.boardId;
		}

		public void setBoardId(String boardId) {
			this.boardId = boardId;
		}

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public Integer getState() {
			return this.state;
		}

		public void setState(Integer state) {
			this.state = state;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}
	}

	@Override
	public DescribeBoardsResponse getInstance(UnmarshallerContext context) {
		return	DescribeBoardsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
