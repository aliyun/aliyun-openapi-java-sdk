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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutUnitbranchResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutUnitbranchResponseUnmarshaller {

	public static GetLinkeBahamutUnitbranchResponse unmarshall(GetLinkeBahamutUnitbranchResponse getLinkeBahamutUnitbranchResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutUnitbranchResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutUnitbranchResponse.RequestId"));
		getLinkeBahamutUnitbranchResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutUnitbranchResponse.ResultCode"));
		getLinkeBahamutUnitbranchResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutUnitbranchResponse.ResultMessage"));
		getLinkeBahamutUnitbranchResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutUnitbranchResponse.ErrorMessage"));
		getLinkeBahamutUnitbranchResponse.setMessage(_ctx.stringValue("GetLinkeBahamutUnitbranchResponse.Message"));
		getLinkeBahamutUnitbranchResponse.setResult(_ctx.stringValue("GetLinkeBahamutUnitbranchResponse.Result"));
		getLinkeBahamutUnitbranchResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutUnitbranchResponse.Success"));
	 
	 	return getLinkeBahamutUnitbranchResponse;
	}
}