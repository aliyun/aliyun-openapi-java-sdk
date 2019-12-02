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

import com.aliyuncs.mse.model.v20190531.CreateEngineNamespaceResponse;
import com.aliyuncs.mse.model.v20190531.CreateEngineNamespaceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateEngineNamespaceResponseUnmarshaller {

	public static CreateEngineNamespaceResponse unmarshall(CreateEngineNamespaceResponse createEngineNamespaceResponse, UnmarshallerContext _ctx) {
		
		createEngineNamespaceResponse.setRequestId(_ctx.stringValue("CreateEngineNamespaceResponse.RequestId"));
		createEngineNamespaceResponse.setSuccess(_ctx.booleanValue("CreateEngineNamespaceResponse.Success"));
		createEngineNamespaceResponse.setMessage(_ctx.stringValue("CreateEngineNamespaceResponse.Message"));
		createEngineNamespaceResponse.setErrorCode(_ctx.stringValue("CreateEngineNamespaceResponse.ErrorCode"));
		createEngineNamespaceResponse.setClusterId(_ctx.stringValue("CreateEngineNamespaceResponse.ClusterId"));

		Data data = new Data();
		data.setNamespace(_ctx.stringValue("CreateEngineNamespaceResponse.Data.Namespace"));
		data.setNamespaceShowName(_ctx.stringValue("CreateEngineNamespaceResponse.Data.NamespaceShowName"));
		data.setNamespaceDesc(_ctx.stringValue("CreateEngineNamespaceResponse.Data.NamespaceDesc"));
		data.setQuota(_ctx.integerValue("CreateEngineNamespaceResponse.Data.Quota"));
		data.setConfigCount(_ctx.integerValue("CreateEngineNamespaceResponse.Data.ConfigCount"));
		data.setType(_ctx.integerValue("CreateEngineNamespaceResponse.Data.Type"));
		createEngineNamespaceResponse.setData(data);
	 
	 	return createEngineNamespaceResponse;
	}
}