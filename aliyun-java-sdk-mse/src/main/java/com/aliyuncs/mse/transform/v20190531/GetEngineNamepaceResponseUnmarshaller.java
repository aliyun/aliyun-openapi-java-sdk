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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.GetEngineNamepaceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEngineNamepaceResponseUnmarshaller {

	public static GetEngineNamepaceResponse unmarshall(GetEngineNamepaceResponse getEngineNamepaceResponse, UnmarshallerContext _ctx) {
		
		getEngineNamepaceResponse.setRequestId(_ctx.stringValue("GetEngineNamepaceResponse.RequestId"));
		getEngineNamepaceResponse.setHttpCode(_ctx.stringValue("GetEngineNamepaceResponse.HttpCode"));
		getEngineNamepaceResponse.setType(_ctx.stringValue("GetEngineNamepaceResponse.Type"));
		getEngineNamepaceResponse.setQuota(_ctx.stringValue("GetEngineNamepaceResponse.Quota"));
		getEngineNamepaceResponse.setMessage(_ctx.stringValue("GetEngineNamepaceResponse.Message"));
		getEngineNamepaceResponse.setConfigCount(_ctx.stringValue("GetEngineNamepaceResponse.ConfigCount"));
		getEngineNamepaceResponse.setNamespaceShowName(_ctx.stringValue("GetEngineNamepaceResponse.NamespaceShowName"));
		getEngineNamepaceResponse.setErrorCode(_ctx.stringValue("GetEngineNamepaceResponse.ErrorCode"));
		getEngineNamepaceResponse.setSuccess(_ctx.booleanValue("GetEngineNamepaceResponse.Success"));
		getEngineNamepaceResponse.setNamespaceDesc(_ctx.stringValue("GetEngineNamepaceResponse.NamespaceDesc"));
		getEngineNamepaceResponse.setNamespace(_ctx.stringValue("GetEngineNamepaceResponse.Namespace"));
	 
	 	return getEngineNamepaceResponse;
	}
}