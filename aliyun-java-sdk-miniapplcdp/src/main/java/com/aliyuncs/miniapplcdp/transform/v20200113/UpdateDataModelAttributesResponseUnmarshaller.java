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

package com.aliyuncs.miniapplcdp.transform.v20200113;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.miniapplcdp.model.v20200113.UpdateDataModelAttributesResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.UpdateDataModelAttributesResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateDataModelAttributesResponseUnmarshaller {

	public static UpdateDataModelAttributesResponse unmarshall(UpdateDataModelAttributesResponse updateDataModelAttributesResponse, UnmarshallerContext _ctx) {
		
		updateDataModelAttributesResponse.setRequestId(_ctx.stringValue("UpdateDataModelAttributesResponse.RequestId"));

		Data data = new Data();
		data.setCreateTime(_ctx.stringValue("UpdateDataModelAttributesResponse.Data.CreateTime"));
		data.setModelType(_ctx.stringValue("UpdateDataModelAttributesResponse.Data.ModelType"));
		data.setSubType(_ctx.stringValue("UpdateDataModelAttributesResponse.Data.SubType"));
		data.setRevision(_ctx.integerValue("UpdateDataModelAttributesResponse.Data.Revision"));
		data.setModifiedTime(_ctx.stringValue("UpdateDataModelAttributesResponse.Data.ModifiedTime"));
		data.setDescription(_ctx.stringValue("UpdateDataModelAttributesResponse.Data.Description"));
		data.setSchemaVersion(_ctx.stringValue("UpdateDataModelAttributesResponse.Data.SchemaVersion"));
		data.setAppId(_ctx.stringValue("UpdateDataModelAttributesResponse.Data.AppId"));
		data.setProps(_ctx.mapValue("UpdateDataModelAttributesResponse.Data.Props"));
		data.setModelStatus(_ctx.stringValue("UpdateDataModelAttributesResponse.Data.ModelStatus"));
		data.setModelName(_ctx.stringValue("UpdateDataModelAttributesResponse.Data.ModelName"));
		data.setContent(_ctx.mapValue("UpdateDataModelAttributesResponse.Data.Content"));
		data.setId(_ctx.stringValue("UpdateDataModelAttributesResponse.Data.Id"));
		data.setModelId(_ctx.stringValue("UpdateDataModelAttributesResponse.Data.ModelId"));

		List<Map<Object, Object>> attributes = _ctx.listMapValue("UpdateDataModelAttributesResponse.Data.Attributes");
		data.setAttributes(attributes);
		updateDataModelAttributesResponse.setData(data);
	 
	 	return updateDataModelAttributesResponse;
	}
}