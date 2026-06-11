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

package com.aliyuncs.airegistry.transform.v20260317;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airegistry.model.v20260317.GetPromptVersionResponse;
import com.aliyuncs.airegistry.model.v20260317.GetPromptVersionResponse.Data;
import com.aliyuncs.airegistry.model.v20260317.GetPromptVersionResponse.Data.Variable;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPromptVersionResponseUnmarshaller {

	public static GetPromptVersionResponse unmarshall(GetPromptVersionResponse getPromptVersionResponse, UnmarshallerContext _ctx) {
		
		getPromptVersionResponse.setRequestId(_ctx.stringValue("GetPromptVersionResponse.RequestId"));

		Data data = new Data();
		data.setPromptKey(_ctx.stringValue("GetPromptVersionResponse.Data.PromptKey"));
		data.setVersion(_ctx.stringValue("GetPromptVersionResponse.Data.Version"));
		data.setStatus(_ctx.stringValue("GetPromptVersionResponse.Data.Status"));
		data.setTemplate(_ctx.stringValue("GetPromptVersionResponse.Data.Template"));
		data.setCommitMsg(_ctx.stringValue("GetPromptVersionResponse.Data.CommitMsg"));
		data.setSrcUser(_ctx.stringValue("GetPromptVersionResponse.Data.SrcUser"));
		data.setGmtModified(_ctx.longValue("GetPromptVersionResponse.Data.GmtModified"));
		data.setMd5(_ctx.stringValue("GetPromptVersionResponse.Data.Md5"));

		List<Variable> variables = new ArrayList<Variable>();
		for (int i = 0; i < _ctx.lengthValue("GetPromptVersionResponse.Data.Variables.Length"); i++) {
			Variable variable = new Variable();
			variable.setName(_ctx.stringValue("GetPromptVersionResponse.Data.Variables["+ i +"].Name"));
			variable.setDefaultValue(_ctx.stringValue("GetPromptVersionResponse.Data.Variables["+ i +"].DefaultValue"));
			variable.setDescription(_ctx.stringValue("GetPromptVersionResponse.Data.Variables["+ i +"].Description"));

			variables.add(variable);
		}
		data.setVariables(variables);
		getPromptVersionResponse.setData(data);
	 
	 	return getPromptVersionResponse;
	}
}