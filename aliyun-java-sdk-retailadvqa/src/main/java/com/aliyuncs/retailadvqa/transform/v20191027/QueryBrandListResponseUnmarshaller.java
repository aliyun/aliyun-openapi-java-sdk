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

package com.aliyuncs.retailadvqa.transform.v20191027;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailadvqa.model.v20191027.QueryBrandListResponse;
import com.aliyuncs.retailadvqa.model.v20191027.QueryBrandListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBrandListResponseUnmarshaller {

	public static QueryBrandListResponse unmarshall(QueryBrandListResponse queryBrandListResponse, UnmarshallerContext _ctx) {
		
		queryBrandListResponse.setRequestId(_ctx.stringValue("QueryBrandListResponse.RequestId"));
		queryBrandListResponse.setErrorCode(_ctx.stringValue("QueryBrandListResponse.ErrorCode"));
		queryBrandListResponse.setSuccess(_ctx.booleanValue("QueryBrandListResponse.Success"));
		queryBrandListResponse.setErrorDesc(_ctx.stringValue("QueryBrandListResponse.ErrorDesc"));
		queryBrandListResponse.setTraceId(_ctx.stringValue("QueryBrandListResponse.TraceId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryBrandListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setBrandName(_ctx.stringValue("QueryBrandListResponse.Data["+ i +"].BrandName"));
			dataItem.setSmartName(_ctx.stringValue("QueryBrandListResponse.Data["+ i +"].SmartName"));

			data.add(dataItem);
		}
		queryBrandListResponse.setData(data);
	 
	 	return queryBrandListResponse;
	}
}