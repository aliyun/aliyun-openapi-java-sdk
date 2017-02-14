/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.green.model.v20161216;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20161216.PluginAntispamResultsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PluginAntispamResultsResponse extends AcsResponse {

	private String code;

	private String msg;

	private Integer totalCount;

	private Integer pageIndex;

	private String pageSize;

	private List<AntispamResult> antispamResults;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public List<AntispamResult> getAntispamResults() {
		return this.antispamResults;
	}

	public void setAntispamResults(List<AntispamResult> antispamResults) {
		this.antispamResults = antispamResults;
	}

	public static class AntispamResult {

		private String id;

		private String userId;

		private String topicId;

		private String title;

		private String feedId;

		private String content;

		private String contentType;

		private Boolean isIllegal;

		private String illegalReason;

		private String bizSence;

		private String dynamicProp;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getTopicId() {
			return this.topicId;
		}

		public void setTopicId(String topicId) {
			this.topicId = topicId;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getFeedId() {
			return this.feedId;
		}

		public void setFeedId(String feedId) {
			this.feedId = feedId;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getContentType() {
			return this.contentType;
		}

		public void setContentType(String contentType) {
			this.contentType = contentType;
		}

		public Boolean getIsIllegal() {
			return this.isIllegal;
		}

		public void setIsIllegal(Boolean isIllegal) {
			this.isIllegal = isIllegal;
		}

		public String getIllegalReason() {
			return this.illegalReason;
		}

		public void setIllegalReason(String illegalReason) {
			this.illegalReason = illegalReason;
		}

		public String getBizSence() {
			return this.bizSence;
		}

		public void setBizSence(String bizSence) {
			this.bizSence = bizSence;
		}

		public String getDynamicProp() {
			return this.dynamicProp;
		}

		public void setDynamicProp(String dynamicProp) {
			this.dynamicProp = dynamicProp;
		}
	}

	@Override
	public PluginAntispamResultsResponse getInstance(UnmarshallerContext context) {
		return	PluginAntispamResultsResponseUnmarshaller.unmarshall(this, context);
	}
}
