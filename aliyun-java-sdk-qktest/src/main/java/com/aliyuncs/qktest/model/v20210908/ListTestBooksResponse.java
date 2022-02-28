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

package com.aliyuncs.qktest.model.v20210908;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qktest.transform.v20210908.ListTestBooksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTestBooksResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer nextToken;

	private List<TestBook> testBooks;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(Integer nextToken) {
		this.nextToken = nextToken;
	}

	public List<TestBook> getTestBooks() {
		return this.testBooks;
	}

	public void setTestBooks(List<TestBook> testBooks) {
		this.testBooks = testBooks;
	}

	public static class TestBook {

		private String resourceGroupId;

		private String createTime;

		private String testBookId;

		private String testBookName;

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getTestBookId() {
			return this.testBookId;
		}

		public void setTestBookId(String testBookId) {
			this.testBookId = testBookId;
		}

		public String getTestBookName() {
			return this.testBookName;
		}

		public void setTestBookName(String testBookName) {
			this.testBookName = testBookName;
		}
	}

	@Override
	public ListTestBooksResponse getInstance(UnmarshallerContext context) {
		return	ListTestBooksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
