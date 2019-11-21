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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeGroupedTagsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGroupedTagsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer count;

	private Integer httpStatusCode;

	private List<GroupedFiled> groupedFileds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<GroupedFiled> getGroupedFileds() {
		return this.groupedFileds;
	}

	public void setGroupedFileds(List<GroupedFiled> groupedFileds) {
		this.groupedFileds = groupedFileds;
	}

	public static class GroupedFiled {

		private String name;

		private Integer tagId;

		private String count;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getTagId() {
			return this.tagId;
		}

		public void setTagId(Integer tagId) {
			this.tagId = tagId;
		}

		public String getCount() {
			return this.count;
		}

		public void setCount(String count) {
			this.count = count;
		}
	}

	@Override
	public DescribeGroupedTagsResponse getInstance(UnmarshallerContext context) {
		return	DescribeGroupedTagsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
