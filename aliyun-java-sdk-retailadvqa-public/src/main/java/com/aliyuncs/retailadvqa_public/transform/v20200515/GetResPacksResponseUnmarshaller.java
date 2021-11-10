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

import com.aliyuncs.retailadvqa_public.model.v20200515.GetResPacksResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.GetResPacksResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResPacksResponseUnmarshaller {

	public static GetResPacksResponse unmarshall(GetResPacksResponse getResPacksResponse, UnmarshallerContext _ctx) {
		
		getResPacksResponse.setRequestId(_ctx.stringValue("GetResPacksResponse.RequestId"));
		getResPacksResponse.setErrorCode(_ctx.stringValue("GetResPacksResponse.ErrorCode"));
		getResPacksResponse.setSuccess(_ctx.booleanValue("GetResPacksResponse.Success"));
		getResPacksResponse.setErrorDesc(_ctx.stringValue("GetResPacksResponse.ErrorDesc"));
		getResPacksResponse.setTraceId(_ctx.stringValue("GetResPacksResponse.TraceId"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("GetResPacksResponse.Data.CurrentPage"));
		data.setSlrGrantedFlag(_ctx.booleanValue("GetResPacksResponse.Data.SlrGrantedFlag"));
		data.setEffectiveInstanceFlag(_ctx.booleanValue("GetResPacksResponse.Data.EffectiveInstanceFlag"));
		data.setPageSize(_ctx.integerValue("GetResPacksResponse.Data.PageSize"));
		data.setBagsInfo(_ctx.stringValue("GetResPacksResponse.Data.BagsInfo"));
		data.setTotalCount(_ctx.integerValue("GetResPacksResponse.Data.TotalCount"));
		data.setPageCount(_ctx.integerValue("GetResPacksResponse.Data.PageCount"));
		getResPacksResponse.setData(data);
	 
	 	return getResPacksResponse;
	}
}