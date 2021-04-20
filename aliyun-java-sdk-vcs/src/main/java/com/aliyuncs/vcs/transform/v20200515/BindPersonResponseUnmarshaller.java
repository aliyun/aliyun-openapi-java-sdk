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

package com.aliyuncs.vcs.transform.v20200515;

import com.aliyuncs.vcs.model.v20200515.BindPersonResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BindPersonResponseUnmarshaller {

	public static BindPersonResponse unmarshall(BindPersonResponse bindPersonResponse, UnmarshallerContext _ctx) {
		
		bindPersonResponse.setRequestId(_ctx.stringValue("BindPersonResponse.RequestId"));
		bindPersonResponse.setMessage(_ctx.stringValue("BindPersonResponse.Message"));
		bindPersonResponse.setData(_ctx.booleanValue("BindPersonResponse.Data"));
		bindPersonResponse.setCode(_ctx.stringValue("BindPersonResponse.Code"));
	 
	 	return bindPersonResponse;
	}
}