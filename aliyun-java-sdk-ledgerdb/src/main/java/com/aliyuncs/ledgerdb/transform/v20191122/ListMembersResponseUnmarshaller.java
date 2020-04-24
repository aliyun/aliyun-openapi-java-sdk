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

package com.aliyuncs.ledgerdb.transform.v20191122;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ledgerdb.model.v20191122.ListMembersResponse;
import com.aliyuncs.ledgerdb.model.v20191122.ListMembersResponse.Member;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMembersResponseUnmarshaller {

	public static ListMembersResponse unmarshall(ListMembersResponse listMembersResponse, UnmarshallerContext _ctx) {
		
		listMembersResponse.setRequestId(_ctx.stringValue("ListMembersResponse.RequestId"));
		listMembersResponse.setNextToken(_ctx.stringValue("ListMembersResponse.NextToken"));
		listMembersResponse.setMaxResults(_ctx.integerValue("ListMembersResponse.MaxResults"));

		List<Member> members = new ArrayList<Member>();
		for (int i = 0; i < _ctx.lengthValue("ListMembersResponse.Members.Length"); i++) {
			Member member = new Member();
			member.setLedgerId(_ctx.stringValue("ListMembersResponse.Members["+ i +"].LedgerId"));
			member.setMemberId(_ctx.stringValue("ListMembersResponse.Members["+ i +"].MemberId"));
			member.setAliUid(_ctx.stringValue("ListMembersResponse.Members["+ i +"].AliUid"));
			member.setKeyType(_ctx.stringValue("ListMembersResponse.Members["+ i +"].KeyType"));
			member.setPublicKey(_ctx.stringValue("ListMembersResponse.Members["+ i +"].PublicKey"));
			member.setRole(_ctx.stringValue("ListMembersResponse.Members["+ i +"].Role"));
			member.setState(_ctx.stringValue("ListMembersResponse.Members["+ i +"].State"));
			member.setCreateTime(_ctx.longValue("ListMembersResponse.Members["+ i +"].CreateTime"));
			member.setUpdateTime(_ctx.longValue("ListMembersResponse.Members["+ i +"].UpdateTime"));

			members.add(member);
		}
		listMembersResponse.setMembers(members);
	 
	 	return listMembersResponse;
	}
}