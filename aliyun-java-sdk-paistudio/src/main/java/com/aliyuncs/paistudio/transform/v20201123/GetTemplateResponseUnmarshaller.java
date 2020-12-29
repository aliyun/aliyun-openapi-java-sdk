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

import com.aliyuncs.paistudio.model.v20201123.GetTemplateResponse;
import com.aliyuncs.paistudio.model.v20201123.GetTemplateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTemplateResponseUnmarshaller {

	public static GetTemplateResponse unmarshall(GetTemplateResponse getTemplateResponse, UnmarshallerContext _ctx) {
		
		getTemplateResponse.setRequestId(_ctx.stringValue("GetTemplateResponse.RequestId"));
		getTemplateResponse.setCode(_ctx.stringValue("GetTemplateResponse.Code"));
		getTemplateResponse.setMessage(_ctx.stringValue("GetTemplateResponse.Message"));

		Data data = new Data();
		data.setContent(_ctx.stringValue("GetTemplateResponse.Data.Content"));
		data.setDescription(_ctx.stringValue("GetTemplateResponse.Data.Description"));
		data.setDetail(_ctx.stringValue("GetTemplateResponse.Data.Detail"));
		data.setDocLink(_ctx.stringValue("GetTemplateResponse.Data.DocLink"));
		data.setImageLink(_ctx.stringValue("GetTemplateResponse.Data.ImageLink"));
		data.setName(_ctx.stringValue("GetTemplateResponse.Data.Name"));
		data.setTemplateId(_ctx.stringValue("GetTemplateResponse.Data.TemplateId"));
		getTemplateResponse.setData(data);
	 
	 	return getTemplateResponse;
	}
}