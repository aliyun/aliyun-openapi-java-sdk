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

package com.aliyuncs.dyvms.transform.v20170620;

import com.aliyuncs.dyvms.model.v20170620.TestRobotv2DialogResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TestRobotv2DialogResponseUnmarshaller {

	public static TestRobotv2DialogResponse unmarshall(TestRobotv2DialogResponse testRobotv2DialogResponse, UnmarshallerContext _ctx) {
		
		testRobotv2DialogResponse.setRequestId(_ctx.stringValue("TestRobotv2DialogResponse.RequestId"));
		testRobotv2DialogResponse.setCode(_ctx.stringValue("TestRobotv2DialogResponse.code"));
		testRobotv2DialogResponse.setData(_ctx.stringValue("TestRobotv2DialogResponse.data"));
	 
	 	return testRobotv2DialogResponse;
	}
}