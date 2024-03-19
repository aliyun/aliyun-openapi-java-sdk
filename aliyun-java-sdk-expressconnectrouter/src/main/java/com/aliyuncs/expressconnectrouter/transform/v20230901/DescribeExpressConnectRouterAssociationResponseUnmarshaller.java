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

import com.aliyuncs.expressconnectrouter.model.v20230901.DescribeExpressConnectRouterAssociationResponse;
import com.aliyuncs.expressconnectrouter.model.v20230901.DescribeExpressConnectRouterAssociationResponse.AssociationListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExpressConnectRouterAssociationResponseUnmarshaller {

	public static DescribeExpressConnectRouterAssociationResponse unmarshall(DescribeExpressConnectRouterAssociationResponse describeExpressConnectRouterAssociationResponse, UnmarshallerContext _ctx) {
		
		describeExpressConnectRouterAssociationResponse.setRequestId(_ctx.stringValue("DescribeExpressConnectRouterAssociationResponse.RequestId"));
		describeExpressConnectRouterAssociationResponse.setSuccess(_ctx.booleanValue("DescribeExpressConnectRouterAssociationResponse.Success"));
		describeExpressConnectRouterAssociationResponse.setCode(_ctx.stringValue("DescribeExpressConnectRouterAssociationResponse.Code"));
		describeExpressConnectRouterAssociationResponse.setMessage(_ctx.stringValue("DescribeExpressConnectRouterAssociationResponse.Message"));
		describeExpressConnectRouterAssociationResponse.setHttpStatusCode(_ctx.integerValue("DescribeExpressConnectRouterAssociationResponse.HttpStatusCode"));
		describeExpressConnectRouterAssociationResponse.setDynamicCode(_ctx.stringValue("DescribeExpressConnectRouterAssociationResponse.DynamicCode"));
		describeExpressConnectRouterAssociationResponse.setDynamicMessage(_ctx.stringValue("DescribeExpressConnectRouterAssociationResponse.DynamicMessage"));
		describeExpressConnectRouterAssociationResponse.setAccessDeniedDetail(_ctx.stringValue("DescribeExpressConnectRouterAssociationResponse.AccessDeniedDetail"));
		describeExpressConnectRouterAssociationResponse.setTotalCount(_ctx.integerValue("DescribeExpressConnectRouterAssociationResponse.TotalCount"));
		describeExpressConnectRouterAssociationResponse.setMaxResults(_ctx.integerValue("DescribeExpressConnectRouterAssociationResponse.MaxResults"));
		describeExpressConnectRouterAssociationResponse.setNextToken(_ctx.stringValue("DescribeExpressConnectRouterAssociationResponse.NextToken"));

		List<AssociationListItem> associationList = new ArrayList<AssociationListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExpressConnectRouterAssociationResponse.AssociationList.Length"); i++) {
			AssociationListItem associationListItem = new AssociationListItem();
			associationListItem.setAssociationId(_ctx.stringValue("DescribeExpressConnectRouterAssociationResponse.AssociationList["+ i +"].AssociationId"));
			associationListItem.setRegionId(_ctx.stringValue("DescribeExpressConnectRouterAssociationResponse.AssociationList["+ i +"].RegionId"));
			associationListItem.setOwnerId(_ctx.longValue("DescribeExpressConnectRouterAssociationResponse.AssociationList["+ i +"].OwnerId"));
			associationListItem.setGmtCreate(_ctx.stringValue("DescribeExpressConnectRouterAssociationResponse.AssociationList["+ i +"].GmtCreate"));
			associationListItem.setGmtModified(_ctx.stringValue("DescribeExpressConnectRouterAssociationResponse.AssociationList["+ i +"].GmtModified"));
			associationListItem.setStatus(_ctx.stringValue("DescribeExpressConnectRouterAssociationResponse.AssociationList["+ i +"].Status"));
			associationListItem.setAssociationNodeType(_ctx.stringValue("DescribeExpressConnectRouterAssociationResponse.AssociationList["+ i +"].AssociationNodeType"));
			associationListItem.setTransitRouterOwnerId(_ctx.longValue("DescribeExpressConnectRouterAssociationResponse.AssociationList["+ i +"].TransitRouterOwnerId"));
			associationListItem.setTransitRouterId(_ctx.stringValue("DescribeExpressConnectRouterAssociationResponse.AssociationList["+ i +"].TransitRouterId"));
			associationListItem.setCenId(_ctx.stringValue("DescribeExpressConnectRouterAssociationResponse.AssociationList["+ i +"].CenId"));
			associationListItem.setVpcOwnerId(_ctx.longValue("DescribeExpressConnectRouterAssociationResponse.AssociationList["+ i +"].VpcOwnerId"));
			associationListItem.setVpcId(_ctx.stringValue("DescribeExpressConnectRouterAssociationResponse.AssociationList["+ i +"].VpcId"));
			associationListItem.setEcrId(_ctx.stringValue("DescribeExpressConnectRouterAssociationResponse.AssociationList["+ i +"].EcrId"));

			List<String> allowedPrefixes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeExpressConnectRouterAssociationResponse.AssociationList["+ i +"].AllowedPrefixes.Length"); j++) {
				allowedPrefixes.add(_ctx.stringValue("DescribeExpressConnectRouterAssociationResponse.AssociationList["+ i +"].AllowedPrefixes["+ j +"]"));
			}
			associationListItem.setAllowedPrefixes(allowedPrefixes);

			associationList.add(associationListItem);
		}
		describeExpressConnectRouterAssociationResponse.setAssociationList(associationList);
	 
	 	return describeExpressConnectRouterAssociationResponse;
	}
}