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

package com.aliyuncs.retailadvqa.transform.v20230417;

import com.aliyuncs.retailadvqa.model.v20230417.QueryMemberBasicInfoResponse;
import com.aliyuncs.retailadvqa.model.v20230417.QueryMemberBasicInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMemberBasicInfoResponseUnmarshaller {

	public static QueryMemberBasicInfoResponse unmarshall(QueryMemberBasicInfoResponse queryMemberBasicInfoResponse, UnmarshallerContext _ctx) {
		
		queryMemberBasicInfoResponse.setRequestId(_ctx.stringValue("QueryMemberBasicInfoResponse.RequestId"));
		queryMemberBasicInfoResponse.setSuccess(_ctx.booleanValue("QueryMemberBasicInfoResponse.Success"));
		queryMemberBasicInfoResponse.setErrorCode(_ctx.stringValue("QueryMemberBasicInfoResponse.ErrorCode"));
		queryMemberBasicInfoResponse.setErrorMessage(_ctx.stringValue("QueryMemberBasicInfoResponse.ErrorMessage"));

		Data data = new Data();
		data.setOpenMerchantId(_ctx.stringValue("QueryMemberBasicInfoResponse.Data.OpenMerchantId"));
		data.setOuterMemberId(_ctx.stringValue("QueryMemberBasicInfoResponse.Data.OuterMemberId"));
		data.setMemberName(_ctx.stringValue("QueryMemberBasicInfoResponse.Data.MemberName"));
		data.setMobile(_ctx.stringValue("QueryMemberBasicInfoResponse.Data.Mobile"));
		data.setSex(_ctx.stringValue("QueryMemberBasicInfoResponse.Data.Sex"));
		data.setBirthday(_ctx.stringValue("QueryMemberBasicInfoResponse.Data.Birthday"));
		data.setCountry(_ctx.stringValue("QueryMemberBasicInfoResponse.Data.Country"));
		data.setProvince(_ctx.stringValue("QueryMemberBasicInfoResponse.Data.Province"));
		data.setCity(_ctx.stringValue("QueryMemberBasicInfoResponse.Data.City"));
		data.setEmail(_ctx.stringValue("QueryMemberBasicInfoResponse.Data.Email"));
		data.setAvatar(_ctx.stringValue("QueryMemberBasicInfoResponse.Data.Avatar"));
		data.setLevelNum(_ctx.stringValue("QueryMemberBasicInfoResponse.Data.LevelNum"));
		data.setLevelName(_ctx.stringValue("QueryMemberBasicInfoResponse.Data.LevelName"));
		data.setPoints(_ctx.stringValue("QueryMemberBasicInfoResponse.Data.Points"));
		data.setScore(_ctx.stringValue("QueryMemberBasicInfoResponse.Data.Score"));
		data.setExtra(_ctx.stringValue("QueryMemberBasicInfoResponse.Data.Extra"));
		data.setArea(_ctx.stringValue("QueryMemberBasicInfoResponse.Data.Area"));
		data.setMemberNickName(_ctx.stringValue("QueryMemberBasicInfoResponse.Data.MemberNickName"));
		queryMemberBasicInfoResponse.setData(data);
	 
	 	return queryMemberBasicInfoResponse;
	}
}