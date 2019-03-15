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

package com.aliyuncs.ubsms.transform.v20150623;

import com.aliyuncs.ubsms.model.v20150623.SetUserBusinessStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetUserBusinessStatusResponseUnmarshaller {

	public static SetUserBusinessStatusResponse unmarshall(SetUserBusinessStatusResponse setUserBusinessStatusResponse, UnmarshallerContext context) {
		
		setUserBusinessStatusResponse.setRequestId(context.stringValue("SetUserBusinessStatusResponse.RequestId"));
		setUserBusinessStatusResponse.setSuccess(context.booleanValue("SetUserBusinessStatusResponse.Success"));
	 
	 	return setUserBusinessStatusResponse;
	}
}