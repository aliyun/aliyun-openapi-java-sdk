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

package com.aliyuncs.dnsknocker.transform.v20190910;

import com.aliyuncs.dnsknocker.model.v20190910.DeleteResourceRecordsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteResourceRecordsResponseUnmarshaller {

	public static DeleteResourceRecordsResponse unmarshall(DeleteResourceRecordsResponse deleteResourceRecordsResponse, UnmarshallerContext _ctx) {
		
		deleteResourceRecordsResponse.setRequestId(_ctx.stringValue("DeleteResourceRecordsResponse.RequestId"));
		deleteResourceRecordsResponse.setResultCode(_ctx.stringValue("DeleteResourceRecordsResponse.ResultCode"));
		deleteResourceRecordsResponse.setResultMessage(_ctx.stringValue("DeleteResourceRecordsResponse.ResultMessage"));
		deleteResourceRecordsResponse.setSuccess(_ctx.stringValue("DeleteResourceRecordsResponse.Success"));
		deleteResourceRecordsResponse.setTransactionId(_ctx.stringValue("DeleteResourceRecordsResponse.TransactionId"));
	 
	 	return deleteResourceRecordsResponse;
	}
}