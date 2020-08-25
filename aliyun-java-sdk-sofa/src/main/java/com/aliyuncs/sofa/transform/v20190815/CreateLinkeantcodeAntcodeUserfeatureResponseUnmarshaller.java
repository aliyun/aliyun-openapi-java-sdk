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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeUserfeatureResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeUserfeatureResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeUserfeatureResponse unmarshall(CreateLinkeantcodeAntcodeUserfeatureResponse createLinkeantcodeAntcodeUserfeatureResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeUserfeatureResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeUserfeatureResponse.RequestId"));
		createLinkeantcodeAntcodeUserfeatureResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeUserfeatureResponse.ResultCode"));
		createLinkeantcodeAntcodeUserfeatureResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeUserfeatureResponse.ResultMessage"));
		createLinkeantcodeAntcodeUserfeatureResponse.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeUserfeatureResponse.CreatedAt"));
		createLinkeantcodeAntcodeUserfeatureResponse.setFeatureType(_ctx.stringValue("CreateLinkeantcodeAntcodeUserfeatureResponse.FeatureType"));
		createLinkeantcodeAntcodeUserfeatureResponse.setFeatureValue(_ctx.stringValue("CreateLinkeantcodeAntcodeUserfeatureResponse.FeatureValue"));
		createLinkeantcodeAntcodeUserfeatureResponse.setId(_ctx.longValue("CreateLinkeantcodeAntcodeUserfeatureResponse.Id"));
		createLinkeantcodeAntcodeUserfeatureResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeUserfeatureResponse.ResponseStatusCode"));
		createLinkeantcodeAntcodeUserfeatureResponse.setSourceId(_ctx.longValue("CreateLinkeantcodeAntcodeUserfeatureResponse.SourceId"));
		createLinkeantcodeAntcodeUserfeatureResponse.setSourceType(_ctx.stringValue("CreateLinkeantcodeAntcodeUserfeatureResponse.SourceType"));
		createLinkeantcodeAntcodeUserfeatureResponse.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeUserfeatureResponse.UpdatedAt"));
	 
	 	return createLinkeantcodeAntcodeUserfeatureResponse;
	}
}