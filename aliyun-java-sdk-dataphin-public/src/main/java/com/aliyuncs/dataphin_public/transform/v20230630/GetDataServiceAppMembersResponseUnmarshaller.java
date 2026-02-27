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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceAppMembersResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceAppMembersResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceAppMembersResponse.Data.Member;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataServiceAppMembersResponseUnmarshaller {

	public static GetDataServiceAppMembersResponse unmarshall(GetDataServiceAppMembersResponse getDataServiceAppMembersResponse, UnmarshallerContext _ctx) {
		
		getDataServiceAppMembersResponse.setRequestId(_ctx.stringValue("GetDataServiceAppMembersResponse.RequestId"));
		getDataServiceAppMembersResponse.setMessage(_ctx.stringValue("GetDataServiceAppMembersResponse.Message"));
		getDataServiceAppMembersResponse.setHttpStatusCode(_ctx.integerValue("GetDataServiceAppMembersResponse.HttpStatusCode"));
		getDataServiceAppMembersResponse.setCode(_ctx.stringValue("GetDataServiceAppMembersResponse.Code"));
		getDataServiceAppMembersResponse.setSuccess(_ctx.booleanValue("GetDataServiceAppMembersResponse.Success"));

		Data data = new Data();

		List<Member> memberList = new ArrayList<Member>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServiceAppMembersResponse.Data.MemberList.Length"); i++) {
			Member member = new Member();
			member.setRole(_ctx.stringValue("GetDataServiceAppMembersResponse.Data.MemberList["+ i +"].Role"));
			member.setEffectiveEnd(_ctx.stringValue("GetDataServiceAppMembersResponse.Data.MemberList["+ i +"].EffectiveEnd"));
			member.setUserId(_ctx.stringValue("GetDataServiceAppMembersResponse.Data.MemberList["+ i +"].UserId"));

			memberList.add(member);
		}
		data.setMemberList(memberList);
		getDataServiceAppMembersResponse.setData(data);
	 
	 	return getDataServiceAppMembersResponse;
	}
}