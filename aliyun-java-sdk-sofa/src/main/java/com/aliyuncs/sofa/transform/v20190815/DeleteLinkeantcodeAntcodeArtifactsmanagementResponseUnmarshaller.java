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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeArtifactsmanagementResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeArtifactsmanagementResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeArtifactsmanagementResponse unmarshall(DeleteLinkeantcodeAntcodeArtifactsmanagementResponse deleteLinkeantcodeAntcodeArtifactsmanagementResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeArtifactsmanagementResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeArtifactsmanagementResponse.RequestId"));
		deleteLinkeantcodeAntcodeArtifactsmanagementResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeArtifactsmanagementResponse.ResultCode"));
		deleteLinkeantcodeAntcodeArtifactsmanagementResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeArtifactsmanagementResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeArtifactsmanagementResponse.setData(_ctx.booleanValue("DeleteLinkeantcodeAntcodeArtifactsmanagementResponse.Data"));
		deleteLinkeantcodeAntcodeArtifactsmanagementResponse.setMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeArtifactsmanagementResponse.Message"));
		deleteLinkeantcodeAntcodeArtifactsmanagementResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeArtifactsmanagementResponse.ResponseStatusCode"));
		deleteLinkeantcodeAntcodeArtifactsmanagementResponse.setStatus(_ctx.booleanValue("DeleteLinkeantcodeAntcodeArtifactsmanagementResponse.Status"));
	 
	 	return deleteLinkeantcodeAntcodeArtifactsmanagementResponse;
	}
}