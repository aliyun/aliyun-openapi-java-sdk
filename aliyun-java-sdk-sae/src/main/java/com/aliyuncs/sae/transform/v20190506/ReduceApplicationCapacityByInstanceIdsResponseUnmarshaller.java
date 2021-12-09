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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.ReduceApplicationCapacityByInstanceIdsResponse;
import com.aliyuncs.sae.model.v20190506.ReduceApplicationCapacityByInstanceIdsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReduceApplicationCapacityByInstanceIdsResponseUnmarshaller {

	public static ReduceApplicationCapacityByInstanceIdsResponse unmarshall(ReduceApplicationCapacityByInstanceIdsResponse reduceApplicationCapacityByInstanceIdsResponse, UnmarshallerContext _ctx) {
		
		reduceApplicationCapacityByInstanceIdsResponse.setRequestId(_ctx.stringValue("ReduceApplicationCapacityByInstanceIdsResponse.RequestId"));
		reduceApplicationCapacityByInstanceIdsResponse.setMessage(_ctx.stringValue("ReduceApplicationCapacityByInstanceIdsResponse.Message"));
		reduceApplicationCapacityByInstanceIdsResponse.setTraceId(_ctx.stringValue("ReduceApplicationCapacityByInstanceIdsResponse.TraceId"));
		reduceApplicationCapacityByInstanceIdsResponse.setErrorCode(_ctx.stringValue("ReduceApplicationCapacityByInstanceIdsResponse.ErrorCode"));
		reduceApplicationCapacityByInstanceIdsResponse.setCode(_ctx.stringValue("ReduceApplicationCapacityByInstanceIdsResponse.Code"));
		reduceApplicationCapacityByInstanceIdsResponse.setSuccess(_ctx.booleanValue("ReduceApplicationCapacityByInstanceIdsResponse.Success"));

		Data data = new Data();
		data.setChangeOrderId(_ctx.stringValue("ReduceApplicationCapacityByInstanceIdsResponse.Data.ChangeOrderId"));
		reduceApplicationCapacityByInstanceIdsResponse.setData(data);
	 
	 	return reduceApplicationCapacityByInstanceIdsResponse;
	}
}