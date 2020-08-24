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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.GetAIAppResponse;
import com.aliyuncs.linkvisual.model.v20180120.GetAIAppResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAIAppResponseUnmarshaller {

	public static GetAIAppResponse unmarshall(GetAIAppResponse getAIAppResponse, UnmarshallerContext _ctx) {
		
		getAIAppResponse.setRequestId(_ctx.stringValue("GetAIAppResponse.RequestId"));
		getAIAppResponse.setSuccess(_ctx.booleanValue("GetAIAppResponse.Success"));
		getAIAppResponse.setErrorMessage(_ctx.stringValue("GetAIAppResponse.ErrorMessage"));
		getAIAppResponse.setCode(_ctx.stringValue("GetAIAppResponse.Code"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("GetAIAppResponse.Data.AppId"));
		data.setAppTemplateId(_ctx.stringValue("GetAIAppResponse.Data.AppTemplateId"));
		data.setVersion(_ctx.stringValue("GetAIAppResponse.Data.Version"));
		data.setLevel(_ctx.integerValue("GetAIAppResponse.Data.Level"));
		data.setName(_ctx.stringValue("GetAIAppResponse.Data.Name"));
		data.setDescription(_ctx.stringValue("GetAIAppResponse.Data.Description"));
		getAIAppResponse.setData(data);
	 
	 	return getAIAppResponse;
	}
}