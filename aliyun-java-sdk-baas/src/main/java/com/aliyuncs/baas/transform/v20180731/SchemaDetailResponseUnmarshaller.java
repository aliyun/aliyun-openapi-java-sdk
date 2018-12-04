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

import com.aliyuncs.baas.model.v20180731.SchemaDetailResponse;
import com.aliyuncs.baas.model.v20180731.SchemaDetailResponse.Result;
import com.aliyuncs.baas.model.v20180731.SchemaDetailResponse.Result.ResponsesItem;
import com.aliyuncs.baas.model.v20180731.SchemaDetailResponse.Result.ResponsesItem.Properties;
import com.aliyuncs.baas.model.v20180731.SchemaDetailResponse.Result.ResponsesItem.Properties.DataSourceItem;
import com.aliyuncs.baas.model.v20180731.SchemaDetailResponse.Result.Schema;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class SchemaDetailResponseUnmarshaller {

	public static SchemaDetailResponse unmarshall(SchemaDetailResponse schemaDetailResponse, UnmarshallerContext context) {
		
		schemaDetailResponse.setRequestId(context.stringValue("SchemaDetailResponse.RequestId"));

		Result result = new Result();

		Schema schema = new Schema();
		schema.setId(context.longValue("SchemaDetailResponse.Result.Schema.Id"));
		schema.setName(context.stringValue("SchemaDetailResponse.Result.Schema.Name"));
		schema.setDescription(context.stringValue("SchemaDetailResponse.Result.Schema.Description"));
		schema.setVersion(context.longValue("SchemaDetailResponse.Result.Schema.Version"));
		schema.setCreateTime(context.longValue("SchemaDetailResponse.Result.Schema.CreateTime"));
		schema.setUpdateTime(context.longValue("SchemaDetailResponse.Result.Schema.UpdateTime"));
		schema.setIsTemplate(context.booleanValue("SchemaDetailResponse.Result.Schema.IsTemplate"));
		result.setSchema(schema);

		List<ResponsesItem> responses = new ArrayList<ResponsesItem>();
		for (int i = 0; i < context.lengthValue("SchemaDetailResponse.Result.Responses.Length"); i++) {
			ResponsesItem responsesItem = new ResponsesItem();
			responsesItem.setCategoryName(context.stringValue("SchemaDetailResponse.Result.Responses["+ i +"].CategoryName"));
			responsesItem.setDescription(context.stringValue("SchemaDetailResponse.Result.Responses["+ i +"].Description"));
			responsesItem.setCategory(context.stringValue("SchemaDetailResponse.Result.Responses["+ i +"].Category"));

			Properties properties = new Properties();
			properties.setCount(context.integerValue("SchemaDetailResponse.Result.Responses["+ i +"].Properties.Count"));

			List<DataSourceItem> dataSource = new ArrayList<DataSourceItem>();
			for (int j = 0; j < context.lengthValue("SchemaDetailResponse.Result.Responses["+ i +"].Properties.DataSource.Length"); j++) {
				DataSourceItem dataSourceItem = new DataSourceItem();
				dataSourceItem.setKey(context.integerValue("SchemaDetailResponse.Result.Responses["+ i +"].Properties.DataSource["+ j +"].Key"));
				dataSourceItem.setField(context.stringValue("SchemaDetailResponse.Result.Responses["+ i +"].Properties.DataSource["+ j +"].Field"));
				dataSourceItem.setType(context.stringValue("SchemaDetailResponse.Result.Responses["+ i +"].Properties.DataSource["+ j +"].Type"));
				dataSourceItem.setLength(context.integerValue("SchemaDetailResponse.Result.Responses["+ i +"].Properties.DataSource["+ j +"].Length"));
				dataSourceItem.setAllowNull(context.integerValue("SchemaDetailResponse.Result.Responses["+ i +"].Properties.DataSource["+ j +"].AllowNull"));
				dataSourceItem.setReg(context.stringValue("SchemaDetailResponse.Result.Responses["+ i +"].Properties.DataSource["+ j +"].Reg"));
				dataSourceItem.setIndexes(context.integerValue("SchemaDetailResponse.Result.Responses["+ i +"].Properties.DataSource["+ j +"].Indexes"));
				dataSourceItem.setAnnotation(context.stringValue("SchemaDetailResponse.Result.Responses["+ i +"].Properties.DataSource["+ j +"].Annotation"));

				dataSource.add(dataSourceItem);
			}
			properties.setDataSource(dataSource);
			responsesItem.setProperties(properties);

			responses.add(responsesItem);
		}
		result.setResponses(responses);
		schemaDetailResponse.setResult(result);
	 
	 	return schemaDetailResponse;
	}
}