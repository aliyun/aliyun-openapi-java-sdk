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

package com.aliyuncs.csas.transform.v20230120;

import com.aliyuncs.csas.model.v20230120.GetApprovalSchemaResponse;
import com.aliyuncs.csas.model.v20230120.GetApprovalSchemaResponse.Schema;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApprovalSchemaResponseUnmarshaller {

	public static GetApprovalSchemaResponse unmarshall(GetApprovalSchemaResponse getApprovalSchemaResponse, UnmarshallerContext _ctx) {
		
		getApprovalSchemaResponse.setRequestId(_ctx.stringValue("GetApprovalSchemaResponse.RequestId"));

		Schema schema = new Schema();
		schema.setCreateTime(_ctx.stringValue("GetApprovalSchemaResponse.Schema.CreateTime"));
		schema.setSchemaId(_ctx.stringValue("GetApprovalSchemaResponse.Schema.SchemaId"));
		schema.setSchemaName(_ctx.stringValue("GetApprovalSchemaResponse.Schema.SchemaName"));
		schema.setDescription(_ctx.stringValue("GetApprovalSchemaResponse.Schema.Description"));
		schema.setSchemaContent(_ctx.stringValue("GetApprovalSchemaResponse.Schema.SchemaContent"));
		schema.setSchemaVersion(_ctx.longValue("GetApprovalSchemaResponse.Schema.SchemaVersion"));
		schema.setPolicyType(_ctx.stringValue("GetApprovalSchemaResponse.Schema.PolicyType"));
		schema.setIsDefault(_ctx.booleanValue("GetApprovalSchemaResponse.Schema.IsDefault"));
		getApprovalSchemaResponse.setSchema(schema);
	 
	 	return getApprovalSchemaResponse;
	}
}