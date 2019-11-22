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

package com.aliyuncs.vs.model.v20181212;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vs.transform.v20181212.CreateStreamSnapshotResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateStreamSnapshotResponse extends AcsResponse {

	private String requestId;

	private String id;

	private String url;

	private String ossBucket;

	private String ossObject;

	private String ossEndpoint;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getOssBucket() {
		return this.ossBucket;
	}

	public void setOssBucket(String ossBucket) {
		this.ossBucket = ossBucket;
	}

	public String getOssObject() {
		return this.ossObject;
	}

	public void setOssObject(String ossObject) {
		this.ossObject = ossObject;
	}

	public String getOssEndpoint() {
		return this.ossEndpoint;
	}

	public void setOssEndpoint(String ossEndpoint) {
		this.ossEndpoint = ossEndpoint;
	}

	@Override
	public CreateStreamSnapshotResponse getInstance(UnmarshallerContext context) {
		return	CreateStreamSnapshotResponseUnmarshaller.unmarshall(this, context);
	}
}
