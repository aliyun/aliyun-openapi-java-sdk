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

package com.aliyuncs.linkface.transform.v20180720;

import com.aliyuncs.linkface.model.v20180720.SyncFacePicturesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncFacePicturesResponseUnmarshaller {

	public static SyncFacePicturesResponse unmarshall(SyncFacePicturesResponse syncFacePicturesResponse, UnmarshallerContext context) {
		
		syncFacePicturesResponse.setRequestId(context.stringValue("SyncFacePicturesResponse.RequestId"));
		syncFacePicturesResponse.setCode(context.integerValue("SyncFacePicturesResponse.Code"));
		syncFacePicturesResponse.setMessage(context.stringValue("SyncFacePicturesResponse.Message"));
		syncFacePicturesResponse.setSuccess(context.booleanValue("SyncFacePicturesResponse.Success"));
	 
	 	return syncFacePicturesResponse;
	}
}