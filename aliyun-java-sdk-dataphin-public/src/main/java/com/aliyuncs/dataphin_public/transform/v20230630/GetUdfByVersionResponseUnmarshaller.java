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

import com.aliyuncs.dataphin_public.model.v20230630.GetUdfByVersionResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetUdfByVersionResponse.UdfInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUdfByVersionResponseUnmarshaller {

	public static GetUdfByVersionResponse unmarshall(GetUdfByVersionResponse getUdfByVersionResponse, UnmarshallerContext _ctx) {
		
		getUdfByVersionResponse.setRequestId(_ctx.stringValue("GetUdfByVersionResponse.RequestId"));
		getUdfByVersionResponse.setMessage(_ctx.stringValue("GetUdfByVersionResponse.Message"));
		getUdfByVersionResponse.setHttpStatusCode(_ctx.integerValue("GetUdfByVersionResponse.HttpStatusCode"));
		getUdfByVersionResponse.setCode(_ctx.stringValue("GetUdfByVersionResponse.Code"));
		getUdfByVersionResponse.setSuccess(_ctx.booleanValue("GetUdfByVersionResponse.Success"));

		UdfInfo udfInfo = new UdfInfo();
		udfInfo.setGmtCreate(_ctx.stringValue("GetUdfByVersionResponse.UdfInfo.GmtCreate"));
		udfInfo.setLastModifier(_ctx.stringValue("GetUdfByVersionResponse.UdfInfo.LastModifier"));
		udfInfo.setCategory(_ctx.integerValue("GetUdfByVersionResponse.UdfInfo.Category"));
		udfInfo.setDescription(_ctx.stringValue("GetUdfByVersionResponse.UdfInfo.Description"));
		udfInfo.setCommandHelp(_ctx.stringValue("GetUdfByVersionResponse.UdfInfo.CommandHelp"));
		udfInfo.setComputeEngineType(_ctx.stringValue("GetUdfByVersionResponse.UdfInfo.ComputeEngineType"));
		udfInfo.setClassName(_ctx.stringValue("GetUdfByVersionResponse.UdfInfo.ClassName"));
		udfInfo.setGmtModified(_ctx.stringValue("GetUdfByVersionResponse.UdfInfo.GmtModified"));
		udfInfo.setId(_ctx.longValue("GetUdfByVersionResponse.UdfInfo.Id"));
		udfInfo.setCreator(_ctx.stringValue("GetUdfByVersionResponse.UdfInfo.Creator"));
		udfInfo.setName(_ctx.stringValue("GetUdfByVersionResponse.UdfInfo.Name"));
		udfInfo.setDirectory(_ctx.stringValue("GetUdfByVersionResponse.UdfInfo.Directory"));
		getUdfByVersionResponse.setUdfInfo(udfInfo);
	 
	 	return getUdfByVersionResponse;
	}
}