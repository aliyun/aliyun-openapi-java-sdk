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

package com.aliyuncs.rds.transform.v20140815;

import com.aliyuncs.rds.model.v20140815.DeleteDedicatedHostAccountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDedicatedHostAccountResponseUnmarshaller {

	public static DeleteDedicatedHostAccountResponse unmarshall(DeleteDedicatedHostAccountResponse deleteDedicatedHostAccountResponse, UnmarshallerContext _ctx) {
		
		deleteDedicatedHostAccountResponse.setRequestId(_ctx.stringValue("DeleteDedicatedHostAccountResponse.RequestId"));
	 
	 	return deleteDedicatedHostAccountResponse;
	}
}