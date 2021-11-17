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

package com.aliyuncs.mindlive_biz.transform.v20210214;

import com.aliyuncs.mindlive_biz.model.v20210214.GrabScreenShotResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GrabScreenShotResponseUnmarshaller {

	public static GrabScreenShotResponse unmarshall(GrabScreenShotResponse grabScreenShotResponse, UnmarshallerContext _ctx) {
		
		grabScreenShotResponse.setRequestId(_ctx.stringValue("GrabScreenShotResponse.RequestId"));
		grabScreenShotResponse.setErrorMessage(_ctx.stringValue("GrabScreenShotResponse.ErrorMessage"));
		grabScreenShotResponse.setSuccess(_ctx.booleanValue("GrabScreenShotResponse.Success"));
		grabScreenShotResponse.setErrorCode(_ctx.stringValue("GrabScreenShotResponse.ErrorCode"));
	 
	 	return grabScreenShotResponse;
	}
}