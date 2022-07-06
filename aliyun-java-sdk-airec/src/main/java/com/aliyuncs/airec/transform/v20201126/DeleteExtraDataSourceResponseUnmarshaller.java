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

import com.aliyuncs.airec.model.v20201126.DeleteExtraDataSourceResponse;
import com.aliyuncs.airec.model.v20201126.DeleteExtraDataSourceResponse.Result;
import com.aliyuncs.airec.model.v20201126.DeleteExtraDataSourceResponse.Result.Meta;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteExtraDataSourceResponseUnmarshaller {

	public static DeleteExtraDataSourceResponse unmarshall(DeleteExtraDataSourceResponse deleteExtraDataSourceResponse, UnmarshallerContext _ctx) {
		
		deleteExtraDataSourceResponse.setRequestId(_ctx.stringValue("DeleteExtraDataSourceResponse.requestId"));

		Result result = new Result();
		result.setStatus(_ctx.stringValue("DeleteExtraDataSourceResponse.result.Status"));
		result.setType(_ctx.stringValue("DeleteExtraDataSourceResponse.result.Type"));
		result.setGmtCreate(_ctx.stringValue("DeleteExtraDataSourceResponse.result.GmtCreate"));
		result.setGmtModified(_ctx.stringValue("DeleteExtraDataSourceResponse.result.GmtModified"));
		result.setDataSourceId(_ctx.stringValue("DeleteExtraDataSourceResponse.result.DataSourceId"));

		Meta meta = new Meta();
		meta.setInternal(_ctx.booleanValue("DeleteExtraDataSourceResponse.result.Meta.Internal"));
		meta.setMetaType(_ctx.stringValue("DeleteExtraDataSourceResponse.result.Meta.MetaType"));
		meta.setProjectName(_ctx.stringValue("DeleteExtraDataSourceResponse.result.Meta.ProjectName"));
		meta.setTableName(_ctx.stringValue("DeleteExtraDataSourceResponse.result.Meta.TableName"));
		meta.setType(_ctx.stringValue("DeleteExtraDataSourceResponse.result.Meta.Type"));
		meta.setUpdateFrequency(_ctx.longValue("DeleteExtraDataSourceResponse.result.Meta.UpdateFrequency"));
		result.setMeta(meta);
		deleteExtraDataSourceResponse.setResult(result);
	 
	 	return deleteExtraDataSourceResponse;
	}
}