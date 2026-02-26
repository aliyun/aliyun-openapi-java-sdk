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

package com.aliyuncs.linkcard.transform.v20210520;

import com.aliyuncs.linkcard.model.v20210520.ResumeSingleCardResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResumeSingleCardResponseUnmarshaller {

	public static ResumeSingleCardResponse unmarshall(ResumeSingleCardResponse resumeSingleCardResponse, UnmarshallerContext _ctx) {
		
		resumeSingleCardResponse.setRequestId(_ctx.stringValue("ResumeSingleCardResponse.RequestId"));
		resumeSingleCardResponse.setData(_ctx.booleanValue("ResumeSingleCardResponse.Data"));
		resumeSingleCardResponse.setErrorMessage(_ctx.stringValue("ResumeSingleCardResponse.ErrorMessage"));
		resumeSingleCardResponse.setSuccess(_ctx.booleanValue("ResumeSingleCardResponse.Success"));
		resumeSingleCardResponse.setLocalizedMessage(_ctx.stringValue("ResumeSingleCardResponse.LocalizedMessage"));
		resumeSingleCardResponse.setCode(_ctx.stringValue("ResumeSingleCardResponse.Code"));
	 
	 	return resumeSingleCardResponse;
	}
}