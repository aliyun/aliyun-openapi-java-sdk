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

import com.aliyuncs.resourcemanager.model.v20200331.ListTargetAttachmentsForControlPolicyResponse;
import com.aliyuncs.resourcemanager.model.v20200331.ListTargetAttachmentsForControlPolicyResponse.TargetAttachment;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTargetAttachmentsForControlPolicyResponseUnmarshaller {

	public static ListTargetAttachmentsForControlPolicyResponse unmarshall(ListTargetAttachmentsForControlPolicyResponse listTargetAttachmentsForControlPolicyResponse, UnmarshallerContext _ctx) {
		
		listTargetAttachmentsForControlPolicyResponse.setRequestId(_ctx.stringValue("ListTargetAttachmentsForControlPolicyResponse.RequestId"));
		listTargetAttachmentsForControlPolicyResponse.setTotalCount(_ctx.integerValue("ListTargetAttachmentsForControlPolicyResponse.TotalCount"));
		listTargetAttachmentsForControlPolicyResponse.setPageSize(_ctx.integerValue("ListTargetAttachmentsForControlPolicyResponse.PageSize"));
		listTargetAttachmentsForControlPolicyResponse.setPageNumber(_ctx.integerValue("ListTargetAttachmentsForControlPolicyResponse.PageNumber"));

		List<TargetAttachment> targetAttachments = new ArrayList<TargetAttachment>();
		for (int i = 0; i < _ctx.lengthValue("ListTargetAttachmentsForControlPolicyResponse.TargetAttachments.Length"); i++) {
			TargetAttachment targetAttachment = new TargetAttachment();
			targetAttachment.setTargetId(_ctx.stringValue("ListTargetAttachmentsForControlPolicyResponse.TargetAttachments["+ i +"].TargetId"));
			targetAttachment.setTargetName(_ctx.stringValue("ListTargetAttachmentsForControlPolicyResponse.TargetAttachments["+ i +"].TargetName"));
			targetAttachment.setAttachDate(_ctx.stringValue("ListTargetAttachmentsForControlPolicyResponse.TargetAttachments["+ i +"].AttachDate"));
			targetAttachment.setTargetType(_ctx.stringValue("ListTargetAttachmentsForControlPolicyResponse.TargetAttachments["+ i +"].TargetType"));

			targetAttachments.add(targetAttachment);
		}
		listTargetAttachmentsForControlPolicyResponse.setTargetAttachments(targetAttachments);
	 
	 	return listTargetAttachmentsForControlPolicyResponse;
	}
}