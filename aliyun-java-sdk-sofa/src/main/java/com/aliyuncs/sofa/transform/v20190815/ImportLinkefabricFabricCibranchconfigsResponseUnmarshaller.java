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

import com.aliyuncs.sofa.model.v20190815.ImportLinkefabricFabricCibranchconfigsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImportLinkefabricFabricCibranchconfigsResponseUnmarshaller {

	public static ImportLinkefabricFabricCibranchconfigsResponse unmarshall(ImportLinkefabricFabricCibranchconfigsResponse importLinkefabricFabricCibranchconfigsResponse, UnmarshallerContext _ctx) {
		
		importLinkefabricFabricCibranchconfigsResponse.setRequestId(_ctx.stringValue("ImportLinkefabricFabricCibranchconfigsResponse.RequestId"));
		importLinkefabricFabricCibranchconfigsResponse.setResultCode(_ctx.stringValue("ImportLinkefabricFabricCibranchconfigsResponse.ResultCode"));
		importLinkefabricFabricCibranchconfigsResponse.setResultMessage(_ctx.stringValue("ImportLinkefabricFabricCibranchconfigsResponse.ResultMessage"));
		importLinkefabricFabricCibranchconfigsResponse.setData(_ctx.booleanValue("ImportLinkefabricFabricCibranchconfigsResponse.Data"));
		importLinkefabricFabricCibranchconfigsResponse.setMessage(_ctx.stringValue("ImportLinkefabricFabricCibranchconfigsResponse.Message"));
		importLinkefabricFabricCibranchconfigsResponse.setResponseStatusCode(_ctx.longValue("ImportLinkefabricFabricCibranchconfigsResponse.ResponseStatusCode"));
		importLinkefabricFabricCibranchconfigsResponse.setSuccess(_ctx.booleanValue("ImportLinkefabricFabricCibranchconfigsResponse.Success"));
	 
	 	return importLinkefabricFabricCibranchconfigsResponse;
	}
}