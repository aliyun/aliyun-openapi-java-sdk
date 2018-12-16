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

	public static ModifyDataSourceResponse unmarshall(ModifyDataSourceResponse modifyDataSourceResponse, UnmarshallerContext context) {
		
		modifyDataSourceResponse.setRequestId(context.stringValue("ModifyDataSourceResponse.RequestId"));
		modifyDataSourceResponse.setCode(context.stringValue("ModifyDataSourceResponse.Code"));
		modifyDataSourceResponse.setMessage(context.stringValue("ModifyDataSourceResponse.Message"));

		Result result = new Result();
		result.setTableName(context.stringValue("ModifyDataSourceResponse.Result.TableName"));
		result.setGmtCreate(context.stringValue("ModifyDataSourceResponse.Result.GmtCreate"));
		result.setGmtModified(context.stringValue("ModifyDataSourceResponse.Result.GmtModified"));

		Meta meta = new Meta();
		meta.setAccessKeyId(context.stringValue("ModifyDataSourceResponse.Result.Meta.AccessKeyId"));
		meta.setProjectName(context.stringValue("ModifyDataSourceResponse.Result.Meta.ProjectName"));
		meta.setTableName(context.stringValue("ModifyDataSourceResponse.Result.Meta.TableName"));
		meta.setPartition(context.stringValue("ModifyDataSourceResponse.Result.Meta.Partition"));
		meta.setTimestamp(context.longValue("ModifyDataSourceResponse.Result.Meta.Timestamp"));
		meta.setBucketName(context.stringValue("ModifyDataSourceResponse.Result.Meta.BucketName"));
		meta.setPath(context.stringValue("ModifyDataSourceResponse.Result.Meta.Path"));
		meta.setType(context.stringValue("ModifyDataSourceResponse.Result.Meta.Type"));
		result.setMeta(meta);
		modifyDataSourceResponse.setResult(result);
	 
	 	return modifyDataSourceResponse;
	}
}