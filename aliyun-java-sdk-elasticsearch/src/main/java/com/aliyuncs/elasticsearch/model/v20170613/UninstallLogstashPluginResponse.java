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

package com.aliyuncs.elasticsearch.model.v20170613;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.elasticsearch.transform.v20170613.UninstallLogstashPluginResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UninstallLogstashPluginResponse extends AcsResponse {

	private String requestId;

	private Map<Object,Object> headers;

	private List<String> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Map<Object,Object> getHeaders() {
		return this.headers;
	}

	public void setHeaders(Map<Object,Object> headers) {
		this.headers = headers;
	}

	public List<String> getResult() {
		return this.result;
	}

	public void setResult(List<String> result) {
		this.result = result;
	}

	@Override
	public UninstallLogstashPluginResponse getInstance(UnmarshallerContext context) {
		return	UninstallLogstashPluginResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
