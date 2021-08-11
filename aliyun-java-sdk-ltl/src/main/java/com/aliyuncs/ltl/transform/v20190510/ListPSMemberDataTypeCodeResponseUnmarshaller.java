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

import com.aliyuncs.ltl.model.v20190510.ListPSMemberDataTypeCodeResponse;
import com.aliyuncs.ltl.model.v20190510.ListPSMemberDataTypeCodeResponse.Data;
import com.aliyuncs.ltl.model.v20190510.ListPSMemberDataTypeCodeResponse.Data.MemberInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPSMemberDataTypeCodeResponseUnmarshaller {

	public static ListPSMemberDataTypeCodeResponse unmarshall(ListPSMemberDataTypeCodeResponse listPSMemberDataTypeCodeResponse, UnmarshallerContext _ctx) {
		
		listPSMemberDataTypeCodeResponse.setRequestId(_ctx.stringValue("ListPSMemberDataTypeCodeResponse.RequestId"));
		listPSMemberDataTypeCodeResponse.setCode(_ctx.integerValue("ListPSMemberDataTypeCodeResponse.Code"));
		listPSMemberDataTypeCodeResponse.setSuccess(_ctx.booleanValue("ListPSMemberDataTypeCodeResponse.Success"));
		listPSMemberDataTypeCodeResponse.setMessage(_ctx.stringValue("ListPSMemberDataTypeCodeResponse.Message"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("ListPSMemberDataTypeCodeResponse.Data.Total"));
		data.setNum(_ctx.integerValue("ListPSMemberDataTypeCodeResponse.Data.Num"));
		data.setSize(_ctx.integerValue("ListPSMemberDataTypeCodeResponse.Data.Size"));

		List<MemberInfo> pageData = new ArrayList<MemberInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListPSMemberDataTypeCodeResponse.Data.PageData.Length"); i++) {
			MemberInfo memberInfo = new MemberInfo();
			memberInfo.setMemberId(_ctx.stringValue("ListPSMemberDataTypeCodeResponse.Data.PageData["+ i +"].MemberId"));
			memberInfo.setMemberName(_ctx.stringValue("ListPSMemberDataTypeCodeResponse.Data.PageData["+ i +"].MemberName"));
			memberInfo.setMemberUid(_ctx.stringValue("ListPSMemberDataTypeCodeResponse.Data.PageData["+ i +"].MemberUid"));
			memberInfo.setDataTypeCode(_ctx.stringValue("ListPSMemberDataTypeCodeResponse.Data.PageData["+ i +"].DataTypeCode"));

			pageData.add(memberInfo);
		}
		data.setPageData(pageData);
		listPSMemberDataTypeCodeResponse.setData(data);
	 
	 	return listPSMemberDataTypeCodeResponse;
	}
}