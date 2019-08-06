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

package com.aliyuncs.drds.transform.v20190123;

import com.aliyuncs.drds.model.v20190123.SetupTableResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetupTableResponseUnmarshaller {

	public static SetupTableResponse unmarshall(SetupTableResponse setupTableResponse, UnmarshallerContext _ctx) {
		
		setupTableResponse.setRequestId(_ctx.stringValue("SetupTableResponse.RequestId"));
		setupTableResponse.setSuccess(_ctx.booleanValue("SetupTableResponse.Success"));
		setupTableResponse.setData(_ctx.booleanValue("SetupTableResponse.Data"));
	 
	 	return setupTableResponse;
	}
}