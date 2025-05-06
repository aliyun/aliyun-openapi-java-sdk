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

package com.aliyuncs.itag.transform.v20210517;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.itag.model.v20210517.UpdateUserRoleInTntResponse;
import com.aliyuncs.itag.model.v20210517.UpdateUserRoleInTntResponse.Result;
import com.aliyuncs.itag.model.v20210517.UpdateUserRoleInTntResponse.Result.ITagSimpleUserVO;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateUserRoleInTntResponseUnmarshaller {

	public static UpdateUserRoleInTntResponse unmarshall(UpdateUserRoleInTntResponse updateUserRoleInTntResponse, UnmarshallerContext _ctx) {
		
		updateUserRoleInTntResponse.setRequestId(_ctx.stringValue("UpdateUserRoleInTntResponse.RequestId"));
		updateUserRoleInTntResponse.setCode(_ctx.stringValue("UpdateUserRoleInTntResponse.Code"));
		updateUserRoleInTntResponse.setErrInfo(_ctx.stringValue("UpdateUserRoleInTntResponse.ErrInfo"));
		updateUserRoleInTntResponse.setMsg(_ctx.stringValue("UpdateUserRoleInTntResponse.Msg"));
		updateUserRoleInTntResponse.setSucc(_ctx.booleanValue("UpdateUserRoleInTntResponse.Succ"));
		updateUserRoleInTntResponse.setErrorCode(_ctx.stringValue("UpdateUserRoleInTntResponse.ErrorCode"));

		Result result = new Result();
		result.setSuccCount(_ctx.integerValue("UpdateUserRoleInTntResponse.Result.SuccCount"));
		result.setFailCount(_ctx.integerValue("UpdateUserRoleInTntResponse.Result.FailCount"));
		result.setFailMsg(_ctx.stringValue("UpdateUserRoleInTntResponse.Result.FailMsg"));

		List<ITagSimpleUserVO> succUserList = new ArrayList<ITagSimpleUserVO>();
		for (int i = 0; i < _ctx.lengthValue("UpdateUserRoleInTntResponse.Result.SuccUserList.Length"); i++) {
			ITagSimpleUserVO iTagSimpleUserVO = new ITagSimpleUserVO();
			iTagSimpleUserVO.setUserId(_ctx.stringValue("UpdateUserRoleInTntResponse.Result.SuccUserList["+ i +"].UserId"));
			iTagSimpleUserVO.setUserName(_ctx.stringValue("UpdateUserRoleInTntResponse.Result.SuccUserList["+ i +"].UserName"));
			iTagSimpleUserVO.setAccountType(_ctx.stringValue("UpdateUserRoleInTntResponse.Result.SuccUserList["+ i +"].AccountType"));
			iTagSimpleUserVO.setAccountNo(_ctx.stringValue("UpdateUserRoleInTntResponse.Result.SuccUserList["+ i +"].AccountNo"));

			succUserList.add(iTagSimpleUserVO);
		}
		result.setSuccUserList(succUserList);

		List<ITagSimpleUserVO> failUserList = new ArrayList<ITagSimpleUserVO>();
		for (int i = 0; i < _ctx.lengthValue("UpdateUserRoleInTntResponse.Result.FailUserList.Length"); i++) {
			ITagSimpleUserVO iTagSimpleUserVO1 = new ITagSimpleUserVO();
			iTagSimpleUserVO1.setUserId(_ctx.stringValue("UpdateUserRoleInTntResponse.Result.FailUserList["+ i +"].UserId"));
			iTagSimpleUserVO1.setUserName(_ctx.stringValue("UpdateUserRoleInTntResponse.Result.FailUserList["+ i +"].UserName"));
			iTagSimpleUserVO1.setAccountType(_ctx.stringValue("UpdateUserRoleInTntResponse.Result.FailUserList["+ i +"].AccountType"));
			iTagSimpleUserVO1.setAccountNo(_ctx.stringValue("UpdateUserRoleInTntResponse.Result.FailUserList["+ i +"].AccountNo"));

			failUserList.add(iTagSimpleUserVO1);
		}
		result.setFailUserList(failUserList);
		updateUserRoleInTntResponse.setResult(result);
	 
	 	return updateUserRoleInTntResponse;
	}
}