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
		eni.setEniNo(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Eni.EniNo"));
		eni.setVPortId(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Eni.VPortId"));
		eni.setVPortName(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Eni.VPortName"));
		eni.setInstanceId(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Eni.InstanceId"));
		eni.setEniType(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Eni.EniType"));
		eni.setVpcId(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Eni.VpcId"));
		eni.setVSwitchId(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Eni.VSwitchId"));
		eni.setEniStatus(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Eni.EniStatus"));
		eni.setEniNetworkType(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Eni.EniNetworkType"));
		eni.setTx(_ctx.longValue("OpsDescribeFullVPortInfoResponse.Data.Eni.Tx"));
		eni.setRx(_ctx.longValue("OpsDescribeFullVPortInfoResponse.Data.Eni.Rx"));
		eni.setTxPps(_ctx.longValue("OpsDescribeFullVPortInfoResponse.Data.Eni.TxPps"));
		eni.setRxPps(_ctx.longValue("OpsDescribeFullVPortInfoResponse.Data.Eni.RxPps"));
		data.setEni(eni);

		Vport vport = new Vport();
		vport.setEniNo(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Vport.EniNo"));
		vport.setVPortId(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Vport.VPortId"));
		vport.setVPortName(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Vport.VPortName"));
		vport.setInstanceId(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Vport.InstanceId"));
		vport.setEniType(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Vport.EniType"));
		vport.setVpcId(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Vport.VpcId"));
		vport.setVSwitchId(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Vport.VSwitchId"));
		vport.setEniStatus(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Vport.EniStatus"));
		vport.setEniNetworkType(_ctx.stringValue("OpsDescribeFullVPortInfoResponse.Data.Vport.EniNetworkType"));
		vport.setTx(_ctx.longValue("OpsDescribeFullVPortInfoResponse.Data.Vport.Tx"));
		vport.setRx(_ctx.longValue("OpsDescribeFullVPortInfoResponse.Data.Vport.Rx"));
		vport.setTxPps(_ctx.longValue("OpsDescribeFullVPortInfoResponse.Data.Vport.TxPps"));
		vport.setRxPps(_ctx.longValue("OpsDescribeFullVPortInfoResponse.Data.Vport.RxPps"));
		data.setVport(vport);
		opsDescribeFullVPortInfoResponse.setData(data);
	 
	 	return opsDescribeFullVPortInfoResponse;
	}
}