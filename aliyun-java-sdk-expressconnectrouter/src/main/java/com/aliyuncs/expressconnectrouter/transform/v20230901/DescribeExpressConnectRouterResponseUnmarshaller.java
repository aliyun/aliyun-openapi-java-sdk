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

import com.aliyuncs.expressconnectrouter.model.v20230901.DescribeExpressConnectRouterResponse;
import com.aliyuncs.expressconnectrouter.model.v20230901.DescribeExpressConnectRouterResponse.EcrListItem;
import com.aliyuncs.expressconnectrouter.model.v20230901.DescribeExpressConnectRouterResponse.EcrListItem.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExpressConnectRouterResponseUnmarshaller {

	public static DescribeExpressConnectRouterResponse unmarshall(DescribeExpressConnectRouterResponse describeExpressConnectRouterResponse, UnmarshallerContext _ctx) {
		
		describeExpressConnectRouterResponse.setRequestId(_ctx.stringValue("DescribeExpressConnectRouterResponse.RequestId"));
		describeExpressConnectRouterResponse.setSuccess(_ctx.booleanValue("DescribeExpressConnectRouterResponse.Success"));
		describeExpressConnectRouterResponse.setCode(_ctx.stringValue("DescribeExpressConnectRouterResponse.Code"));
		describeExpressConnectRouterResponse.setMessage(_ctx.stringValue("DescribeExpressConnectRouterResponse.Message"));
		describeExpressConnectRouterResponse.setHttpStatusCode(_ctx.integerValue("DescribeExpressConnectRouterResponse.HttpStatusCode"));
		describeExpressConnectRouterResponse.setDynamicCode(_ctx.stringValue("DescribeExpressConnectRouterResponse.DynamicCode"));
		describeExpressConnectRouterResponse.setDynamicMessage(_ctx.stringValue("DescribeExpressConnectRouterResponse.DynamicMessage"));
		describeExpressConnectRouterResponse.setAccessDeniedDetail(_ctx.stringValue("DescribeExpressConnectRouterResponse.AccessDeniedDetail"));
		describeExpressConnectRouterResponse.setTotalCount(_ctx.integerValue("DescribeExpressConnectRouterResponse.TotalCount"));
		describeExpressConnectRouterResponse.setMaxResults(_ctx.integerValue("DescribeExpressConnectRouterResponse.MaxResults"));
		describeExpressConnectRouterResponse.setNextToken(_ctx.stringValue("DescribeExpressConnectRouterResponse.NextToken"));

		List<EcrListItem> ecrList = new ArrayList<EcrListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExpressConnectRouterResponse.EcrList.Length"); i++) {
			EcrListItem ecrListItem = new EcrListItem();
			ecrListItem.setEcrId(_ctx.stringValue("DescribeExpressConnectRouterResponse.EcrList["+ i +"].EcrId"));
			ecrListItem.setOwnerId(_ctx.longValue("DescribeExpressConnectRouterResponse.EcrList["+ i +"].OwnerId"));
			ecrListItem.setGmtCreate(_ctx.stringValue("DescribeExpressConnectRouterResponse.EcrList["+ i +"].GmtCreate"));
			ecrListItem.setGmtModified(_ctx.stringValue("DescribeExpressConnectRouterResponse.EcrList["+ i +"].GmtModified"));
			ecrListItem.setStatus(_ctx.stringValue("DescribeExpressConnectRouterResponse.EcrList["+ i +"].Status"));
			ecrListItem.setBizStatus(_ctx.stringValue("DescribeExpressConnectRouterResponse.EcrList["+ i +"].BizStatus"));
			ecrListItem.setResourceGroupId(_ctx.stringValue("DescribeExpressConnectRouterResponse.EcrList["+ i +"].ResourceGroupId"));
			ecrListItem.setName(_ctx.stringValue("DescribeExpressConnectRouterResponse.EcrList["+ i +"].Name"));
			ecrListItem.setDescription(_ctx.stringValue("DescribeExpressConnectRouterResponse.EcrList["+ i +"].Description"));
			ecrListItem.setAlibabaSideAsn(_ctx.longValue("DescribeExpressConnectRouterResponse.EcrList["+ i +"].AlibabaSideAsn"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeExpressConnectRouterResponse.EcrList["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setId(_ctx.longValue("DescribeExpressConnectRouterResponse.EcrList["+ i +"].Tags["+ j +"].Id"));
				tag.setResourceId(_ctx.stringValue("DescribeExpressConnectRouterResponse.EcrList["+ i +"].Tags["+ j +"].ResourceId"));
				tag.setResuorceType(_ctx.stringValue("DescribeExpressConnectRouterResponse.EcrList["+ i +"].Tags["+ j +"].ResuorceType"));
				tag.setRegionNo(_ctx.stringValue("DescribeExpressConnectRouterResponse.EcrList["+ i +"].Tags["+ j +"].RegionNo"));
				tag.setAliUid(_ctx.longValue("DescribeExpressConnectRouterResponse.EcrList["+ i +"].Tags["+ j +"].AliUid"));
				tag.setTagKey(_ctx.stringValue("DescribeExpressConnectRouterResponse.EcrList["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribeExpressConnectRouterResponse.EcrList["+ i +"].Tags["+ j +"].TagValue"));
				tag.setScope(_ctx.integerValue("DescribeExpressConnectRouterResponse.EcrList["+ i +"].Tags["+ j +"].Scope"));
				tag.setCategory(_ctx.integerValue("DescribeExpressConnectRouterResponse.EcrList["+ i +"].Tags["+ j +"].Category"));

				tags.add(tag);
			}
			ecrListItem.setTags(tags);

			ecrList.add(ecrListItem);
		}
		describeExpressConnectRouterResponse.setEcrList(ecrList);
	 
	 	return describeExpressConnectRouterResponse;
	}
}