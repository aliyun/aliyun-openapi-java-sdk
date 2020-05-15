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

package com.aliyuncs.hbase.transform.v20190101;

import com.aliyuncs.hbase.model.v20190101.ModifyClusterDeletionProtectionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyClusterDeletionProtectionResponseUnmarshaller {

	public static ModifyClusterDeletionProtectionResponse unmarshall(ModifyClusterDeletionProtectionResponse modifyClusterDeletionProtectionResponse, UnmarshallerContext _ctx) {
		
		modifyClusterDeletionProtectionResponse.setRequestId(_ctx.stringValue("ModifyClusterDeletionProtectionResponse.RequestId"));
	 
	 	return modifyClusterDeletionProtectionResponse;
	}
}