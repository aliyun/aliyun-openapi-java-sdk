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

package com.aliyuncs.retailcloud.transform.v20180313;

import com.aliyuncs.retailcloud.model.v20180313.CreatePersistentVolumeClaimResponse;
import com.aliyuncs.retailcloud.model.v20180313.CreatePersistentVolumeClaimResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePersistentVolumeClaimResponseUnmarshaller {

	public static CreatePersistentVolumeClaimResponse unmarshall(CreatePersistentVolumeClaimResponse createPersistentVolumeClaimResponse, UnmarshallerContext _ctx) {
		
		createPersistentVolumeClaimResponse.setRequestId(_ctx.stringValue("CreatePersistentVolumeClaimResponse.RequestId"));
		createPersistentVolumeClaimResponse.setCode(_ctx.integerValue("CreatePersistentVolumeClaimResponse.Code"));
		createPersistentVolumeClaimResponse.setErrMsg(_ctx.stringValue("CreatePersistentVolumeClaimResponse.ErrMsg"));

		Result result = new Result();
		result.setPersistentVolumeClaimId(_ctx.longValue("CreatePersistentVolumeClaimResponse.Result.PersistentVolumeClaimId"));
		createPersistentVolumeClaimResponse.setResult(result);
	 
	 	return createPersistentVolumeClaimResponse;
	}
}