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

package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeDnsGtmInstanceSystemCnameResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDnsGtmInstanceSystemCnameResponse extends AcsResponse {

	private String requestId;

	private String systemCname;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSystemCname() {
		return this.systemCname;
	}

	public void setSystemCname(String systemCname) {
		this.systemCname = systemCname;
	}

	@Override
	public DescribeDnsGtmInstanceSystemCnameResponse getInstance(UnmarshallerContext context) {
		return	DescribeDnsGtmInstanceSystemCnameResponseUnmarshaller.unmarshall(this, context);
	}
}
