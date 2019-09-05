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

package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.CreateIntranetDomainResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateIntranetDomainResponse extends AcsResponse {

	private String requestId;

	private String domainName;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	@Override
	public CreateIntranetDomainResponse getInstance(UnmarshallerContext context) {
		return	CreateIntranetDomainResponseUnmarshaller.unmarshall(this, context);
	}
}
