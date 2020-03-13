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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeLinktAdmincustomfieldResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeLinktAdmincustomfieldResponseUnmarshaller {

	public static DeleteLinkeLinktAdmincustomfieldResponse unmarshall(DeleteLinkeLinktAdmincustomfieldResponse deleteLinkeLinktAdmincustomfieldResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeLinktAdmincustomfieldResponse.setRequestId(_ctx.stringValue("DeleteLinkeLinktAdmincustomfieldResponse.RequestId"));
		deleteLinkeLinktAdmincustomfieldResponse.setResultCode(_ctx.stringValue("DeleteLinkeLinktAdmincustomfieldResponse.ResultCode"));
		deleteLinkeLinktAdmincustomfieldResponse.setResultMessage(_ctx.stringValue("DeleteLinkeLinktAdmincustomfieldResponse.ResultMessage"));
		deleteLinkeLinktAdmincustomfieldResponse.setData(_ctx.booleanValue("DeleteLinkeLinktAdmincustomfieldResponse.Data"));
		deleteLinkeLinktAdmincustomfieldResponse.setErrorCode(_ctx.longValue("DeleteLinkeLinktAdmincustomfieldResponse.ErrorCode"));
		deleteLinkeLinktAdmincustomfieldResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeLinktAdmincustomfieldResponse.ErrorMessage"));
		deleteLinkeLinktAdmincustomfieldResponse.setSuccess(_ctx.booleanValue("DeleteLinkeLinktAdmincustomfieldResponse.Success"));
	 
	 	return deleteLinkeLinktAdmincustomfieldResponse;
	}
}