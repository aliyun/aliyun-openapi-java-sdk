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

package com.aliyuncs.domain.model.v20180208;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20180208.GetReserveDomainUrlResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetReserveDomainUrlResponse extends AcsResponse {

	private String requestId;

	private String url;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBizUrl() {
		return this.url;
	}

	public void setBizUrl(String url) {
		this.url = url;
	}

	/**
	 * @deprecated use getBizUrl instead of this.
	 */
	@Deprecated
	public String getUrl() {
		return this.url;
	}

	/**
	 * @deprecated use setBizUrl instead of this.
	 */
	@Deprecated
	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public GetReserveDomainUrlResponse getInstance(UnmarshallerContext context) {
		return	GetReserveDomainUrlResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
