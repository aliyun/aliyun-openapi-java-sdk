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

package com.aliyuncs.unimkt.transform.v20181212;

import com.aliyuncs.unimkt.model.v20181212.ReduceAmountResponse;
import com.aliyuncs.unimkt.model.v20181212.ReduceAmountResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReduceAmountResponseUnmarshaller {

	public static ReduceAmountResponse unmarshall(ReduceAmountResponse reduceAmountResponse, UnmarshallerContext _ctx) {
		
		reduceAmountResponse.setRequestId(_ctx.stringValue("ReduceAmountResponse.RequestId"));
		reduceAmountResponse.setSuccess(_ctx.booleanValue("ReduceAmountResponse.Success"));
		reduceAmountResponse.setErrorCode(_ctx.integerValue("ReduceAmountResponse.ErrorCode"));
		reduceAmountResponse.setErrorMsg(_ctx.stringValue("ReduceAmountResponse.ErrorMsg"));

		Data data = new Data();
		data.setChargeDetail(_ctx.stringValue("ReduceAmountResponse.Data.ChargeDetail"));
		data.setTaskId(_ctx.longValue("ReduceAmountResponse.Data.TaskId"));
		data.setPrice(_ctx.longValue("ReduceAmountResponse.Data.Price"));
		reduceAmountResponse.setData(data);
	 
	 	return reduceAmountResponse;
	}
}