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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeNamespacefeatureResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeNamespacefeatureResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeNamespacefeatureResponse unmarshall(CreateLinkeantcodeAntcodeNamespacefeatureResponse createLinkeantcodeAntcodeNamespacefeatureResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeNamespacefeatureResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeNamespacefeatureResponse.RequestId"));
		createLinkeantcodeAntcodeNamespacefeatureResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeNamespacefeatureResponse.ResultCode"));
		createLinkeantcodeAntcodeNamespacefeatureResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeNamespacefeatureResponse.ResultMessage"));
		createLinkeantcodeAntcodeNamespacefeatureResponse.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeNamespacefeatureResponse.CreatedAt"));
		createLinkeantcodeAntcodeNamespacefeatureResponse.setFeatureType(_ctx.stringValue("CreateLinkeantcodeAntcodeNamespacefeatureResponse.FeatureType"));
		createLinkeantcodeAntcodeNamespacefeatureResponse.setFeatureValue(_ctx.stringValue("CreateLinkeantcodeAntcodeNamespacefeatureResponse.FeatureValue"));
		createLinkeantcodeAntcodeNamespacefeatureResponse.setId(_ctx.longValue("CreateLinkeantcodeAntcodeNamespacefeatureResponse.Id"));
		createLinkeantcodeAntcodeNamespacefeatureResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeNamespacefeatureResponse.ResponseStatusCode"));
		createLinkeantcodeAntcodeNamespacefeatureResponse.setSourceId(_ctx.longValue("CreateLinkeantcodeAntcodeNamespacefeatureResponse.SourceId"));
		createLinkeantcodeAntcodeNamespacefeatureResponse.setSourceType(_ctx.stringValue("CreateLinkeantcodeAntcodeNamespacefeatureResponse.SourceType"));
		createLinkeantcodeAntcodeNamespacefeatureResponse.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeNamespacefeatureResponse.UpdatedAt"));
	 
	 	return createLinkeantcodeAntcodeNamespacefeatureResponse;
	}
}