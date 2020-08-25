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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeProjectfeatureResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeProjectfeatureResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeProjectfeatureResponse unmarshall(DeleteLinkeantcodeAntcodeProjectfeatureResponse deleteLinkeantcodeAntcodeProjectfeatureResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeProjectfeatureResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectfeatureResponse.RequestId"));
		deleteLinkeantcodeAntcodeProjectfeatureResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectfeatureResponse.ResultCode"));
		deleteLinkeantcodeAntcodeProjectfeatureResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectfeatureResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeProjectfeatureResponse.setCreatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectfeatureResponse.CreatedAt"));
		deleteLinkeantcodeAntcodeProjectfeatureResponse.setFeatureType(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectfeatureResponse.FeatureType"));
		deleteLinkeantcodeAntcodeProjectfeatureResponse.setFeatureValue(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectfeatureResponse.FeatureValue"));
		deleteLinkeantcodeAntcodeProjectfeatureResponse.setId(_ctx.longValue("DeleteLinkeantcodeAntcodeProjectfeatureResponse.Id"));
		deleteLinkeantcodeAntcodeProjectfeatureResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeProjectfeatureResponse.ResponseStatusCode"));
		deleteLinkeantcodeAntcodeProjectfeatureResponse.setSourceId(_ctx.longValue("DeleteLinkeantcodeAntcodeProjectfeatureResponse.SourceId"));
		deleteLinkeantcodeAntcodeProjectfeatureResponse.setSourceType(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectfeatureResponse.SourceType"));
		deleteLinkeantcodeAntcodeProjectfeatureResponse.setUpdatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectfeatureResponse.UpdatedAt"));
	 
	 	return deleteLinkeantcodeAntcodeProjectfeatureResponse;
	}
}