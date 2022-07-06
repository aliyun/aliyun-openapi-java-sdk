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

import com.aliyuncs.airec.model.v20201126.GetExtraDataSourceResponse;
import com.aliyuncs.airec.model.v20201126.GetExtraDataSourceResponse.Result;
import com.aliyuncs.airec.model.v20201126.GetExtraDataSourceResponse.Result.Meta;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetExtraDataSourceResponseUnmarshaller {

	public static GetExtraDataSourceResponse unmarshall(GetExtraDataSourceResponse getExtraDataSourceResponse, UnmarshallerContext _ctx) {
		
		getExtraDataSourceResponse.setRequestId(_ctx.stringValue("GetExtraDataSourceResponse.requestId"));

		Result result = new Result();
		result.setStatus(_ctx.stringValue("GetExtraDataSourceResponse.result.Status"));
		result.setType(_ctx.stringValue("GetExtraDataSourceResponse.result.Type"));
		result.setGmtCreate(_ctx.stringValue("GetExtraDataSourceResponse.result.GmtCreate"));
		result.setGmtModified(_ctx.stringValue("GetExtraDataSourceResponse.result.GmtModified"));
		result.setDataSourceId(_ctx.stringValue("GetExtraDataSourceResponse.result.DataSourceId"));

		Meta meta = new Meta();
		meta.setInternal(_ctx.booleanValue("GetExtraDataSourceResponse.result.Meta.Internal"));
		meta.setMetaType(_ctx.stringValue("GetExtraDataSourceResponse.result.Meta.MetaType"));
		meta.setProjectName(_ctx.stringValue("GetExtraDataSourceResponse.result.Meta.ProjectName"));
		meta.setTableName(_ctx.stringValue("GetExtraDataSourceResponse.result.Meta.TableName"));
		meta.setType(_ctx.stringValue("GetExtraDataSourceResponse.result.Meta.Type"));
		meta.setUpdateFrequency(_ctx.longValue("GetExtraDataSourceResponse.result.Meta.UpdateFrequency"));
		result.setMeta(meta);
		getExtraDataSourceResponse.setResult(result);
	 
	 	return getExtraDataSourceResponse;
	}
}