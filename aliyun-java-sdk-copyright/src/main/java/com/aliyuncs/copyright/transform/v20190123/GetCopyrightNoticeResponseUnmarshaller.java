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

package com.aliyuncs.copyright.transform.v20190123;

import com.aliyuncs.copyright.model.v20190123.GetCopyrightNoticeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCopyrightNoticeResponseUnmarshaller {

	public static GetCopyrightNoticeResponse unmarshall(GetCopyrightNoticeResponse getCopyrightNoticeResponse, UnmarshallerContext _ctx) {
		
		getCopyrightNoticeResponse.setRequestId(_ctx.stringValue("GetCopyrightNoticeResponse.RequestId"));
		getCopyrightNoticeResponse.setSuccess(_ctx.booleanValue("GetCopyrightNoticeResponse.Success"));
		getCopyrightNoticeResponse.setApplyPeople(_ctx.stringValue("GetCopyrightNoticeResponse.ApplyPeople"));
		getCopyrightNoticeResponse.setModifyInfo(_ctx.stringValue("GetCopyrightNoticeResponse.ModifyInfo"));
		getCopyrightNoticeResponse.setFlowNumber(_ctx.stringValue("GetCopyrightNoticeResponse.FlowNumber"));
		getCopyrightNoticeResponse.setAgentPeople(_ctx.stringValue("GetCopyrightNoticeResponse.AgentPeople"));
		getCopyrightNoticeResponse.setName(_ctx.stringValue("GetCopyrightNoticeResponse.Name"));
		getCopyrightNoticeResponse.setOwner(_ctx.stringValue("GetCopyrightNoticeResponse.Owner"));
		getCopyrightNoticeResponse.setCreateDate(_ctx.stringValue("GetCopyrightNoticeResponse.CreateDate"));
		getCopyrightNoticeResponse.setAdmissibleNumber(_ctx.stringValue("GetCopyrightNoticeResponse.AdmissibleNumber"));
		getCopyrightNoticeResponse.setFileList(_ctx.stringValue("GetCopyrightNoticeResponse.FileList"));
	 
	 	return getCopyrightNoticeResponse;
	}
}