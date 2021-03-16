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

package com.aliyuncs.ecsops.transform.v20160401;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeVPortInfoResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeVPortInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeVPortInfoResponseUnmarshaller {

	public static OpsDescribeVPortInfoResponse unmarshall(OpsDescribeVPortInfoResponse opsDescribeVPortInfoResponse, UnmarshallerContext _ctx) {
		
		opsDescribeVPortInfoResponse.setRequestId(_ctx.stringValue("OpsDescribeVPortInfoResponse.RequestId"));

		Data data = new Data();
		data.setVPortName(_ctx.stringValue("OpsDescribeVPortInfoResponse.Data.VPortName"));
		data.setInstanceId(_ctx.stringValue("OpsDescribeVPortInfoResponse.Data.InstanceId"));
		data.setEniType(_ctx.stringValue("OpsDescribeVPortInfoResponse.Data.EniType"));
		data.setVpcId(_ctx.stringValue("OpsDescribeVPortInfoResponse.Data.VpcId"));
		data.setVSwitchId(_ctx.stringValue("OpsDescribeVPortInfoResponse.Data.VSwitchId"));
		data.setEniStatus(_ctx.stringValue("OpsDescribeVPortInfoResponse.Data.EniStatus"));
		data.setEniNetworkType(_ctx.stringValue("OpsDescribeVPortInfoResponse.Data.EniNetworkType"));
		opsDescribeVPortInfoResponse.setData(data);
	 
	 	return opsDescribeVPortInfoResponse;
	}
}