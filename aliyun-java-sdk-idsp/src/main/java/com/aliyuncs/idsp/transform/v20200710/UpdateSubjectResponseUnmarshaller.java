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

package com.aliyuncs.idsp.transform.v20200710;

import com.aliyuncs.idsp.model.v20200710.UpdateSubjectResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateSubjectResponseUnmarshaller {

	public static UpdateSubjectResponse unmarshall(UpdateSubjectResponse updateSubjectResponse, UnmarshallerContext _ctx) {
		
		updateSubjectResponse.setRequestId(_ctx.stringValue("UpdateSubjectResponse.RequestId"));
		updateSubjectResponse.setSuccess(_ctx.booleanValue("UpdateSubjectResponse.Success"));
		updateSubjectResponse.setCode(_ctx.stringValue("UpdateSubjectResponse.Code"));
		updateSubjectResponse.setMessage(_ctx.stringValue("UpdateSubjectResponse.Message"));
		updateSubjectResponse.setData(_ctx.longValue("UpdateSubjectResponse.Data"));
	 
	 	return updateSubjectResponse;
	}
}