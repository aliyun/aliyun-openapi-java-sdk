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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.DeleteCircuitBreakerRulesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteCircuitBreakerRulesResponseUnmarshaller {

	public static DeleteCircuitBreakerRulesResponse unmarshall(DeleteCircuitBreakerRulesResponse deleteCircuitBreakerRulesResponse, UnmarshallerContext _ctx) {
		
		deleteCircuitBreakerRulesResponse.setRequestId(_ctx.stringValue("DeleteCircuitBreakerRulesResponse.RequestId"));
		deleteCircuitBreakerRulesResponse.setCode(_ctx.integerValue("DeleteCircuitBreakerRulesResponse.Code"));
		deleteCircuitBreakerRulesResponse.setMessage(_ctx.stringValue("DeleteCircuitBreakerRulesResponse.Message"));
		deleteCircuitBreakerRulesResponse.setSuccess(_ctx.booleanValue("DeleteCircuitBreakerRulesResponse.Success"));
		deleteCircuitBreakerRulesResponse.setHttpStatusCode(_ctx.integerValue("DeleteCircuitBreakerRulesResponse.HttpStatusCode"));

		List<Long> data = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("DeleteCircuitBreakerRulesResponse.Data.Length"); i++) {
			data.add(_ctx.longValue("DeleteCircuitBreakerRulesResponse.Data["+ i +"]"));
		}
		deleteCircuitBreakerRulesResponse.setData(data);
	 
	 	return deleteCircuitBreakerRulesResponse;
	}
}