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

package com.aliyuncs.cloudwf.transform.v20170328;

import com.aliyuncs.cloudwf.model.v20170328.ReleaseInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReleaseInstanceResponseUnmarshaller {

	public static ReleaseInstanceResponse unmarshall(ReleaseInstanceResponse releaseInstanceResponse, UnmarshallerContext context) {
		
		releaseInstanceResponse.setRequestId(context.stringValue("ReleaseInstanceResponse.RequestId"));
		releaseInstanceResponse.setSuccess(context.booleanValue("ReleaseInstanceResponse.success"));
		releaseInstanceResponse.setMessage(context.stringValue("ReleaseInstanceResponse.message"));
		releaseInstanceResponse.setResult(context.stringValue("ReleaseInstanceResponse.result"));
	 
	 	return releaseInstanceResponse;
	}
}