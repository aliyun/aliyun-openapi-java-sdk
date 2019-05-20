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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.GetConsumedAmountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetConsumedAmountResponseUnmarshaller {

	public static GetConsumedAmountResponse unmarshall(GetConsumedAmountResponse getConsumedAmountResponse, UnmarshallerContext context) {
		
		getConsumedAmountResponse.setRequestId(context.stringValue("GetConsumedAmountResponse.RequestId"));
		getConsumedAmountResponse.setSuccess(context.booleanValue("GetConsumedAmountResponse.Success"));
		getConsumedAmountResponse.setCode(context.stringValue("GetConsumedAmountResponse.Code"));
		getConsumedAmountResponse.setMessage(context.stringValue("GetConsumedAmountResponse.Message"));
		getConsumedAmountResponse.setHttpStatusCode(context.integerValue("GetConsumedAmountResponse.HttpStatusCode"));
		getConsumedAmountResponse.setOutcomingAmount(context.longValue("GetConsumedAmountResponse.outcomingAmount"));
		getConsumedAmountResponse.setOutcomingCount(context.integerValue("GetConsumedAmountResponse.outcomingCount"));
		getConsumedAmountResponse.setIncomingAmount(context.longValue("GetConsumedAmountResponse.incomingAmount"));
		getConsumedAmountResponse.setIncomingCount(context.integerValue("GetConsumedAmountResponse.incomingCount"));
	 
	 	return getConsumedAmountResponse;
	}
}