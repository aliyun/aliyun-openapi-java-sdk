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

import com.aliyuncs.expressconnectrouter.model.v20230901.DescribeInstanceGrantedToExpressConnectRouterResponse;
import com.aliyuncs.expressconnectrouter.model.v20230901.DescribeInstanceGrantedToExpressConnectRouterResponse.EcrGrantedInstanceListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceGrantedToExpressConnectRouterResponseUnmarshaller {

	public static DescribeInstanceGrantedToExpressConnectRouterResponse unmarshall(DescribeInstanceGrantedToExpressConnectRouterResponse describeInstanceGrantedToExpressConnectRouterResponse, UnmarshallerContext _ctx) {
		
		describeInstanceGrantedToExpressConnectRouterResponse.setRequestId(_ctx.stringValue("DescribeInstanceGrantedToExpressConnectRouterResponse.RequestId"));
		describeInstanceGrantedToExpressConnectRouterResponse.setSuccess(_ctx.booleanValue("DescribeInstanceGrantedToExpressConnectRouterResponse.Success"));
		describeInstanceGrantedToExpressConnectRouterResponse.setCode(_ctx.stringValue("DescribeInstanceGrantedToExpressConnectRouterResponse.Code"));
		describeInstanceGrantedToExpressConnectRouterResponse.setMessage(_ctx.stringValue("DescribeInstanceGrantedToExpressConnectRouterResponse.Message"));
		describeInstanceGrantedToExpressConnectRouterResponse.setHttpStatusCode(_ctx.integerValue("DescribeInstanceGrantedToExpressConnectRouterResponse.HttpStatusCode"));
		describeInstanceGrantedToExpressConnectRouterResponse.setDynamicCode(_ctx.stringValue("DescribeInstanceGrantedToExpressConnectRouterResponse.DynamicCode"));
		describeInstanceGrantedToExpressConnectRouterResponse.setDynamicMessage(_ctx.stringValue("DescribeInstanceGrantedToExpressConnectRouterResponse.DynamicMessage"));
		describeInstanceGrantedToExpressConnectRouterResponse.setAccessDeniedDetail(_ctx.stringValue("DescribeInstanceGrantedToExpressConnectRouterResponse.AccessDeniedDetail"));
		describeInstanceGrantedToExpressConnectRouterResponse.setTotalCount(_ctx.integerValue("DescribeInstanceGrantedToExpressConnectRouterResponse.TotalCount"));
		describeInstanceGrantedToExpressConnectRouterResponse.setMaxResults(_ctx.integerValue("DescribeInstanceGrantedToExpressConnectRouterResponse.MaxResults"));
		describeInstanceGrantedToExpressConnectRouterResponse.setNextToken(_ctx.stringValue("DescribeInstanceGrantedToExpressConnectRouterResponse.NextToken"));

		List<EcrGrantedInstanceListItem> ecrGrantedInstanceList = new ArrayList<EcrGrantedInstanceListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceGrantedToExpressConnectRouterResponse.EcrGrantedInstanceList.Length"); i++) {
			EcrGrantedInstanceListItem ecrGrantedInstanceListItem = new EcrGrantedInstanceListItem();
			ecrGrantedInstanceListItem.setGrantId(_ctx.stringValue("DescribeInstanceGrantedToExpressConnectRouterResponse.EcrGrantedInstanceList["+ i +"].GrantId"));
			ecrGrantedInstanceListItem.setStatus(_ctx.stringValue("DescribeInstanceGrantedToExpressConnectRouterResponse.EcrGrantedInstanceList["+ i +"].Status"));
			ecrGrantedInstanceListItem.setGmtCreate(_ctx.stringValue("DescribeInstanceGrantedToExpressConnectRouterResponse.EcrGrantedInstanceList["+ i +"].GmtCreate"));
			ecrGrantedInstanceListItem.setGmtModified(_ctx.stringValue("DescribeInstanceGrantedToExpressConnectRouterResponse.EcrGrantedInstanceList["+ i +"].GmtModified"));
			ecrGrantedInstanceListItem.setEcrId(_ctx.stringValue("DescribeInstanceGrantedToExpressConnectRouterResponse.EcrGrantedInstanceList["+ i +"].EcrId"));
			ecrGrantedInstanceListItem.setNodeId(_ctx.stringValue("DescribeInstanceGrantedToExpressConnectRouterResponse.EcrGrantedInstanceList["+ i +"].NodeId"));
			ecrGrantedInstanceListItem.setNodeType(_ctx.stringValue("DescribeInstanceGrantedToExpressConnectRouterResponse.EcrGrantedInstanceList["+ i +"].NodeType"));
			ecrGrantedInstanceListItem.setNodeRegionId(_ctx.stringValue("DescribeInstanceGrantedToExpressConnectRouterResponse.EcrGrantedInstanceList["+ i +"].NodeRegionId"));
			ecrGrantedInstanceListItem.setNodeOwnerUid(_ctx.longValue("DescribeInstanceGrantedToExpressConnectRouterResponse.EcrGrantedInstanceList["+ i +"].NodeOwnerUid"));
			ecrGrantedInstanceListItem.setNodeOwnerBid(_ctx.stringValue("DescribeInstanceGrantedToExpressConnectRouterResponse.EcrGrantedInstanceList["+ i +"].NodeOwnerBid"));

			ecrGrantedInstanceList.add(ecrGrantedInstanceListItem);
		}
		describeInstanceGrantedToExpressConnectRouterResponse.setEcrGrantedInstanceList(ecrGrantedInstanceList);
	 
	 	return describeInstanceGrantedToExpressConnectRouterResponse;
	}
}