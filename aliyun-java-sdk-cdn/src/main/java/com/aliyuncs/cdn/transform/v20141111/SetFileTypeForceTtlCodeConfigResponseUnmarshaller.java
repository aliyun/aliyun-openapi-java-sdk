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

package com.aliyuncs.cdn.transform.v20141111;

import com.aliyuncs.cdn.model.v20141111.SetFileTypeForceTtlCodeConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetFileTypeForceTtlCodeConfigResponseUnmarshaller {

	public static SetFileTypeForceTtlCodeConfigResponse unmarshall(SetFileTypeForceTtlCodeConfigResponse setFileTypeForceTtlCodeConfigResponse, UnmarshallerContext context) {
		
		setFileTypeForceTtlCodeConfigResponse.setRequestId(context.stringValue("SetFileTypeForceTtlCodeConfigResponse.RequestId"));
	 
	 	return setFileTypeForceTtlCodeConfigResponse;
	}
}