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

package com.aliyuncs.teambition_aliyun.transform.v20200226;

import com.aliyuncs.teambition_aliyun.model.v20200226.ApplySmallMicroResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ApplySmallMicroResponseUnmarshaller {

	public static ApplySmallMicroResponse unmarshall(ApplySmallMicroResponse applySmallMicroResponse, UnmarshallerContext _ctx) {
		
		applySmallMicroResponse.setRequestId(_ctx.stringValue("ApplySmallMicroResponse.RequestId"));
		applySmallMicroResponse.setCode(_ctx.integerValue("ApplySmallMicroResponse.code"));
		applySmallMicroResponse.setResult(_ctx.mapValue("ApplySmallMicroResponse.result"));
		applySmallMicroResponse.setMessage(_ctx.booleanValue("ApplySmallMicroResponse.message"));
		applySmallMicroResponse.setRaw(_ctx.booleanValue("ApplySmallMicroResponse.raw"));
	 
	 	return applySmallMicroResponse;
	}
}