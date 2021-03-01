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

package com.aliyuncs.datalake.transform.v20200710;

import com.aliyuncs.datalake.model.v20200710.RenameTableResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RenameTableResponseUnmarshaller {

	public static RenameTableResponse unmarshall(RenameTableResponse renameTableResponse, UnmarshallerContext _ctx) {
		
		renameTableResponse.setRequestId(_ctx.stringValue("RenameTableResponse.RequestId"));
		renameTableResponse.setMessage(_ctx.stringValue("RenameTableResponse.Message"));
		renameTableResponse.setCode(_ctx.stringValue("RenameTableResponse.Code"));
		renameTableResponse.setSuccess(_ctx.booleanValue("RenameTableResponse.Success"));
	 
	 	return renameTableResponse;
	}
}