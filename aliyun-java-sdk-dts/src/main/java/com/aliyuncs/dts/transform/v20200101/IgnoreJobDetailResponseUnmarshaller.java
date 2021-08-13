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

package com.aliyuncs.dts.transform.v20200101;

import com.aliyuncs.dts.model.v20200101.IgnoreJobDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class IgnoreJobDetailResponseUnmarshaller {

	public static IgnoreJobDetailResponse unmarshall(IgnoreJobDetailResponse ignoreJobDetailResponse, UnmarshallerContext _ctx) {
		
		ignoreJobDetailResponse.setRequestId(_ctx.stringValue("IgnoreJobDetailResponse.RequestId"));
		ignoreJobDetailResponse.setCode(_ctx.stringValue("IgnoreJobDetailResponse.Code"));
		ignoreJobDetailResponse.setHttpStatusCode(_ctx.integerValue("IgnoreJobDetailResponse.HttpStatusCode"));
		ignoreJobDetailResponse.setSuccess(_ctx.booleanValue("IgnoreJobDetailResponse.Success"));
	 
	 	return ignoreJobDetailResponse;
	}
}