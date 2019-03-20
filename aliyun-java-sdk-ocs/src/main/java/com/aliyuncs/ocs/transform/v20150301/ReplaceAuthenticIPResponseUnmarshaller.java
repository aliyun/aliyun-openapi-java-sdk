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

package com.aliyuncs.ocs.transform.v20150301;

import com.aliyuncs.ocs.model.v20150301.ReplaceAuthenticIPResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReplaceAuthenticIPResponseUnmarshaller {

	public static ReplaceAuthenticIPResponse unmarshall(ReplaceAuthenticIPResponse replaceAuthenticIPResponse, UnmarshallerContext context) {
		
		replaceAuthenticIPResponse.setRequestId(context.stringValue("ReplaceAuthenticIPResponse.RequestId"));
	 
	 	return replaceAuthenticIPResponse;
	}
}