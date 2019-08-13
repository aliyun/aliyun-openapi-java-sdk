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

package com.aliyuncs.emr.transform.v20160408;

import com.aliyuncs.emr.model.v20160408.SaveBatchUserAccountInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveBatchUserAccountInfoResponseUnmarshaller {

	public static SaveBatchUserAccountInfoResponse unmarshall(SaveBatchUserAccountInfoResponse saveBatchUserAccountInfoResponse, UnmarshallerContext _ctx) {
		
		saveBatchUserAccountInfoResponse.setRequestId(_ctx.stringValue("SaveBatchUserAccountInfoResponse.RequestId"));
		saveBatchUserAccountInfoResponse.setPaging(_ctx.booleanValue("SaveBatchUserAccountInfoResponse.Paging"));
		saveBatchUserAccountInfoResponse.setData(_ctx.booleanValue("SaveBatchUserAccountInfoResponse.Data"));
	 
	 	return saveBatchUserAccountInfoResponse;
	}
}