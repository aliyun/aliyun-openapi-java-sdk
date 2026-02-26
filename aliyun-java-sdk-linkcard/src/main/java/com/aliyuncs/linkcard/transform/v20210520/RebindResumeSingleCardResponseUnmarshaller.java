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

import com.aliyuncs.linkcard.model.v20210520.RebindResumeSingleCardResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RebindResumeSingleCardResponseUnmarshaller {

	public static RebindResumeSingleCardResponse unmarshall(RebindResumeSingleCardResponse rebindResumeSingleCardResponse, UnmarshallerContext _ctx) {
		
		rebindResumeSingleCardResponse.setRequestId(_ctx.stringValue("RebindResumeSingleCardResponse.RequestId"));
		rebindResumeSingleCardResponse.setData(_ctx.booleanValue("RebindResumeSingleCardResponse.Data"));
		rebindResumeSingleCardResponse.setErrorMessage(_ctx.stringValue("RebindResumeSingleCardResponse.ErrorMessage"));
		rebindResumeSingleCardResponse.setSuccess(_ctx.booleanValue("RebindResumeSingleCardResponse.Success"));
		rebindResumeSingleCardResponse.setLocalizedMessage(_ctx.stringValue("RebindResumeSingleCardResponse.LocalizedMessage"));
		rebindResumeSingleCardResponse.setCode(_ctx.stringValue("RebindResumeSingleCardResponse.Code"));
	 
	 	return rebindResumeSingleCardResponse;
	}
}