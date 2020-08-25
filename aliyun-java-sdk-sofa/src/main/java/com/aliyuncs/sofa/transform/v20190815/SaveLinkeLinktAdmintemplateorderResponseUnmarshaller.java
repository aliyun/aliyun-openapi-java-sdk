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

import com.aliyuncs.sofa.model.v20190815.SaveLinkeLinktAdmintemplateorderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveLinkeLinktAdmintemplateorderResponseUnmarshaller {

	public static SaveLinkeLinktAdmintemplateorderResponse unmarshall(SaveLinkeLinktAdmintemplateorderResponse saveLinkeLinktAdmintemplateorderResponse, UnmarshallerContext _ctx) {
		
		saveLinkeLinktAdmintemplateorderResponse.setRequestId(_ctx.stringValue("SaveLinkeLinktAdmintemplateorderResponse.RequestId"));
		saveLinkeLinktAdmintemplateorderResponse.setResultCode(_ctx.stringValue("SaveLinkeLinktAdmintemplateorderResponse.ResultCode"));
		saveLinkeLinktAdmintemplateorderResponse.setResultMessage(_ctx.stringValue("SaveLinkeLinktAdmintemplateorderResponse.ResultMessage"));
		saveLinkeLinktAdmintemplateorderResponse.setData(_ctx.booleanValue("SaveLinkeLinktAdmintemplateorderResponse.Data"));
		saveLinkeLinktAdmintemplateorderResponse.setErrorCode(_ctx.longValue("SaveLinkeLinktAdmintemplateorderResponse.ErrorCode"));
		saveLinkeLinktAdmintemplateorderResponse.setErrorMessage(_ctx.stringValue("SaveLinkeLinktAdmintemplateorderResponse.ErrorMessage"));
		saveLinkeLinktAdmintemplateorderResponse.setResponseStatusCode(_ctx.longValue("SaveLinkeLinktAdmintemplateorderResponse.ResponseStatusCode"));
		saveLinkeLinktAdmintemplateorderResponse.setSuccess(_ctx.booleanValue("SaveLinkeLinktAdmintemplateorderResponse.Success"));
	 
	 	return saveLinkeLinktAdmintemplateorderResponse;
	}
}