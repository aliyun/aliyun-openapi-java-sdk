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

import com.aliyuncs.agency.model.v20180703.GetSubAccountInfoResponse;
import com.aliyuncs.agency.model.v20180703.GetSubAccountInfoResponse.AccountInfo;
import com.aliyuncs.agency.model.v20180703.GetSubAccountInfoResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSubAccountInfoResponseUnmarshaller {

	public static GetSubAccountInfoResponse unmarshall(GetSubAccountInfoResponse getSubAccountInfoResponse, UnmarshallerContext _ctx) {
		
		getSubAccountInfoResponse.setCode(_ctx.stringValue("GetSubAccountInfoResponse.Code"));
		getSubAccountInfoResponse.setMessage(_ctx.stringValue("GetSubAccountInfoResponse.Message"));
		getSubAccountInfoResponse.setSuccess(_ctx.booleanValue("GetSubAccountInfoResponse.Success"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setPageSize(_ctx.integerValue("GetSubAccountInfoResponse.PageInfo.PageSize"));
		pageInfo.setTotal(_ctx.integerValue("GetSubAccountInfoResponse.PageInfo.Total"));
		pageInfo.setPage(_ctx.integerValue("GetSubAccountInfoResponse.PageInfo.Page"));
		getSubAccountInfoResponse.setPageInfo(pageInfo);

		List<AccountInfo> accountInfoList = new ArrayList<AccountInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetSubAccountInfoResponse.AccountInfoList.Length"); i++) {
			AccountInfo accountInfo = new AccountInfo();
			accountInfo.setSubAccountType(_ctx.integerValue("GetSubAccountInfoResponse.AccountInfoList["+ i +"].SubAccountType"));
			accountInfo.setAssociationSuccessTime(_ctx.stringValue("GetSubAccountInfoResponse.AccountInfoList["+ i +"].AssociationSuccessTime"));
			accountInfo.setAccountNickname(_ctx.stringValue("GetSubAccountInfoResponse.AccountInfoList["+ i +"].AccountNickname"));
			accountInfo.setEmail(_ctx.stringValue("GetSubAccountInfoResponse.AccountInfoList["+ i +"].Email"));
			accountInfo.setRemark(_ctx.stringValue("GetSubAccountInfoResponse.AccountInfoList["+ i +"].Remark"));
			accountInfo.setMobile(_ctx.stringValue("GetSubAccountInfoResponse.AccountInfoList["+ i +"].Mobile"));
			accountInfo.setUid(_ctx.longValue("GetSubAccountInfoResponse.AccountInfoList["+ i +"].Uid"));

			accountInfoList.add(accountInfo);
		}
		getSubAccountInfoResponse.setAccountInfoList(accountInfoList);
	 
	 	return getSubAccountInfoResponse;
	}
}