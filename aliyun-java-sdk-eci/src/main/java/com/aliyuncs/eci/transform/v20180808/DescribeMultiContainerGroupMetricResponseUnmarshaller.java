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
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.MonitorData;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.MonitorData.Record;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.MonitorData.Record.Container;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.MonitorData.Record.Memory;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.MonitorData.Record.Disk;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.MonitorData.Record.Filesystem;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.MonitorData.Record.CPU;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.MonitorData.Record.Network;
import com.aliyuncs.eci.model.v20180808.DescribeMultiContainerGroupMetricResponse.MonitorData.Record.Network.Interface;

import com.aliyuncs.transform.UnmarshallerContext;


/**
 * @author xiaohui
 * @version 1.3.4
 */
public class DescribeMultiContainerGroupMetricResponseUnmarshaller {

	public static DescribeMultiContainerGroupMetricResponse unmarshall(
			DescribeMultiContainerGroupMetricResponse describeMultiContainerGroupMetricResponse, UnmarshallerContext context
	) {
		describeMultiContainerGroupMetricResponse.setRequestId(context.stringValue("DescribeMultiContainerGroupMetricResponse.RequestId"));

		List<MonitorData> monitorDatas = new ArrayList<MonitorData>();
		for (int i = 0; i < context.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas.Length"); i++) {
			MonitorData monitorData = new MonitorData();
			monitorData.setContainerGroupId(context.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].ContainerGroupId"));

			List<Record> records = new ArrayList<Record>();
			for (int j = 0; j < context.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records.Length"); j++) {
				Record record = new Record();

				CPU cpu = new CPU();
				cpu.setLimit(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].CPU.Limit"));
				cpu.setLoad(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].CPU.Load"));
				cpu.setUsageNanoCores(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].CPU.UsageNanoCores"));
				cpu.setUsageCoreNanoSeconds(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].CPU.UsageCoreNanoSeconds"));
				record.setCpu(cpu);

				Memory memory = new Memory();
				memory.setRss(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Memory.Rss"));
				memory.setCache(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Memory.Cache"));
				memory.setWorkingSet(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Memory.WorkingSet"));
				memory.setUsageBytes(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Memory.UsageBytes"));
				memory.setAvailableBytes(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Memory.AvailableBytes"));
				memory.setActualAvailableBytes(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Memory.ActualAvailableBytes"));
				record.setMemory(memory);

				Network network = new Network();
				List<Interface> interfaces = new ArrayList<Interface>();
				for (int k = 0; k < context.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Network.Interfaces.Length"); k++) {
					Interface interfaceObj = new Interface();
					interfaceObj.setName(context.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Network.Interfaces[" + k + "].Name"));
					interfaceObj.setRxBytes(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Network.Interfaces[" + k + "].RxBytes"));
					interfaceObj.setRxErrors(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Network.Interfaces[" + k + "].RxErrors"));
					interfaceObj.setRxDrops(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Network.Interfaces[" + k + "].RxDrops"));
					interfaceObj.setRxPackets(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Network.Interfaces[" + k + "].RxPackets"));
					interfaceObj.setTxBytes(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Network.Interfaces[" + k + "].TxBytes"));
					interfaceObj.setTxErrors(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Network.Interfaces[" + k + "].TxErrors"));
					interfaceObj.setTxDrops(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Network.Interfaces[" + k + "].TxDrops"));
					interfaceObj.setTxPackets(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Network.Interfaces[" + k + "].TxPackets"));

					interfaces.add(interfaceObj);
				}
				network.setInterfaces(interfaces);
				record.setNetwork(network);

				List<Container> containers = new ArrayList<Container>();
				for (int l = 0; l < context.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Containers.Length"); l++) {
					Container container = new Container();
					container.setName(context.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Containers[" + l + "].Name"));

					CPU containerCpu = new CPU();
					containerCpu.setLimit(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Containers[" + l + "].CPU.Limit"));
					containerCpu.setLoad(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Containers[" + l + "].CPU.Load"));
					containerCpu.setUsageNanoCores(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Containers[" + l + "].CPU.UsageNanoCores"));
					containerCpu.setUsageCoreNanoSeconds(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Containers[" + l + "].CPU.UsageCoreNanoSeconds"));

					Memory containerMemory = new Memory();
					containerMemory.setRss(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Containers[" + l + "].Memory.Rss"));
					containerMemory.setCache(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Containers[" + l + "].Memory.Cache"));
					containerMemory.setWorkingSet(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Containers[" + l + "].Memory.WorkingSet"));
					containerMemory.setUsageBytes(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Containers[" + l + "].Memory.UsageBytes"));
					containerMemory.setAvailableBytes(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Containers[" + l + "].Memory.AvailableBytes"));
					containerMemory.setActualAvailableBytes(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Containers[" + l + "].Memory.ActualAvailableBytes"));

					container.setCpu(containerCpu);
					container.setMemory(containerMemory);
					containers.add(container);

				}
				record.setContainers(containers);

				List<Filesystem> filesystems = new ArrayList<Filesystem>();
				for (int m = 0; m < context.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Filesystem.Length"); m++) {
					Filesystem filesystem = new Filesystem();
					filesystem.setUsage(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Filesystem[" + m + "].Usage"));
					filesystem.setFsName(context.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Filesystem[" + m + "].FsName"));
					filesystem.setCapacity(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Filesystem[" + m + "].Capacity"));
					filesystem.setAvailable(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Filesystem[" + m + "].Available"));
					filesystems.add(filesystem);
				}

				record.setFilesystems(filesystems);

				List<Disk> disks = new ArrayList<Disk>();
				for (int n = 0; n < context.lengthValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Disk.Length"); n++) {
					Disk disk = new Disk();
					disk.setDevice(context.stringValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Disk[" + n + "].Device"));
					disk.setReadBytes(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Disk[" + n + "].ReadBytes"));
					disk.setReadIo(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Disk[" + n + "].ReadIo"));
					disk.setWriteBytes(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Disk[" + n + "].WriteBytes"));
					disk.setWriteIo(context.longValue("DescribeMultiContainerGroupMetricResponse.MonitorDatas[" + i + "].Records[" + j + "].Disk[" + n + "].WriteIo"));
					disks.add(disk);
				}

				record.setDisk(disks);

				records.add(record);
			}
			monitorData.setRecords(records);

			monitorDatas.add(monitorData);
		}

		describeMultiContainerGroupMetricResponse.setMonitorDatas(monitorDatas);
		return describeMultiContainerGroupMetricResponse;
	}
}