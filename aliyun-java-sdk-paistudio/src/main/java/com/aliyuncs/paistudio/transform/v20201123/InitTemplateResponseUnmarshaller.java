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

package com.aliyuncs.paistudio.transform.v20201123;

import com.aliyuncs.paistudio.model.v20201123.InitTemplateResponse;
import com.aliyuncs.paistudio.model.v20201123.InitTemplateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class InitTemplateResponseUnmarshaller {

	public static InitTemplateResponse unmarshall(InitTemplateResponse initTemplateResponse, UnmarshallerContext _ctx) {
		
		initTemplateResponse.setRequestId(_ctx.stringValue("InitTemplateResponse.RequestId"));
		initTemplateResponse.setCode(_ctx.stringValue("InitTemplateResponse.Code"));
		initTemplateResponse.setMessage(_ctx.stringValue("InitTemplateResponse.Message"));

		Data data = new Data();
		data.setContent(_ctx.stringValue("InitTemplateResponse.Data.Content"));
		data.setDescription(_ctx.stringValue("InitTemplateResponse.Data.Description"));
		data.setExperimentId(_ctx.stringValue("InitTemplateResponse.Data.ExperimentId"));
		data.setGmtCreate(_ctx.stringValue("InitTemplateResponse.Data.GmtCreate"));
		data.setGmtDeleted(_ctx.stringValue("InitTemplateResponse.Data.GmtDeleted"));
		data.setGmtModified(_ctx.stringValue("InitTemplateResponse.Data.GmtModified"));
		data.setId(_ctx.integerValue("InitTemplateResponse.Data.Id"));
		data.setIsDeleted(_ctx.booleanValue("InitTemplateResponse.Data.IsDeleted"));
		data.setName(_ctx.stringValue("InitTemplateResponse.Data.Name"));
		data.setOperatorCreate(_ctx.stringValue("InitTemplateResponse.Data.OperatorCreate"));
		data.setOperatorDeleted(_ctx.stringValue("InitTemplateResponse.Data.OperatorDeleted"));
		data.setOperatorModified(_ctx.stringValue("InitTemplateResponse.Data.OperatorModified"));
		data.setParentUserId(_ctx.stringValue("InitTemplateResponse.Data.ParentUserId"));
		data.setVersion(_ctx.integerValue("InitTemplateResponse.Data.Version"));
		data.setWorkspaceId(_ctx.stringValue("InitTemplateResponse.Data.WorkspaceId"));
		initTemplateResponse.setData(data);
	 
	 	return initTemplateResponse;
	}
}