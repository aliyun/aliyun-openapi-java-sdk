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

package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.ResetAppCodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResetAppCodeResponseUnmarshaller {

	public static ResetAppCodeResponse unmarshall(ResetAppCodeResponse resetAppCodeResponse, UnmarshallerContext _ctx) {
		
		resetAppCodeResponse.setRequestId(_ctx.stringValue("ResetAppCodeResponse.RequestId"));
	 
	 	return resetAppCodeResponse;
	}
}