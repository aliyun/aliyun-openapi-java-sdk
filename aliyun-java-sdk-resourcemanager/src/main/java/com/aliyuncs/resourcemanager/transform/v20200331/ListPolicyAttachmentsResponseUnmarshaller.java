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

package com.aliyuncs.resourcemanager.transform.v20200331;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcemanager.model.v20200331.ListPolicyAttachmentsResponse;
import com.aliyuncs.resourcemanager.model.v20200331.ListPolicyAttachmentsResponse.PolicyAttachment;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPolicyAttachmentsResponseUnmarshaller {

	public static ListPolicyAttachmentsResponse unmarshall(ListPolicyAttachmentsResponse listPolicyAttachmentsResponse, UnmarshallerContext _ctx) {
		
		listPolicyAttachmentsResponse.setRequestId(_ctx.stringValue("ListPolicyAttachmentsResponse.RequestId"));
		listPolicyAttachmentsResponse.setTotalCount(_ctx.integerValue("ListPolicyAttachmentsResponse.TotalCount"));
		listPolicyAttachmentsResponse.setPageSize(_ctx.integerValue("ListPolicyAttachmentsResponse.PageSize"));
		listPolicyAttachmentsResponse.setPageNumber(_ctx.integerValue("ListPolicyAttachmentsResponse.PageNumber"));

		List<PolicyAttachment> policyAttachments = new ArrayList<PolicyAttachment>();
		for (int i = 0; i < _ctx.lengthValue("ListPolicyAttachmentsResponse.PolicyAttachments.Length"); i++) {
			PolicyAttachment policyAttachment = new PolicyAttachment();
			policyAttachment.setDescription(_ctx.stringValue("ListPolicyAttachmentsResponse.PolicyAttachments["+ i +"].Description"));
			policyAttachment.setResourceGroupId(_ctx.stringValue("ListPolicyAttachmentsResponse.PolicyAttachments["+ i +"].ResourceGroupId"));
			policyAttachment.setPolicyName(_ctx.stringValue("ListPolicyAttachmentsResponse.PolicyAttachments["+ i +"].PolicyName"));
			policyAttachment.setPrincipalName(_ctx.stringValue("ListPolicyAttachmentsResponse.PolicyAttachments["+ i +"].PrincipalName"));
			policyAttachment.setAttachDate(_ctx.stringValue("ListPolicyAttachmentsResponse.PolicyAttachments["+ i +"].AttachDate"));
			policyAttachment.setPolicyType(_ctx.stringValue("ListPolicyAttachmentsResponse.PolicyAttachments["+ i +"].PolicyType"));
			policyAttachment.setPrincipalType(_ctx.stringValue("ListPolicyAttachmentsResponse.PolicyAttachments["+ i +"].PrincipalType"));

			policyAttachments.add(policyAttachment);
		}
		listPolicyAttachmentsResponse.setPolicyAttachments(policyAttachments);
	 
	 	return listPolicyAttachmentsResponse;
	}
}