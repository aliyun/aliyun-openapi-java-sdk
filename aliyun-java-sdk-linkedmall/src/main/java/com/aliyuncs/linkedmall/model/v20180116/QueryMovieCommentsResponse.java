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

package com.aliyuncs.linkedmall.model.v20180116;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.QueryMovieCommentsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMovieCommentsResponse extends AcsResponse {

	private String requestId;

	private String logsId;

	private String subCode;

	private String subMessage;

	private String code;

	private Boolean success;

	private String message;

	private Long count;

	private List<Comment> commentList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLogsId() {
		return this.logsId;
	}

	public void setLogsId(String logsId) {
		this.logsId = logsId;
	}

	public String getSubCode() {
		return this.subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubMessage() {
		return this.subMessage;
	}

	public void setSubMessage(String subMessage) {
		this.subMessage = subMessage;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getCount() {
		return this.count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public List<Comment> getCommentList() {
		return this.commentList;
	}

	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}

	public static class Comment {

		private String commentTime;

		private String content;

		private Long favorCount;

		private Long id;

		private String nickName;

		private Long remark;

		private Long movieId;

		private String subject;

		public String getCommentTime() {
			return this.commentTime;
		}

		public void setCommentTime(String commentTime) {
			this.commentTime = commentTime;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public Long getFavorCount() {
			return this.favorCount;
		}

		public void setFavorCount(Long favorCount) {
			this.favorCount = favorCount;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNickName() {
			return this.nickName;
		}

		public void setNickName(String nickName) {
			this.nickName = nickName;
		}

		public Long getRemark() {
			return this.remark;
		}

		public void setRemark(Long remark) {
			this.remark = remark;
		}

		public Long getMovieId() {
			return this.movieId;
		}

		public void setMovieId(Long movieId) {
			this.movieId = movieId;
		}

		public String getSubject() {
			return this.subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}
	}

	@Override
	public QueryMovieCommentsResponse getInstance(UnmarshallerContext context) {
		return	QueryMovieCommentsResponseUnmarshaller.unmarshall(this, context);
	}
}
