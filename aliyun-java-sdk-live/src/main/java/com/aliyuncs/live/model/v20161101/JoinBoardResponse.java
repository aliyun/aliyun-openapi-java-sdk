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

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.JoinBoardResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class JoinBoardResponse extends AcsResponse {

	private String requestId;

	private String token;

	private String boardId;

	private String topicId;

	private String keepaliveTopic;

	private Integer keepaliveInterval;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getBoardId() {
		return this.boardId;
	}

	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}

	public String getTopicId() {
		return this.topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public String getKeepaliveTopic() {
		return this.keepaliveTopic;
	}

	public void setKeepaliveTopic(String keepaliveTopic) {
		this.keepaliveTopic = keepaliveTopic;
	}

	public Integer getKeepaliveInterval() {
		return this.keepaliveInterval;
	}

	public void setKeepaliveInterval(Integer keepaliveInterval) {
		this.keepaliveInterval = keepaliveInterval;
	}

	@Override
	public JoinBoardResponse getInstance(UnmarshallerContext context) {
		return	JoinBoardResponseUnmarshaller.unmarshall(this, context);
	}
}
