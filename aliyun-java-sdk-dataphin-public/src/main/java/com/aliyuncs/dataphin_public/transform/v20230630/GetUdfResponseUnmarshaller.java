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

import com.aliyuncs.dataphin_public.model.v20230630.GetUdfResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetUdfResponse.UdfInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUdfResponseUnmarshaller {

	public static GetUdfResponse unmarshall(GetUdfResponse getUdfResponse, UnmarshallerContext _ctx) {
		
		getUdfResponse.setRequestId(_ctx.stringValue("GetUdfResponse.RequestId"));
		getUdfResponse.setSuccess(_ctx.booleanValue("GetUdfResponse.Success"));
		getUdfResponse.setHttpStatusCode(_ctx.integerValue("GetUdfResponse.HttpStatusCode"));
		getUdfResponse.setCode(_ctx.stringValue("GetUdfResponse.Code"));
		getUdfResponse.setMessage(_ctx.stringValue("GetUdfResponse.Message"));

		UdfInfo udfInfo = new UdfInfo();
		udfInfo.setId(_ctx.longValue("GetUdfResponse.UdfInfo.Id"));
		udfInfo.setName(_ctx.stringValue("GetUdfResponse.UdfInfo.Name"));
		udfInfo.setComputeEngineType(_ctx.stringValue("GetUdfResponse.UdfInfo.ComputeEngineType"));
		udfInfo.setDirectory(_ctx.stringValue("GetUdfResponse.UdfInfo.Directory"));
		udfInfo.setClassName(_ctx.stringValue("GetUdfResponse.UdfInfo.ClassName"));
		udfInfo.setCategory(_ctx.integerValue("GetUdfResponse.UdfInfo.Category"));
		udfInfo.setCommandHelp(_ctx.stringValue("GetUdfResponse.UdfInfo.CommandHelp"));
		udfInfo.setDescription(_ctx.stringValue("GetUdfResponse.UdfInfo.Description"));
		udfInfo.setGmtCreate(_ctx.stringValue("GetUdfResponse.UdfInfo.GmtCreate"));
		udfInfo.setGmtModified(_ctx.stringValue("GetUdfResponse.UdfInfo.GmtModified"));
		udfInfo.setCreator(_ctx.stringValue("GetUdfResponse.UdfInfo.Creator"));
		udfInfo.setLastModifier(_ctx.stringValue("GetUdfResponse.UdfInfo.LastModifier"));
		getUdfResponse.setUdfInfo(udfInfo);
	 
	 	return getUdfResponse;
	}
}