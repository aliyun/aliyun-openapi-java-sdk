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

import com.aliyuncs.sofa.model.v20190815.PushTSSpiLifeCycleCallbackResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushTSSpiLifeCycleCallbackResponseUnmarshaller {

	public static PushTSSpiLifeCycleCallbackResponse unmarshall(PushTSSpiLifeCycleCallbackResponse pushTSSpiLifeCycleCallbackResponse, UnmarshallerContext _ctx) {
		
		pushTSSpiLifeCycleCallbackResponse.setRequestId(_ctx.stringValue("PushTSSpiLifeCycleCallbackResponse.RequestId"));
		pushTSSpiLifeCycleCallbackResponse.setResultCode(_ctx.stringValue("PushTSSpiLifeCycleCallbackResponse.ResultCode"));
		pushTSSpiLifeCycleCallbackResponse.setResultMessage(_ctx.stringValue("PushTSSpiLifeCycleCallbackResponse.ResultMessage"));
		pushTSSpiLifeCycleCallbackResponse.setCode(_ctx.stringValue("PushTSSpiLifeCycleCallbackResponse.code"));
		pushTSSpiLifeCycleCallbackResponse.setData(_ctx.stringValue("PushTSSpiLifeCycleCallbackResponse.data"));
		pushTSSpiLifeCycleCallbackResponse.setMessage(_ctx.stringValue("PushTSSpiLifeCycleCallbackResponse.message"));
		pushTSSpiLifeCycleCallbackResponse.setSuccess(_ctx.stringValue("PushTSSpiLifeCycleCallbackResponse.success"));
		pushTSSpiLifeCycleCallbackResponse.setSynchro(_ctx.stringValue("PushTSSpiLifeCycleCallbackResponse.synchro"));
	 
	 	return pushTSSpiLifeCycleCallbackResponse;
	}
}