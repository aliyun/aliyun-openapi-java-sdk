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

package com.aliyuncs.ft.model.v20180713;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ft.transform.v20180713.TestHttpApiResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TestHttpApiResponse extends AcsResponse {

	private String params;

	private String serviceRpcSign;

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getServiceRpcSign() {
		return this.serviceRpcSign;
	}

	public void setServiceRpcSign(String serviceRpcSign) {
		this.serviceRpcSign = serviceRpcSign;
	}

	@Override
	public TestHttpApiResponse getInstance(UnmarshallerContext context) {
		return	TestHttpApiResponseUnmarshaller.unmarshall(this, context);
	}
}
