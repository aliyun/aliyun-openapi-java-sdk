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

import com.aliyuncs.lto.model.v20210707.ListPrivacyRuleSharedMemberResponse;
import com.aliyuncs.lto.model.v20210707.ListPrivacyRuleSharedMemberResponse.BizChainInfo;
import com.aliyuncs.lto.model.v20210707.ListPrivacyRuleSharedMemberResponse.BizChainInfo.MemberInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPrivacyRuleSharedMemberResponseUnmarshaller {

	public static ListPrivacyRuleSharedMemberResponse unmarshall(ListPrivacyRuleSharedMemberResponse listPrivacyRuleSharedMemberResponse, UnmarshallerContext _ctx) {
		
		listPrivacyRuleSharedMemberResponse.setRequestId(_ctx.stringValue("ListPrivacyRuleSharedMemberResponse.RequestId"));
		listPrivacyRuleSharedMemberResponse.setCode(_ctx.stringValue("ListPrivacyRuleSharedMemberResponse.Code"));
		listPrivacyRuleSharedMemberResponse.setHttpStatusCode(_ctx.integerValue("ListPrivacyRuleSharedMemberResponse.HttpStatusCode"));
		listPrivacyRuleSharedMemberResponse.setMessage(_ctx.stringValue("ListPrivacyRuleSharedMemberResponse.Message"));
		listPrivacyRuleSharedMemberResponse.setSuccess(_ctx.booleanValue("ListPrivacyRuleSharedMemberResponse.Success"));

		List<BizChainInfo> data = new ArrayList<BizChainInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListPrivacyRuleSharedMemberResponse.Data.Length"); i++) {
			BizChainInfo bizChainInfo = new BizChainInfo();
			bizChainInfo.setBizChainId(_ctx.stringValue("ListPrivacyRuleSharedMemberResponse.Data["+ i +"].BizChainId"));
			bizChainInfo.setBizChainName(_ctx.stringValue("ListPrivacyRuleSharedMemberResponse.Data["+ i +"].BizChainName"));

			List<MemberInfo> memberList = new ArrayList<MemberInfo>();
			for (int j = 0; j < _ctx.lengthValue("ListPrivacyRuleSharedMemberResponse.Data["+ i +"].MemberList.Length"); j++) {
				MemberInfo memberInfo = new MemberInfo();
				memberInfo.setShared(_ctx.stringValue("ListPrivacyRuleSharedMemberResponse.Data["+ i +"].MemberList["+ j +"].Shared"));
				memberInfo.setMemberId(_ctx.stringValue("ListPrivacyRuleSharedMemberResponse.Data["+ i +"].MemberList["+ j +"].MemberId"));
				memberInfo.setMemberName(_ctx.stringValue("ListPrivacyRuleSharedMemberResponse.Data["+ i +"].MemberList["+ j +"].MemberName"));

				memberList.add(memberInfo);
			}
			bizChainInfo.setMemberList(memberList);

			data.add(bizChainInfo);
		}
		listPrivacyRuleSharedMemberResponse.setData(data);
	 
	 	return listPrivacyRuleSharedMemberResponse;
	}
}