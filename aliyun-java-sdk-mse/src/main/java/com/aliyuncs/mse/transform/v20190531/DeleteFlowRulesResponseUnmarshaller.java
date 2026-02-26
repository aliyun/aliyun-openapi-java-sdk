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

import com.aliyuncs.mse.model.v20190531.DeleteFlowRulesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteFlowRulesResponseUnmarshaller {

	public static DeleteFlowRulesResponse unmarshall(DeleteFlowRulesResponse deleteFlowRulesResponse, UnmarshallerContext _ctx) {
		
		deleteFlowRulesResponse.setRequestId(_ctx.stringValue("DeleteFlowRulesResponse.RequestId"));
		deleteFlowRulesResponse.setCode(_ctx.integerValue("DeleteFlowRulesResponse.Code"));
		deleteFlowRulesResponse.setMessage(_ctx.stringValue("DeleteFlowRulesResponse.Message"));
		deleteFlowRulesResponse.setSuccess(_ctx.booleanValue("DeleteFlowRulesResponse.Success"));
		deleteFlowRulesResponse.setHttpStatusCode(_ctx.integerValue("DeleteFlowRulesResponse.HttpStatusCode"));

		List<Long> data = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("DeleteFlowRulesResponse.Data.Length"); i++) {
			data.add(_ctx.longValue("DeleteFlowRulesResponse.Data["+ i +"]"));
		}
		deleteFlowRulesResponse.setData(data);
	 
	 	return deleteFlowRulesResponse;
	}
}