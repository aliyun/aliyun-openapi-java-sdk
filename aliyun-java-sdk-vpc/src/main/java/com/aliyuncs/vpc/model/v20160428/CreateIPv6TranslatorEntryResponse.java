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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.CreateIPv6TranslatorEntryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateIPv6TranslatorEntryResponse extends AcsResponse {

	private String ipv6TranslatorEntryId;

	private String requestId;

	public String getIpv6TranslatorEntryId() {
		return this.ipv6TranslatorEntryId;
	}

	public void setIpv6TranslatorEntryId(String ipv6TranslatorEntryId) {
		this.ipv6TranslatorEntryId = ipv6TranslatorEntryId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public CreateIPv6TranslatorEntryResponse getInstance(UnmarshallerContext context) {
		return	CreateIPv6TranslatorEntryResponseUnmarshaller.unmarshall(this, context);
	}
}
