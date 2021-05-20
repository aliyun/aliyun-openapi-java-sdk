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

package com.aliyuncs.green.model.v20170823;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20170823.DescribeAuditCallbackListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAuditCallbackListResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<Callback> callbackList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Callback> getCallbackList() {
		return this.callbackList;
	}

	public void setCallbackList(List<Callback> callbackList) {
		this.callbackList = callbackList;
	}

	public static class Callback {

		private Long id;

		private String name;

		private String url;

		private String seed;

		private String cryptType;

		private String createTime;

		private String modifiedTime;

		private List<String> callbackTypes;

		private List<String> callbackSuggestions;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getSeed() {
			return this.seed;
		}

		public void setSeed(String seed) {
			this.seed = seed;
		}

		public String getCryptType() {
			return this.cryptType;
		}

		public void setCryptType(String cryptType) {
			this.cryptType = cryptType;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public List<String> getCallbackTypes() {
			return this.callbackTypes;
		}

		public void setCallbackTypes(List<String> callbackTypes) {
			this.callbackTypes = callbackTypes;
		}

		public List<String> getCallbackSuggestions() {
			return this.callbackSuggestions;
		}

		public void setCallbackSuggestions(List<String> callbackSuggestions) {
			this.callbackSuggestions = callbackSuggestions;
		}
	}

	@Override
	public DescribeAuditCallbackListResponse getInstance(UnmarshallerContext context) {
		return	DescribeAuditCallbackListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
