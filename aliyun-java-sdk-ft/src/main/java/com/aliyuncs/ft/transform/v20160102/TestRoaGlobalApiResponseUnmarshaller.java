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

package com.aliyuncs.ft.transform.v20160102;

import com.aliyuncs.ft.model.v20160102.TestRoaGlobalApiResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TestRoaGlobalApiResponseUnmarshaller {

	public static TestRoaGlobalApiResponse unmarshall(TestRoaGlobalApiResponse testRoaGlobalApiResponse, UnmarshallerContext _ctx) {
		
		testRoaGlobalApiResponse.setHeaders(_ctx.stringValue("TestRoaGlobalApiResponse.Headers"));
		testRoaGlobalApiResponse.setBody(_ctx.stringValue("TestRoaGlobalApiResponse.Body"));
		testRoaGlobalApiResponse.setParams(_ctx.stringValue("TestRoaGlobalApiResponse.Params"));
		testRoaGlobalApiResponse.setRemoteAddr(_ctx.stringValue("TestRoaGlobalApiResponse.RemoteAddr"));
		testRoaGlobalApiResponse.setQueryString(_ctx.stringValue("TestRoaGlobalApiResponse.QueryString"));
		testRoaGlobalApiResponse.setRequestURL(_ctx.stringValue("TestRoaGlobalApiResponse.RequestURL"));
	 
	 	return testRoaGlobalApiResponse;
	}
}