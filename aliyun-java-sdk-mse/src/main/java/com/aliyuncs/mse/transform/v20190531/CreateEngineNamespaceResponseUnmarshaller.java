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
		createEngineNamespaceResponse.setMessage(_ctx.stringValue("CreateEngineNamespaceResponse.Message"));
		createEngineNamespaceResponse.setClusterId(_ctx.stringValue("CreateEngineNamespaceResponse.ClusterId"));
		createEngineNamespaceResponse.setErrorCode(_ctx.stringValue("CreateEngineNamespaceResponse.ErrorCode"));
		createEngineNamespaceResponse.setSuccess(_ctx.booleanValue("CreateEngineNamespaceResponse.Success"));

		Data data = new Data();
		data.setType(_ctx.integerValue("CreateEngineNamespaceResponse.Data.Type"));
		data.setNamespaceShowName(_ctx.stringValue("CreateEngineNamespaceResponse.Data.NamespaceShowName"));
		data.setQuota(_ctx.integerValue("CreateEngineNamespaceResponse.Data.Quota"));
		data.setNamespace(_ctx.stringValue("CreateEngineNamespaceResponse.Data.Namespace"));
		data.setNamespaceDesc(_ctx.stringValue("CreateEngineNamespaceResponse.Data.NamespaceDesc"));
		data.setConfigCount(_ctx.integerValue("CreateEngineNamespaceResponse.Data.ConfigCount"));
		data.setServiceCount(_ctx.integerValue("CreateEngineNamespaceResponse.Data.ServiceCount"));
		createEngineNamespaceResponse.setData(data);
	 
	 	return createEngineNamespaceResponse;
	}
}