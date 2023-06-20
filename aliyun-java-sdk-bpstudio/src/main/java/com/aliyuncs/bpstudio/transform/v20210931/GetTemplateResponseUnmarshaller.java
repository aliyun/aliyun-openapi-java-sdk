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

package com.aliyuncs.bpstudio.transform.v20210931;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bpstudio.model.v20210931.GetTemplateResponse;
import com.aliyuncs.bpstudio.model.v20210931.GetTemplateResponse.Data;
import com.aliyuncs.bpstudio.model.v20210931.GetTemplateResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTemplateResponseUnmarshaller {

	public static GetTemplateResponse unmarshall(GetTemplateResponse getTemplateResponse, UnmarshallerContext _ctx) {
		
		getTemplateResponse.setRequestId(_ctx.stringValue("GetTemplateResponse.RequestId"));
		getTemplateResponse.setMessage(_ctx.stringValue("GetTemplateResponse.Message"));
		getTemplateResponse.setCode(_ctx.integerValue("GetTemplateResponse.Code"));

		Data data = new Data();
		data.setDescription(_ctx.stringValue("GetTemplateResponse.Data.Description"));
		data.setImageURL(_ctx.stringValue("GetTemplateResponse.Data.ImageURL"));
		data.setName(_ctx.stringValue("GetTemplateResponse.Data.Name"));
		data.setTemplateId(_ctx.stringValue("GetTemplateResponse.Data.TemplateId"));
		data.setCreateTime(_ctx.stringValue("GetTemplateResponse.Data.CreateTime"));
		data.setResourceGroupId(_ctx.stringValue("GetTemplateResponse.Data.ResourceGroupId"));

		List<Item> variables = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("GetTemplateResponse.Data.Variables.Length"); i++) {
			Item item = new Item();
			item.setAttribute(_ctx.stringValue("GetTemplateResponse.Data.Variables["+ i +"].Attribute"));
			item.setDataType(_ctx.stringValue("GetTemplateResponse.Data.Variables["+ i +"].DataType"));
			item.setDefaultValue(_ctx.stringValue("GetTemplateResponse.Data.Variables["+ i +"].DefaultValue"));
			item.setVariable(_ctx.stringValue("GetTemplateResponse.Data.Variables["+ i +"].Variable"));

			variables.add(item);
		}
		data.setVariables(variables);
		getTemplateResponse.setData(data);
	 
	 	return getTemplateResponse;
	}
}