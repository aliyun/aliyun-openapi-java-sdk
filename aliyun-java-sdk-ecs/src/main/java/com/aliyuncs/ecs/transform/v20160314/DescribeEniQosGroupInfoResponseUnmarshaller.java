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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeEniQosGroupInfoResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeEniQosGroupInfoResponse.QosGroupInfo;
import com.aliyuncs.ecs.model.v20160314.DescribeEniQosGroupInfoResponse.QosGroupInfo.QosGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEniQosGroupInfoResponseUnmarshaller {

	public static DescribeEniQosGroupInfoResponse unmarshall(DescribeEniQosGroupInfoResponse describeEniQosGroupInfoResponse, UnmarshallerContext _ctx) {
		
		describeEniQosGroupInfoResponse.setRequestId(_ctx.stringValue("DescribeEniQosGroupInfoResponse.RequestId"));

		QosGroupInfo qosGroupInfo = new QosGroupInfo();
		qosGroupInfo.setInstanceId(_ctx.stringValue("DescribeEniQosGroupInfoResponse.QosGroupInfo.InstanceId"));

		List<String> networkInterfaceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEniQosGroupInfoResponse.QosGroupInfo.NetworkInterfaceIds.Length"); i++) {
			networkInterfaceIds.add(_ctx.stringValue("DescribeEniQosGroupInfoResponse.QosGroupInfo.NetworkInterfaceIds["+ i +"]"));
		}
		qosGroupInfo.setNetworkInterfaceIds(networkInterfaceIds);

		QosGroup qosGroup = new QosGroup();
		qosGroup.setType(_ctx.stringValue("DescribeEniQosGroupInfoResponse.QosGroupInfo.QosGroup.Type"));
		qosGroup.setRx(_ctx.stringValue("DescribeEniQosGroupInfoResponse.QosGroupInfo.QosGroup.Rx"));
		qosGroup.setGmtModify(_ctx.stringValue("DescribeEniQosGroupInfoResponse.QosGroupInfo.QosGroup.GmtModify"));
		qosGroup.setQosGroupName(_ctx.stringValue("DescribeEniQosGroupInfoResponse.QosGroupInfo.QosGroup.QosGroupName"));
		qosGroup.setTx(_ctx.stringValue("DescribeEniQosGroupInfoResponse.QosGroupInfo.QosGroup.Tx"));
		qosGroup.setTxPps(_ctx.stringValue("DescribeEniQosGroupInfoResponse.QosGroupInfo.QosGroup.TxPps"));
		qosGroup.setGmtCreate(_ctx.stringValue("DescribeEniQosGroupInfoResponse.QosGroupInfo.QosGroup.GmtCreate"));
		qosGroup.setRxPps(_ctx.stringValue("DescribeEniQosGroupInfoResponse.QosGroupInfo.QosGroup.RxPps"));
		qosGroupInfo.setQosGroup(qosGroup);
		describeEniQosGroupInfoResponse.setQosGroupInfo(qosGroupInfo);
	 
	 	return describeEniQosGroupInfoResponse;
	}
}