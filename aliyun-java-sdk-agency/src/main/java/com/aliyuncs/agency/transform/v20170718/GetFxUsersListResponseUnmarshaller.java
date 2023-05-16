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

package com.aliyuncs.agency.transform.v20170718;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.agency.model.v20170718.GetFxUsersListResponse;
import com.aliyuncs.agency.model.v20170718.GetFxUsersListResponse.FxUserInfo;
import com.aliyuncs.agency.model.v20170718.GetFxUsersListResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFxUsersListResponseUnmarshaller {

	public static GetFxUsersListResponse unmarshall(GetFxUsersListResponse getFxUsersListResponse, UnmarshallerContext _ctx) {
		
		getFxUsersListResponse.setRequestId(_ctx.stringValue("GetFxUsersListResponse.RequestId"));
		getFxUsersListResponse.setCode(_ctx.stringValue("GetFxUsersListResponse.Code"));
		getFxUsersListResponse.setMessage(_ctx.stringValue("GetFxUsersListResponse.Message"));
		getFxUsersListResponse.setSuccess(_ctx.booleanValue("GetFxUsersListResponse.Success"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setPageSize(_ctx.integerValue("GetFxUsersListResponse.PageInfo.PageSize"));
		pageInfo.setTotal(_ctx.integerValue("GetFxUsersListResponse.PageInfo.Total"));
		pageInfo.setPage(_ctx.integerValue("GetFxUsersListResponse.PageInfo.Page"));
		getFxUsersListResponse.setPageInfo(pageInfo);

		List<FxUserInfo> data = new ArrayList<FxUserInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetFxUsersListResponse.Data.Length"); i++) {
			FxUserInfo fxUserInfo = new FxUserInfo();
			fxUserInfo.setDistributionRebateType(_ctx.longValue("GetFxUsersListResponse.Data["+ i +"].DistributionRebateType"));
			fxUserInfo.setKpId(_ctx.longValue("GetFxUsersListResponse.Data["+ i +"].KpId"));
			fxUserInfo.setCustomerRebateType(_ctx.longValue("GetFxUsersListResponse.Data["+ i +"].CustomerRebateType"));
			fxUserInfo.setParentUid(_ctx.longValue("GetFxUsersListResponse.Data["+ i +"].ParentUid"));
			fxUserInfo.setIsSub(_ctx.integerValue("GetFxUsersListResponse.Data["+ i +"].IsSub"));
			fxUserInfo.setLevel(_ctx.integerValue("GetFxUsersListResponse.Data["+ i +"].Level"));

			data.add(fxUserInfo);
		}
		getFxUsersListResponse.setData(data);
	 
	 	return getFxUsersListResponse;
	}
}