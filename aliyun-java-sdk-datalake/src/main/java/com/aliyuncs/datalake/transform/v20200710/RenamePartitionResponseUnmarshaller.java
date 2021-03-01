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

import com.aliyuncs.datalake.model.v20200710.RenamePartitionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RenamePartitionResponseUnmarshaller {

	public static RenamePartitionResponse unmarshall(RenamePartitionResponse renamePartitionResponse, UnmarshallerContext _ctx) {
		
		renamePartitionResponse.setRequestId(_ctx.stringValue("RenamePartitionResponse.RequestId"));
		renamePartitionResponse.setMessage(_ctx.stringValue("RenamePartitionResponse.Message"));
		renamePartitionResponse.setCode(_ctx.stringValue("RenamePartitionResponse.Code"));
		renamePartitionResponse.setSuccess(_ctx.booleanValue("RenamePartitionResponse.Success"));
	 
	 	return renamePartitionResponse;
	}
}