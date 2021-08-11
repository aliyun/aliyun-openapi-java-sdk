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

package com.aliyuncs.mpaas.transform.v20200710;

import com.aliyuncs.mpaas.model.v20200710.TestProxyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TestProxyResponseUnmarshaller {

	public static TestProxyResponse unmarshall(TestProxyResponse testProxyResponse, UnmarshallerContext _ctx) {
		
		testProxyResponse.setRequestId(_ctx.stringValue("TestProxyResponse.RequestId"));
		testProxyResponse.setResultCode(_ctx.stringValue("TestProxyResponse.ResultCode"));
		testProxyResponse.setResultMessage(_ctx.stringValue("TestProxyResponse.ResultMessage"));
		testProxyResponse.setContent(_ctx.stringValue("TestProxyResponse.Content"));
	 
	 	return testProxyResponse;
	}
}