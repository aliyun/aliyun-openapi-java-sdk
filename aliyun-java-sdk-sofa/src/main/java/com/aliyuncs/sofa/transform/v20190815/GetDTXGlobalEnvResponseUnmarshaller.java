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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.GetDTXGlobalEnvResponse;
import com.aliyuncs.sofa.model.v20190815.GetDTXGlobalEnvResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDTXGlobalEnvResponseUnmarshaller {

	public static GetDTXGlobalEnvResponse unmarshall(GetDTXGlobalEnvResponse getDTXGlobalEnvResponse, UnmarshallerContext _ctx) {
		
		getDTXGlobalEnvResponse.setRequestId(_ctx.stringValue("GetDTXGlobalEnvResponse.RequestId"));
		getDTXGlobalEnvResponse.setResultCode(_ctx.stringValue("GetDTXGlobalEnvResponse.ResultCode"));
		getDTXGlobalEnvResponse.setResultMessage(_ctx.stringValue("GetDTXGlobalEnvResponse.ResultMessage"));
		getDTXGlobalEnvResponse.setSuccess(_ctx.booleanValue("GetDTXGlobalEnvResponse.Success"));

		Data data = new Data();
		data.setEnv(_ctx.stringValue("GetDTXGlobalEnvResponse.Data.Env"));
		data.setIsPublicCloud(_ctx.booleanValue("GetDTXGlobalEnvResponse.Data.IsPublicCloud"));
		data.setTenant(_ctx.stringValue("GetDTXGlobalEnvResponse.Data.Tenant"));
		getDTXGlobalEnvResponse.setData(data);
	 
	 	return getDTXGlobalEnvResponse;
	}
}