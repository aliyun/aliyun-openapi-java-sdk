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

package com.aliyuncs.mpaas.transform.v20200710;

import com.aliyuncs.mpaas.model.v20200710.GetTemplateResponse;
import com.aliyuncs.mpaas.model.v20200710.GetTemplateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTemplateResponseUnmarshaller {

	public static GetTemplateResponse unmarshall(GetTemplateResponse getTemplateResponse, UnmarshallerContext _ctx) {
		
		getTemplateResponse.setRequestId(_ctx.stringValue("GetTemplateResponse.RequestId"));
		getTemplateResponse.setSuccess(_ctx.booleanValue("GetTemplateResponse.Success"));
		getTemplateResponse.setCode(_ctx.stringValue("GetTemplateResponse.Code"));
		getTemplateResponse.setMsg(_ctx.stringValue("GetTemplateResponse.Msg"));

		Data data = new Data();
		data.setId(_ctx.stringValue("GetTemplateResponse.Data.Id"));
		data.setName(_ctx.stringValue("GetTemplateResponse.Data.Name"));
		data.setDescInfo(_ctx.stringValue("GetTemplateResponse.Data.DescInfo"));
		data.setTitle(_ctx.stringValue("GetTemplateResponse.Data.Title"));
		data.setContent(_ctx.stringValue("GetTemplateResponse.Data.Content"));
		data.setUri(_ctx.stringValue("GetTemplateResponse.Data.Uri"));
		data.setVariables(_ctx.stringValue("GetTemplateResponse.Data.Variables"));
		data.setPushStyle(_ctx.stringValue("GetTemplateResponse.Data.PushStyle"));
		data.setImageUrls(_ctx.stringValue("GetTemplateResponse.Data.ImageUrls"));
		data.setIconUrls(_ctx.stringValue("GetTemplateResponse.Data.IconUrls"));
		data.setShowStyle(_ctx.stringValue("GetTemplateResponse.Data.ShowStyle"));
		data.setAction(_ctx.stringValue("GetTemplateResponse.Data.Action"));
		data.setGmtCreate(_ctx.stringValue("GetTemplateResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("GetTemplateResponse.Data.GmtModified"));
		getTemplateResponse.setData(data);
	 
	 	return getTemplateResponse;
	}
}