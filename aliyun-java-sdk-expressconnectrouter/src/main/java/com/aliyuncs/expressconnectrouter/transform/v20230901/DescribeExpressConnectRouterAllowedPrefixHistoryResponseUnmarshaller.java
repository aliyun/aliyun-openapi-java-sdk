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

package com.aliyuncs.expressconnectrouter.transform.v20230901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.expressconnectrouter.model.v20230901.DescribeExpressConnectRouterAllowedPrefixHistoryResponse;
import com.aliyuncs.expressconnectrouter.model.v20230901.DescribeExpressConnectRouterAllowedPrefixHistoryResponse.AllowedPrefixHistoryListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExpressConnectRouterAllowedPrefixHistoryResponseUnmarshaller {

	public static DescribeExpressConnectRouterAllowedPrefixHistoryResponse unmarshall(DescribeExpressConnectRouterAllowedPrefixHistoryResponse describeExpressConnectRouterAllowedPrefixHistoryResponse, UnmarshallerContext _ctx) {
		
		describeExpressConnectRouterAllowedPrefixHistoryResponse.setRequestId(_ctx.stringValue("DescribeExpressConnectRouterAllowedPrefixHistoryResponse.RequestId"));
		describeExpressConnectRouterAllowedPrefixHistoryResponse.setSuccess(_ctx.booleanValue("DescribeExpressConnectRouterAllowedPrefixHistoryResponse.Success"));
		describeExpressConnectRouterAllowedPrefixHistoryResponse.setCode(_ctx.stringValue("DescribeExpressConnectRouterAllowedPrefixHistoryResponse.Code"));
		describeExpressConnectRouterAllowedPrefixHistoryResponse.setMessage(_ctx.stringValue("DescribeExpressConnectRouterAllowedPrefixHistoryResponse.Message"));
		describeExpressConnectRouterAllowedPrefixHistoryResponse.setHttpStatusCode(_ctx.integerValue("DescribeExpressConnectRouterAllowedPrefixHistoryResponse.HttpStatusCode"));
		describeExpressConnectRouterAllowedPrefixHistoryResponse.setDynamicCode(_ctx.stringValue("DescribeExpressConnectRouterAllowedPrefixHistoryResponse.DynamicCode"));
		describeExpressConnectRouterAllowedPrefixHistoryResponse.setDynamicMessage(_ctx.stringValue("DescribeExpressConnectRouterAllowedPrefixHistoryResponse.DynamicMessage"));
		describeExpressConnectRouterAllowedPrefixHistoryResponse.setAccessDeniedDetail(_ctx.stringValue("DescribeExpressConnectRouterAllowedPrefixHistoryResponse.AccessDeniedDetail"));

		List<AllowedPrefixHistoryListItem> allowedPrefixHistoryList = new ArrayList<AllowedPrefixHistoryListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExpressConnectRouterAllowedPrefixHistoryResponse.AllowedPrefixHistoryList.Length"); i++) {
			AllowedPrefixHistoryListItem allowedPrefixHistoryListItem = new AllowedPrefixHistoryListItem();
			allowedPrefixHistoryListItem.setGmtCreate(_ctx.stringValue("DescribeExpressConnectRouterAllowedPrefixHistoryResponse.AllowedPrefixHistoryList["+ i +"].GmtCreate"));

			List<String> allowedPrefix = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeExpressConnectRouterAllowedPrefixHistoryResponse.AllowedPrefixHistoryList["+ i +"].AllowedPrefix.Length"); j++) {
				allowedPrefix.add(_ctx.stringValue("DescribeExpressConnectRouterAllowedPrefixHistoryResponse.AllowedPrefixHistoryList["+ i +"].AllowedPrefix["+ j +"]"));
			}
			allowedPrefixHistoryListItem.setAllowedPrefix(allowedPrefix);

			allowedPrefixHistoryList.add(allowedPrefixHistoryListItem);
		}
		describeExpressConnectRouterAllowedPrefixHistoryResponse.setAllowedPrefixHistoryList(allowedPrefixHistoryList);
	 
	 	return describeExpressConnectRouterAllowedPrefixHistoryResponse;
	}
}