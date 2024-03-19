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

import com.aliyuncs.expressconnectrouter.model.v20230901.DescribeDisabledExpressConnectRouterRouteEntriesResponse;
import com.aliyuncs.expressconnectrouter.model.v20230901.DescribeDisabledExpressConnectRouterRouteEntriesResponse.DisabledRouteEntryListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDisabledExpressConnectRouterRouteEntriesResponseUnmarshaller {

	public static DescribeDisabledExpressConnectRouterRouteEntriesResponse unmarshall(DescribeDisabledExpressConnectRouterRouteEntriesResponse describeDisabledExpressConnectRouterRouteEntriesResponse, UnmarshallerContext _ctx) {
		
		describeDisabledExpressConnectRouterRouteEntriesResponse.setRequestId(_ctx.stringValue("DescribeDisabledExpressConnectRouterRouteEntriesResponse.RequestId"));
		describeDisabledExpressConnectRouterRouteEntriesResponse.setSuccess(_ctx.booleanValue("DescribeDisabledExpressConnectRouterRouteEntriesResponse.Success"));
		describeDisabledExpressConnectRouterRouteEntriesResponse.setCode(_ctx.stringValue("DescribeDisabledExpressConnectRouterRouteEntriesResponse.Code"));
		describeDisabledExpressConnectRouterRouteEntriesResponse.setMessage(_ctx.stringValue("DescribeDisabledExpressConnectRouterRouteEntriesResponse.Message"));
		describeDisabledExpressConnectRouterRouteEntriesResponse.setHttpStatusCode(_ctx.integerValue("DescribeDisabledExpressConnectRouterRouteEntriesResponse.HttpStatusCode"));
		describeDisabledExpressConnectRouterRouteEntriesResponse.setDynamicCode(_ctx.stringValue("DescribeDisabledExpressConnectRouterRouteEntriesResponse.DynamicCode"));
		describeDisabledExpressConnectRouterRouteEntriesResponse.setDynamicMessage(_ctx.stringValue("DescribeDisabledExpressConnectRouterRouteEntriesResponse.DynamicMessage"));
		describeDisabledExpressConnectRouterRouteEntriesResponse.setAccessDeniedDetail(_ctx.stringValue("DescribeDisabledExpressConnectRouterRouteEntriesResponse.AccessDeniedDetail"));
		describeDisabledExpressConnectRouterRouteEntriesResponse.setTotalCount(_ctx.integerValue("DescribeDisabledExpressConnectRouterRouteEntriesResponse.TotalCount"));
		describeDisabledExpressConnectRouterRouteEntriesResponse.setMaxResults(_ctx.integerValue("DescribeDisabledExpressConnectRouterRouteEntriesResponse.MaxResults"));
		describeDisabledExpressConnectRouterRouteEntriesResponse.setNextToken(_ctx.stringValue("DescribeDisabledExpressConnectRouterRouteEntriesResponse.NextToken"));

		List<DisabledRouteEntryListItem> disabledRouteEntryList = new ArrayList<DisabledRouteEntryListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDisabledExpressConnectRouterRouteEntriesResponse.DisabledRouteEntryList.Length"); i++) {
			DisabledRouteEntryListItem disabledRouteEntryListItem = new DisabledRouteEntryListItem();
			disabledRouteEntryListItem.setEcrId(_ctx.stringValue("DescribeDisabledExpressConnectRouterRouteEntriesResponse.DisabledRouteEntryList["+ i +"].EcrId"));
			disabledRouteEntryListItem.setDestinationCidrBlock(_ctx.stringValue("DescribeDisabledExpressConnectRouterRouteEntriesResponse.DisabledRouteEntryList["+ i +"].DestinationCidrBlock"));
			disabledRouteEntryListItem.setNexthopInstanceId(_ctx.stringValue("DescribeDisabledExpressConnectRouterRouteEntriesResponse.DisabledRouteEntryList["+ i +"].NexthopInstanceId"));
			disabledRouteEntryListItem.setNexthopInstanceRegionId(_ctx.stringValue("DescribeDisabledExpressConnectRouterRouteEntriesResponse.DisabledRouteEntryList["+ i +"].NexthopInstanceRegionId"));
			disabledRouteEntryListItem.setGmtCreate(_ctx.stringValue("DescribeDisabledExpressConnectRouterRouteEntriesResponse.DisabledRouteEntryList["+ i +"].GmtCreate"));

			disabledRouteEntryList.add(disabledRouteEntryListItem);
		}
		describeDisabledExpressConnectRouterRouteEntriesResponse.setDisabledRouteEntryList(disabledRouteEntryList);
	 
	 	return describeDisabledExpressConnectRouterRouteEntriesResponse;
	}
}