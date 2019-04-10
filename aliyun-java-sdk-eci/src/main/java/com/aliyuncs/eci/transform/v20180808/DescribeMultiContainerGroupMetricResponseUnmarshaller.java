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

package com.aliyuncs.eci.transform.v20180808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.PodStat;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.PodStat.CPU;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.PodStat.Container;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.PodStat.Container.CPU1;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.PodStat.Container.Memory2;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.PodStat.Memory;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.PodStat.Network;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.Record.PodStat.Network._Interface;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMultiContainerGroupMetricResponseUnmarshaller {

	public static DescribeMultiContainerGroupMetricResponse unmarshall(DescribeMultiContainerGroupMetricResponse describeMultiContainerGroupMetricResponse, UnmarshallerContext context) {
		
		describeMultiContainerGroupMetricResponse.setRequestId(context.stringValue("DescribeMultiContainerGroupMetricResponse.RequestId"));

		List<Record> monitorDatas = new ArrayList<Record>();
		for (int i = 0; i < context.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas.Length"); i++) {
			Record record = new Record();
			record.setContainerGroupId(context.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].ContainerGroupId"));

			List<PodStat> records = new ArrayList<PodStat>();
			for (int j = 0; j < context.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records.Length"); j++) {
				PodStat podStat = new PodStat();
				podStat.setTimestamp(context.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Timestamp"));

				CPU cPU = new CPU();
				cPU.setUsageNanoCores(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].CPU.UsageNanoCores"));
				cPU.setUsageCoreNanoSeconds(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].CPU.UsageCoreNanoSeconds"));
				cPU.setLoad(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].CPU.Load"));
				cPU.setLimit(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].CPU.Limit"));
				podStat.setCPU(cPU);

				Memory memory = new Memory();
				memory.setAvailableBytes(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Memory.AvailableBytes"));
				memory.setUsageBytes(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Memory.UsageBytes"));
				podStat.setMemory(memory);

				Network network = new Network();

				List<_Interface> interfaces = new ArrayList<_Interface>();
				for (int k = 0; k < context.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Network.Interfaces.Length"); k++) {
					_Interface _interface = new _Interface();
					_interface.setTxBytes(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Network.Interfaces["+ k +"].TxBytes"));
					_interface.setRxBytes(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Network.Interfaces["+ k +"].RxBytes"));
					_interface.setTxErrors(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Network.Interfaces["+ k +"].TxErrors"));
					_interface.setRxErrors(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Network.Interfaces["+ k +"].RxErrors"));
					_interface.setName(context.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Network.Interfaces["+ k +"].Name"));

					interfaces.add(_interface);
				}
				network.setInterfaces(interfaces);
				podStat.setNetwork(network);

				List<Container> containers = new ArrayList<Container>();
				for (int k = 0; k < context.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Containers.Length"); k++) {
					Container container = new Container();
					container.setName(context.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Containers["+ k +"].Name"));

					CPU1 cPU1 = new CPU1();
					cPU1.setUsageNanoCores(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Containers["+ k +"].CPU.UsageNanoCores"));
					cPU1.setUsageCoreNanoSeconds(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Containers["+ k +"].CPU.UsageCoreNanoSeconds"));
					cPU1.setLoad(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Containers["+ k +"].CPU.Load"));
					cPU1.setLimit(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Containers["+ k +"].CPU.Limit"));
					container.setCPU1(cPU1);

					Memory2 memory2 = new Memory2();
					memory2.setAvailableBytes(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Containers["+ k +"].Memory.AvailableBytes"));
					memory2.setUsageBytes(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas["+ i +"].Records["+ j +"].Containers["+ k +"].Memory.UsageBytes"));
					container.setMemory2(memory2);

					containers.add(container);
				}
				podStat.setContainers(containers);

				records.add(podStat);
			}
			record.setRecords(records);

			monitorDatas.add(record);
		}
		describeMultiContainerGroupMetricResponse.setMonitorDatas(monitorDatas);
	 
	 	return describeMultiContainerGroupMetricResponse;
	}
}