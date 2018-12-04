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

import com.aliyuncs.baas.model.v20180731.DescribeBcSchemaResponse;
import com.aliyuncs.baas.model.v20180731.DescribeBcSchemaResponse.Result;
import com.aliyuncs.baas.model.v20180731.DescribeBcSchemaResponse.Result.ResponsesItem;
import com.aliyuncs.baas.model.v20180731.DescribeBcSchemaResponse.Result.ResponsesItem.Properties;
import com.aliyuncs.baas.model.v20180731.DescribeBcSchemaResponse.Result.ResponsesItem.Properties.DataSourceItem;
import com.aliyuncs.baas.model.v20180731.DescribeBcSchemaResponse.Result.Schema;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBcSchemaResponseUnmarshaller {

	public static DescribeBcSchemaResponse unmarshall(DescribeBcSchemaResponse describeBcSchemaResponse, UnmarshallerContext context) {
		
		describeBcSchemaResponse.setRequestId(context.stringValue("DescribeBcSchemaResponse.RequestId"));

		Result result = new Result();

		Schema schema = new Schema();
		schema.setId(context.longValue("DescribeBcSchemaResponse.Result.Schema.Id"));
		schema.setName(context.stringValue("DescribeBcSchemaResponse.Result.Schema.Name"));
		schema.setDescription(context.stringValue("DescribeBcSchemaResponse.Result.Schema.Description"));
		schema.setVersion(context.longValue("DescribeBcSchemaResponse.Result.Schema.Version"));
		schema.setCreateTime(context.longValue("DescribeBcSchemaResponse.Result.Schema.CreateTime"));
		schema.setUpdateTime(context.longValue("DescribeBcSchemaResponse.Result.Schema.UpdateTime"));
		schema.setIsTemplate(context.booleanValue("DescribeBcSchemaResponse.Result.Schema.IsTemplate"));
		result.setSchema(schema);

		List<ResponsesItem> responses = new ArrayList<ResponsesItem>();
		for (int i = 0; i < context.lengthValue("DescribeBcSchemaResponse.Result.Responses.Length"); i++) {
			ResponsesItem responsesItem = new ResponsesItem();
			responsesItem.setCategoryName(context.stringValue("DescribeBcSchemaResponse.Result.Responses["+ i +"].CategoryName"));
			responsesItem.setDescription(context.stringValue("DescribeBcSchemaResponse.Result.Responses["+ i +"].Description"));
			responsesItem.setCategory(context.stringValue("DescribeBcSchemaResponse.Result.Responses["+ i +"].Category"));

			Properties properties = new Properties();
			properties.setCount(context.integerValue("DescribeBcSchemaResponse.Result.Responses["+ i +"].Properties.Count"));

			List<DataSourceItem> dataSource = new ArrayList<DataSourceItem>();
			for (int j = 0; j < context.lengthValue("DescribeBcSchemaResponse.Result.Responses["+ i +"].Properties.DataSource.Length"); j++) {
				DataSourceItem dataSourceItem = new DataSourceItem();
				dataSourceItem.setKey(context.integerValue("DescribeBcSchemaResponse.Result.Responses["+ i +"].Properties.DataSource["+ j +"].Key"));
				dataSourceItem.setField(context.stringValue("DescribeBcSchemaResponse.Result.Responses["+ i +"].Properties.DataSource["+ j +"].Field"));
				dataSourceItem.setType(context.stringValue("DescribeBcSchemaResponse.Result.Responses["+ i +"].Properties.DataSource["+ j +"].Type"));
				dataSourceItem.setLength(context.integerValue("DescribeBcSchemaResponse.Result.Responses["+ i +"].Properties.DataSource["+ j +"].Length"));
				dataSourceItem.setAllowNull(context.integerValue("DescribeBcSchemaResponse.Result.Responses["+ i +"].Properties.DataSource["+ j +"].AllowNull"));
				dataSourceItem.setReg(context.stringValue("DescribeBcSchemaResponse.Result.Responses["+ i +"].Properties.DataSource["+ j +"].Reg"));
				dataSourceItem.setIndexes(context.integerValue("DescribeBcSchemaResponse.Result.Responses["+ i +"].Properties.DataSource["+ j +"].Indexes"));
				dataSourceItem.setAnnotation(context.stringValue("DescribeBcSchemaResponse.Result.Responses["+ i +"].Properties.DataSource["+ j +"].Annotation"));

				dataSource.add(dataSourceItem);
			}
			properties.setDataSource(dataSource);
			responsesItem.setProperties(properties);

			responses.add(responsesItem);
		}
		result.setResponses(responses);
		describeBcSchemaResponse.setResult(result);
	 
	 	return describeBcSchemaResponse;
	}
}