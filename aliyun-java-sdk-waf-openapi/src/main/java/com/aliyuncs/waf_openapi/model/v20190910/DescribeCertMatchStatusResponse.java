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

package com.aliyuncs.waf_openapi.model.v20190910;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.waf_openapi.transform.v20190910.DescribeCertMatchStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCertMatchStatusResponse extends AcsResponse {

	private String requestId;

	private Boolean matchStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getMatchStatus() {
		return this.matchStatus;
	}

	public void setMatchStatus(Boolean matchStatus) {
		this.matchStatus = matchStatus;
	}

	@Override
	public DescribeCertMatchStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeCertMatchStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
