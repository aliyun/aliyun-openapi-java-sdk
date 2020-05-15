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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.CreateSnapshotResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSnapshotResponseUnmarshaller {

	public static CreateSnapshotResponse unmarshall(CreateSnapshotResponse createSnapshotResponse, UnmarshallerContext _ctx) {
		
		createSnapshotResponse.setRequestId(_ctx.stringValue("CreateSnapshotResponse.RequestId"));
		createSnapshotResponse.setSuccess(_ctx.booleanValue("CreateSnapshotResponse.Success"));
		createSnapshotResponse.setCode(_ctx.stringValue("CreateSnapshotResponse.Code"));
		createSnapshotResponse.setMessage(_ctx.stringValue("CreateSnapshotResponse.Message"));
		createSnapshotResponse.setSnapshotId(_ctx.stringValue("CreateSnapshotResponse.SnapshotId"));
	 
	 	return createSnapshotResponse;
	}
}