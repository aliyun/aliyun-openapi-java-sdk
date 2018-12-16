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

package com.aliyuncs.airec.transform.v20181012;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20181012.DescribeSchemaResponse;
import com.aliyuncs.airec.model.v20181012.DescribeSchemaResponse.Result;
import com.aliyuncs.airec.model.v20181012.DescribeSchemaResponse.Result.MetaItem;
import com.aliyuncs.airec.model.v20181012.DescribeSchemaResponse.Result.MetaItem.FieldsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSchemaResponseUnmarshaller {

	public static DescribeSchemaResponse unmarshall(DescribeSchemaResponse describeSchemaResponse, UnmarshallerContext context) {
		
		describeSchemaResponse.setRequestId(context.stringValue("DescribeSchemaResponse.RequestId"));
		describeSchemaResponse.setCode(context.stringValue("DescribeSchemaResponse.Code"));
		describeSchemaResponse.setMessage(context.stringValue("DescribeSchemaResponse.Message"));

		Result result = new Result();
		result.setId(context.stringValue("DescribeSchemaResponse.Result.Id"));
		result.setDescription(context.stringValue("DescribeSchemaResponse.Result.Description"));

		List<MetaItem> meta = new ArrayList<MetaItem>();
		for (int i = 0; i < context.lengthValue("DescribeSchemaResponse.Result.Meta.Length"); i++) {
			MetaItem metaItem = new MetaItem();
			metaItem.setTableName(context.stringValue("DescribeSchemaResponse.Result.Meta["+ i +"].TableName"));

			List<FieldsItem> fields = new ArrayList<FieldsItem>();
			for (int j = 0; j < context.lengthValue("DescribeSchemaResponse.Result.Meta["+ i +"].Fields.Length"); j++) {
				FieldsItem fieldsItem = new FieldsItem();
				fieldsItem.setName(context.stringValue("DescribeSchemaResponse.Result.Meta["+ i +"].Fields["+ j +"].Name"));
				fieldsItem.setType(context.stringValue("DescribeSchemaResponse.Result.Meta["+ i +"].Fields["+ j +"].Type"));
				fieldsItem.setDescription(context.stringValue("DescribeSchemaResponse.Result.Meta["+ i +"].Fields["+ j +"].Description"));
				fieldsItem.setRequired(context.booleanValue("DescribeSchemaResponse.Result.Meta["+ i +"].Fields["+ j +"].Required"));
				fieldsItem.setExample(context.stringValue("DescribeSchemaResponse.Result.Meta["+ i +"].Fields["+ j +"].Example"));

				fields.add(fieldsItem);
			}
			metaItem.setFields(fields);

			meta.add(metaItem);
		}
		result.setMeta(meta);
		describeSchemaResponse.setResult(result);
	 
	 	return describeSchemaResponse;
	}
}