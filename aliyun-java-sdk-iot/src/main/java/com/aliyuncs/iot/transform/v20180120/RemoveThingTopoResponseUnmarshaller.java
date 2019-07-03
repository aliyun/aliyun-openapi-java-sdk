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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.RemoveThingTopoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveThingTopoResponseUnmarshaller {

	public static RemoveThingTopoResponse unmarshall(RemoveThingTopoResponse removeThingTopoResponse, UnmarshallerContext _ctx) {
		
		removeThingTopoResponse.setRequestId(_ctx.stringValue("RemoveThingTopoResponse.RequestId"));
		removeThingTopoResponse.setSuccess(_ctx.booleanValue("RemoveThingTopoResponse.Success"));
		removeThingTopoResponse.setCode(_ctx.stringValue("RemoveThingTopoResponse.Code"));
		removeThingTopoResponse.setErrorMessage(_ctx.stringValue("RemoveThingTopoResponse.ErrorMessage"));
		removeThingTopoResponse.setData(_ctx.booleanValue("RemoveThingTopoResponse.Data"));
	 
	 	return removeThingTopoResponse;
	}
}