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

import com.aliyuncs.paistudio.model.v20201123.GetExperimentResponse;
import com.aliyuncs.paistudio.model.v20201123.GetExperimentResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetExperimentResponseUnmarshaller {

	public static GetExperimentResponse unmarshall(GetExperimentResponse getExperimentResponse, UnmarshallerContext _ctx) {
		
		getExperimentResponse.setRequestId(_ctx.stringValue("GetExperimentResponse.RequestId"));
		getExperimentResponse.setCode(_ctx.stringValue("GetExperimentResponse.Code"));
		getExperimentResponse.setMessage(_ctx.stringValue("GetExperimentResponse.Message"));

		Data data = new Data();
		data.setContent(_ctx.stringValue("GetExperimentResponse.Data.Content"));
		data.setCreator(_ctx.stringValue("GetExperimentResponse.Data.Creator"));
		data.setDescription(_ctx.stringValue("GetExperimentResponse.Data.Description"));
		data.setExperimentId(_ctx.stringValue("GetExperimentResponse.Data.ExperimentId"));
		data.setGmtCreate(_ctx.stringValue("GetExperimentResponse.Data.GmtCreate"));
		data.setGmtDeleted(_ctx.stringValue("GetExperimentResponse.Data.GmtDeleted"));
		data.setGmtModified(_ctx.stringValue("GetExperimentResponse.Data.GmtModified"));
		data.setId(_ctx.integerValue("GetExperimentResponse.Data.Id"));
		data.setIsDeleted(_ctx.booleanValue("GetExperimentResponse.Data.IsDeleted"));
		data.setName(_ctx.stringValue("GetExperimentResponse.Data.Name"));
		data.setOperatorDeleted(_ctx.stringValue("GetExperimentResponse.Data.OperatorDeleted"));
		data.setOperatorModified(_ctx.stringValue("GetExperimentResponse.Data.OperatorModified"));
		data.setParentUserId(_ctx.stringValue("GetExperimentResponse.Data.ParentUserId"));
		data.setSource(_ctx.stringValue("GetExperimentResponse.Data.Source"));
		data.setVersion(_ctx.integerValue("GetExperimentResponse.Data.Version"));
		data.setWorkspaceId(_ctx.stringValue("GetExperimentResponse.Data.WorkspaceId"));
		data.setDeleted(_ctx.booleanValue("GetExperimentResponse.Data.deleted"));
		getExperimentResponse.setData(data);
	 
	 	return getExperimentResponse;
	}
}