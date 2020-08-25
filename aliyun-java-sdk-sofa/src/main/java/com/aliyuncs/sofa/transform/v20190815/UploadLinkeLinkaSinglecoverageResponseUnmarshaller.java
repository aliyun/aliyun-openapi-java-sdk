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

import com.aliyuncs.sofa.model.v20190815.UploadLinkeLinkaSinglecoverageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadLinkeLinkaSinglecoverageResponseUnmarshaller {

	public static UploadLinkeLinkaSinglecoverageResponse unmarshall(UploadLinkeLinkaSinglecoverageResponse uploadLinkeLinkaSinglecoverageResponse, UnmarshallerContext _ctx) {
		
		uploadLinkeLinkaSinglecoverageResponse.setRequestId(_ctx.stringValue("UploadLinkeLinkaSinglecoverageResponse.RequestId"));
		uploadLinkeLinkaSinglecoverageResponse.setResultCode(_ctx.stringValue("UploadLinkeLinkaSinglecoverageResponse.ResultCode"));
		uploadLinkeLinkaSinglecoverageResponse.setResultMessage(_ctx.stringValue("UploadLinkeLinkaSinglecoverageResponse.ResultMessage"));
		uploadLinkeLinkaSinglecoverageResponse.setErrorCode(_ctx.stringValue("UploadLinkeLinkaSinglecoverageResponse.ErrorCode"));
		uploadLinkeLinkaSinglecoverageResponse.setErrorMsg(_ctx.stringValue("UploadLinkeLinkaSinglecoverageResponse.ErrorMsg"));
		uploadLinkeLinkaSinglecoverageResponse.setResponseStatusCode(_ctx.longValue("UploadLinkeLinkaSinglecoverageResponse.ResponseStatusCode"));
		uploadLinkeLinkaSinglecoverageResponse.setResult(_ctx.stringValue("UploadLinkeLinkaSinglecoverageResponse.Result"));
		uploadLinkeLinkaSinglecoverageResponse.setSuccess(_ctx.booleanValue("UploadLinkeLinkaSinglecoverageResponse.Success"));
	 
	 	return uploadLinkeLinkaSinglecoverageResponse;
	}
}