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

package com.aliyuncs.saf.transform.v20190521;

import com.aliyuncs.saf.model.v20190521.RequestDecisionResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestDecisionResponseUnmarshaller {

	public static RequestDecisionResponse unmarshall(RequestDecisionResponse requestDecisionResponse, UnmarshallerContext _ctx) {
		
		requestDecisionResponse.setRequestId(_ctx.stringValue("RequestDecisionResponse.RequestId"));
		requestDecisionResponse.setCode(_ctx.longValue("RequestDecisionResponse.Code"));
		requestDecisionResponse.setMessage(_ctx.stringValue("RequestDecisionResponse.Message"));
		requestDecisionResponse.setData(_ctx.mapValue("RequestDecisionResponse.Data"));
	 
	 	return requestDecisionResponse;
	}
}