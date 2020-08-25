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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUsergitauthResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeUsergitauthResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeUsergitauthResponse unmarshall(UpdateLinkeantcodeAntcodeUsergitauthResponse updateLinkeantcodeAntcodeUsergitauthResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeUsergitauthResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeUsergitauthResponse.RequestId"));
		updateLinkeantcodeAntcodeUsergitauthResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeUsergitauthResponse.ResultCode"));
		updateLinkeantcodeAntcodeUsergitauthResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeUsergitauthResponse.ResultMessage"));
		updateLinkeantcodeAntcodeUsergitauthResponse.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUsergitauthResponse.CreatedAt"));
		updateLinkeantcodeAntcodeUsergitauthResponse.setFeatureType(_ctx.stringValue("UpdateLinkeantcodeAntcodeUsergitauthResponse.FeatureType"));
		updateLinkeantcodeAntcodeUsergitauthResponse.setFeatureValue(_ctx.stringValue("UpdateLinkeantcodeAntcodeUsergitauthResponse.FeatureValue"));
		updateLinkeantcodeAntcodeUsergitauthResponse.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeUsergitauthResponse.Id"));
		updateLinkeantcodeAntcodeUsergitauthResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeUsergitauthResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeUsergitauthResponse.setSourceId(_ctx.longValue("UpdateLinkeantcodeAntcodeUsergitauthResponse.SourceId"));
		updateLinkeantcodeAntcodeUsergitauthResponse.setSourceType(_ctx.stringValue("UpdateLinkeantcodeAntcodeUsergitauthResponse.SourceType"));
		updateLinkeantcodeAntcodeUsergitauthResponse.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUsergitauthResponse.UpdatedAt"));
	 
	 	return updateLinkeantcodeAntcodeUsergitauthResponse;
	}
}