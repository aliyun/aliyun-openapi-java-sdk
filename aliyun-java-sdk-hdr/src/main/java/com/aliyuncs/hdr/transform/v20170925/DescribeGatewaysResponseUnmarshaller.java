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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hdr.model.v20170925.DescribeGatewaysResponse;
import com.aliyuncs.hdr.model.v20170925.DescribeGatewaysResponse.Gateway;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewaysResponseUnmarshaller {

	public static DescribeGatewaysResponse unmarshall(DescribeGatewaysResponse describeGatewaysResponse, UnmarshallerContext _ctx) {
		
		describeGatewaysResponse.setRequestId(_ctx.stringValue("DescribeGatewaysResponse.RequestId"));
		describeGatewaysResponse.setSuccess(_ctx.booleanValue("DescribeGatewaysResponse.Success"));
		describeGatewaysResponse.setCode(_ctx.stringValue("DescribeGatewaysResponse.Code"));
		describeGatewaysResponse.setMessage(_ctx.stringValue("DescribeGatewaysResponse.Message"));
		describeGatewaysResponse.setTotalCount(_ctx.integerValue("DescribeGatewaysResponse.TotalCount"));
		describeGatewaysResponse.setPageNumber(_ctx.integerValue("DescribeGatewaysResponse.PageNumber"));
		describeGatewaysResponse.setPageSize(_ctx.integerValue("DescribeGatewaysResponse.PageSize"));

		List<Gateway> gateways = new ArrayList<Gateway>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGatewaysResponse.Gateways.Length"); i++) {
			Gateway gateway = new Gateway();
			gateway.setGatewayId(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].GatewayId"));
			gateway.setSitePairId(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].SitePairId"));
			gateway.setSiteName(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].SiteName"));
			gateway.setGatewayName(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].GatewayName"));
			gateway.setGatewayDescription(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].GatewayDescription"));
			gateway.setGatewayIp(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].GatewayIp"));
			gateway.setGatewayClass(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].GatewayClass"));
			gateway.setStoreInstanceId(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].StoreInstanceId"));
			gateway.setMCInstanceId(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].MCInstanceId"));
			gateway.setBackupWorkload(_ctx.integerValue("DescribeGatewaysResponse.Gateways["+ i +"].BackupWorkload"));
			gateway.setRecoveryWorkload(_ctx.integerValue("DescribeGatewaysResponse.Gateways["+ i +"].RecoveryWorkload"));
			gateway.setTaskId(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].TaskId"));
			gateway.setStatus(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].Status"));
			gateway.setMcUsername(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].McUsername"));
			gateway.setMcPassword(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].McPassword"));
			gateway.setCreatedTime(_ctx.longValue("DescribeGatewaysResponse.Gateways["+ i +"].CreatedTime"));

			gateways.add(gateway);
		}
		describeGatewaysResponse.setGateways(gateways);
	 
	 	return describeGatewaysResponse;
	}
}