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

package com.aliyuncs.ft.model.v20210101;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ft.transform.v20210101.RpcDataUploadResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RpcDataUploadResponse extends AcsResponse {

	private String requestId;

	private String url;

	private Long totalBytes;

	private Long totalTime;

	private String speed;

	private Map<Object,Object> params;

	private Map<Object,Object> headers;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Long getTotalBytes() {
		return this.totalBytes;
	}

	public void setTotalBytes(Long totalBytes) {
		this.totalBytes = totalBytes;
	}

	public Long getTotalTime() {
		return this.totalTime;
	}

	public void setTotalTime(Long totalTime) {
		this.totalTime = totalTime;
	}

	public String getSpeed() {
		return this.speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public Map<Object,Object> getParams() {
		return this.params;
	}

	public void setParams(Map<Object,Object> params) {
		this.params = params;
	}

	public Map<Object,Object> getHeaders() {
		return this.headers;
	}

	public void setHeaders(Map<Object,Object> headers) {
		this.headers = headers;
	}

	@Override
	public RpcDataUploadResponse getInstance(UnmarshallerContext context) {
		return	RpcDataUploadResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
