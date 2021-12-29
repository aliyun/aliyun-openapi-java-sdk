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

package com.aliyuncs.dcdn.model.v20180115;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DcdnHttpRequestTestToolResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DcdnHttpRequestTestToolResponse extends AcsResponse {

	private String requestId;

	private String header;

	private String body;

	private Integer statusCode;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getHeader() {
		return this.header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Integer getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	@Override
	public DcdnHttpRequestTestToolResponse getInstance(UnmarshallerContext context) {
		return	DcdnHttpRequestTestToolResponseUnmarshaller.unmarshall(this, context);
	}
}
