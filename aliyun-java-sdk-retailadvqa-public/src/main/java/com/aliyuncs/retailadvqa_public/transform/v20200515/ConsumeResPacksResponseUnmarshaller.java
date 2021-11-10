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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import com.aliyuncs.retailadvqa_public.model.v20200515.ConsumeResPacksResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.ConsumeResPacksResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConsumeResPacksResponseUnmarshaller {

	public static ConsumeResPacksResponse unmarshall(ConsumeResPacksResponse consumeResPacksResponse, UnmarshallerContext _ctx) {
		
		consumeResPacksResponse.setRequestId(_ctx.stringValue("ConsumeResPacksResponse.RequestId"));
		consumeResPacksResponse.setErrorCode(_ctx.stringValue("ConsumeResPacksResponse.ErrorCode"));
		consumeResPacksResponse.setSuccess(_ctx.booleanValue("ConsumeResPacksResponse.Success"));
		consumeResPacksResponse.setErrorDesc(_ctx.stringValue("ConsumeResPacksResponse.ErrorDesc"));
		consumeResPacksResponse.setTraceId(_ctx.stringValue("ConsumeResPacksResponse.TraceId"));

		Data data = new Data();
		data.setCount(_ctx.integerValue("ConsumeResPacksResponse.Data.Count"));
		consumeResPacksResponse.setData(data);
	 
	 	return consumeResPacksResponse;
	}
}