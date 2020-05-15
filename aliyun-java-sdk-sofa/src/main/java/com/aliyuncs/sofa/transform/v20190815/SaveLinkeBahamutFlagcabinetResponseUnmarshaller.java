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

import com.aliyuncs.sofa.model.v20190815.SaveLinkeBahamutFlagcabinetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveLinkeBahamutFlagcabinetResponseUnmarshaller {

	public static SaveLinkeBahamutFlagcabinetResponse unmarshall(SaveLinkeBahamutFlagcabinetResponse saveLinkeBahamutFlagcabinetResponse, UnmarshallerContext _ctx) {
		
		saveLinkeBahamutFlagcabinetResponse.setRequestId(_ctx.stringValue("SaveLinkeBahamutFlagcabinetResponse.RequestId"));
		saveLinkeBahamutFlagcabinetResponse.setResultCode(_ctx.stringValue("SaveLinkeBahamutFlagcabinetResponse.ResultCode"));
		saveLinkeBahamutFlagcabinetResponse.setResultMessage(_ctx.stringValue("SaveLinkeBahamutFlagcabinetResponse.ResultMessage"));
		saveLinkeBahamutFlagcabinetResponse.setErrorMessage(_ctx.stringValue("SaveLinkeBahamutFlagcabinetResponse.ErrorMessage"));
		saveLinkeBahamutFlagcabinetResponse.setMessage(_ctx.stringValue("SaveLinkeBahamutFlagcabinetResponse.Message"));
		saveLinkeBahamutFlagcabinetResponse.setResult(_ctx.booleanValue("SaveLinkeBahamutFlagcabinetResponse.Result"));
		saveLinkeBahamutFlagcabinetResponse.setSuccess(_ctx.booleanValue("SaveLinkeBahamutFlagcabinetResponse.Success"));
	 
	 	return saveLinkeBahamutFlagcabinetResponse;
	}
}