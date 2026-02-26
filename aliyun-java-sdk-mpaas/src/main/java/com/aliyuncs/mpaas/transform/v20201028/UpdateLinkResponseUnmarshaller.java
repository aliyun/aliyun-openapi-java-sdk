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

package com.aliyuncs.mpaas.transform.v20201028;

import com.aliyuncs.mpaas.model.v20201028.UpdateLinkResponse;
import com.aliyuncs.mpaas.model.v20201028.UpdateLinkResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkResponseUnmarshaller {

	public static UpdateLinkResponse unmarshall(UpdateLinkResponse updateLinkResponse, UnmarshallerContext _ctx) {
		
		updateLinkResponse.setRequestId(_ctx.stringValue("UpdateLinkResponse.RequestId"));
		updateLinkResponse.setResultMessage(_ctx.stringValue("UpdateLinkResponse.ResultMessage"));
		updateLinkResponse.setResultCode(_ctx.stringValue("UpdateLinkResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setTarget(_ctx.stringValue("UpdateLinkResponse.ResultContent.Target"));
		resultContent.setData(_ctx.stringValue("UpdateLinkResponse.ResultContent.Data"));
		resultContent.setVersion(_ctx.stringValue("UpdateLinkResponse.ResultContent.Version"));
		updateLinkResponse.setResultContent(resultContent);
	 
	 	return updateLinkResponse;
	}
}