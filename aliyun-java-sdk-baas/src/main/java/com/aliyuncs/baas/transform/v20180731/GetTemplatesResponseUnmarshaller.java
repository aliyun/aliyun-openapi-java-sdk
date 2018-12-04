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

import com.aliyuncs.baas.model.v20180731.GetTemplatesResponse;
import com.aliyuncs.baas.model.v20180731.GetTemplatesResponse.Result;
import com.aliyuncs.baas.model.v20180731.GetTemplatesResponse.Result.SchemaListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTemplatesResponseUnmarshaller {

	public static GetTemplatesResponse unmarshall(GetTemplatesResponse getTemplatesResponse, UnmarshallerContext context) {
		
		getTemplatesResponse.setRequestId(context.stringValue("GetTemplatesResponse.RequestId"));

		Result result = new Result();

		List<SchemaListItem> schemaList = new ArrayList<SchemaListItem>();
		for (int i = 0; i < context.lengthValue("GetTemplatesResponse.Result.SchemaList.Length"); i++) {
			SchemaListItem schemaListItem = new SchemaListItem();
			schemaListItem.setId(context.longValue("GetTemplatesResponse.Result.SchemaList["+ i +"].Id"));
			schemaListItem.setName(context.stringValue("GetTemplatesResponse.Result.SchemaList["+ i +"].Name"));
			schemaListItem.setDescription(context.stringValue("GetTemplatesResponse.Result.SchemaList["+ i +"].Description"));
			schemaListItem.setVersion(context.longValue("GetTemplatesResponse.Result.SchemaList["+ i +"].Version"));
			schemaListItem.setCreateTime(context.longValue("GetTemplatesResponse.Result.SchemaList["+ i +"].CreateTime"));
			schemaListItem.setUpdateTime(context.longValue("GetTemplatesResponse.Result.SchemaList["+ i +"].UpdateTime"));
			schemaListItem.setIsTemplate(context.integerValue("GetTemplatesResponse.Result.SchemaList["+ i +"].IsTemplate"));

			schemaList.add(schemaListItem);
		}
		result.setSchemaList(schemaList);
		getTemplatesResponse.setResult(result);
	 
	 	return getTemplatesResponse;
	}
}