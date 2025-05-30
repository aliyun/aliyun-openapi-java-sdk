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

package com.aliyuncs.brinekingdom.transform.v20190627;

import com.aliyuncs.brinekingdom.model.v20190627.DeleteConsistentDemandResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteConsistentDemandResponseUnmarshaller {

	public static DeleteConsistentDemandResponse unmarshall(DeleteConsistentDemandResponse deleteConsistentDemandResponse, UnmarshallerContext _ctx) {
		
		deleteConsistentDemandResponse.setRequestId(_ctx.stringValue("DeleteConsistentDemandResponse.RequestId"));
		deleteConsistentDemandResponse.setMessage(_ctx.stringValue("DeleteConsistentDemandResponse.Message"));
		deleteConsistentDemandResponse.setSuccess(_ctx.booleanValue("DeleteConsistentDemandResponse.Success"));
		deleteConsistentDemandResponse.setResult(_ctx.longValue("DeleteConsistentDemandResponse.Result"));
	 
	 	return deleteConsistentDemandResponse;
	}
}