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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeNamespacefeatureResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeNamespacefeatureResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeNamespacefeatureResponse unmarshall(DeleteLinkeantcodeAntcodeNamespacefeatureResponse deleteLinkeantcodeAntcodeNamespacefeatureResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeNamespacefeatureResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeNamespacefeatureResponse.RequestId"));
		deleteLinkeantcodeAntcodeNamespacefeatureResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeNamespacefeatureResponse.ResultCode"));
		deleteLinkeantcodeAntcodeNamespacefeatureResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeNamespacefeatureResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeNamespacefeatureResponse.setCreatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeNamespacefeatureResponse.CreatedAt"));
		deleteLinkeantcodeAntcodeNamespacefeatureResponse.setFeatureType(_ctx.stringValue("DeleteLinkeantcodeAntcodeNamespacefeatureResponse.FeatureType"));
		deleteLinkeantcodeAntcodeNamespacefeatureResponse.setFeatureValue(_ctx.stringValue("DeleteLinkeantcodeAntcodeNamespacefeatureResponse.FeatureValue"));
		deleteLinkeantcodeAntcodeNamespacefeatureResponse.setId(_ctx.longValue("DeleteLinkeantcodeAntcodeNamespacefeatureResponse.Id"));
		deleteLinkeantcodeAntcodeNamespacefeatureResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeNamespacefeatureResponse.ResponseStatusCode"));
		deleteLinkeantcodeAntcodeNamespacefeatureResponse.setSourceId(_ctx.longValue("DeleteLinkeantcodeAntcodeNamespacefeatureResponse.SourceId"));
		deleteLinkeantcodeAntcodeNamespacefeatureResponse.setSourceType(_ctx.stringValue("DeleteLinkeantcodeAntcodeNamespacefeatureResponse.SourceType"));
		deleteLinkeantcodeAntcodeNamespacefeatureResponse.setUpdatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeNamespacefeatureResponse.UpdatedAt"));
	 
	 	return deleteLinkeantcodeAntcodeNamespacefeatureResponse;
	}
}