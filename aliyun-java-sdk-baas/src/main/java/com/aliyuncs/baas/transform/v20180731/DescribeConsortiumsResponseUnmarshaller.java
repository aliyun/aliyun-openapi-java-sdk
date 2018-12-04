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

package com.aliyuncs.baas.transform.v20180731;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20180731.DescribeConsortiumsResponse;
import com.aliyuncs.baas.model.v20180731.DescribeConsortiumsResponse.ResultItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConsortiumsResponseUnmarshaller {

	public static DescribeConsortiumsResponse unmarshall(DescribeConsortiumsResponse describeConsortiumsResponse, UnmarshallerContext context) {
		
		describeConsortiumsResponse.setRequestId(context.stringValue("DescribeConsortiumsResponse.RequestId"));
		describeConsortiumsResponse.setSuccess(context.booleanValue("DescribeConsortiumsResponse.Success"));
		describeConsortiumsResponse.setErrorCode(context.integerValue("DescribeConsortiumsResponse.ErrorCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < context.lengthValue("DescribeConsortiumsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setRequestId(context.stringValue("DescribeConsortiumsResponse.Result["+ i +"].RequestId"));
			resultItem.setConsortiumId(context.stringValue("DescribeConsortiumsResponse.Result["+ i +"].ConsortiumId"));
			resultItem.setName(context.stringValue("DescribeConsortiumsResponse.Result["+ i +"].Name"));
			resultItem.setCodeName(context.stringValue("DescribeConsortiumsResponse.Result["+ i +"].CodeName"));
			resultItem.setOwnerBid(context.stringValue("DescribeConsortiumsResponse.Result["+ i +"].OwnerBid"));
			resultItem.setOwnerUid(context.integerValue("DescribeConsortiumsResponse.Result["+ i +"].OwnerUid"));
			resultItem.setOwnerName(context.stringValue("DescribeConsortiumsResponse.Result["+ i +"].OwnerName"));
			resultItem.setChannelPolicy(context.stringValue("DescribeConsortiumsResponse.Result["+ i +"].ChannelPolicy"));
			resultItem.setOrganizationCount(context.integerValue("DescribeConsortiumsResponse.Result["+ i +"].OrganizationCount"));
			resultItem.setChannelCount(context.integerValue("DescribeConsortiumsResponse.Result["+ i +"].ChannelCount"));
			resultItem.setCreateTime(context.stringValue("DescribeConsortiumsResponse.Result["+ i +"].CreateTime"));
			resultItem.setState(context.stringValue("DescribeConsortiumsResponse.Result["+ i +"].State"));
			resultItem.setRegionId(context.stringValue("DescribeConsortiumsResponse.Result["+ i +"].RegionId"));
			resultItem.setDomain(context.stringValue("DescribeConsortiumsResponse.Result["+ i +"].Domain"));

			result.add(resultItem);
		}
		describeConsortiumsResponse.setResult(result);
	 
	 	return describeConsortiumsResponse;
	}
}