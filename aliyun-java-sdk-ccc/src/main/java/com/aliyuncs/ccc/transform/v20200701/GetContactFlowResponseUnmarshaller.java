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

package com.aliyuncs.ccc.transform.v20200701;

import com.aliyuncs.ccc.model.v20200701.GetContactFlowResponse;
import com.aliyuncs.ccc.model.v20200701.GetContactFlowResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetContactFlowResponseUnmarshaller {

	public static GetContactFlowResponse unmarshall(GetContactFlowResponse getContactFlowResponse, UnmarshallerContext _ctx) {
		
		getContactFlowResponse.setRequestId(_ctx.stringValue("GetContactFlowResponse.RequestId"));
		getContactFlowResponse.setCode(_ctx.stringValue("GetContactFlowResponse.Code"));
		getContactFlowResponse.setHttpStatusCode(_ctx.integerValue("GetContactFlowResponse.HttpStatusCode"));
		getContactFlowResponse.setMessage(_ctx.stringValue("GetContactFlowResponse.Message"));

		Data data = new Data();
		data.setType(_ctx.stringValue("GetContactFlowResponse.Data.Type"));
		data.setDefinition(_ctx.stringValue("GetContactFlowResponse.Data.Definition"));
		data.setDraftId(_ctx.stringValue("GetContactFlowResponse.Data.DraftId"));
		data.setDescription(_ctx.stringValue("GetContactFlowResponse.Data.Description"));
		data.setUpdatedTime(_ctx.stringValue("GetContactFlowResponse.Data.UpdatedTime"));
		data.setEditor(_ctx.stringValue("GetContactFlowResponse.Data.Editor"));
		data.setPublished(_ctx.booleanValue("GetContactFlowResponse.Data.Published"));
		data.setInstanceId(_ctx.stringValue("GetContactFlowResponse.Data.InstanceId"));
		data.setName(_ctx.stringValue("GetContactFlowResponse.Data.Name"));
		data.setContactFlowId(_ctx.stringValue("GetContactFlowResponse.Data.ContactFlowId"));
		data.setCreatedTime(_ctx.stringValue("GetContactFlowResponse.Data.CreatedTime"));
		getContactFlowResponse.setData(data);
	 
	 	return getContactFlowResponse;
	}
}