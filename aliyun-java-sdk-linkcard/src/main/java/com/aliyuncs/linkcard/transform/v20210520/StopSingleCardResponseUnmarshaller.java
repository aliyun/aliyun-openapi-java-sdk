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

import com.aliyuncs.linkcard.model.v20210520.StopSingleCardResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopSingleCardResponseUnmarshaller {

	public static StopSingleCardResponse unmarshall(StopSingleCardResponse stopSingleCardResponse, UnmarshallerContext _ctx) {
		
		stopSingleCardResponse.setRequestId(_ctx.stringValue("StopSingleCardResponse.RequestId"));
		stopSingleCardResponse.setData(_ctx.booleanValue("StopSingleCardResponse.Data"));
		stopSingleCardResponse.setErrorMessage(_ctx.stringValue("StopSingleCardResponse.ErrorMessage"));
		stopSingleCardResponse.setSuccess(_ctx.booleanValue("StopSingleCardResponse.Success"));
		stopSingleCardResponse.setLocalizedMessage(_ctx.stringValue("StopSingleCardResponse.LocalizedMessage"));
		stopSingleCardResponse.setCode(_ctx.stringValue("StopSingleCardResponse.Code"));
	 
	 	return stopSingleCardResponse;
	}
}