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

package com.aliyuncs.lto.transform.v20210707;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.lto.model.v20210707.ListAllMemberResponse;
import com.aliyuncs.lto.model.v20210707.ListAllMemberResponse.MemberInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAllMemberResponseUnmarshaller {

	public static ListAllMemberResponse unmarshall(ListAllMemberResponse listAllMemberResponse, UnmarshallerContext _ctx) {
		
		listAllMemberResponse.setRequestId(_ctx.stringValue("ListAllMemberResponse.RequestId"));
		listAllMemberResponse.setCode(_ctx.stringValue("ListAllMemberResponse.Code"));
		listAllMemberResponse.setHttpStatusCode(_ctx.integerValue("ListAllMemberResponse.HttpStatusCode"));
		listAllMemberResponse.setMessage(_ctx.stringValue("ListAllMemberResponse.Message"));
		listAllMemberResponse.setSuccess(_ctx.booleanValue("ListAllMemberResponse.Success"));

		List<MemberInfo> data = new ArrayList<MemberInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListAllMemberResponse.Data.Length"); i++) {
			MemberInfo memberInfo = new MemberInfo();
			memberInfo.setName(_ctx.stringValue("ListAllMemberResponse.Data["+ i +"].Name"));
			memberInfo.setMemberId(_ctx.stringValue("ListAllMemberResponse.Data["+ i +"].MemberId"));

			data.add(memberInfo);
		}
		listAllMemberResponse.setData(data);
	 
	 	return listAllMemberResponse;
	}
}