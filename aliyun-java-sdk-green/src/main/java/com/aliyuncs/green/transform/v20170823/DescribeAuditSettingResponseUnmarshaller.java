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

package com.aliyuncs.green.transform.v20170823;

import com.aliyuncs.green.model.v20170823.DescribeAuditSettingResponse;
import com.aliyuncs.green.model.v20170823.DescribeAuditSettingResponse.AuditRange;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAuditSettingResponseUnmarshaller {

	public static DescribeAuditSettingResponse unmarshall(DescribeAuditSettingResponse describeAuditSettingResponse, UnmarshallerContext context) {
		
		describeAuditSettingResponse.setRequestId(context.stringValue("DescribeAuditSettingResponse.RequestId"));
		describeAuditSettingResponse.setSeed(context.stringValue("DescribeAuditSettingResponse.Seed"));
		describeAuditSettingResponse.setCallback(context.stringValue("DescribeAuditSettingResponse.Callback"));

		AuditRange auditRange = new AuditRange();
		auditRange.setBlock(context.booleanValue("DescribeAuditSettingResponse.AuditRange.block"));
		auditRange.setReview(context.booleanValue("DescribeAuditSettingResponse.AuditRange.review"));
		auditRange.setPass(context.booleanValue("DescribeAuditSettingResponse.AuditRange.pass"));
		describeAuditSettingResponse.setAuditRange(auditRange);
	 
	 	return describeAuditSettingResponse;
	}
}