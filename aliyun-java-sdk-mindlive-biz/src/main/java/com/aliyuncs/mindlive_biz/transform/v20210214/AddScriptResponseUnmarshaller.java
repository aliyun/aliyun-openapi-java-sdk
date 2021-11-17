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

package com.aliyuncs.mindlive_biz.transform.v20210214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mindlive_biz.model.v20210214.AddScriptResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.AddScriptResponse.ScriptDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddScriptResponseUnmarshaller {

	public static AddScriptResponse unmarshall(AddScriptResponse addScriptResponse, UnmarshallerContext _ctx) {
		
		addScriptResponse.setRequestId(_ctx.stringValue("AddScriptResponse.RequestId"));
		addScriptResponse.setErrorMessage(_ctx.stringValue("AddScriptResponse.ErrorMessage"));
		addScriptResponse.setSuccess(_ctx.booleanValue("AddScriptResponse.Success"));
		addScriptResponse.setErrorCode(_ctx.stringValue("AddScriptResponse.ErrorCode"));

		List<ScriptDTO> data = new ArrayList<ScriptDTO>();
		for (int i = 0; i < _ctx.lengthValue("AddScriptResponse.Data.Length"); i++) {
			ScriptDTO scriptDTO = new ScriptDTO();
			scriptDTO.setUuid(_ctx.stringValue("AddScriptResponse.Data["+ i +"].Uuid"));
			scriptDTO.setText(_ctx.stringValue("AddScriptResponse.Data["+ i +"].Text"));
			scriptDTO.setAsSellingPoint(_ctx.booleanValue("AddScriptResponse.Data["+ i +"].AsSellingPoint"));

			data.add(scriptDTO);
		}
		addScriptResponse.setData(data);
	 
	 	return addScriptResponse;
	}
}