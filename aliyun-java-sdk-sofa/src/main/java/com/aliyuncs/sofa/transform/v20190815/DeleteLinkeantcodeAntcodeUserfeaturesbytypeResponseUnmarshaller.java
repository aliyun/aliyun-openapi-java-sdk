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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeUserfeaturesbytypeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeUserfeaturesbytypeResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeUserfeaturesbytypeResponse unmarshall(DeleteLinkeantcodeAntcodeUserfeaturesbytypeResponse deleteLinkeantcodeAntcodeUserfeaturesbytypeResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeUserfeaturesbytypeResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeUserfeaturesbytypeResponse.RequestId"));
		deleteLinkeantcodeAntcodeUserfeaturesbytypeResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeUserfeaturesbytypeResponse.ResultCode"));
		deleteLinkeantcodeAntcodeUserfeaturesbytypeResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeUserfeaturesbytypeResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeUserfeaturesbytypeResponse.setCreatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeUserfeaturesbytypeResponse.CreatedAt"));
		deleteLinkeantcodeAntcodeUserfeaturesbytypeResponse.setFeatureType(_ctx.stringValue("DeleteLinkeantcodeAntcodeUserfeaturesbytypeResponse.FeatureType"));
		deleteLinkeantcodeAntcodeUserfeaturesbytypeResponse.setFeatureValue(_ctx.stringValue("DeleteLinkeantcodeAntcodeUserfeaturesbytypeResponse.FeatureValue"));
		deleteLinkeantcodeAntcodeUserfeaturesbytypeResponse.setId(_ctx.longValue("DeleteLinkeantcodeAntcodeUserfeaturesbytypeResponse.Id"));
		deleteLinkeantcodeAntcodeUserfeaturesbytypeResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeUserfeaturesbytypeResponse.ResponseStatusCode"));
		deleteLinkeantcodeAntcodeUserfeaturesbytypeResponse.setSourceId(_ctx.longValue("DeleteLinkeantcodeAntcodeUserfeaturesbytypeResponse.SourceId"));
		deleteLinkeantcodeAntcodeUserfeaturesbytypeResponse.setSourceType(_ctx.stringValue("DeleteLinkeantcodeAntcodeUserfeaturesbytypeResponse.SourceType"));
		deleteLinkeantcodeAntcodeUserfeaturesbytypeResponse.setUpdatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeUserfeaturesbytypeResponse.UpdatedAt"));
	 
	 	return deleteLinkeantcodeAntcodeUserfeaturesbytypeResponse;
	}
}