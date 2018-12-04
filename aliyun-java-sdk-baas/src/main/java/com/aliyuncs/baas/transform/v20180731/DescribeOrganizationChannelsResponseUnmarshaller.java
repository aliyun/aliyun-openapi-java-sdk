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

import com.aliyuncs.baas.model.v20180731.DescribeOrganizationChannelsResponse;
import com.aliyuncs.baas.model.v20180731.DescribeOrganizationChannelsResponse.ResultItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOrganizationChannelsResponseUnmarshaller {

	public static DescribeOrganizationChannelsResponse unmarshall(DescribeOrganizationChannelsResponse describeOrganizationChannelsResponse, UnmarshallerContext context) {
		
		describeOrganizationChannelsResponse.setRequestId(context.stringValue("DescribeOrganizationChannelsResponse.RequestId"));
		describeOrganizationChannelsResponse.setSuccess(context.booleanValue("DescribeOrganizationChannelsResponse.Success"));
		describeOrganizationChannelsResponse.setErrorCode(context.integerValue("DescribeOrganizationChannelsResponse.ErrorCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < context.lengthValue("DescribeOrganizationChannelsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setChannelId(context.stringValue("DescribeOrganizationChannelsResponse.Result["+ i +"].ChannelId"));
			resultItem.setName(context.stringValue("DescribeOrganizationChannelsResponse.Result["+ i +"].Name"));
			resultItem.setConsortiumId(context.stringValue("DescribeOrganizationChannelsResponse.Result["+ i +"].ConsortiumId"));
			resultItem.setState(context.stringValue("DescribeOrganizationChannelsResponse.Result["+ i +"].State"));
			resultItem.setOwnerBid(context.stringValue("DescribeOrganizationChannelsResponse.Result["+ i +"].OwnerBid"));
			resultItem.setOwnerUid(context.integerValue("DescribeOrganizationChannelsResponse.Result["+ i +"].OwnerUid"));
			resultItem.setOwnerName(context.stringValue("DescribeOrganizationChannelsResponse.Result["+ i +"].OwnerName"));
			resultItem.setMemberCount(context.integerValue("DescribeOrganizationChannelsResponse.Result["+ i +"].MemberCount"));
			resultItem.setChaincodeCount(context.integerValue("DescribeOrganizationChannelsResponse.Result["+ i +"].ChaincodeCount"));
			resultItem.setBlockCount(context.integerValue("DescribeOrganizationChannelsResponse.Result["+ i +"].BlockCount"));
			resultItem.setRequestId(context.stringValue("DescribeOrganizationChannelsResponse.Result["+ i +"].RequestId"));
			resultItem.setCreateTime(context.stringValue("DescribeOrganizationChannelsResponse.Result["+ i +"].CreateTime"));
			resultItem.setUpdateTime(context.stringValue("DescribeOrganizationChannelsResponse.Result["+ i +"].UpdateTime"));
			resultItem.setDeleted(context.booleanValue("DescribeOrganizationChannelsResponse.Result["+ i +"].Deleted"));
			resultItem.setDeleteTime(context.stringValue("DescribeOrganizationChannelsResponse.Result["+ i +"].DeleteTime"));
			resultItem.setConsortiumName(context.stringValue("DescribeOrganizationChannelsResponse.Result["+ i +"].ConsortiumName"));

			result.add(resultItem);
		}
		describeOrganizationChannelsResponse.setResult(result);
	 
	 	return describeOrganizationChannelsResponse;
	}
}