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

package com.aliyuncs.airec.transform.v20201126;

import com.aliyuncs.airec.model.v20201126.ModifyDataSourceResponse;
import com.aliyuncs.airec.model.v20201126.ModifyDataSourceResponse.Result;
import com.aliyuncs.airec.model.v20201126.ModifyDataSourceResponse.Result.Meta;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyDataSourceResponseUnmarshaller {

	public static ModifyDataSourceResponse unmarshall(ModifyDataSourceResponse modifyDataSourceResponse, UnmarshallerContext _ctx) {
		
		modifyDataSourceResponse.setCode(_ctx.stringValue("ModifyDataSourceResponse.code"));
		modifyDataSourceResponse.setMessage(_ctx.stringValue("ModifyDataSourceResponse.message"));
		modifyDataSourceResponse.setRequestId(_ctx.stringValue("ModifyDataSourceResponse.requestId"));

		Result result = new Result();
		result.setGmtCreate(_ctx.stringValue("ModifyDataSourceResponse.result.gmtCreate"));
		result.setGmtModified(_ctx.stringValue("ModifyDataSourceResponse.result.gmtModified"));
		result.setTableName(_ctx.stringValue("ModifyDataSourceResponse.result.tableName"));

		Meta meta = new Meta();
		meta.setAccessKeyId(_ctx.stringValue("ModifyDataSourceResponse.result.meta.accessKeyId"));
		meta.setBucketName(_ctx.stringValue("ModifyDataSourceResponse.result.meta.bucketName"));
		meta.setPartition(_ctx.stringValue("ModifyDataSourceResponse.result.meta.partition"));
		meta.setPath(_ctx.stringValue("ModifyDataSourceResponse.result.meta.path"));
		meta.setProjectName(_ctx.stringValue("ModifyDataSourceResponse.result.meta.projectName"));
		meta.setTableName(_ctx.stringValue("ModifyDataSourceResponse.result.meta.tableName"));
		meta.setTimestamp(_ctx.longValue("ModifyDataSourceResponse.result.meta.timestamp"));
		meta.setType(_ctx.stringValue("ModifyDataSourceResponse.result.meta.type"));
		result.setMeta(meta);
		modifyDataSourceResponse.setResult(result);
	 
	 	return modifyDataSourceResponse;
	}
}