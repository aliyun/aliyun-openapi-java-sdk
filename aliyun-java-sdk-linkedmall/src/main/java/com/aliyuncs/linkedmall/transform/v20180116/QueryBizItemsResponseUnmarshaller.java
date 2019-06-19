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

package com.aliyuncs.linkedmall.transform.v20180116;

import com.aliyuncs.linkedmall.model.v20180116.QueryBizItemsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBizItemsResponseUnmarshaller {

	public static QueryBizItemsResponse unmarshall(QueryBizItemsResponse queryBizItemsResponse, UnmarshallerContext context) {
		
		queryBizItemsResponse.setRequestId(context.stringValue("QueryBizItemsResponse.RequestId"));
		queryBizItemsResponse.setCode(context.stringValue("QueryBizItemsResponse.Code"));
		queryBizItemsResponse.setMessage(context.stringValue("QueryBizItemsResponse.Message"));
		queryBizItemsResponse.setTotalCount(context.integerValue("QueryBizItemsResponse.TotalCount"));
		queryBizItemsResponse.setPageNumber(context.integerValue("QueryBizItemsResponse.PageNumber"));
		queryBizItemsResponse.setPageSize(context.integerValue("QueryBizItemsResponse.PageSize"));
		queryBizItemsResponse.setModel(context.stringValue("QueryBizItemsResponse.Model"));
	 
	 	return queryBizItemsResponse;
	}
}