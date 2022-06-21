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

package com.aliyuncs.swas.transform.v20170810;

import com.aliyuncs.swas.model.v20170810.RollbackSnapshotResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RollbackSnapshotResponseUnmarshaller {

	public static RollbackSnapshotResponse unmarshall(RollbackSnapshotResponse rollbackSnapshotResponse, UnmarshallerContext _ctx) {
		
		rollbackSnapshotResponse.setRequestId(_ctx.stringValue("RollbackSnapshotResponse.RequestId"));
		rollbackSnapshotResponse.setCode(_ctx.stringValue("RollbackSnapshotResponse.Code"));
		rollbackSnapshotResponse.setSuccess(_ctx.booleanValue("RollbackSnapshotResponse.Success"));
		rollbackSnapshotResponse.setResult(_ctx.booleanValue("RollbackSnapshotResponse.Result"));
	 
	 	return rollbackSnapshotResponse;
	}
}