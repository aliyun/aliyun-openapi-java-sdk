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

package com.aliyuncs.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeCanExpandInstanceDetailListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCanExpandInstanceDetailListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<ItemData> data;

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

	public List<ItemData> getData() {
		return this.data;
	}

	public void setData(List<ItemData> data) {
		this.data = data;
	}

	public static class ItemData {

		private String srcInstance;

		private List<String> dbList;

		public String getSrcInstance() {
			return this.srcInstance;
		}

		public void setSrcInstance(String srcInstance) {
			this.srcInstance = srcInstance;
		}

		public List<String> getDbList() {
			return this.dbList;
		}

		public void setDbList(List<String> dbList) {
			this.dbList = dbList;
		}
	}

	@Override
	public DescribeCanExpandInstanceDetailListResponse getInstance(UnmarshallerContext context) {
		return	DescribeCanExpandInstanceDetailListResponseUnmarshaller.unmarshall(this, context);
	}
}
