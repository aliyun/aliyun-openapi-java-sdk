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

import com.aliyuncs.sofa.model.v20190815.ImportLinkedeploycoreDeploycoreAppserviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImportLinkedeploycoreDeploycoreAppserviceResponseUnmarshaller {

	public static ImportLinkedeploycoreDeploycoreAppserviceResponse unmarshall(ImportLinkedeploycoreDeploycoreAppserviceResponse importLinkedeploycoreDeploycoreAppserviceResponse, UnmarshallerContext _ctx) {
		
		importLinkedeploycoreDeploycoreAppserviceResponse.setRequestId(_ctx.stringValue("ImportLinkedeploycoreDeploycoreAppserviceResponse.RequestId"));
		importLinkedeploycoreDeploycoreAppserviceResponse.setResultCode(_ctx.stringValue("ImportLinkedeploycoreDeploycoreAppserviceResponse.ResultCode"));
		importLinkedeploycoreDeploycoreAppserviceResponse.setResultMessage(_ctx.stringValue("ImportLinkedeploycoreDeploycoreAppserviceResponse.ResultMessage"));
		importLinkedeploycoreDeploycoreAppserviceResponse.setData(_ctx.booleanValue("ImportLinkedeploycoreDeploycoreAppserviceResponse.Data"));
		importLinkedeploycoreDeploycoreAppserviceResponse.setMessage(_ctx.stringValue("ImportLinkedeploycoreDeploycoreAppserviceResponse.Message"));
		importLinkedeploycoreDeploycoreAppserviceResponse.setResponseStatusCode(_ctx.longValue("ImportLinkedeploycoreDeploycoreAppserviceResponse.ResponseStatusCode"));
		importLinkedeploycoreDeploycoreAppserviceResponse.setSuccess(_ctx.booleanValue("ImportLinkedeploycoreDeploycoreAppserviceResponse.Success"));
	 
	 	return importLinkedeploycoreDeploycoreAppserviceResponse;
	}
}