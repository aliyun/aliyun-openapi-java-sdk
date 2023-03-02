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

import com.aliyuncs.lto.model.v20210707.ListMemberAccessRecordResponse;
import com.aliyuncs.lto.model.v20210707.ListMemberAccessRecordResponse.Data;
import com.aliyuncs.lto.model.v20210707.ListMemberAccessRecordResponse.Data.MemberInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMemberAccessRecordResponseUnmarshaller {

	public static ListMemberAccessRecordResponse unmarshall(ListMemberAccessRecordResponse listMemberAccessRecordResponse, UnmarshallerContext _ctx) {
		
		listMemberAccessRecordResponse.setRequestId(_ctx.stringValue("ListMemberAccessRecordResponse.RequestId"));
		listMemberAccessRecordResponse.setCode(_ctx.stringValue("ListMemberAccessRecordResponse.Code"));
		listMemberAccessRecordResponse.setHttpStatusCode(_ctx.integerValue("ListMemberAccessRecordResponse.HttpStatusCode"));
		listMemberAccessRecordResponse.setMessage(_ctx.stringValue("ListMemberAccessRecordResponse.Message"));
		listMemberAccessRecordResponse.setSuccess(_ctx.booleanValue("ListMemberAccessRecordResponse.Success"));

		Data data = new Data();
		data.setNum(_ctx.integerValue("ListMemberAccessRecordResponse.Data.Num"));
		data.setTotal(_ctx.integerValue("ListMemberAccessRecordResponse.Data.Total"));
		data.setSize(_ctx.integerValue("ListMemberAccessRecordResponse.Data.Size"));

		List<MemberInfo> pageData = new ArrayList<MemberInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListMemberAccessRecordResponse.Data.PageData.Length"); i++) {
			MemberInfo memberInfo = new MemberInfo();
			memberInfo.setStatus(_ctx.stringValue("ListMemberAccessRecordResponse.Data.PageData["+ i +"].Status"));
			memberInfo.setAuthorizedCount(_ctx.longValue("ListMemberAccessRecordResponse.Data.PageData["+ i +"].AuthorizedCount"));
			memberInfo.setRemark(_ctx.stringValue("ListMemberAccessRecordResponse.Data.PageData["+ i +"].Remark"));
			memberInfo.setAdminName(_ctx.stringValue("ListMemberAccessRecordResponse.Data.PageData["+ i +"].AdminName"));
			memberInfo.setMemberId(_ctx.stringValue("ListMemberAccessRecordResponse.Data.PageData["+ i +"].MemberId"));
			memberInfo.setName(_ctx.stringValue("ListMemberAccessRecordResponse.Data.PageData["+ i +"].Name"));
			memberInfo.setContactor(_ctx.stringValue("ListMemberAccessRecordResponse.Data.PageData["+ i +"].Contactor"));
			memberInfo.setTelephony(_ctx.stringValue("ListMemberAccessRecordResponse.Data.PageData["+ i +"].Telephony"));
			memberInfo.setUid(_ctx.stringValue("ListMemberAccessRecordResponse.Data.PageData["+ i +"].Uid"));
			memberInfo.setAccessStatus(_ctx.stringValue("ListMemberAccessRecordResponse.Data.PageData["+ i +"].AccessStatus"));
			memberInfo.setAccessDate(_ctx.longValue("ListMemberAccessRecordResponse.Data.PageData["+ i +"].AccessDate"));
			memberInfo.setMemberResponseDate(_ctx.longValue("ListMemberAccessRecordResponse.Data.PageData["+ i +"].MemberResponseDate"));
			memberInfo.setAuthorizedDeviceCount(_ctx.integerValue("ListMemberAccessRecordResponse.Data.PageData["+ i +"].AuthorizedDeviceCount"));

			pageData.add(memberInfo);
		}
		data.setPageData(pageData);
		listMemberAccessRecordResponse.setData(data);
	 
	 	return listMemberAccessRecordResponse;
	}
}