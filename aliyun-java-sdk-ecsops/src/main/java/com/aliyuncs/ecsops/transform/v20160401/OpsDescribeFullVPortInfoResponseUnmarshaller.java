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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeFullVPortInfoResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeFullVPortInfoResponse.Data;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeFullVPortInfoResponse.Data.Eni;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeFullVPortInfoResponse.Data.Vport;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeFullVPortInfoResponseUnmarshaller {

	public static OpsDescribeFullVPortInfoResponse unmarshall(OpsDescribeFullVPortInfoResponse opsDescribeFullVPortInfoResponse, UnmarshallerContext _ctx) {
		
		opsDescribeFullVPortInfoResponse.setRequestId(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.RequestId"));

		Data data = new Data();

		Eni eni = new Eni();
		eni.setVpcId(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Eni.VpcId"));
		eni.setVPortId(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Eni.VPortId"));
		eni.setInstanceId(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Eni.InstanceId"));
		eni.setRx(_ctx.longValue("OpsDescribeFullVPortInfoResponse.Data.Eni.Rx"));
		eni.setVSwitchId(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Eni.VSwitchId"));
		eni.setTx(_ctx.longValue("OpsDescribeFullVPortInfoResponse.Data.Eni.Tx"));
		eni.setVPortName(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Eni.VPortName"));
		eni.setTxPps(_ctx.longValue("OpsDescribeFullVPortInfoResponse.Data.Eni.TxPps"));
		eni.setEniNetworkType(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Eni.EniNetworkType"));
		eni.setEniNo(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Eni.EniNo"));
		eni.setEniStatus(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Eni.EniStatus"));
		eni.setRxPps(_ctx.longValue("OpsDescribeFullVPortInfoResponse.Data.Eni.RxPps"));
		eni.setEniType(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Eni.EniType"));
		data.setEni(eni);

		Vport vport = new Vport();
		vport.setVpcId(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Vport.VpcId"));
		vport.setVPortId(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Vport.VPortId"));
		vport.setInstanceId(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Vport.InstanceId"));
		vport.setRx(_ctx.longValue("OpsDescribeFullVPortInfoResponse.Data.Vport.Rx"));
		vport.setVSwitchId(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Vport.VSwitchId"));
		vport.setTx(_ctx.longValue("OpsDescribeFullVPortInfoResponse.Data.Vport.Tx"));
		vport.setVPortName(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Vport.VPortName"));
		vport.setTxPps(_ctx.longValue("OpsDescribeFullVPortInfoResponse.Data.Vport.TxPps"));
		vport.setEniNetworkType(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Vport.EniNetworkType"));
		vport.setEniNo(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Vport.EniNo"));
		vport.setEniStatus(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Vport.EniStatus"));
		vport.setRxPps(_ctx.longValue("OpsDescribeFullVPortInfoResponse.Data.Vport.RxPps"));
		vport.setEniType(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Vport.EniType"));
		data.setVport(vport);
		opsDescribeFullVPortInfoResponse.setData(data);
	 
	 	return opsDescribeFullVPortInfoResponse;
	}
}