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

import com.aliyuncs.itag.model.v20210517.GetOrCreateTntInstByBizNoResponse;
import com.aliyuncs.itag.model.v20210517.GetOrCreateTntInstByBizNoResponse.Result;
import com.aliyuncs.itag.model.v20210517.GetOrCreateTntInstByBizNoResponse.Result.Creator;
import com.aliyuncs.itag.model.v20210517.GetOrCreateTntInstByBizNoResponse.Result.Modifier;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOrCreateTntInstByBizNoResponseUnmarshaller {

	public static GetOrCreateTntInstByBizNoResponse unmarshall(GetOrCreateTntInstByBizNoResponse getOrCreateTntInstByBizNoResponse, UnmarshallerContext _ctx) {
		
		getOrCreateTntInstByBizNoResponse.setRequestId(_ctx.stringValue("GetOrCreateTntInstByBizNoResponse.RequestId"));
		getOrCreateTntInstByBizNoResponse.setCode(_ctx.stringValue("GetOrCreateTntInstByBizNoResponse.Code"));
		getOrCreateTntInstByBizNoResponse.setErrInfo(_ctx.stringValue("GetOrCreateTntInstByBizNoResponse.ErrInfo"));
		getOrCreateTntInstByBizNoResponse.setMsg(_ctx.stringValue("GetOrCreateTntInstByBizNoResponse.Msg"));
		getOrCreateTntInstByBizNoResponse.setSucc(_ctx.booleanValue("GetOrCreateTntInstByBizNoResponse.Succ"));
		getOrCreateTntInstByBizNoResponse.setErrorCode(_ctx.stringValue("GetOrCreateTntInstByBizNoResponse.ErrorCode"));

		Result result = new Result();
		result.setGmtCreate(_ctx.stringValue("GetOrCreateTntInstByBizNoResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.stringValue("GetOrCreateTntInstByBizNoResponse.Result.GmtModified"));
		result.setTntInstId(_ctx.stringValue("GetOrCreateTntInstByBizNoResponse.Result.TntInstId"));
		result.setName(_ctx.stringValue("GetOrCreateTntInstByBizNoResponse.Result.Name"));
		result.setBizNO(_ctx.stringValue("GetOrCreateTntInstByBizNoResponse.Result.BizNO"));

		Creator creator = new Creator();
		creator.setUserId(_ctx.stringValue("GetOrCreateTntInstByBizNoResponse.Result.Creator.UserId"));
		creator.setUserName(_ctx.stringValue("GetOrCreateTntInstByBizNoResponse.Result.Creator.UserName"));
		creator.setAccountType(_ctx.stringValue("GetOrCreateTntInstByBizNoResponse.Result.Creator.AccountType"));
		creator.setAccountNo(_ctx.stringValue("GetOrCreateTntInstByBizNoResponse.Result.Creator.AccountNo"));
		result.setCreator(creator);

		Modifier modifier = new Modifier();
		modifier.setUserId(_ctx.stringValue("GetOrCreateTntInstByBizNoResponse.Result.Modifier.UserId"));
		modifier.setUserName(_ctx.stringValue("GetOrCreateTntInstByBizNoResponse.Result.Modifier.UserName"));
		modifier.setAccountType(_ctx.stringValue("GetOrCreateTntInstByBizNoResponse.Result.Modifier.AccountType"));
		modifier.setAccountNo(_ctx.stringValue("GetOrCreateTntInstByBizNoResponse.Result.Modifier.AccountNo"));
		result.setModifier(modifier);
		getOrCreateTntInstByBizNoResponse.setResult(result);
	 
	 	return getOrCreateTntInstByBizNoResponse;
	}
}