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

package com.aliyuncs.imm.transform.v20170906;

import com.aliyuncs.imm.model.v20170906.PutProjectResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PutProjectResponseUnmarshaller {

	public static PutProjectResponse unmarshall(PutProjectResponse putProjectResponse, UnmarshallerContext context) {
		
		putProjectResponse.setRequestId(context.stringValue("PutProjectResponse.RequestId"));
		putProjectResponse.setProject(context.stringValue("PutProjectResponse.Project"));
		putProjectResponse.setCreateTime(context.stringValue("PutProjectResponse.CreateTime"));
		putProjectResponse.setModifyTime(context.stringValue("PutProjectResponse.ModifyTime"));
		putProjectResponse.setServiceRole(context.stringValue("PutProjectResponse.ServiceRole"));
		putProjectResponse.setCU(context.integerValue("PutProjectResponse.CU"));
		putProjectResponse.setType(context.stringValue("PutProjectResponse.Type"));
		putProjectResponse.setEndpoint(context.stringValue("PutProjectResponse.Endpoint"));
		putProjectResponse.setBillingType(context.stringValue("PutProjectResponse.BillingType"));
	 
	 	return putProjectResponse;
	}
}