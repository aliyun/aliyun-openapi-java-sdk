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

package com.aliyuncs.baas.transform.v20181221;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20181221.DescribeFabricOrganizationChannelsResponse;
import com.aliyuncs.baas.model.v20181221.DescribeFabricOrganizationChannelsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricOrganizationChannelsResponseUnmarshaller {

	public static DescribeFabricOrganizationChannelsResponse unmarshall(DescribeFabricOrganizationChannelsResponse describeFabricOrganizationChannelsResponse, UnmarshallerContext _ctx) {
		
		describeFabricOrganizationChannelsResponse.setRequestId(_ctx.stringValue("DescribeFabricOrganizationChannelsResponse.RequestId"));
		describeFabricOrganizationChannelsResponse.setSuccess(_ctx.booleanValue("DescribeFabricOrganizationChannelsResponse.Success"));
		describeFabricOrganizationChannelsResponse.setErrorCode(_ctx.integerValue("DescribeFabricOrganizationChannelsResponse.ErrorCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFabricOrganizationChannelsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setBatchTimeout(_ctx.integerValue("DescribeFabricOrganizationChannelsResponse.Result["+ i +"].BatchTimeout"));
			resultItem.setUpdateTime(_ctx.stringValue("DescribeFabricOrganizationChannelsResponse.Result["+ i +"].UpdateTime"));
			resultItem.setChaincodeCount(_ctx.integerValue("DescribeFabricOrganizationChannelsResponse.Result["+ i +"].ChaincodeCount"));
			resultItem.setPreferredMaxBytes(_ctx.integerValue("DescribeFabricOrganizationChannelsResponse.Result["+ i +"].PreferredMaxBytes"));
			resultItem.setState(_ctx.stringValue("DescribeFabricOrganizationChannelsResponse.Result["+ i +"].State"));
			resultItem.setCreateTime(_ctx.stringValue("DescribeFabricOrganizationChannelsResponse.Result["+ i +"].CreateTime"));
			resultItem.setSupportChannelConfig(_ctx.booleanValue("DescribeFabricOrganizationChannelsResponse.Result["+ i +"].SupportChannelConfig"));
			resultItem.setOwnerName(_ctx.stringValue("DescribeFabricOrganizationChannelsResponse.Result["+ i +"].OwnerName"));
			resultItem.setOwnerUid(_ctx.longValue("DescribeFabricOrganizationChannelsResponse.Result["+ i +"].OwnerUid"));
			resultItem.setOwnerBid(_ctx.stringValue("DescribeFabricOrganizationChannelsResponse.Result["+ i +"].OwnerBid"));
			resultItem.setMaxMessageCount(_ctx.integerValue("DescribeFabricOrganizationChannelsResponse.Result["+ i +"].MaxMessageCount"));
			resultItem.setMemberCount(_ctx.integerValue("DescribeFabricOrganizationChannelsResponse.Result["+ i +"].MemberCount"));
			resultItem.setRequestId(_ctx.stringValue("DescribeFabricOrganizationChannelsResponse.Result["+ i +"].RequestId"));
			resultItem.setConsortiumId(_ctx.stringValue("DescribeFabricOrganizationChannelsResponse.Result["+ i +"].ConsortiumId"));
			resultItem.setChannelName(_ctx.stringValue("DescribeFabricOrganizationChannelsResponse.Result["+ i +"].ChannelName"));
			resultItem.setDeleteTime(_ctx.stringValue("DescribeFabricOrganizationChannelsResponse.Result["+ i +"].DeleteTime"));
			resultItem.setChannelId(_ctx.stringValue("DescribeFabricOrganizationChannelsResponse.Result["+ i +"].ChannelId"));
			resultItem.setDeleted(_ctx.booleanValue("DescribeFabricOrganizationChannelsResponse.Result["+ i +"].Deleted"));
			resultItem.setConsortiumName(_ctx.stringValue("DescribeFabricOrganizationChannelsResponse.Result["+ i +"].ConsortiumName"));
			resultItem.setBlockCount(_ctx.integerValue("DescribeFabricOrganizationChannelsResponse.Result["+ i +"].BlockCount"));

			result.add(resultItem);
		}
		describeFabricOrganizationChannelsResponse.setResult(result);
	 
	 	return describeFabricOrganizationChannelsResponse;
	}
}