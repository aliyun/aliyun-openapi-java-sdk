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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.GetHoneypotProbeResponse;
import com.aliyuncs.sas.model.v20181203.GetHoneypotProbeResponse.Data;
import com.aliyuncs.sas.model.v20181203.GetHoneypotProbeResponse.Data.ControlNode;
import com.aliyuncs.sas.model.v20181203.GetHoneypotProbeResponse.Data.HoneyPotProbeScanPort;
import com.aliyuncs.sas.model.v20181203.GetHoneypotProbeResponse.Data.HoneypotProbeBindListItem;
import com.aliyuncs.sas.model.v20181203.GetHoneypotProbeResponse.Data.HoneypotProbeBindListItem.BindPortListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHoneypotProbeResponseUnmarshaller {

	public static GetHoneypotProbeResponse unmarshall(GetHoneypotProbeResponse getHoneypotProbeResponse, UnmarshallerContext _ctx) {
		
		getHoneypotProbeResponse.setRequestId(_ctx.stringValue("GetHoneypotProbeResponse.RequestId"));
		getHoneypotProbeResponse.setSuccess(_ctx.booleanValue("GetHoneypotProbeResponse.Success"));
		getHoneypotProbeResponse.setCode(_ctx.stringValue("GetHoneypotProbeResponse.Code"));
		getHoneypotProbeResponse.setMessage(_ctx.stringValue("GetHoneypotProbeResponse.Message"));
		getHoneypotProbeResponse.setHttpStatusCode(_ctx.integerValue("GetHoneypotProbeResponse.HttpStatusCode"));

		Data data = new Data();
		data.setProbeId(_ctx.stringValue("GetHoneypotProbeResponse.Data.ProbeId"));
		data.setProbeType(_ctx.stringValue("GetHoneypotProbeResponse.Data.ProbeType"));
		data.setDisplayName(_ctx.stringValue("GetHoneypotProbeResponse.Data.DisplayName"));
		data.setOsType(_ctx.stringValue("GetHoneypotProbeResponse.Data.OsType"));
		data.setProbeVersion(_ctx.stringValue("GetHoneypotProbeResponse.Data.ProbeVersion"));
		data.setHostIp(_ctx.stringValue("GetHoneypotProbeResponse.Data.HostIp"));
		data.setPing(_ctx.booleanValue("GetHoneypotProbeResponse.Data.Ping"));
		data.setArp(_ctx.booleanValue("GetHoneypotProbeResponse.Data.Arp"));
		data.setDeployTime(_ctx.longValue("GetHoneypotProbeResponse.Data.DeployTime"));
		data.setStatus(_ctx.integerValue("GetHoneypotProbeResponse.Data.Status"));
		data.setCpuLoad(_ctx.doubleValue("GetHoneypotProbeResponse.Data.CpuLoad"));
		data.setMemoryLoad(_ctx.doubleValue("GetHoneypotProbeResponse.Data.MemoryLoad"));
		data.setUuid(_ctx.stringValue("GetHoneypotProbeResponse.Data.Uuid"));
		data.setProxyIp(_ctx.stringValue("GetHoneypotProbeResponse.Data.ProxyIp"));
		data.setVpcId(_ctx.stringValue("GetHoneypotProbeResponse.Data.VpcId"));

		List<String> listenIpList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetHoneypotProbeResponse.Data.ListenIpList.Length"); i++) {
			listenIpList.add(_ctx.stringValue("GetHoneypotProbeResponse.Data.ListenIpList["+ i +"]"));
		}
		data.setListenIpList(listenIpList);

		List<String> canListenIpList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetHoneypotProbeResponse.Data.CanListenIpList.Length"); i++) {
			canListenIpList.add(_ctx.stringValue("GetHoneypotProbeResponse.Data.CanListenIpList["+ i +"]"));
		}
		data.setCanListenIpList(canListenIpList);

		List<String> cidrList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetHoneypotProbeResponse.Data.CidrList.Length"); i++) {
			cidrList.add(_ctx.stringValue("GetHoneypotProbeResponse.Data.CidrList["+ i +"]"));
		}
		data.setCidrList(cidrList);

		ControlNode controlNode = new ControlNode();
		controlNode.setNodeId(_ctx.stringValue("GetHoneypotProbeResponse.Data.ControlNode.NodeId"));
		controlNode.setNodeName(_ctx.stringValue("GetHoneypotProbeResponse.Data.ControlNode.NodeName"));
		controlNode.setEcsInstanceId(_ctx.stringValue("GetHoneypotProbeResponse.Data.ControlNode.EcsInstanceId"));
		data.setControlNode(controlNode);

		HoneyPotProbeScanPort honeyPotProbeScanPort = new HoneyPotProbeScanPort();
		honeyPotProbeScanPort.setId(_ctx.longValue("GetHoneypotProbeResponse.Data.HoneyPotProbeScanPort.Id"));
		honeyPotProbeScanPort.setProbeId(_ctx.stringValue("GetHoneypotProbeResponse.Data.HoneyPotProbeScanPort.ProbeId"));
		honeyPotProbeScanPort.setStatus(_ctx.integerValue("GetHoneypotProbeResponse.Data.HoneyPotProbeScanPort.Status"));
		honeyPotProbeScanPort.setPorts(_ctx.stringValue("GetHoneypotProbeResponse.Data.HoneyPotProbeScanPort.Ports"));

		List<String> serviceIpList1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetHoneypotProbeResponse.Data.HoneyPotProbeScanPort.ServiceIpList.Length"); i++) {
			serviceIpList1.add(_ctx.stringValue("GetHoneypotProbeResponse.Data.HoneyPotProbeScanPort.ServiceIpList["+ i +"]"));
		}
		honeyPotProbeScanPort.setServiceIpList1(serviceIpList1);
		data.setHoneyPotProbeScanPort(honeyPotProbeScanPort);

		List<HoneypotProbeBindListItem> honeypotProbeBindList = new ArrayList<HoneypotProbeBindListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetHoneypotProbeResponse.Data.HoneypotProbeBindList.Length"); i++) {
			HoneypotProbeBindListItem honeypotProbeBindListItem = new HoneypotProbeBindListItem();
			honeypotProbeBindListItem.setStatus(_ctx.integerValue("GetHoneypotProbeResponse.Data.HoneypotProbeBindList["+ i +"].Status"));
			honeypotProbeBindListItem.setHoneypotId(_ctx.stringValue("GetHoneypotProbeResponse.Data.HoneypotProbeBindList["+ i +"].HoneypotId"));
			honeypotProbeBindListItem.setBindId(_ctx.stringValue("GetHoneypotProbeResponse.Data.HoneypotProbeBindList["+ i +"].BindId"));

			List<String> serviceIpList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetHoneypotProbeResponse.Data.HoneypotProbeBindList["+ i +"].ServiceIpList.Length"); j++) {
				serviceIpList.add(_ctx.stringValue("GetHoneypotProbeResponse.Data.HoneypotProbeBindList["+ i +"].ServiceIpList["+ j +"]"));
			}
			honeypotProbeBindListItem.setServiceIpList(serviceIpList);

			List<BindPortListItem> bindPortList = new ArrayList<BindPortListItem>();
			for (int j = 0; j < _ctx.lengthValue("GetHoneypotProbeResponse.Data.HoneypotProbeBindList["+ i +"].BindPortList.Length"); j++) {
				BindPortListItem bindPortListItem = new BindPortListItem();
				bindPortListItem.setStartPort(_ctx.integerValue("GetHoneypotProbeResponse.Data.HoneypotProbeBindList["+ i +"].BindPortList["+ j +"].StartPort"));
				bindPortListItem.setEndPort(_ctx.integerValue("GetHoneypotProbeResponse.Data.HoneypotProbeBindList["+ i +"].BindPortList["+ j +"].EndPort"));
				bindPortListItem.setProto(_ctx.stringValue("GetHoneypotProbeResponse.Data.HoneypotProbeBindList["+ i +"].BindPortList["+ j +"].Proto"));
				bindPortListItem.setFixed(_ctx.booleanValue("GetHoneypotProbeResponse.Data.HoneypotProbeBindList["+ i +"].BindPortList["+ j +"].Fixed"));
				bindPortListItem.setTargetPort(_ctx.integerValue("GetHoneypotProbeResponse.Data.HoneypotProbeBindList["+ i +"].BindPortList["+ j +"].TargetPort"));
				bindPortListItem.setId(_ctx.longValue("GetHoneypotProbeResponse.Data.HoneypotProbeBindList["+ i +"].BindPortList["+ j +"].Id"));
				bindPortListItem.setBindPort(_ctx.booleanValue("GetHoneypotProbeResponse.Data.HoneypotProbeBindList["+ i +"].BindPortList["+ j +"].BindPort"));
				bindPortListItem.setErr(_ctx.stringValue("GetHoneypotProbeResponse.Data.HoneypotProbeBindList["+ i +"].BindPortList["+ j +"].Err"));
				bindPortListItem.setMsg(_ctx.stringValue("GetHoneypotProbeResponse.Data.HoneypotProbeBindList["+ i +"].BindPortList["+ j +"].Msg"));
				bindPortListItem.setStatus(_ctx.integerValue("GetHoneypotProbeResponse.Data.HoneypotProbeBindList["+ i +"].BindPortList["+ j +"].Status"));

				bindPortList.add(bindPortListItem);
			}
			honeypotProbeBindListItem.setBindPortList(bindPortList);

			honeypotProbeBindList.add(honeypotProbeBindListItem);
		}
		data.setHoneypotProbeBindList(honeypotProbeBindList);
		getHoneypotProbeResponse.setData(data);
	 
	 	return getHoneypotProbeResponse;
	}
}