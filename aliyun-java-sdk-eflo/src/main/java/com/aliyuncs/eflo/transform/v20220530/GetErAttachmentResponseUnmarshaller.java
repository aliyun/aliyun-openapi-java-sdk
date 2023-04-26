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

package com.aliyuncs.eflo.transform.v20220530;

import com.aliyuncs.eflo.model.v20220530.GetErAttachmentResponse;
import com.aliyuncs.eflo.model.v20220530.GetErAttachmentResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetErAttachmentResponseUnmarshaller {

	public static GetErAttachmentResponse unmarshall(GetErAttachmentResponse getErAttachmentResponse, UnmarshallerContext _ctx) {
		
		getErAttachmentResponse.setRequestId(_ctx.stringValue("GetErAttachmentResponse.RequestId"));
		getErAttachmentResponse.setCode(_ctx.integerValue("GetErAttachmentResponse.Code"));
		getErAttachmentResponse.setMessage(_ctx.stringValue("GetErAttachmentResponse.Message"));

		Content content = new Content();
		content.setCreateTime(_ctx.stringValue("GetErAttachmentResponse.Content.CreateTime"));
		content.setGmtModified(_ctx.stringValue("GetErAttachmentResponse.Content.GmtModified"));
		content.setMessage(_ctx.stringValue("GetErAttachmentResponse.Content.Message"));
		content.setStatus(_ctx.stringValue("GetErAttachmentResponse.Content.Status"));
		content.setRegionId(_ctx.stringValue("GetErAttachmentResponse.Content.RegionId"));
		content.setTenantId(_ctx.stringValue("GetErAttachmentResponse.Content.TenantId"));
		content.setErAttachmentName(_ctx.stringValue("GetErAttachmentResponse.Content.ErAttachmentName"));
		content.setErAttachmentId(_ctx.stringValue("GetErAttachmentResponse.Content.ErAttachmentId"));
		content.setErId(_ctx.stringValue("GetErAttachmentResponse.Content.ErId"));
		content.setInstanceType(_ctx.stringValue("GetErAttachmentResponse.Content.InstanceType"));
		content.setInstanceId(_ctx.stringValue("GetErAttachmentResponse.Content.InstanceId"));
		content.setInstanceName(_ctx.stringValue("GetErAttachmentResponse.Content.InstanceName"));
		content.setAutoReceiveAllRoute(_ctx.booleanValue("GetErAttachmentResponse.Content.AutoReceiveAllRoute"));
		content.setAcross(_ctx.booleanValue("GetErAttachmentResponse.Content.Across"));
		content.setResourceTenantId(_ctx.stringValue("GetErAttachmentResponse.Content.ResourceTenantId"));
		getErAttachmentResponse.setContent(content);
	 
	 	return getErAttachmentResponse;
	}
}