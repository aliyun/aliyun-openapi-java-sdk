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

package com.aliyuncs.cdn.model.v20141111;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.ListDomainsByLogConfigIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDomainsByLogConfigIdResponse extends AcsResponse {

	private String requestId;

	private List<String> domains;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getDomains() {
		return this.domains;
	}

	public void setDomains(List<String> domains) {
		this.domains = domains;
	}

	@Override
	public ListDomainsByLogConfigIdResponse getInstance(UnmarshallerContext context) {
		return	ListDomainsByLogConfigIdResponseUnmarshaller.unmarshall(this, context);
	}
}
