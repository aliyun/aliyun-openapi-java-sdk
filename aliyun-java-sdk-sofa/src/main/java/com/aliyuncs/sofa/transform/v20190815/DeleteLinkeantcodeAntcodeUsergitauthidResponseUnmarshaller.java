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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeUsergitauthidResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeUsergitauthidResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeUsergitauthidResponse unmarshall(DeleteLinkeantcodeAntcodeUsergitauthidResponse deleteLinkeantcodeAntcodeUsergitauthidResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeUsergitauthidResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeUsergitauthidResponse.RequestId"));
		deleteLinkeantcodeAntcodeUsergitauthidResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeUsergitauthidResponse.ResultCode"));
		deleteLinkeantcodeAntcodeUsergitauthidResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeUsergitauthidResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeUsergitauthidResponse.setCreatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeUsergitauthidResponse.CreatedAt"));
		deleteLinkeantcodeAntcodeUsergitauthidResponse.setFeatureType(_ctx.stringValue("DeleteLinkeantcodeAntcodeUsergitauthidResponse.FeatureType"));
		deleteLinkeantcodeAntcodeUsergitauthidResponse.setFeatureValue(_ctx.stringValue("DeleteLinkeantcodeAntcodeUsergitauthidResponse.FeatureValue"));
		deleteLinkeantcodeAntcodeUsergitauthidResponse.setId(_ctx.longValue("DeleteLinkeantcodeAntcodeUsergitauthidResponse.Id"));
		deleteLinkeantcodeAntcodeUsergitauthidResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeUsergitauthidResponse.ResponseStatusCode"));
		deleteLinkeantcodeAntcodeUsergitauthidResponse.setSourceId(_ctx.longValue("DeleteLinkeantcodeAntcodeUsergitauthidResponse.SourceId"));
		deleteLinkeantcodeAntcodeUsergitauthidResponse.setSourceType(_ctx.stringValue("DeleteLinkeantcodeAntcodeUsergitauthidResponse.SourceType"));
		deleteLinkeantcodeAntcodeUsergitauthidResponse.setUpdatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeUsergitauthidResponse.UpdatedAt"));
	 
	 	return deleteLinkeantcodeAntcodeUsergitauthidResponse;
	}
}