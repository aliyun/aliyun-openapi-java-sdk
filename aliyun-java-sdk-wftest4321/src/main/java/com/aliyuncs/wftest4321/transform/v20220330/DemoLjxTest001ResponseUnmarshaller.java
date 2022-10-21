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

package com.aliyuncs.wftest4321.transform.v20220330;

import com.aliyuncs.wftest4321.model.v20220330.DemoLjxTest001Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class DemoLjxTest001ResponseUnmarshaller {

	public static DemoLjxTest001Response unmarshall(DemoLjxTest001Response demoLjxTest001Response, UnmarshallerContext _ctx) {
		
		demoLjxTest001Response.setRequestId(_ctx.stringValue("DemoLjxTest001Response.requestId"));
		demoLjxTest001Response.setCode(_ctx.stringValue("DemoLjxTest001Response.Code"));
	 
	 	return demoLjxTest001Response;
	}
}