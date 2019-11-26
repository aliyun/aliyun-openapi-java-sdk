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

package com.aliyuncs.dyvms.transform.v20170620;

import com.aliyuncs.dyvms.model.v20170620.QueryVmsPackageOrderListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryVmsPackageOrderListResponseUnmarshaller {

	public static QueryVmsPackageOrderListResponse unmarshall(QueryVmsPackageOrderListResponse queryVmsPackageOrderListResponse, UnmarshallerContext _ctx) {
		
		queryVmsPackageOrderListResponse.setRequestId(_ctx.stringValue("QueryVmsPackageOrderListResponse.RequestId"));
		queryVmsPackageOrderListResponse.setCode(_ctx.stringValue("QueryVmsPackageOrderListResponse.code"));
		queryVmsPackageOrderListResponse.setData(_ctx.stringValue("QueryVmsPackageOrderListResponse.data"));
	 
	 	return queryVmsPackageOrderListResponse;
	}
}