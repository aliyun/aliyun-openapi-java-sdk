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

package com.aliyuncs.hdr.transform.v20170925;

import com.aliyuncs.hdr.model.v20170925.DescribeGatewayResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewayResponseUnmarshaller {

	public static DescribeGatewayResponse unmarshall(DescribeGatewayResponse describeGatewayResponse, UnmarshallerContext _ctx) {
		
		describeGatewayResponse.setRequestId(_ctx.stringValue("DescribeGatewayResponse.RequestId"));
		describeGatewayResponse.setSuccess(_ctx.booleanValue("DescribeGatewayResponse.Success"));
		describeGatewayResponse.setCode(_ctx.stringValue("DescribeGatewayResponse.Code"));
		describeGatewayResponse.setMessage(_ctx.stringValue("DescribeGatewayResponse.Message"));
		describeGatewayResponse.setGatewayId(_ctx.stringValue("DescribeGatewayResponse.GatewayId"));
		describeGatewayResponse.setSitePairId(_ctx.stringValue("DescribeGatewayResponse.SitePairId"));
		describeGatewayResponse.setSiteName(_ctx.stringValue("DescribeGatewayResponse.SiteName"));
		describeGatewayResponse.setGatewayName(_ctx.stringValue("DescribeGatewayResponse.GatewayName"));
		describeGatewayResponse.setGatewayDescription(_ctx.stringValue("DescribeGatewayResponse.GatewayDescription"));
		describeGatewayResponse.setGatewayIp(_ctx.stringValue("DescribeGatewayResponse.GatewayIp"));
		describeGatewayResponse.setGatewayClass(_ctx.stringValue("DescribeGatewayResponse.GatewayClass"));
		describeGatewayResponse.setStoreInstanceId(_ctx.stringValue("DescribeGatewayResponse.StoreInstanceId"));
		describeGatewayResponse.setMCInstanceId(_ctx.stringValue("DescribeGatewayResponse.MCInstanceId"));
		describeGatewayResponse.setBackupWorkload(_ctx.integerValue("DescribeGatewayResponse.BackupWorkload"));
		describeGatewayResponse.setRecoveryWorkload(_ctx.integerValue("DescribeGatewayResponse.RecoveryWorkload"));
		describeGatewayResponse.setTaskId(_ctx.stringValue("DescribeGatewayResponse.TaskId"));
		describeGatewayResponse.setStatus(_ctx.stringValue("DescribeGatewayResponse.Status"));
		describeGatewayResponse.setMcUsername(_ctx.stringValue("DescribeGatewayResponse.McUsername"));
		describeGatewayResponse.setMcPassword(_ctx.stringValue("DescribeGatewayResponse.McPassword"));
		describeGatewayResponse.setCreatedTime(_ctx.longValue("DescribeGatewayResponse.CreatedTime"));
	 
	 	return describeGatewayResponse;
	}
}