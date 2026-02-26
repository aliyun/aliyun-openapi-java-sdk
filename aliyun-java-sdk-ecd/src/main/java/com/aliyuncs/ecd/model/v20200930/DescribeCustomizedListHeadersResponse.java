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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeCustomizedListHeadersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCustomizedListHeadersResponse extends AcsResponse {

	private String requestId;

	private List<Header> headers;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Header> getHeaders() {
		return this.headers;
	}

	public void setHeaders(List<Header> headers) {
		this.headers = headers;
	}

	public static class Header {

		private String displayType;

		private String headerKey;

		private String headerName;

		public String getDisplayType() {
			return this.displayType;
		}

		public void setDisplayType(String displayType) {
			this.displayType = displayType;
		}

		public String getHeaderKey() {
			return this.headerKey;
		}

		public void setHeaderKey(String headerKey) {
			this.headerKey = headerKey;
		}

		public String getHeaderName() {
			return this.headerName;
		}

		public void setHeaderName(String headerName) {
			this.headerName = headerName;
		}
	}

	@Override
	public DescribeCustomizedListHeadersResponse getInstance(UnmarshallerContext context) {
		return	DescribeCustomizedListHeadersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
