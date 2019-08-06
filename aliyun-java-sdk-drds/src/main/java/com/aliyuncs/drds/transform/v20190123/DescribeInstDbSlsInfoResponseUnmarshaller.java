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

package com.aliyuncs.drds.transform.v20190123;

import com.aliyuncs.drds.model.v20190123.DescribeInstDbSlsInfoResponse;
import com.aliyuncs.drds.model.v20190123.DescribeInstDbSlsInfoResponse.AuditInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstDbSlsInfoResponseUnmarshaller {

	public static DescribeInstDbSlsInfoResponse unmarshall(DescribeInstDbSlsInfoResponse describeInstDbSlsInfoResponse, UnmarshallerContext _ctx) {
		
		describeInstDbSlsInfoResponse.setRequestId(_ctx.stringValue("DescribeInstDbSlsInfoResponse.RequestId"));
		describeInstDbSlsInfoResponse.setSuccess(_ctx.booleanValue("DescribeInstDbSlsInfoResponse.Success"));

		AuditInfo auditInfo = new AuditInfo();
		auditInfo.setProject(_ctx.stringValue("DescribeInstDbSlsInfoResponse.AuditInfo.Project"));
		auditInfo.setLogStore(_ctx.stringValue("DescribeInstDbSlsInfoResponse.AuditInfo.LogStore"));
		describeInstDbSlsInfoResponse.setAuditInfo(auditInfo);
	 
	 	return describeInstDbSlsInfoResponse;
	}
}