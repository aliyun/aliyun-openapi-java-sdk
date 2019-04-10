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

import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupMetricResponse;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupMetricResponse.Record;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupMetricResponse.Record.CPU;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupMetricResponse.Record.Container;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupMetricResponse.Record.Container.CPU1;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupMetricResponse.Record.Container.Memory2;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupMetricResponse.Record.Memory;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupMetricResponse.Record.Network;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupMetricResponse.Record.Network._Interface;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeContainerGroupMetricResponseUnmarshaller {

	public static DescribeContainerGroupMetricResponse unmarshall(DescribeContainerGroupMetricResponse describeContainerGroupMetricResponse, UnmarshallerContext context) {
		
		describeContainerGroupMetricResponse.setRequestId(context.stringValue("DescribeContainerGroupMetricResponse.RequestId"));
		describeContainerGroupMetricResponse.setContainerGroupId(context.stringValue("DescribeContainerGroupMetricResponse.ContainerGroupId"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < context.lengthValue("DescribeContainerGroupMetricResponse.Records.Length"); i++) {
			Record record = new Record();
			record.setTimestamp(context.stringValue("DescribeContainerGroupMetricResponse.Records["+ i +"].Timestamp"));

			CPU cPU = new CPU();
			cPU.setUsageNanoCores(context.longValue("DescribeContainerGroupMetricResponse.Records["+ i +"].CPU.UsageNanoCores"));
			cPU.setUsageCoreNanoSeconds(context.longValue("DescribeContainerGroupMetricResponse.Records["+ i +"].CPU.UsageCoreNanoSeconds"));
			cPU.setLoad(context.longValue("DescribeContainerGroupMetricResponse.Records["+ i +"].CPU.Load"));
			cPU.setLimit(context.longValue("DescribeContainerGroupMetricResponse.Records["+ i +"].CPU.Limit"));
			record.setCPU(cPU);

			Memory memory = new Memory();
			memory.setAvailableBytes(context.longValue("DescribeContainerGroupMetricResponse.Records["+ i +"].Memory.AvailableBytes"));
			memory.setUsageBytes(context.longValue("DescribeContainerGroupMetricResponse.Records["+ i +"].Memory.UsageBytes"));
			record.setMemory(memory);

			Network network = new Network();

			List<_Interface> interfaces = new ArrayList<_Interface>();
			for (int j = 0; j < context.lengthValue("DescribeContainerGroupMetricResponse.Records["+ i +"].Network.Interfaces.Length"); j++) {
				_Interface _interface = new _Interface();
				_interface.setTxBytes(context.longValue("DescribeContainerGroupMetricResponse.Records["+ i +"].Network.Interfaces["+ j +"].TxBytes"));
				_interface.setRxBytes(context.longValue("DescribeContainerGroupMetricResponse.Records["+ i +"].Network.Interfaces["+ j +"].RxBytes"));
				_interface.setTxErrors(context.longValue("DescribeContainerGroupMetricResponse.Records["+ i +"].Network.Interfaces["+ j +"].TxErrors"));
				_interface.setRxErrors(context.longValue("DescribeContainerGroupMetricResponse.Records["+ i +"].Network.Interfaces["+ j +"].RxErrors"));
				_interface.setName(context.stringValue("DescribeContainerGroupMetricResponse.Records["+ i +"].Network.Interfaces["+ j +"].Name"));

				interfaces.add(_interface);
			}
			network.setInterfaces(interfaces);
			record.setNetwork(network);

			List<Container> containers = new ArrayList<Container>();
			for (int j = 0; j < context.lengthValue("DescribeContainerGroupMetricResponse.Records["+ i +"].Containers.Length"); j++) {
				Container container = new Container();
				container.setName(context.stringValue("DescribeContainerGroupMetricResponse.Records["+ i +"].Containers["+ j +"].Name"));

				CPU1 cPU1 = new CPU1();
				cPU1.setUsageNanoCores(context.longValue("DescribeContainerGroupMetricResponse.Records["+ i +"].Containers["+ j +"].CPU.UsageNanoCores"));
				cPU1.setUsageCoreNanoSeconds(context.longValue("DescribeContainerGroupMetricResponse.Records["+ i +"].Containers["+ j +"].CPU.UsageCoreNanoSeconds"));
				cPU1.setLoad(context.longValue("DescribeContainerGroupMetricResponse.Records["+ i +"].Containers["+ j +"].CPU.Load"));
				cPU1.setLimit(context.longValue("DescribeContainerGroupMetricResponse.Records["+ i +"].Containers["+ j +"].CPU.Limit"));
				container.setCPU1(cPU1);

				Memory2 memory2 = new Memory2();
				memory2.setAvailableBytes(context.longValue("DescribeContainerGroupMetricResponse.Records["+ i +"].Containers["+ j +"].Memory.AvailableBytes"));
				memory2.setUsageBytes(context.longValue("DescribeContainerGroupMetricResponse.Records["+ i +"].Containers["+ j +"].Memory.UsageBytes"));
				container.setMemory2(memory2);

				containers.add(container);
			}
			record.setContainers(containers);

			records.add(record);
		}
		describeContainerGroupMetricResponse.setRecords(records);
	 
	 	return describeContainerGroupMetricResponse;
	}
}