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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.CreateApplicationTemplateResponse;
import com.aliyuncs.edas.model.v20170801.CreateApplicationTemplateResponse.Data;
import com.aliyuncs.edas.model.v20170801.CreateApplicationTemplateResponse.Data.SourceConfig;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateApplicationTemplateResponseUnmarshaller {

	public static CreateApplicationTemplateResponse unmarshall(CreateApplicationTemplateResponse createApplicationTemplateResponse, UnmarshallerContext _ctx) {
		
		createApplicationTemplateResponse.setRequestId(_ctx.stringValue("CreateApplicationTemplateResponse.RequestId"));
		createApplicationTemplateResponse.setCode(_ctx.integerValue("CreateApplicationTemplateResponse.Code"));
		createApplicationTemplateResponse.setMessage(_ctx.stringValue("CreateApplicationTemplateResponse.Message"));

		Data data = new Data();
		data.setShowName(_ctx.stringValue("CreateApplicationTemplateResponse.Data.ShowName"));
		data.setDescription(_ctx.stringValue("CreateApplicationTemplateResponse.Data.Description"));
		data.setName(_ctx.stringValue("CreateApplicationTemplateResponse.Data.Name"));
		data.setId(_ctx.longValue("CreateApplicationTemplateResponse.Data.Id"));
		data.setAttributes(_ctx.mapValue("CreateApplicationTemplateResponse.Data.Attributes"));

		SourceConfig sourceConfig = new SourceConfig();
		sourceConfig.setSourceUrl(_ctx.stringValue("CreateApplicationTemplateResponse.Data.SourceConfig.SourceUrl"));
		data.setSourceConfig(sourceConfig);
		createApplicationTemplateResponse.setData(data);
	 
	 	return createApplicationTemplateResponse;
	}
}