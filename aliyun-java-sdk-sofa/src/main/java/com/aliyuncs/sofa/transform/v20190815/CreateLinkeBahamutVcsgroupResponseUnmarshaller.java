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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutVcsgroupResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutVcsgroupResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeBahamutVcsgroupResponseUnmarshaller {

	public static CreateLinkeBahamutVcsgroupResponse unmarshall(CreateLinkeBahamutVcsgroupResponse createLinkeBahamutVcsgroupResponse, UnmarshallerContext _ctx) {
		
		createLinkeBahamutVcsgroupResponse.setRequestId(_ctx.stringValue("CreateLinkeBahamutVcsgroupResponse.RequestId"));
		createLinkeBahamutVcsgroupResponse.setResultCode(_ctx.stringValue("CreateLinkeBahamutVcsgroupResponse.ResultCode"));
		createLinkeBahamutVcsgroupResponse.setResultMessage(_ctx.stringValue("CreateLinkeBahamutVcsgroupResponse.ResultMessage"));
		createLinkeBahamutVcsgroupResponse.setErrorMessage(_ctx.stringValue("CreateLinkeBahamutVcsgroupResponse.ErrorMessage"));
		createLinkeBahamutVcsgroupResponse.setMessage(_ctx.stringValue("CreateLinkeBahamutVcsgroupResponse.Message"));
		createLinkeBahamutVcsgroupResponse.setSuccess(_ctx.booleanValue("CreateLinkeBahamutVcsgroupResponse.Success"));

		Result result = new Result();
		result.setDescription(_ctx.stringValue("CreateLinkeBahamutVcsgroupResponse.Result.Description"));
		result.setId(_ctx.stringValue("CreateLinkeBahamutVcsgroupResponse.Result.Id"));
		result.setName(_ctx.stringValue("CreateLinkeBahamutVcsgroupResponse.Result.Name"));
		result.setPath(_ctx.stringValue("CreateLinkeBahamutVcsgroupResponse.Result.Path"));
		createLinkeBahamutVcsgroupResponse.setResult(result);
	 
	 	return createLinkeBahamutVcsgroupResponse;
	}
}