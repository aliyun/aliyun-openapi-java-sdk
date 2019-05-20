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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.PublishVnInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PublishVnInstanceResponse extends AcsResponse {

	private String requestId;

	private String status;

	private String version;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBizVersion() {
		return this.version;
	}

	public void setBizVersion(String version) {
		this.version = version;
	}

	/**
	 * @deprecated use getBizVersion instead of this.
	 */
	@Deprecated
	public String getVersion() {
		return this.version;
	}

	/**
	 * @deprecated use setBizVersion instead of this.
	 */
	@Deprecated
	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public PublishVnInstanceResponse getInstance(UnmarshallerContext context) {
		return	PublishVnInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
