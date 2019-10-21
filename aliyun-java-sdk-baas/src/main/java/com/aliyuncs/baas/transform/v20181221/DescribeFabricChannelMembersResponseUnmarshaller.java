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

import com.aliyuncs.baas.model.v20181221.DescribeFabricChannelMembersResponse;
import com.aliyuncs.baas.model.v20181221.DescribeFabricChannelMembersResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricChannelMembersResponseUnmarshaller {

	public static DescribeFabricChannelMembersResponse unmarshall(DescribeFabricChannelMembersResponse describeFabricChannelMembersResponse, UnmarshallerContext _ctx) {
		
		describeFabricChannelMembersResponse.setRequestId(_ctx.stringValue("DescribeFabricChannelMembersResponse.RequestId"));
		describeFabricChannelMembersResponse.setSuccess(_ctx.booleanValue("DescribeFabricChannelMembersResponse.Success"));
		describeFabricChannelMembersResponse.setErrorCode(_ctx.integerValue("DescribeFabricChannelMembersResponse.ErrorCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFabricChannelMembersResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setChannelId(_ctx.stringValue("DescribeFabricChannelMembersResponse.Result["+ i +"].ChannelId"));
			resultItem.setOrganizationId(_ctx.stringValue("DescribeFabricChannelMembersResponse.Result["+ i +"].OrganizationId"));
			resultItem.setWithPeer(_ctx.booleanValue("DescribeFabricChannelMembersResponse.Result["+ i +"].WithPeer"));
			resultItem.setState(_ctx.stringValue("DescribeFabricChannelMembersResponse.Result["+ i +"].State"));
			resultItem.setInviteTime(_ctx.stringValue("DescribeFabricChannelMembersResponse.Result["+ i +"].InviteTime"));
			resultItem.setAcceptTime(_ctx.stringValue("DescribeFabricChannelMembersResponse.Result["+ i +"].AcceptTime"));
			resultItem.setOrganizationName(_ctx.stringValue("DescribeFabricChannelMembersResponse.Result["+ i +"].OrganizationName"));
			resultItem.setOrganizationDomain(_ctx.stringValue("DescribeFabricChannelMembersResponse.Result["+ i +"].OrganizationDomain"));
			resultItem.setOrganizationDescription(_ctx.stringValue("DescribeFabricChannelMembersResponse.Result["+ i +"].OrganizationDescription"));

			result.add(resultItem);
		}
		describeFabricChannelMembersResponse.setResult(result);
	 
	 	return describeFabricChannelMembersResponse;
	}
}