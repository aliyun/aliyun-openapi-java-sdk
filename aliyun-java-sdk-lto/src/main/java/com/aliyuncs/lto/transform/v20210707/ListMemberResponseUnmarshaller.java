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

import com.aliyuncs.lto.model.v20210707.ListMemberResponse;
import com.aliyuncs.lto.model.v20210707.ListMemberResponse.Data;
import com.aliyuncs.lto.model.v20210707.ListMemberResponse.Data.MemberInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMemberResponseUnmarshaller {

	public static ListMemberResponse unmarshall(ListMemberResponse listMemberResponse, UnmarshallerContext _ctx) {
		
		listMemberResponse.setRequestId(_ctx.stringValue("ListMemberResponse.RequestId"));
		listMemberResponse.setCode(_ctx.stringValue("ListMemberResponse.Code"));
		listMemberResponse.setHttpStatusCode(_ctx.integerValue("ListMemberResponse.HttpStatusCode"));
		listMemberResponse.setMessage(_ctx.stringValue("ListMemberResponse.Message"));
		listMemberResponse.setSuccess(_ctx.booleanValue("ListMemberResponse.Success"));

		Data data = new Data();
		data.setNum(_ctx.integerValue("ListMemberResponse.Data.Num"));
		data.setTotal(_ctx.integerValue("ListMemberResponse.Data.Total"));
		data.setSize(_ctx.integerValue("ListMemberResponse.Data.Size"));

		List<MemberInfo> pageData = new ArrayList<MemberInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListMemberResponse.Data.PageData.Length"); i++) {
			MemberInfo memberInfo = new MemberInfo();
			memberInfo.setStatus(_ctx.stringValue("ListMemberResponse.Data.PageData["+ i +"].Status"));
			memberInfo.setAuthorizedCount(_ctx.longValue("ListMemberResponse.Data.PageData["+ i +"].AuthorizedCount"));
			memberInfo.setRemark(_ctx.stringValue("ListMemberResponse.Data.PageData["+ i +"].Remark"));
			memberInfo.setAdminName(_ctx.stringValue("ListMemberResponse.Data.PageData["+ i +"].AdminName"));
			memberInfo.setMemberId(_ctx.stringValue("ListMemberResponse.Data.PageData["+ i +"].MemberId"));
			memberInfo.setName(_ctx.stringValue("ListMemberResponse.Data.PageData["+ i +"].Name"));
			memberInfo.setContactor(_ctx.stringValue("ListMemberResponse.Data.PageData["+ i +"].Contactor"));
			memberInfo.setTelephony(_ctx.stringValue("ListMemberResponse.Data.PageData["+ i +"].Telephony"));
			memberInfo.setUid(_ctx.stringValue("ListMemberResponse.Data.PageData["+ i +"].Uid"));
			memberInfo.setAuthorizedDeviceCount(_ctx.integerValue("ListMemberResponse.Data.PageData["+ i +"].AuthorizedDeviceCount"));

			pageData.add(memberInfo);
		}
		data.setPageData(pageData);
		listMemberResponse.setData(data);
	 
	 	return listMemberResponse;
	}
}