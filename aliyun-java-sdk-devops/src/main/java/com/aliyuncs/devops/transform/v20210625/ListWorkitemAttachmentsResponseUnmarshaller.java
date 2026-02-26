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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.ListWorkitemAttachmentsResponse;
import com.aliyuncs.devops.model.v20210625.ListWorkitemAttachmentsResponse.Attachment;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWorkitemAttachmentsResponseUnmarshaller {

	public static ListWorkitemAttachmentsResponse unmarshall(ListWorkitemAttachmentsResponse listWorkitemAttachmentsResponse, UnmarshallerContext _ctx) {
		
		listWorkitemAttachmentsResponse.setRequestId(_ctx.stringValue("ListWorkitemAttachmentsResponse.requestId"));
		listWorkitemAttachmentsResponse.setErrorMsg(_ctx.stringValue("ListWorkitemAttachmentsResponse.errorMsg"));
		listWorkitemAttachmentsResponse.setErrorCode(_ctx.stringValue("ListWorkitemAttachmentsResponse.errorCode"));
		listWorkitemAttachmentsResponse.setSuccess(_ctx.booleanValue("ListWorkitemAttachmentsResponse.success"));

		List<Attachment> attachments = new ArrayList<Attachment>();
		for (int i = 0; i < _ctx.lengthValue("ListWorkitemAttachmentsResponse.attachments.Length"); i++) {
			Attachment attachment = new Attachment();
			attachment.setFileIdentifier(_ctx.stringValue("ListWorkitemAttachmentsResponse.attachments["+ i +"].fileIdentifier"));
			attachment.setFileName(_ctx.stringValue("ListWorkitemAttachmentsResponse.attachments["+ i +"].fileName"));
			attachment.setFileSuffix(_ctx.stringValue("ListWorkitemAttachmentsResponse.attachments["+ i +"].fileSuffix"));
			attachment.setSize(_ctx.stringValue("ListWorkitemAttachmentsResponse.attachments["+ i +"].size"));
			attachment.setUrl(_ctx.stringValue("ListWorkitemAttachmentsResponse.attachments["+ i +"].url"));
			attachment.setGmtCreate(_ctx.longValue("ListWorkitemAttachmentsResponse.attachments["+ i +"].gmtCreate"));
			attachment.setCreator(_ctx.stringValue("ListWorkitemAttachmentsResponse.attachments["+ i +"].creator"));

			attachments.add(attachment);
		}
		listWorkitemAttachmentsResponse.setAttachments(attachments);
	 
	 	return listWorkitemAttachmentsResponse;
	}
}