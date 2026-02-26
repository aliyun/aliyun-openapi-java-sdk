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

package com.aliyuncs.marketplaceintl.transform.v20221230;

import com.aliyuncs.marketplaceintl.model.v20221230.PushMeteringDataResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushMeteringDataResponseUnmarshaller {

	public static PushMeteringDataResponse unmarshall(PushMeteringDataResponse pushMeteringDataResponse, UnmarshallerContext _ctx) {
		
		pushMeteringDataResponse.setRequestId(_ctx.stringValue("PushMeteringDataResponse.RequestId"));
		pushMeteringDataResponse.setResult(_ctx.booleanValue("PushMeteringDataResponse.Result"));
		pushMeteringDataResponse.setSuccess(_ctx.booleanValue("PushMeteringDataResponse.Success"));
		pushMeteringDataResponse.setCode(_ctx.stringValue("PushMeteringDataResponse.Code"));
		pushMeteringDataResponse.setMessage(_ctx.stringValue("PushMeteringDataResponse.Message"));
		pushMeteringDataResponse.setForceFatal(_ctx.booleanValue("PushMeteringDataResponse.ForceFatal"));
		pushMeteringDataResponse.setDynamicMessage(_ctx.stringValue("PushMeteringDataResponse.DynamicMessage"));
	 
	 	return pushMeteringDataResponse;
	}
}