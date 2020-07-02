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

package com.aliyuncs.reid.transform.v20190928;

import com.aliyuncs.reid.model.v20190928.PullTakeShoesEventResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PullTakeShoesEventResponseUnmarshaller {

	public static PullTakeShoesEventResponse unmarshall(PullTakeShoesEventResponse pullTakeShoesEventResponse, UnmarshallerContext _ctx) {
		
		pullTakeShoesEventResponse.setRequestId(_ctx.stringValue("PullTakeShoesEventResponse.RequestId"));
		pullTakeShoesEventResponse.setStartTime(_ctx.longValue("PullTakeShoesEventResponse.StartTime"));
		pullTakeShoesEventResponse.setErrorCode(_ctx.stringValue("PullTakeShoesEventResponse.ErrorCode"));
		pullTakeShoesEventResponse.setErrorMessage(_ctx.stringValue("PullTakeShoesEventResponse.ErrorMessage"));
		pullTakeShoesEventResponse.setStoreId(_ctx.longValue("PullTakeShoesEventResponse.StoreId"));
		pullTakeShoesEventResponse.setSkuId(_ctx.stringValue("PullTakeShoesEventResponse.SkuId"));
		pullTakeShoesEventResponse.setTakeShoesEventCount(_ctx.integerValue("PullTakeShoesEventResponse.TakeShoesEventCount"));
		pullTakeShoesEventResponse.setMessage(_ctx.stringValue("PullTakeShoesEventResponse.Message"));
		pullTakeShoesEventResponse.setCode(_ctx.stringValue("PullTakeShoesEventResponse.Code"));
		pullTakeShoesEventResponse.setDynamicCode(_ctx.stringValue("PullTakeShoesEventResponse.DynamicCode"));
		pullTakeShoesEventResponse.setSuccess(_ctx.booleanValue("PullTakeShoesEventResponse.Success"));
		pullTakeShoesEventResponse.setDynamicMessage(_ctx.stringValue("PullTakeShoesEventResponse.DynamicMessage"));
	 
	 	return pullTakeShoesEventResponse;
	}
}