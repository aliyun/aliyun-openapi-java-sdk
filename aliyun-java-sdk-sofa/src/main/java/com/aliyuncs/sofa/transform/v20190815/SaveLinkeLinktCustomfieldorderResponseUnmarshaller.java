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

import com.aliyuncs.sofa.model.v20190815.SaveLinkeLinktCustomfieldorderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveLinkeLinktCustomfieldorderResponseUnmarshaller {

	public static SaveLinkeLinktCustomfieldorderResponse unmarshall(SaveLinkeLinktCustomfieldorderResponse saveLinkeLinktCustomfieldorderResponse, UnmarshallerContext _ctx) {
		
		saveLinkeLinktCustomfieldorderResponse.setRequestId(_ctx.stringValue("SaveLinkeLinktCustomfieldorderResponse.RequestId"));
		saveLinkeLinktCustomfieldorderResponse.setResultCode(_ctx.stringValue("SaveLinkeLinktCustomfieldorderResponse.ResultCode"));
		saveLinkeLinktCustomfieldorderResponse.setResultMessage(_ctx.stringValue("SaveLinkeLinktCustomfieldorderResponse.ResultMessage"));
		saveLinkeLinktCustomfieldorderResponse.setData(_ctx.booleanValue("SaveLinkeLinktCustomfieldorderResponse.Data"));
		saveLinkeLinktCustomfieldorderResponse.setErrorCode(_ctx.longValue("SaveLinkeLinktCustomfieldorderResponse.ErrorCode"));
		saveLinkeLinktCustomfieldorderResponse.setErrorMessage(_ctx.stringValue("SaveLinkeLinktCustomfieldorderResponse.ErrorMessage"));
		saveLinkeLinktCustomfieldorderResponse.setSuccess(_ctx.booleanValue("SaveLinkeLinktCustomfieldorderResponse.Success"));
	 
	 	return saveLinkeLinktCustomfieldorderResponse;
	}
}