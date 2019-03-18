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

package com.aliyuncs.cas.transform.v20180813;

import com.aliyuncs.cas.model.v20180813.CreateOrderAuditResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOrderAuditResponseUnmarshaller {

	public static CreateOrderAuditResponse unmarshall(CreateOrderAuditResponse createOrderAuditResponse, UnmarshallerContext context) {
		
		createOrderAuditResponse.setRequestId(context.stringValue("CreateOrderAuditResponse.RequestId"));
		createOrderAuditResponse.setType(context.stringValue("CreateOrderAuditResponse.Type"));
		createOrderAuditResponse.setCheckName(context.stringValue("CreateOrderAuditResponse.CheckName"));
		createOrderAuditResponse.setCheckValue(context.stringValue("CreateOrderAuditResponse.CheckValue"));
		createOrderAuditResponse.setModifiedTime(context.stringValue("CreateOrderAuditResponse.ModifiedTime"));
		createOrderAuditResponse.setCheckType(context.stringValue("CreateOrderAuditResponse.CheckType"));
		createOrderAuditResponse.setCheckName1(context.stringValue("CreateOrderAuditResponse.CheckName1"));
		createOrderAuditResponse.setCheckName2(context.stringValue("CreateOrderAuditResponse.CheckName2"));
	 
	 	return createOrderAuditResponse;
	}
}