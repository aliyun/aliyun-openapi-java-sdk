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

import com.aliyuncs.sofa.model.v20190815.UploadLinkeantcodeAntcodeNamespaceprojectuploadsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadLinkeantcodeAntcodeNamespaceprojectuploadsResponseUnmarshaller {

	public static UploadLinkeantcodeAntcodeNamespaceprojectuploadsResponse unmarshall(UploadLinkeantcodeAntcodeNamespaceprojectuploadsResponse uploadLinkeantcodeAntcodeNamespaceprojectuploadsResponse, UnmarshallerContext _ctx) {
		
		uploadLinkeantcodeAntcodeNamespaceprojectuploadsResponse.setRequestId(_ctx.stringValue("UploadLinkeantcodeAntcodeNamespaceprojectuploadsResponse.RequestId"));
		uploadLinkeantcodeAntcodeNamespaceprojectuploadsResponse.setResultCode(_ctx.stringValue("UploadLinkeantcodeAntcodeNamespaceprojectuploadsResponse.ResultCode"));
		uploadLinkeantcodeAntcodeNamespaceprojectuploadsResponse.setResultMessage(_ctx.stringValue("UploadLinkeantcodeAntcodeNamespaceprojectuploadsResponse.ResultMessage"));
		uploadLinkeantcodeAntcodeNamespaceprojectuploadsResponse.setResponseContent(_ctx.stringValue("UploadLinkeantcodeAntcodeNamespaceprojectuploadsResponse.ResponseContent"));
		uploadLinkeantcodeAntcodeNamespaceprojectuploadsResponse.setResponseStatusCode(_ctx.longValue("UploadLinkeantcodeAntcodeNamespaceprojectuploadsResponse.ResponseStatusCode"));
	 
	 	return uploadLinkeantcodeAntcodeNamespaceprojectuploadsResponse;
	}
}