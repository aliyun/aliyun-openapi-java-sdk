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

package com.aliyuncs.mindlive_biz.transform.v20210214;

import com.aliyuncs.mindlive_biz.model.v20210214.SavePasterResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SavePasterResponseUnmarshaller {

	public static SavePasterResponse unmarshall(SavePasterResponse savePasterResponse, UnmarshallerContext _ctx) {
		
		savePasterResponse.setRequestId(_ctx.stringValue("SavePasterResponse.RequestId"));
		savePasterResponse.setErrorMessage(_ctx.stringValue("SavePasterResponse.ErrorMessage"));
		savePasterResponse.setSuccess(_ctx.booleanValue("SavePasterResponse.Success"));
		savePasterResponse.setErrorCode(_ctx.stringValue("SavePasterResponse.ErrorCode"));
	 
	 	return savePasterResponse;
	}
}