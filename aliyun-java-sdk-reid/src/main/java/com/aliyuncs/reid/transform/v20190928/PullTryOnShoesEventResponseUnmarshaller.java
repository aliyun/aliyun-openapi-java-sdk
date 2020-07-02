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

import com.aliyuncs.reid.model.v20190928.PullTryOnShoesEventResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PullTryOnShoesEventResponseUnmarshaller {

	public static PullTryOnShoesEventResponse unmarshall(PullTryOnShoesEventResponse pullTryOnShoesEventResponse, UnmarshallerContext _ctx) {
		
		pullTryOnShoesEventResponse.setRequestId(_ctx.stringValue("PullTryOnShoesEventResponse.RequestId"));
		pullTryOnShoesEventResponse.setStoreId(_ctx.longValue("PullTryOnShoesEventResponse.StoreId"));
		pullTryOnShoesEventResponse.setSuccess(_ctx.booleanValue("PullTryOnShoesEventResponse.Success"));
		pullTryOnShoesEventResponse.setStartTs(_ctx.longValue("PullTryOnShoesEventResponse.StartTs"));
		pullTryOnShoesEventResponse.setDynamicMessage(_ctx.stringValue("PullTryOnShoesEventResponse.DynamicMessage"));
		pullTryOnShoesEventResponse.setErrorCode(_ctx.stringValue("PullTryOnShoesEventResponse.ErrorCode"));
		pullTryOnShoesEventResponse.setErrorMessage(_ctx.stringValue("PullTryOnShoesEventResponse.ErrorMessage"));
		pullTryOnShoesEventResponse.setTryOnShoesEventCount(_ctx.integerValue("PullTryOnShoesEventResponse.TryOnShoesEventCount"));
		pullTryOnShoesEventResponse.setPageNumber(_ctx.integerValue("PullTryOnShoesEventResponse.PageNumber"));
		pullTryOnShoesEventResponse.setMessage(_ctx.stringValue("PullTryOnShoesEventResponse.Message"));
		pullTryOnShoesEventResponse.setCode(_ctx.stringValue("PullTryOnShoesEventResponse.Code"));
		pullTryOnShoesEventResponse.setTotalCount(_ctx.longValue("PullTryOnShoesEventResponse.TotalCount"));
		pullTryOnShoesEventResponse.setDynamicCode(_ctx.stringValue("PullTryOnShoesEventResponse.DynamicCode"));
		pullTryOnShoesEventResponse.setSkuId(_ctx.stringValue("PullTryOnShoesEventResponse.SkuId"));
		pullTryOnShoesEventResponse.setPageSize(_ctx.integerValue("PullTryOnShoesEventResponse.PageSize"));
	 
	 	return pullTryOnShoesEventResponse;
	}
}