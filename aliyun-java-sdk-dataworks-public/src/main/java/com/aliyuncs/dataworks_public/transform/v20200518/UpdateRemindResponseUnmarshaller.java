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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.UpdateRemindResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateRemindResponseUnmarshaller {

	public static UpdateRemindResponse unmarshall(UpdateRemindResponse updateRemindResponse, UnmarshallerContext _ctx) {
		
		updateRemindResponse.setRequestId(_ctx.stringValue("UpdateRemindResponse.RequestId"));
		updateRemindResponse.setHttpStatusCode(_ctx.integerValue("UpdateRemindResponse.HttpStatusCode"));
		updateRemindResponse.setData(_ctx.booleanValue("UpdateRemindResponse.Data"));
		updateRemindResponse.setErrorMessage(_ctx.stringValue("UpdateRemindResponse.ErrorMessage"));
		updateRemindResponse.setSuccess(_ctx.booleanValue("UpdateRemindResponse.Success"));
		updateRemindResponse.setErrorCode(_ctx.stringValue("UpdateRemindResponse.ErrorCode"));
	 
	 	return updateRemindResponse;
	}
}