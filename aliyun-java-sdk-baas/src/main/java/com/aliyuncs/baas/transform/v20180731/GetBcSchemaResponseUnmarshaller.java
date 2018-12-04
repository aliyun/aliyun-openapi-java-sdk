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

package com.aliyuncs.baas.transform.v20180731;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20180731.GetBcSchemaResponse;
import com.aliyuncs.baas.model.v20180731.GetBcSchemaResponse.Result;
import com.aliyuncs.baas.model.v20180731.GetBcSchemaResponse.Result.ResponsesItem;
import com.aliyuncs.baas.model.v20180731.GetBcSchemaResponse.Result.ResponsesItem.Properties;
import com.aliyuncs.baas.model.v20180731.GetBcSchemaResponse.Result.ResponsesItem.Properties.DataSourceItem;
import com.aliyuncs.baas.model.v20180731.GetBcSchemaResponse.Result.Schema;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBcSchemaResponseUnmarshaller {

	public static GetBcSchemaResponse unmarshall(GetBcSchemaResponse getBcSchemaResponse, UnmarshallerContext context) {
		
		getBcSchemaResponse.setRequestId(context.stringValue("GetBcSchemaResponse.RequestId"));

		Result result = new Result();

		Schema schema = new Schema();
		schema.setId(context.longValue("GetBcSchemaResponse.Result.Schema.Id"));
		schema.setName(context.stringValue("GetBcSchemaResponse.Result.Schema.Name"));
		schema.setDescription(context.stringValue("GetBcSchemaResponse.Result.Schema.Description"));
		schema.setVersion(context.longValue("GetBcSchemaResponse.Result.Schema.Version"));
		schema.setCreateTime(context.longValue("GetBcSchemaResponse.Result.Schema.CreateTime"));
		schema.setUpdateTime(context.longValue("GetBcSchemaResponse.Result.Schema.UpdateTime"));
		schema.setIsTemplate(context.booleanValue("GetBcSchemaResponse.Result.Schema.IsTemplate"));
		result.setSchema(schema);

		List<ResponsesItem> responses = new ArrayList<ResponsesItem>();
		for (int i = 0; i < context.lengthValue("GetBcSchemaResponse.Result.Responses.Length"); i++) {
			ResponsesItem responsesItem = new ResponsesItem();
			responsesItem.setCategoryName(context.stringValue("GetBcSchemaResponse.Result.Responses["+ i +"].CategoryName"));
			responsesItem.setDescription(context.stringValue("GetBcSchemaResponse.Result.Responses["+ i +"].Description"));
			responsesItem.setCategory(context.stringValue("GetBcSchemaResponse.Result.Responses["+ i +"].Category"));

			Properties properties = new Properties();
			properties.setCount(context.integerValue("GetBcSchemaResponse.Result.Responses["+ i +"].Properties.Count"));

			List<DataSourceItem> dataSource = new ArrayList<DataSourceItem>();
			for (int j = 0; j < context.lengthValue("GetBcSchemaResponse.Result.Responses["+ i +"].Properties.DataSource.Length"); j++) {
				DataSourceItem dataSourceItem = new DataSourceItem();
				dataSourceItem.setKey(context.integerValue("GetBcSchemaResponse.Result.Responses["+ i +"].Properties.DataSource["+ j +"].Key"));
				dataSourceItem.setField(context.stringValue("GetBcSchemaResponse.Result.Responses["+ i +"].Properties.DataSource["+ j +"].Field"));
				dataSourceItem.setType(context.stringValue("GetBcSchemaResponse.Result.Responses["+ i +"].Properties.DataSource["+ j +"].Type"));
				dataSourceItem.setLength(context.integerValue("GetBcSchemaResponse.Result.Responses["+ i +"].Properties.DataSource["+ j +"].Length"));
				dataSourceItem.setAllowNull(context.integerValue("GetBcSchemaResponse.Result.Responses["+ i +"].Properties.DataSource["+ j +"].AllowNull"));
				dataSourceItem.setReg(context.stringValue("GetBcSchemaResponse.Result.Responses["+ i +"].Properties.DataSource["+ j +"].Reg"));
				dataSourceItem.setIndexes(context.integerValue("GetBcSchemaResponse.Result.Responses["+ i +"].Properties.DataSource["+ j +"].Indexes"));
				dataSourceItem.setAnnotation(context.stringValue("GetBcSchemaResponse.Result.Responses["+ i +"].Properties.DataSource["+ j +"].Annotation"));

				dataSource.add(dataSourceItem);
			}
			properties.setDataSource(dataSource);
			responsesItem.setProperties(properties);

			responses.add(responsesItem);
		}
		result.setResponses(responses);
		getBcSchemaResponse.setResult(result);
	 
	 	return getBcSchemaResponse;
	}
}