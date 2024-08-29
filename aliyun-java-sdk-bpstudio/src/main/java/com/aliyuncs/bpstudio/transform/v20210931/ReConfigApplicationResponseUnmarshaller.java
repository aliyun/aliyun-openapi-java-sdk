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

package com.aliyuncs.bpstudio.transform.v20210931;

import com.aliyuncs.bpstudio.model.v20210931.ReConfigApplicationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReConfigApplicationResponseUnmarshaller {

	public static ReConfigApplicationResponse unmarshall(ReConfigApplicationResponse reConfigApplicationResponse, UnmarshallerContext _ctx) {
		
		reConfigApplicationResponse.setRequestId(_ctx.stringValue("ReConfigApplicationResponse.RequestId"));
		reConfigApplicationResponse.setMessage(_ctx.stringValue("ReConfigApplicationResponse.Message"));
		reConfigApplicationResponse.setCode(_ctx.integerValue("ReConfigApplicationResponse.Code"));
	 
	 	return reConfigApplicationResponse;
	}
}