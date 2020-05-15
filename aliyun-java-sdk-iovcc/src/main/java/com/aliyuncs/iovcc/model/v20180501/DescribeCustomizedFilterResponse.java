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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.DescribeCustomizedFilterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCustomizedFilterResponse extends AcsResponse {

	private String requestId;

	private CustomizedFilter customizedFilter;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public CustomizedFilter getCustomizedFilter() {
		return this.customizedFilter;
	}

	public void setCustomizedFilter(CustomizedFilter customizedFilter) {
		this.customizedFilter = customizedFilter;
	}

	public static class CustomizedFilter {

		private Long id;

		private String versionType;

		private Long versionId;

		private String name;

		private String value;

		private String valueCompareType;

		private String blackWhiteType;

		private String gmtCreate;

		private String gmtModify;

		private String valueType;

		private Long gmtCreateTimestamp;

		private Long gmtModifyTimestamp;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getVersionType() {
			return this.versionType;
		}

		public void setVersionType(String versionType) {
			this.versionType = versionType;
		}

		public Long getVersionId() {
			return this.versionId;
		}

		public void setVersionId(Long versionId) {
			this.versionId = versionId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getValueCompareType() {
			return this.valueCompareType;
		}

		public void setValueCompareType(String valueCompareType) {
			this.valueCompareType = valueCompareType;
		}

		public String getBlackWhiteType() {
			return this.blackWhiteType;
		}

		public void setBlackWhiteType(String blackWhiteType) {
			this.blackWhiteType = blackWhiteType;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModify() {
			return this.gmtModify;
		}

		public void setGmtModify(String gmtModify) {
			this.gmtModify = gmtModify;
		}

		public String getValueType() {
			return this.valueType;
		}

		public void setValueType(String valueType) {
			this.valueType = valueType;
		}

		public Long getGmtCreateTimestamp() {
			return this.gmtCreateTimestamp;
		}

		public void setGmtCreateTimestamp(Long gmtCreateTimestamp) {
			this.gmtCreateTimestamp = gmtCreateTimestamp;
		}

		public Long getGmtModifyTimestamp() {
			return this.gmtModifyTimestamp;
		}

		public void setGmtModifyTimestamp(Long gmtModifyTimestamp) {
			this.gmtModifyTimestamp = gmtModifyTimestamp;
		}
	}

	@Override
	public DescribeCustomizedFilterResponse getInstance(UnmarshallerContext context) {
		return	DescribeCustomizedFilterResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
