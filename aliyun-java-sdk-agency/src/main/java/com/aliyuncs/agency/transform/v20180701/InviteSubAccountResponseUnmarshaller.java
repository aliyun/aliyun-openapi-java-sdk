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

import com.aliyuncs.agency.model.v20180701.InviteSubAccountResponse;
import com.aliyuncs.agency.model.v20180701.InviteSubAccountResponse.Result;
import com.aliyuncs.agency.model.v20180701.InviteSubAccountResponse.Result.Result1;
import com.aliyuncs.transform.UnmarshallerContext;


public class InviteSubAccountResponseUnmarshaller {

	public static InviteSubAccountResponse unmarshall(InviteSubAccountResponse inviteSubAccountResponse, UnmarshallerContext _ctx) {
		
		inviteSubAccountResponse.setRequestId(_ctx.stringValue("InviteSubAccountResponse.RequestId"));
		inviteSubAccountResponse.setCode(_ctx.stringValue("InviteSubAccountResponse.Code"));
		inviteSubAccountResponse.setMessage(_ctx.stringValue("InviteSubAccountResponse.Message"));
		inviteSubAccountResponse.setSuccess(_ctx.booleanValue("InviteSubAccountResponse.Success"));

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("InviteSubAccountResponse.Results.Length"); i++) {
			Result result = new Result();
			result.setCode(_ctx.stringValue("InviteSubAccountResponse.Results["+ i +"].Code"));
			result.setMessage(_ctx.stringValue("InviteSubAccountResponse.Results["+ i +"].Message"));
			result.setSuccess(_ctx.booleanValue("InviteSubAccountResponse.Results["+ i +"].Success"));

			Result1 result1 = new Result1();
			result1.setRegUrl(_ctx.stringValue("InviteSubAccountResponse.Results["+ i +"].Result.RegUrl"));
			result1.setDays(_ctx.integerValue("InviteSubAccountResponse.Results["+ i +"].Result.Days"));
			result1.setInviteId(_ctx.longValue("InviteSubAccountResponse.Results["+ i +"].Result.InviteId"));
			result.setResult1(result1);

			results.add(result);
		}
		inviteSubAccountResponse.setResults(results);
	 
	 	return inviteSubAccountResponse;
	}
}