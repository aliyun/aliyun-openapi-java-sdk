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

import com.aliyuncs.dataphin_public.model.v20230630.GetStandardSetResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardSetResponse.StandardSetInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardSetResponse.StandardSetInfo.ApprovalConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardSetResponse.StandardSetInfo.Creator;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardSetResponse.StandardSetInfo.DirectoryReference;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardSetResponse.StandardSetInfo.LastModifier;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardSetResponse.StandardSetInfo.Maintainer;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardSetResponse.StandardSetInfo.Member;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardSetResponse.StandardSetInfo.MemberGroup;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardSetResponse.StandardSetInfo.OfflineApprovalConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardSetResponse.StandardSetInfo.VisibilityConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardSetResponse.StandardSetInfo.VisibilityConfig.SpecifiedUser;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStandardSetResponseUnmarshaller {

	public static GetStandardSetResponse unmarshall(GetStandardSetResponse getStandardSetResponse, UnmarshallerContext _ctx) {
		
		getStandardSetResponse.setRequestId(_ctx.stringValue("GetStandardSetResponse.RequestId"));
		getStandardSetResponse.setSuccess(_ctx.booleanValue("GetStandardSetResponse.Success"));
		getStandardSetResponse.setHttpStatusCode(_ctx.integerValue("GetStandardSetResponse.HttpStatusCode"));
		getStandardSetResponse.setCode(_ctx.stringValue("GetStandardSetResponse.Code"));
		getStandardSetResponse.setMessage(_ctx.stringValue("GetStandardSetResponse.Message"));

		StandardSetInfo standardSetInfo = new StandardSetInfo();
		standardSetInfo.setId(_ctx.longValue("GetStandardSetResponse.StandardSetInfo.Id"));
		standardSetInfo.setName(_ctx.stringValue("GetStandardSetResponse.StandardSetInfo.Name"));
		standardSetInfo.setCode(_ctx.stringValue("GetStandardSetResponse.StandardSetInfo.Code"));
		standardSetInfo.setDescription(_ctx.stringValue("GetStandardSetResponse.StandardSetInfo.Description"));
		standardSetInfo.setCreateTime(_ctx.stringValue("GetStandardSetResponse.StandardSetInfo.CreateTime"));
		standardSetInfo.setModifyTime(_ctx.stringValue("GetStandardSetResponse.StandardSetInfo.ModifyTime"));
		standardSetInfo.setDefaultStandardTemplateId(_ctx.longValue("GetStandardSetResponse.StandardSetInfo.DefaultStandardTemplateId"));

		DirectoryReference directoryReference = new DirectoryReference();
		directoryReference.setDirectory(_ctx.stringValue("GetStandardSetResponse.StandardSetInfo.DirectoryReference.Directory"));
		standardSetInfo.setDirectoryReference(directoryReference);

		VisibilityConfig visibilityConfig = new VisibilityConfig();
		visibilityConfig.setType(_ctx.stringValue("GetStandardSetResponse.StandardSetInfo.VisibilityConfig.Type"));

		List<SpecifiedUser> specifiedUserList = new ArrayList<SpecifiedUser>();
		for (int i = 0; i < _ctx.lengthValue("GetStandardSetResponse.StandardSetInfo.VisibilityConfig.SpecifiedUserList.Length"); i++) {
			SpecifiedUser specifiedUser = new SpecifiedUser();
			specifiedUser.setId(_ctx.stringValue("GetStandardSetResponse.StandardSetInfo.VisibilityConfig.SpecifiedUserList["+ i +"].Id"));
			specifiedUser.setName(_ctx.stringValue("GetStandardSetResponse.StandardSetInfo.VisibilityConfig.SpecifiedUserList["+ i +"].Name"));

			specifiedUserList.add(specifiedUser);
		}
		visibilityConfig.setSpecifiedUserList(specifiedUserList);
		standardSetInfo.setVisibilityConfig(visibilityConfig);

		Creator creator = new Creator();
		creator.setId(_ctx.stringValue("GetStandardSetResponse.StandardSetInfo.Creator.Id"));
		creator.setName(_ctx.stringValue("GetStandardSetResponse.StandardSetInfo.Creator.Name"));
		standardSetInfo.setCreator(creator);

		LastModifier lastModifier = new LastModifier();
		lastModifier.setId(_ctx.stringValue("GetStandardSetResponse.StandardSetInfo.LastModifier.Id"));
		lastModifier.setName(_ctx.stringValue("GetStandardSetResponse.StandardSetInfo.LastModifier.Name"));
		standardSetInfo.setLastModifier(lastModifier);

		ApprovalConfig approvalConfig = new ApprovalConfig();
		approvalConfig.setEnableApproval(_ctx.booleanValue("GetStandardSetResponse.StandardSetInfo.ApprovalConfig.EnableApproval"));
		approvalConfig.setIsSubmitInBatch(_ctx.booleanValue("GetStandardSetResponse.StandardSetInfo.ApprovalConfig.IsSubmitInBatch"));
		approvalConfig.setApprovalType(_ctx.stringValue("GetStandardSetResponse.StandardSetInfo.ApprovalConfig.ApprovalType"));
		approvalConfig.setTemplateId(_ctx.longValue("GetStandardSetResponse.StandardSetInfo.ApprovalConfig.TemplateId"));
		standardSetInfo.setApprovalConfig(approvalConfig);

		OfflineApprovalConfig offlineApprovalConfig = new OfflineApprovalConfig();
		offlineApprovalConfig.setEnableApproval(_ctx.booleanValue("GetStandardSetResponse.StandardSetInfo.OfflineApprovalConfig.EnableApproval"));
		offlineApprovalConfig.setIsSubmitInBatch(_ctx.booleanValue("GetStandardSetResponse.StandardSetInfo.OfflineApprovalConfig.IsSubmitInBatch"));
		offlineApprovalConfig.setApprovalType(_ctx.stringValue("GetStandardSetResponse.StandardSetInfo.OfflineApprovalConfig.ApprovalType"));
		offlineApprovalConfig.setTemplateId(_ctx.longValue("GetStandardSetResponse.StandardSetInfo.OfflineApprovalConfig.TemplateId"));
		standardSetInfo.setOfflineApprovalConfig(offlineApprovalConfig);

		List<Maintainer> maintainerList = new ArrayList<Maintainer>();
		for (int i = 0; i < _ctx.lengthValue("GetStandardSetResponse.StandardSetInfo.MaintainerList.Length"); i++) {
			Maintainer maintainer = new Maintainer();
			maintainer.setId(_ctx.stringValue("GetStandardSetResponse.StandardSetInfo.MaintainerList["+ i +"].Id"));
			maintainer.setName(_ctx.stringValue("GetStandardSetResponse.StandardSetInfo.MaintainerList["+ i +"].Name"));

			maintainerList.add(maintainer);
		}
		standardSetInfo.setMaintainerList(maintainerList);

		List<Member> memberList = new ArrayList<Member>();
		for (int i = 0; i < _ctx.lengthValue("GetStandardSetResponse.StandardSetInfo.MemberList.Length"); i++) {
			Member member = new Member();
			member.setId(_ctx.stringValue("GetStandardSetResponse.StandardSetInfo.MemberList["+ i +"].Id"));
			member.setName(_ctx.stringValue("GetStandardSetResponse.StandardSetInfo.MemberList["+ i +"].Name"));

			memberList.add(member);
		}
		standardSetInfo.setMemberList(memberList);

		List<MemberGroup> memberGroupList = new ArrayList<MemberGroup>();
		for (int i = 0; i < _ctx.lengthValue("GetStandardSetResponse.StandardSetInfo.MemberGroupList.Length"); i++) {
			MemberGroup memberGroup = new MemberGroup();
			memberGroup.setId(_ctx.stringValue("GetStandardSetResponse.StandardSetInfo.MemberGroupList["+ i +"].Id"));
			memberGroup.setName(_ctx.stringValue("GetStandardSetResponse.StandardSetInfo.MemberGroupList["+ i +"].Name"));

			memberGroupList.add(memberGroup);
		}
		standardSetInfo.setMemberGroupList(memberGroupList);
		getStandardSetResponse.setStandardSetInfo(standardSetInfo);
	 
	 	return getStandardSetResponse;
	}
}