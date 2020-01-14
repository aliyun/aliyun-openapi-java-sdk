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

package com.aliyuncs.cloudwifi_pop.transform.v20191118;

import com.aliyuncs.cloudwifi_pop.model.v20191118.RebootApResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class RebootApResponseUnmarshaller {

	public static RebootApResponse unmarshall(RebootApResponse rebootApResponse, UnmarshallerContext _ctx) {
		
		rebootApResponse.setRequestId(_ctx.stringValue("RebootApResponse.RequestId"));
		rebootApResponse.setData(_ctx.mapValue("RebootApResponse.Data"));
		rebootApResponse.setIsSuccess(_ctx.booleanValue("RebootApResponse.IsSuccess"));
		rebootApResponse.setErrorCode(_ctx.integerValue("RebootApResponse.ErrorCode"));
		rebootApResponse.setErrorMessage(_ctx.stringValue("RebootApResponse.ErrorMessage"));
	 
	 	return rebootApResponse;
	}
}