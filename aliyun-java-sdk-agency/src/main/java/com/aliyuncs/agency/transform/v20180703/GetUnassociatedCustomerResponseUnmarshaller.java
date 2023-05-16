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

package com.aliyuncs.agency.transform.v20180703;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.agency.model.v20180703.GetUnassociatedCustomerResponse;
import com.aliyuncs.agency.model.v20180703.GetUnassociatedCustomerResponse.InviteInfo;
import com.aliyuncs.agency.model.v20180703.GetUnassociatedCustomerResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUnassociatedCustomerResponseUnmarshaller {

	public static GetUnassociatedCustomerResponse unmarshall(GetUnassociatedCustomerResponse getUnassociatedCustomerResponse, UnmarshallerContext _ctx) {
		
		getUnassociatedCustomerResponse.setCode(_ctx.stringValue("GetUnassociatedCustomerResponse.Code"));
		getUnassociatedCustomerResponse.setMessage(_ctx.stringValue("GetUnassociatedCustomerResponse.Message"));
		getUnassociatedCustomerResponse.setSuccess(_ctx.booleanValue("GetUnassociatedCustomerResponse.Success"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setPageSize(_ctx.integerValue("GetUnassociatedCustomerResponse.PageInfo.PageSize"));
		pageInfo.setTotal(_ctx.integerValue("GetUnassociatedCustomerResponse.PageInfo.Total"));
		pageInfo.setPage(_ctx.integerValue("GetUnassociatedCustomerResponse.PageInfo.Page"));
		getUnassociatedCustomerResponse.setPageInfo(pageInfo);

		List<InviteInfo> inviteInfoList = new ArrayList<InviteInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetUnassociatedCustomerResponse.InviteInfoList.Length"); i++) {
			InviteInfo inviteInfo = new InviteInfo();
			inviteInfo.setStatus(_ctx.integerValue("GetUnassociatedCustomerResponse.InviteInfoList["+ i +"].Status"));
			inviteInfo.setGmtCreate(_ctx.stringValue("GetUnassociatedCustomerResponse.InviteInfoList["+ i +"].GmtCreate"));
			inviteInfo.setAccountNickname(_ctx.stringValue("GetUnassociatedCustomerResponse.InviteInfoList["+ i +"].AccountNickname"));
			inviteInfo.setEmail(_ctx.stringValue("GetUnassociatedCustomerResponse.InviteInfoList["+ i +"].Email"));
			inviteInfo.setInviteId(_ctx.longValue("GetUnassociatedCustomerResponse.InviteInfoList["+ i +"].InviteId"));

			inviteInfoList.add(inviteInfo);
		}
		getUnassociatedCustomerResponse.setInviteInfoList(inviteInfoList);
	 
	 	return getUnassociatedCustomerResponse;
	}
}