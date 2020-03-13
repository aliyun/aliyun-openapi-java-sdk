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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeBahamutReleaseResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeBahamutReleaseResponseUnmarshaller {

	public static DeleteLinkeBahamutReleaseResponse unmarshall(DeleteLinkeBahamutReleaseResponse deleteLinkeBahamutReleaseResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeBahamutReleaseResponse.setRequestId(_ctx.stringValue("DeleteLinkeBahamutReleaseResponse.RequestId"));
		deleteLinkeBahamutReleaseResponse.setResultCode(_ctx.stringValue("DeleteLinkeBahamutReleaseResponse.ResultCode"));
		deleteLinkeBahamutReleaseResponse.setResultMessage(_ctx.stringValue("DeleteLinkeBahamutReleaseResponse.ResultMessage"));
		deleteLinkeBahamutReleaseResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeBahamutReleaseResponse.ErrorMessage"));
		deleteLinkeBahamutReleaseResponse.setMessage(_ctx.stringValue("DeleteLinkeBahamutReleaseResponse.Message"));
		deleteLinkeBahamutReleaseResponse.setSuccess(_ctx.booleanValue("DeleteLinkeBahamutReleaseResponse.Success"));
	 
	 	return deleteLinkeBahamutReleaseResponse;
	}
}