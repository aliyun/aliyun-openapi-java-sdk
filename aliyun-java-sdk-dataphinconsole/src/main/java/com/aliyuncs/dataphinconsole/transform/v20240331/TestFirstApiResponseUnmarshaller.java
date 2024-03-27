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

package com.aliyuncs.dataphinconsole.transform.v20240331;

import com.aliyuncs.dataphinconsole.model.v20240331.TestFirstApiResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TestFirstApiResponseUnmarshaller {

	public static TestFirstApiResponse unmarshall(TestFirstApiResponse testFirstApiResponse, UnmarshallerContext _ctx) {
		
		testFirstApiResponse.setRequestId(_ctx.stringValue("TestFirstApiResponse.RequestId"));
		testFirstApiResponse.setCode(_ctx.stringValue("TestFirstApiResponse.Code"));
		testFirstApiResponse.setMessage(_ctx.stringValue("TestFirstApiResponse.Message"));
		testFirstApiResponse.setData(_ctx.stringValue("TestFirstApiResponse.Data"));
		testFirstApiResponse.setSuccess(_ctx.booleanValue("TestFirstApiResponse.Success"));
		testFirstApiResponse.setHttpStatusCode(_ctx.integerValue("TestFirstApiResponse.HttpStatusCode"));
	 
	 	return testFirstApiResponse;
	}
}