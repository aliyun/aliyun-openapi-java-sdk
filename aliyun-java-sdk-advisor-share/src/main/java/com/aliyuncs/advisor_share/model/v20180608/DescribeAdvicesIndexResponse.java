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

package com.aliyuncs.advisor_share.model.v20180608;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.advisor_share.transform.v20180608.DescribeAdvicesIndexResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAdvicesIndexResponse extends AcsResponse {

	private String productStatus;

	private String requestId;

	private List<DataItem> data;

	public String getProductStatus() {
		return this.productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String code;

		private Boolean hasMore;

		private Integer size;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public Boolean getHasMore() {
			return this.hasMore;
		}

		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
			this.size = size;
		}
	}

	@Override
	public DescribeAdvicesIndexResponse getInstance(UnmarshallerContext context) {
		return	DescribeAdvicesIndexResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
