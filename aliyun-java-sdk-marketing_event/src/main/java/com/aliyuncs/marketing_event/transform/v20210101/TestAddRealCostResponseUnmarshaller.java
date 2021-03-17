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

package com.aliyuncs.marketing_event.transform.v20210101;

import com.aliyuncs.marketing_event.model.v20210101.TestAddRealCostResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TestAddRealCostResponseUnmarshaller {

	public static TestAddRealCostResponse unmarshall(TestAddRealCostResponse testAddRealCostResponse, UnmarshallerContext _ctx) {
		
		testAddRealCostResponse.setRequestId(_ctx.stringValue("TestAddRealCostResponse.RequestId"));
		testAddRealCostResponse.setCode(_ctx.stringValue("TestAddRealCostResponse.Code"));
		testAddRealCostResponse.setSuccess(_ctx.booleanValue("TestAddRealCostResponse.Success"));
		testAddRealCostResponse.setMessage(_ctx.stringValue("TestAddRealCostResponse.Message"));
	 
	 	return testAddRealCostResponse;
	}
}