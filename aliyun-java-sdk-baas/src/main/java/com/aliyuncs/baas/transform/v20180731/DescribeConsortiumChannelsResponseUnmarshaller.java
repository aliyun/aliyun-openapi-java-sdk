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

import com.aliyuncs.baas.model.v20180731.DescribeConsortiumChannelsResponse;
import com.aliyuncs.baas.model.v20180731.DescribeConsortiumChannelsResponse.ResultItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConsortiumChannelsResponseUnmarshaller {

	public static DescribeConsortiumChannelsResponse unmarshall(DescribeConsortiumChannelsResponse describeConsortiumChannelsResponse, UnmarshallerContext context) {
		
		describeConsortiumChannelsResponse.setRequestId(context.stringValue("DescribeConsortiumChannelsResponse.RequestId"));
		describeConsortiumChannelsResponse.setSuccess(context.booleanValue("DescribeConsortiumChannelsResponse.Success"));
		describeConsortiumChannelsResponse.setErrorCode(context.integerValue("DescribeConsortiumChannelsResponse.ErrorCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < context.lengthValue("DescribeConsortiumChannelsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(context.integerValue("DescribeConsortiumChannelsResponse.Result["+ i +"].Id"));
			resultItem.setChannelId(context.stringValue("DescribeConsortiumChannelsResponse.Result["+ i +"].ChannelId"));
			resultItem.setName(context.stringValue("DescribeConsortiumChannelsResponse.Result["+ i +"].Name"));
			resultItem.setConsortiumId(context.stringValue("DescribeConsortiumChannelsResponse.Result["+ i +"].ConsortiumId"));
			resultItem.setState(context.stringValue("DescribeConsortiumChannelsResponse.Result["+ i +"].State"));
			resultItem.setOwnerBid(context.stringValue("DescribeConsortiumChannelsResponse.Result["+ i +"].OwnerBid"));
			resultItem.setOwnerUid(context.integerValue("DescribeConsortiumChannelsResponse.Result["+ i +"].OwnerUid"));
			resultItem.setOwnerName(context.stringValue("DescribeConsortiumChannelsResponse.Result["+ i +"].OwnerName"));
			resultItem.setMemberCount(context.integerValue("DescribeConsortiumChannelsResponse.Result["+ i +"].MemberCount"));
			resultItem.setChaincodeCount(context.integerValue("DescribeConsortiumChannelsResponse.Result["+ i +"].ChaincodeCount"));
			resultItem.setBlockCount(context.integerValue("DescribeConsortiumChannelsResponse.Result["+ i +"].BlockCount"));
			resultItem.setRequestId(context.stringValue("DescribeConsortiumChannelsResponse.Result["+ i +"].RequestId"));
			resultItem.setCreateTime(context.stringValue("DescribeConsortiumChannelsResponse.Result["+ i +"].CreateTime"));
			resultItem.setUpdateTime(context.stringValue("DescribeConsortiumChannelsResponse.Result["+ i +"].UpdateTime"));
			resultItem.setDeleted(context.booleanValue("DescribeConsortiumChannelsResponse.Result["+ i +"].Deleted"));
			resultItem.setDeleteTime(context.stringValue("DescribeConsortiumChannelsResponse.Result["+ i +"].DeleteTime"));
			resultItem.setConsortiumName(context.stringValue("DescribeConsortiumChannelsResponse.Result["+ i +"].ConsortiumName"));
			resultItem.setMemberJoinedCount(context.stringValue("DescribeConsortiumChannelsResponse.Result["+ i +"].MemberJoinedCount"));
			resultItem.setNeedJoined(context.booleanValue("DescribeConsortiumChannelsResponse.Result["+ i +"].NeedJoined"));

			result.add(resultItem);
		}
		describeConsortiumChannelsResponse.setResult(result);
	 
	 	return describeConsortiumChannelsResponse;
	}
}