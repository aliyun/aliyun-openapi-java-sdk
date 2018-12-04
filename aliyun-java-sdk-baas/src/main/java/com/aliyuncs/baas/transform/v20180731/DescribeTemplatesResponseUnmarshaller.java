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

import com.aliyuncs.baas.model.v20180731.DescribeTemplatesResponse;
import com.aliyuncs.baas.model.v20180731.DescribeTemplatesResponse.Result;
import com.aliyuncs.baas.model.v20180731.DescribeTemplatesResponse.Result.SchemaListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTemplatesResponseUnmarshaller {

	public static DescribeTemplatesResponse unmarshall(DescribeTemplatesResponse describeTemplatesResponse, UnmarshallerContext context) {
		
		describeTemplatesResponse.setRequestId(context.stringValue("DescribeTemplatesResponse.RequestId"));

		Result result = new Result();

		List<SchemaListItem> schemaList = new ArrayList<SchemaListItem>();
		for (int i = 0; i < context.lengthValue("DescribeTemplatesResponse.Result.SchemaList.Length"); i++) {
			SchemaListItem schemaListItem = new SchemaListItem();
			schemaListItem.setId(context.longValue("DescribeTemplatesResponse.Result.SchemaList["+ i +"].Id"));
			schemaListItem.setName(context.stringValue("DescribeTemplatesResponse.Result.SchemaList["+ i +"].Name"));
			schemaListItem.setDescription(context.stringValue("DescribeTemplatesResponse.Result.SchemaList["+ i +"].Description"));
			schemaListItem.setVersion(context.longValue("DescribeTemplatesResponse.Result.SchemaList["+ i +"].Version"));
			schemaListItem.setCreateTime(context.longValue("DescribeTemplatesResponse.Result.SchemaList["+ i +"].CreateTime"));
			schemaListItem.setUpdateTime(context.longValue("DescribeTemplatesResponse.Result.SchemaList["+ i +"].UpdateTime"));
			schemaListItem.setIsTemplate(context.integerValue("DescribeTemplatesResponse.Result.SchemaList["+ i +"].IsTemplate"));

			schemaList.add(schemaListItem);
		}
		result.setSchemaList(schemaList);
		describeTemplatesResponse.setResult(result);
	 
	 	return describeTemplatesResponse;
	}
}