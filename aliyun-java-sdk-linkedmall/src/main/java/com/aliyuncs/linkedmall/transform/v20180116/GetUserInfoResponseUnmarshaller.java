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

package com.aliyuncs.linkedmall.transform.v20180116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20180116.GetUserInfoResponse;
import com.aliyuncs.linkedmall.model.v20180116.GetUserInfoResponse.LoginResult;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserInfoResponseUnmarshaller {

	public static GetUserInfoResponse unmarshall(GetUserInfoResponse getUserInfoResponse, UnmarshallerContext _ctx) {
		
		getUserInfoResponse.setRequestId(_ctx.stringValue("GetUserInfoResponse.RequestId"));
		getUserInfoResponse.setCode(_ctx.stringValue("GetUserInfoResponse.Code"));
		getUserInfoResponse.setMessage(_ctx.stringValue("GetUserInfoResponse.Message"));

		LoginResult loginResult = new LoginResult();
		loginResult.setLmUserId(_ctx.longValue("GetUserInfoResponse.LoginResult.LmUserId"));
		loginResult.setBizId(_ctx.stringValue("GetUserInfoResponse.LoginResult.BizId"));
		loginResult.setBizUid(_ctx.stringValue("GetUserInfoResponse.LoginResult.BizUid"));
		loginResult.setBizUserName(_ctx.stringValue("GetUserInfoResponse.LoginResult.BizUserName"));
		loginResult.setReturnUrl(_ctx.stringValue("GetUserInfoResponse.LoginResult.ReturnUrl"));
		loginResult.setExtInfo(_ctx.mapValue("GetUserInfoResponse.LoginResult.ExtInfo"));

		List<String> subBizId = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetUserInfoResponse.LoginResult.SubBizId.Length"); i++) {
			subBizId.add(_ctx.stringValue("GetUserInfoResponse.LoginResult.SubBizId["+ i +"]"));
		}
		loginResult.setSubBizId(subBizId);
		getUserInfoResponse.setLoginResult(loginResult);
	 
	 	return getUserInfoResponse;
	}
}