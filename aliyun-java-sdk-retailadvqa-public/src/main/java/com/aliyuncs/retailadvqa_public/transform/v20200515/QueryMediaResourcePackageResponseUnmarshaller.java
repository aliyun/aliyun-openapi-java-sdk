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

import com.aliyuncs.retailadvqa_public.model.v20200515.QueryMediaResourcePackageResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.QueryMediaResourcePackageResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMediaResourcePackageResponseUnmarshaller {

	public static QueryMediaResourcePackageResponse unmarshall(QueryMediaResourcePackageResponse queryMediaResourcePackageResponse, UnmarshallerContext _ctx) {
		
		queryMediaResourcePackageResponse.setRequestId(_ctx.stringValue("QueryMediaResourcePackageResponse.RequestId"));
		queryMediaResourcePackageResponse.setErrorCode(_ctx.stringValue("QueryMediaResourcePackageResponse.ErrorCode"));
		queryMediaResourcePackageResponse.setSuccess(_ctx.stringValue("QueryMediaResourcePackageResponse.Success"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("QueryMediaResourcePackageResponse.Data.CurrentPage"));
		data.setSlrGrantedFlag(_ctx.booleanValue("QueryMediaResourcePackageResponse.Data.SlrGrantedFlag"));
		data.setEffectiveInstanceFlag(_ctx.booleanValue("QueryMediaResourcePackageResponse.Data.EffectiveInstanceFlag"));
		data.setPageSize(_ctx.integerValue("QueryMediaResourcePackageResponse.Data.PageSize"));
		data.setBagsInfo(_ctx.stringValue("QueryMediaResourcePackageResponse.Data.BagsInfo"));
		data.setTotalCount(_ctx.integerValue("QueryMediaResourcePackageResponse.Data.TotalCount"));
		data.setPageCount(_ctx.integerValue("QueryMediaResourcePackageResponse.Data.PageCount"));
		queryMediaResourcePackageResponse.setData(data);
	 
	 	return queryMediaResourcePackageResponse;
	}
}