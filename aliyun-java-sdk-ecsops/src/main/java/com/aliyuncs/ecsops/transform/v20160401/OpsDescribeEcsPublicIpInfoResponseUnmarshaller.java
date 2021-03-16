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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeEcsPublicIpInfoResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeEcsPublicIpInfoResponse.EcsNatPublicIpModel;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeEcsPublicIpInfoResponse.VpcNatPublicIpModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeEcsPublicIpInfoResponseUnmarshaller {

	public static OpsDescribeEcsPublicIpInfoResponse unmarshall(OpsDescribeEcsPublicIpInfoResponse opsDescribeEcsPublicIpInfoResponse, UnmarshallerContext _ctx) {
		
		opsDescribeEcsPublicIpInfoResponse.setRequestId(_ctx.stringValue("OpsDescribeEcsPublicIpInfoResponse.RequestId"));
		opsDescribeEcsPublicIpInfoResponse.setCode(_ctx.stringValue("OpsDescribeEcsPublicIpInfoResponse.Code"));
		opsDescribeEcsPublicIpInfoResponse.setMessage(_ctx.stringValue("OpsDescribeEcsPublicIpInfoResponse.Message"));

		EcsNatPublicIpModel ecsNatPublicIpModel = new EcsNatPublicIpModel();
		ecsNatPublicIpModel.setEcsInstanceInternetIp(_ctx.stringValue("OpsDescribeEcsPublicIpInfoResponse.EcsNatPublicIpModel.EcsInstanceInternetIp"));
		ecsNatPublicIpModel.setEcsInstanceIpForms(_ctx.stringValue("OpsDescribeEcsPublicIpInfoResponse.EcsNatPublicIpModel.EcsInstanceIpForms"));
		ecsNatPublicIpModel.setEcsInstanceInternetTx(_ctx.integerValue("OpsDescribeEcsPublicIpInfoResponse.EcsNatPublicIpModel.EcsInstanceInternetTx"));
		ecsNatPublicIpModel.setEcsInstanceInternetRx(_ctx.integerValue("OpsDescribeEcsPublicIpInfoResponse.EcsNatPublicIpModel.EcsInstanceInternetRx"));
		ecsNatPublicIpModel.setEniInstancePrimaryIp(_ctx.stringValue("OpsDescribeEcsPublicIpInfoResponse.EcsNatPublicIpModel.EniInstancePrimaryIp"));
		ecsNatPublicIpModel.setIsp(_ctx.stringValue("OpsDescribeEcsPublicIpInfoResponse.EcsNatPublicIpModel.Isp"));
		opsDescribeEcsPublicIpInfoResponse.setEcsNatPublicIpModel(ecsNatPublicIpModel);

		VpcNatPublicIpModel vpcNatPublicIpModel = new VpcNatPublicIpModel();
		vpcNatPublicIpModel.setIp(_ctx.stringValue("OpsDescribeEcsPublicIpInfoResponse.VpcNatPublicIpModel.Ip"));
		vpcNatPublicIpModel.setEcsInstanceId(_ctx.stringValue("OpsDescribeEcsPublicIpInfoResponse.VpcNatPublicIpModel.EcsInstanceId"));
		vpcNatPublicIpModel.setStatus(_ctx.stringValue("OpsDescribeEcsPublicIpInfoResponse.VpcNatPublicIpModel.Status"));
		vpcNatPublicIpModel.setIsp(_ctx.stringValue("OpsDescribeEcsPublicIpInfoResponse.VpcNatPublicIpModel.Isp"));
		vpcNatPublicIpModel.setPublicTxBps(_ctx.integerValue("OpsDescribeEcsPublicIpInfoResponse.VpcNatPublicIpModel.PublicTxBps"));
		vpcNatPublicIpModel.setPublicRxBps(_ctx.integerValue("OpsDescribeEcsPublicIpInfoResponse.VpcNatPublicIpModel.PublicRxBps"));
		opsDescribeEcsPublicIpInfoResponse.setVpcNatPublicIpModel(vpcNatPublicIpModel);
	 
	 	return opsDescribeEcsPublicIpInfoResponse;
	}
}