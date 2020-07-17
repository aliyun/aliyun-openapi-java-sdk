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

import com.aliyuncs.idsp.model.v20200710.AddSubjectResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddSubjectResponseUnmarshaller {

	public static AddSubjectResponse unmarshall(AddSubjectResponse addSubjectResponse, UnmarshallerContext _ctx) {
		
		addSubjectResponse.setRequestId(_ctx.stringValue("AddSubjectResponse.RequestId"));
		addSubjectResponse.setSuccess(_ctx.booleanValue("AddSubjectResponse.Success"));
		addSubjectResponse.setCode(_ctx.stringValue("AddSubjectResponse.Code"));
		addSubjectResponse.setMessage(_ctx.stringValue("AddSubjectResponse.Message"));
		addSubjectResponse.setData(_ctx.longValue("AddSubjectResponse.Data"));
	 
	 	return addSubjectResponse;
	}
}