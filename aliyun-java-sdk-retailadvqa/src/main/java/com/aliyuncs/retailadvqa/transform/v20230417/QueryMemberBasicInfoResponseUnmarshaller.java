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
import com.aliyuncs.retailadvqa.model.v20230417.QueryMemberBasicInfoResponse.OpenMemberBasicInfoDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMemberBasicInfoResponseUnmarshaller {

	public static QueryMemberBasicInfoResponse unmarshall(QueryMemberBasicInfoResponse queryMemberBasicInfoResponse, UnmarshallerContext _ctx) {
		
		queryMemberBasicInfoResponse.setRequestId(_ctx.stringValue("QueryMemberBasicInfoResponse.RequestId"));
		queryMemberBasicInfoResponse.setSuccess(_ctx.booleanValue("QueryMemberBasicInfoResponse.Success"));
		queryMemberBasicInfoResponse.setHttpStatusCode(_ctx.stringValue("QueryMemberBasicInfoResponse.HttpStatusCode"));
		queryMemberBasicInfoResponse.setErrorCode(_ctx.stringValue("QueryMemberBasicInfoResponse.ErrorCode"));
		queryMemberBasicInfoResponse.setErrorMessage(_ctx.stringValue("QueryMemberBasicInfoResponse.ErrorMessage"));
		queryMemberBasicInfoResponse.setMessage(_ctx.stringValue("QueryMemberBasicInfoResponse.Message"));

		OpenMemberBasicInfoDTO openMemberBasicInfoDTO = new OpenMemberBasicInfoDTO();
		openMemberBasicInfoDTO.setOpenMerchantId(_ctx.stringValue("QueryMemberBasicInfoResponse.OpenMemberBasicInfoDTO.OpenMerchantId"));
		openMemberBasicInfoDTO.setOuterMemberId(_ctx.stringValue("QueryMemberBasicInfoResponse.OpenMemberBasicInfoDTO.OuterMemberId"));
		openMemberBasicInfoDTO.setMemberName(_ctx.stringValue("QueryMemberBasicInfoResponse.OpenMemberBasicInfoDTO.MemberName"));
		openMemberBasicInfoDTO.setMobile(_ctx.stringValue("QueryMemberBasicInfoResponse.OpenMemberBasicInfoDTO.Mobile"));
		openMemberBasicInfoDTO.setSex(_ctx.stringValue("QueryMemberBasicInfoResponse.OpenMemberBasicInfoDTO.Sex"));
		openMemberBasicInfoDTO.setBirthday(_ctx.stringValue("QueryMemberBasicInfoResponse.OpenMemberBasicInfoDTO.Birthday"));
		openMemberBasicInfoDTO.setCountry(_ctx.stringValue("QueryMemberBasicInfoResponse.OpenMemberBasicInfoDTO.Country"));
		openMemberBasicInfoDTO.setProvince(_ctx.stringValue("QueryMemberBasicInfoResponse.OpenMemberBasicInfoDTO.Province"));
		openMemberBasicInfoDTO.setCity(_ctx.stringValue("QueryMemberBasicInfoResponse.OpenMemberBasicInfoDTO.City"));
		openMemberBasicInfoDTO.setEmail(_ctx.stringValue("QueryMemberBasicInfoResponse.OpenMemberBasicInfoDTO.Email"));
		openMemberBasicInfoDTO.setAvatar(_ctx.stringValue("QueryMemberBasicInfoResponse.OpenMemberBasicInfoDTO.Avatar"));
		openMemberBasicInfoDTO.setLevelNum(_ctx.stringValue("QueryMemberBasicInfoResponse.OpenMemberBasicInfoDTO.LevelNum"));
		openMemberBasicInfoDTO.setLevelName(_ctx.stringValue("QueryMemberBasicInfoResponse.OpenMemberBasicInfoDTO.LevelName"));
		openMemberBasicInfoDTO.setPoints(_ctx.stringValue("QueryMemberBasicInfoResponse.OpenMemberBasicInfoDTO.Points"));
		openMemberBasicInfoDTO.setScore(_ctx.stringValue("QueryMemberBasicInfoResponse.OpenMemberBasicInfoDTO.Score"));
		openMemberBasicInfoDTO.setExtra(_ctx.stringValue("QueryMemberBasicInfoResponse.OpenMemberBasicInfoDTO.Extra"));
		queryMemberBasicInfoResponse.setOpenMemberBasicInfoDTO(openMemberBasicInfoDTO);
	 
	 	return queryMemberBasicInfoResponse;
	}
}