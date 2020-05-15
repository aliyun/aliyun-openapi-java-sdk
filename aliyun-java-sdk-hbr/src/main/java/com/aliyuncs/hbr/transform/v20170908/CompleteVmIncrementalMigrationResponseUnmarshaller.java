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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.CompleteVmIncrementalMigrationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CompleteVmIncrementalMigrationResponseUnmarshaller {

	public static CompleteVmIncrementalMigrationResponse unmarshall(CompleteVmIncrementalMigrationResponse completeVmIncrementalMigrationResponse, UnmarshallerContext _ctx) {
		
		completeVmIncrementalMigrationResponse.setRequestId(_ctx.stringValue("CompleteVmIncrementalMigrationResponse.RequestId"));
		completeVmIncrementalMigrationResponse.setSuccess(_ctx.booleanValue("CompleteVmIncrementalMigrationResponse.Success"));
		completeVmIncrementalMigrationResponse.setCode(_ctx.stringValue("CompleteVmIncrementalMigrationResponse.Code"));
		completeVmIncrementalMigrationResponse.setMessage(_ctx.stringValue("CompleteVmIncrementalMigrationResponse.Message"));

		List<String> pendingRestoreVms = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CompleteVmIncrementalMigrationResponse.PendingRestoreVms.Length"); i++) {
			pendingRestoreVms.add(_ctx.stringValue("CompleteVmIncrementalMigrationResponse.PendingRestoreVms["+ i +"]"));
		}
		completeVmIncrementalMigrationResponse.setPendingRestoreVms(pendingRestoreVms);
	 
	 	return completeVmIncrementalMigrationResponse;
	}
}