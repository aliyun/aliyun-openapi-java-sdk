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

import com.aliyuncs.resourcemanager.model.v20200331.ListControlPolicyAttachmentsForTargetResponse;
import com.aliyuncs.resourcemanager.model.v20200331.ListControlPolicyAttachmentsForTargetResponse.ControlPolicyAttachment;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListControlPolicyAttachmentsForTargetResponseUnmarshaller {

	public static ListControlPolicyAttachmentsForTargetResponse unmarshall(ListControlPolicyAttachmentsForTargetResponse listControlPolicyAttachmentsForTargetResponse, UnmarshallerContext _ctx) {
		
		listControlPolicyAttachmentsForTargetResponse.setRequestId(_ctx.stringValue("ListControlPolicyAttachmentsForTargetResponse.RequestId"));

		List<ControlPolicyAttachment> controlPolicyAttachments = new ArrayList<ControlPolicyAttachment>();
		for (int i = 0; i < _ctx.lengthValue("ListControlPolicyAttachmentsForTargetResponse.ControlPolicyAttachments.Length"); i++) {
			ControlPolicyAttachment controlPolicyAttachment = new ControlPolicyAttachment();
			controlPolicyAttachment.setDescription(_ctx.stringValue("ListControlPolicyAttachmentsForTargetResponse.ControlPolicyAttachments["+ i +"].Description"));
			controlPolicyAttachment.setEffectScope(_ctx.stringValue("ListControlPolicyAttachmentsForTargetResponse.ControlPolicyAttachments["+ i +"].EffectScope"));
			controlPolicyAttachment.setPolicyName(_ctx.stringValue("ListControlPolicyAttachmentsForTargetResponse.ControlPolicyAttachments["+ i +"].PolicyName"));
			controlPolicyAttachment.setPolicyId(_ctx.stringValue("ListControlPolicyAttachmentsForTargetResponse.ControlPolicyAttachments["+ i +"].PolicyId"));
			controlPolicyAttachment.setAttachDate(_ctx.stringValue("ListControlPolicyAttachmentsForTargetResponse.ControlPolicyAttachments["+ i +"].AttachDate"));
			controlPolicyAttachment.setPolicyType(_ctx.stringValue("ListControlPolicyAttachmentsForTargetResponse.ControlPolicyAttachments["+ i +"].PolicyType"));

			controlPolicyAttachments.add(controlPolicyAttachment);
		}
		listControlPolicyAttachmentsForTargetResponse.setControlPolicyAttachments(controlPolicyAttachments);
	 
	 	return listControlPolicyAttachmentsForTargetResponse;
	}
}