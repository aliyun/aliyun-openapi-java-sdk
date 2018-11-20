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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20170823.DescribeKeywordLibResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeKeywordLibResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<KeywordLib> keywordLibList;

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

	public List<KeywordLib> getKeywordLibList() {
		return this.keywordLibList;
	}

	public void setKeywordLibList(List<KeywordLib> keywordLibList) {
		this.keywordLibList = keywordLibList;
	}

	public static class KeywordLib {

		private Integer id;

		private String modifiedTime;

		private String name;

		private String code;

		private Integer count;

		private String category;

		private String resourceType;

		private String libType;

		private String source;

		private String serviceModule;

		private List<String> bizTypes;

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getLibType() {
			return this.libType;
		}

		public void setLibType(String libType) {
			this.libType = libType;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getServiceModule() {
			return this.serviceModule;
		}

		public void setServiceModule(String serviceModule) {
			this.serviceModule = serviceModule;
		}

		public List<String> getBizTypes() {
			return this.bizTypes;
		}

		public void setBizTypes(List<String> bizTypes) {
			this.bizTypes = bizTypes;
		}
	}

	@Override
	public DescribeKeywordLibResponse getInstance(UnmarshallerContext context) {
		return	DescribeKeywordLibResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
