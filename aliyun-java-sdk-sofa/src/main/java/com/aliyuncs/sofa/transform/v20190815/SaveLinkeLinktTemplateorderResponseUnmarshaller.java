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

import com.aliyuncs.sofa.model.v20190815.SaveLinkeLinktTemplateorderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveLinkeLinktTemplateorderResponseUnmarshaller {

	public static SaveLinkeLinktTemplateorderResponse unmarshall(SaveLinkeLinktTemplateorderResponse saveLinkeLinktTemplateorderResponse, UnmarshallerContext _ctx) {
		
		saveLinkeLinktTemplateorderResponse.setRequestId(_ctx.stringValue("SaveLinkeLinktTemplateorderResponse.RequestId"));
		saveLinkeLinktTemplateorderResponse.setResultCode(_ctx.stringValue("SaveLinkeLinktTemplateorderResponse.ResultCode"));
		saveLinkeLinktTemplateorderResponse.setResultMessage(_ctx.stringValue("SaveLinkeLinktTemplateorderResponse.ResultMessage"));
		saveLinkeLinktTemplateorderResponse.setData(_ctx.booleanValue("SaveLinkeLinktTemplateorderResponse.Data"));
		saveLinkeLinktTemplateorderResponse.setErrorCode(_ctx.longValue("SaveLinkeLinktTemplateorderResponse.ErrorCode"));
		saveLinkeLinktTemplateorderResponse.setErrorMessage(_ctx.stringValue("SaveLinkeLinktTemplateorderResponse.ErrorMessage"));
		saveLinkeLinktTemplateorderResponse.setResponseStatusCode(_ctx.longValue("SaveLinkeLinktTemplateorderResponse.ResponseStatusCode"));
		saveLinkeLinktTemplateorderResponse.setSuccess(_ctx.booleanValue("SaveLinkeLinktTemplateorderResponse.Success"));
	 
	 	return saveLinkeLinktTemplateorderResponse;
	}
}