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

import com.aliyuncs.swas.model.v20170810.DeleteDomainDnsRecordResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDomainDnsRecordResponseUnmarshaller {

	public static DeleteDomainDnsRecordResponse unmarshall(DeleteDomainDnsRecordResponse deleteDomainDnsRecordResponse, UnmarshallerContext _ctx) {
		
		deleteDomainDnsRecordResponse.setRequestId(_ctx.stringValue("DeleteDomainDnsRecordResponse.RequestId"));
		deleteDomainDnsRecordResponse.setIsSuccess(_ctx.booleanValue("DeleteDomainDnsRecordResponse.IsSuccess"));
		deleteDomainDnsRecordResponse.setData(_ctx.booleanValue("DeleteDomainDnsRecordResponse.Data"));
		deleteDomainDnsRecordResponse.setCode(_ctx.stringValue("DeleteDomainDnsRecordResponse.Code"));
	 
	 	return deleteDomainDnsRecordResponse;
	}
}