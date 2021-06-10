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

package com.aliyuncs.ltl.transform.v20190510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ltl.model.v20190510.ListMemberResponse;
import com.aliyuncs.ltl.model.v20190510.ListMemberResponse.Data;
import com.aliyuncs.ltl.model.v20190510.ListMemberResponse.Data.MemberInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMemberResponseUnmarshaller {

	public static ListMemberResponse unmarshall(ListMemberResponse listMemberResponse, UnmarshallerContext _ctx) {
		
		listMemberResponse.setRequestId(_ctx.stringValue("ListMemberResponse.RequestId"));
		listMemberResponse.setCode(_ctx.integerValue("ListMemberResponse.Code"));
		listMemberResponse.setSuccess(_ctx.booleanValue("ListMemberResponse.Success"));
		listMemberResponse.setMessage(_ctx.stringValue("ListMemberResponse.Message"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("ListMemberResponse.Data.Total"));
		data.setNum(_ctx.integerValue("ListMemberResponse.Data.Num"));
		data.setSize(_ctx.integerValue("ListMemberResponse.Data.Size"));

		List<MemberInfo> pageData = new ArrayList<MemberInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListMemberResponse.Data.PageData.Length"); i++) {
			MemberInfo memberInfo = new MemberInfo();
			memberInfo.setMemberId(_ctx.stringValue("ListMemberResponse.Data.PageData["+ i +"].MemberId"));
			memberInfo.setMemberName(_ctx.stringValue("ListMemberResponse.Data.PageData["+ i +"].MemberName"));
			memberInfo.setMemberUid(_ctx.stringValue("ListMemberResponse.Data.PageData["+ i +"].MemberUid"));
			memberInfo.setMemberContact(_ctx.stringValue("ListMemberResponse.Data.PageData["+ i +"].MemberContact"));
			memberInfo.setMemberPhone(_ctx.stringValue("ListMemberResponse.Data.PageData["+ i +"].MemberPhone"));
			memberInfo.setRemark(_ctx.stringValue("ListMemberResponse.Data.PageData["+ i +"].Remark"));
			memberInfo.setStatus(_ctx.stringValue("ListMemberResponse.Data.PageData["+ i +"].Status"));

			pageData.add(memberInfo);
		}
		data.setPageData(pageData);
		listMemberResponse.setData(data);
	 
	 	return listMemberResponse;
	}
}