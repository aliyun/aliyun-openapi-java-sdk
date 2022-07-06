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

import com.aliyuncs.airec.model.v20201126.CreateExtraDataSourceResponse;
import com.aliyuncs.airec.model.v20201126.CreateExtraDataSourceResponse.Result;
import com.aliyuncs.airec.model.v20201126.CreateExtraDataSourceResponse.Result.Meta;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateExtraDataSourceResponseUnmarshaller {

	public static CreateExtraDataSourceResponse unmarshall(CreateExtraDataSourceResponse createExtraDataSourceResponse, UnmarshallerContext _ctx) {
		
		createExtraDataSourceResponse.setRequestId(_ctx.stringValue("CreateExtraDataSourceResponse.requestId"));

		Result result = new Result();
		result.setStatus(_ctx.stringValue("CreateExtraDataSourceResponse.result.Status"));
		result.setType(_ctx.stringValue("CreateExtraDataSourceResponse.result.Type"));
		result.setGmtCreate(_ctx.stringValue("CreateExtraDataSourceResponse.result.GmtCreate"));
		result.setGmtModified(_ctx.stringValue("CreateExtraDataSourceResponse.result.GmtModified"));
		result.setDataSourceId(_ctx.stringValue("CreateExtraDataSourceResponse.result.DataSourceId"));

		Meta meta = new Meta();
		meta.setInternal(_ctx.booleanValue("CreateExtraDataSourceResponse.result.Meta.Internal"));
		meta.setMetaType(_ctx.stringValue("CreateExtraDataSourceResponse.result.Meta.MetaType"));
		meta.setProjectName(_ctx.stringValue("CreateExtraDataSourceResponse.result.Meta.ProjectName"));
		meta.setTableName(_ctx.stringValue("CreateExtraDataSourceResponse.result.Meta.TableName"));
		meta.setType(_ctx.stringValue("CreateExtraDataSourceResponse.result.Meta.Type"));
		meta.setUpdateFrequency(_ctx.longValue("CreateExtraDataSourceResponse.result.Meta.UpdateFrequency"));
		result.setMeta(meta);
		createExtraDataSourceResponse.setResult(result);
	 
	 	return createExtraDataSourceResponse;
	}
}