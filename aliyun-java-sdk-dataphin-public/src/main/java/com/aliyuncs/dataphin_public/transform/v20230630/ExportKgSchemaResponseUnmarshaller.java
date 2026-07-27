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

import com.aliyuncs.dataphin_public.model.v20230630.ExportKgSchemaResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ExportKgSchemaResponse.SchemaInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExportKgSchemaResponseUnmarshaller {

	public static ExportKgSchemaResponse unmarshall(ExportKgSchemaResponse exportKgSchemaResponse, UnmarshallerContext _ctx) {
		
		exportKgSchemaResponse.setRequestId(_ctx.stringValue("ExportKgSchemaResponse.RequestId"));
		exportKgSchemaResponse.setMessage(_ctx.stringValue("ExportKgSchemaResponse.Message"));
		exportKgSchemaResponse.setHttpStatusCode(_ctx.integerValue("ExportKgSchemaResponse.HttpStatusCode"));
		exportKgSchemaResponse.setCode(_ctx.stringValue("ExportKgSchemaResponse.Code"));
		exportKgSchemaResponse.setSuccess(_ctx.booleanValue("ExportKgSchemaResponse.Success"));

		SchemaInfo schemaInfo = new SchemaInfo();
		schemaInfo.setContent(_ctx.stringValue("ExportKgSchemaResponse.SchemaInfo.Content"));
		schemaInfo.setOutputFormat(_ctx.stringValue("ExportKgSchemaResponse.SchemaInfo.OutputFormat"));
		exportKgSchemaResponse.setSchemaInfo(schemaInfo);
	 
	 	return exportKgSchemaResponse;
	}
}