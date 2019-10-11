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

import com.aliyuncs.airec.model.v20181012.ModifyDataSourceResponse;
import com.aliyuncs.airec.model.v20181012.ModifyDataSourceResponse.Result;
import com.aliyuncs.airec.model.v20181012.ModifyDataSourceResponse.Result.Meta;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyDataSourceResponseUnmarshaller {

	public static ModifyDataSourceResponse unmarshall(ModifyDataSourceResponse modifyDataSourceResponse, UnmarshallerContext _ctx) {
		
		modifyDataSourceResponse.setRequestId(_ctx.stringValue("ModifyDataSourceResponse.RequestId"));
		modifyDataSourceResponse.setCode(_ctx.stringValue("ModifyDataSourceResponse.Code"));
		modifyDataSourceResponse.setMessage(_ctx.stringValue("ModifyDataSourceResponse.Message"));

		Result result = new Result();
		result.setTableName(_ctx.stringValue("ModifyDataSourceResponse.Result.TableName"));
		result.setGmtCreate(_ctx.stringValue("ModifyDataSourceResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.stringValue("ModifyDataSourceResponse.Result.GmtModified"));

		Meta meta = new Meta();
		meta.setAccessKeyId(_ctx.stringValue("ModifyDataSourceResponse.Result.Meta.AccessKeyId"));
		meta.setProjectName(_ctx.stringValue("ModifyDataSourceResponse.Result.Meta.ProjectName"));
		meta.setTableName(_ctx.stringValue("ModifyDataSourceResponse.Result.Meta.TableName"));
		meta.setPartition(_ctx.stringValue("ModifyDataSourceResponse.Result.Meta.Partition"));
		meta.setTimestamp(_ctx.longValue("ModifyDataSourceResponse.Result.Meta.Timestamp"));
		meta.setBucketName(_ctx.stringValue("ModifyDataSourceResponse.Result.Meta.BucketName"));
		meta.setPath(_ctx.stringValue("ModifyDataSourceResponse.Result.Meta.Path"));
		meta.setType(_ctx.stringValue("ModifyDataSourceResponse.Result.Meta.Type"));
		result.setMeta(meta);
		modifyDataSourceResponse.setResult(result);
	 
	 	return modifyDataSourceResponse;
	}
}