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

package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.RefreshCdnDomainConfigsCacheResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RefreshCdnDomainConfigsCacheResponse extends AcsResponse {

	private String requestId;

	private List<String> sucessDomains;

	private List<String> failedDomains;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getSucessDomains() {
		return this.sucessDomains;
	}

	public void setSucessDomains(List<String> sucessDomains) {
		this.sucessDomains = sucessDomains;
	}

	public List<String> getFailedDomains() {
		return this.failedDomains;
	}

	public void setFailedDomains(List<String> failedDomains) {
		this.failedDomains = failedDomains;
	}

	@Override
	public RefreshCdnDomainConfigsCacheResponse getInstance(UnmarshallerContext context) {
		return	RefreshCdnDomainConfigsCacheResponseUnmarshaller.unmarshall(this, context);
	}
}
