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
		getUdfResponse.setMessage(_ctx.stringValue("GetUdfResponse.Message"));
		getUdfResponse.setHttpStatusCode(_ctx.integerValue("GetUdfResponse.HttpStatusCode"));
		getUdfResponse.setCode(_ctx.stringValue("GetUdfResponse.Code"));
		getUdfResponse.setSuccess(_ctx.booleanValue("GetUdfResponse.Success"));

		UdfInfo udfInfo = new UdfInfo();
		udfInfo.setGmtCreate(_ctx.stringValue("GetUdfResponse.UdfInfo.GmtCreate"));
		udfInfo.setLastModifier(_ctx.stringValue("GetUdfResponse.UdfInfo.LastModifier"));
		udfInfo.setCategory(_ctx.integerValue("GetUdfResponse.UdfInfo.Category"));
		udfInfo.setDescription(_ctx.stringValue("GetUdfResponse.UdfInfo.Description"));
		udfInfo.setCommandHelp(_ctx.stringValue("GetUdfResponse.UdfInfo.CommandHelp"));
		udfInfo.setComputeEngineType(_ctx.stringValue("GetUdfResponse.UdfInfo.ComputeEngineType"));
		udfInfo.setClassName(_ctx.stringValue("GetUdfResponse.UdfInfo.ClassName"));
		udfInfo.setGmtModified(_ctx.stringValue("GetUdfResponse.UdfInfo.GmtModified"));
		udfInfo.setId(_ctx.longValue("GetUdfResponse.UdfInfo.Id"));
		udfInfo.setCreator(_ctx.stringValue("GetUdfResponse.UdfInfo.Creator"));
		udfInfo.setName(_ctx.stringValue("GetUdfResponse.UdfInfo.Name"));
		udfInfo.setDirectory(_ctx.stringValue("GetUdfResponse.UdfInfo.Directory"));
		getUdfResponse.setUdfInfo(udfInfo);
	 
	 	return getUdfResponse;
	}
}