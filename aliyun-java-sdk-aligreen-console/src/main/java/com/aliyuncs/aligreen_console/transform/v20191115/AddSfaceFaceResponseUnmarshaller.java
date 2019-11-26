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

package com.aliyuncs.aligreen_console.transform.v20191115;

import com.aliyuncs.aligreen_console.model.v20191115.AddSfaceFaceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddSfaceFaceResponseUnmarshaller {

	public static AddSfaceFaceResponse unmarshall(AddSfaceFaceResponse addSfaceFaceResponse, UnmarshallerContext _ctx) {
		
		addSfaceFaceResponse.setRequestId(_ctx.stringValue("AddSfaceFaceResponse.RequestId"));
		addSfaceFaceResponse.setDataId(_ctx.stringValue("AddSfaceFaceResponse.DataId"));
	 
	 	return addSfaceFaceResponse;
	}
}