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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.ImportKgSchemaResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ImportKgSchemaResponse.ImportResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImportKgSchemaResponseUnmarshaller {

	public static ImportKgSchemaResponse unmarshall(ImportKgSchemaResponse importKgSchemaResponse, UnmarshallerContext _ctx) {
		
		importKgSchemaResponse.setRequestId(_ctx.stringValue("ImportKgSchemaResponse.RequestId"));
		importKgSchemaResponse.setMessage(_ctx.stringValue("ImportKgSchemaResponse.Message"));
		importKgSchemaResponse.setHttpStatusCode(_ctx.integerValue("ImportKgSchemaResponse.HttpStatusCode"));
		importKgSchemaResponse.setCode(_ctx.stringValue("ImportKgSchemaResponse.Code"));
		importKgSchemaResponse.setSuccess(_ctx.booleanValue("ImportKgSchemaResponse.Success"));

		ImportResult importResult = new ImportResult();
		importResult.setRelationTypeCount(_ctx.integerValue("ImportKgSchemaResponse.ImportResult.RelationTypeCount"));
		importResult.setEntityTypeCount(_ctx.integerValue("ImportKgSchemaResponse.ImportResult.EntityTypeCount"));
		importKgSchemaResponse.setImportResult(importResult);
	 
	 	return importKgSchemaResponse;
	}
}