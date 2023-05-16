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

package com.aliyuncs.agency.transform.v20180701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.agency.model.v20180701.GetAccountInfoResponse;
import com.aliyuncs.agency.model.v20180701.GetAccountInfoResponse.AccountInfo;
import com.aliyuncs.agency.model.v20180701.GetAccountInfoResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAccountInfoResponseUnmarshaller {

	public static GetAccountInfoResponse unmarshall(GetAccountInfoResponse getAccountInfoResponse, UnmarshallerContext _ctx) {
		
		getAccountInfoResponse.setCode(_ctx.stringValue("GetAccountInfoResponse.Code"));
		getAccountInfoResponse.setMessage(_ctx.stringValue("GetAccountInfoResponse.Message"));
		getAccountInfoResponse.setSuccess(_ctx.booleanValue("GetAccountInfoResponse.Success"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setPageSize(_ctx.integerValue("GetAccountInfoResponse.PageInfo.PageSize"));
		pageInfo.setTotal(_ctx.integerValue("GetAccountInfoResponse.PageInfo.Total"));
		pageInfo.setPage(_ctx.integerValue("GetAccountInfoResponse.PageInfo.Page"));
		getAccountInfoResponse.setPageInfo(pageInfo);

		List<AccountInfo> accountInfoList = new ArrayList<AccountInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetAccountInfoResponse.AccountInfoList.Length"); i++) {
			AccountInfo accountInfo = new AccountInfo();
			accountInfo.setSubAccountType(_ctx.integerValue("GetAccountInfoResponse.AccountInfoList["+ i +"].SubAccountType"));
			accountInfo.setAssociationSuccessTime(_ctx.stringValue("GetAccountInfoResponse.AccountInfoList["+ i +"].AssociationSuccessTime"));
			accountInfo.setAccountNickname(_ctx.stringValue("GetAccountInfoResponse.AccountInfoList["+ i +"].AccountNickname"));
			accountInfo.setEmail(_ctx.stringValue("GetAccountInfoResponse.AccountInfoList["+ i +"].Email"));
			accountInfo.setRemark(_ctx.stringValue("GetAccountInfoResponse.AccountInfoList["+ i +"].Remark"));
			accountInfo.setMobile(_ctx.stringValue("GetAccountInfoResponse.AccountInfoList["+ i +"].Mobile"));
			accountInfo.setAliyunId(_ctx.stringValue("GetAccountInfoResponse.AccountInfoList["+ i +"].AliyunId"));
			accountInfo.setUid(_ctx.longValue("GetAccountInfoResponse.AccountInfoList["+ i +"].Uid"));

			accountInfoList.add(accountInfo);
		}
		getAccountInfoResponse.setAccountInfoList(accountInfoList);
	 
	 	return getAccountInfoResponse;
	}
}