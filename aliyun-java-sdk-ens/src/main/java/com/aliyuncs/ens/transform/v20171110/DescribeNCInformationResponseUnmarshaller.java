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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeNCInformationResponse;
import com.aliyuncs.ens.model.v20171110.DescribeNCInformationResponse.DataItem;
import com.aliyuncs.ens.model.v20171110.DescribeNCInformationResponse.DataItem.Cpu;
import com.aliyuncs.ens.model.v20171110.DescribeNCInformationResponse.DataItem.Gpu;
import com.aliyuncs.ens.model.v20171110.DescribeNCInformationResponse.DataItem.Hdd;
import com.aliyuncs.ens.model.v20171110.DescribeNCInformationResponse.DataItem.Info;
import com.aliyuncs.ens.model.v20171110.DescribeNCInformationResponse.DataItem.Memory;
import com.aliyuncs.ens.model.v20171110.DescribeNCInformationResponse.DataItem.Nvme;
import com.aliyuncs.ens.model.v20171110.DescribeNCInformationResponse.DataItem.Ssd;
import com.aliyuncs.ens.model.v20171110.DescribeNCInformationResponse.Pager;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNCInformationResponseUnmarshaller {

	public static DescribeNCInformationResponse unmarshall(DescribeNCInformationResponse describeNCInformationResponse, UnmarshallerContext _ctx) {
		
		describeNCInformationResponse.setRequestId(_ctx.stringValue("DescribeNCInformationResponse.RequestId"));
		describeNCInformationResponse.setCurrentPage(_ctx.integerValue("DescribeNCInformationResponse.CurrentPage"));
		describeNCInformationResponse.setTotalCount(_ctx.integerValue("DescribeNCInformationResponse.TotalCount"));
		describeNCInformationResponse.setMsg(_ctx.stringValue("DescribeNCInformationResponse.Msg"));
		describeNCInformationResponse.setDesc(_ctx.stringValue("DescribeNCInformationResponse.Desc"));

		Pager pager = new Pager();
		pager.setPage(_ctx.longValue("DescribeNCInformationResponse.Pager.Page"));
		pager.setSize(_ctx.longValue("DescribeNCInformationResponse.Pager.Size"));
		pager.setTotal(_ctx.longValue("DescribeNCInformationResponse.Pager.Total"));
		describeNCInformationResponse.setPager(pager);

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNCInformationResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setOnline(_ctx.booleanValue("DescribeNCInformationResponse.Data["+ i +"].Online"));
			dataItem.setRegion(_ctx.stringValue("DescribeNCInformationResponse.Data["+ i +"].Region"));
			dataItem.setVirtual(_ctx.stringValue("DescribeNCInformationResponse.Data["+ i +"].Virtual"));

			Cpu cpu = new Cpu();
			cpu.setDisplay(_ctx.booleanValue("DescribeNCInformationResponse.Data["+ i +"].Cpu.Display"));
			cpu.setOversellRatio(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Cpu.OversellRatio"));
			cpu.setRemain(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Cpu.Remain"));
			cpu.setReserved(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Cpu.Reserved"));
			cpu.setReserveDisable(_ctx.booleanValue("DescribeNCInformationResponse.Data["+ i +"].Cpu.ReserveDisable"));
			cpu.setReserveDisableTotal(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Cpu.ReserveDisableTotal"));
			cpu.setStatusDisable(_ctx.booleanValue("DescribeNCInformationResponse.Data["+ i +"].Cpu.StatusDisable"));
			cpu.setStatusDisableTotal(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Cpu.StatusDisableTotal"));
			cpu.setTotal(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Cpu.Total"));
			cpu.setType(_ctx.stringValue("DescribeNCInformationResponse.Data["+ i +"].Cpu.Type"));
			cpu.setUsed(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Cpu.Used"));
			cpu.setUsedRatio(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Cpu.UsedRatio"));
			dataItem.setCpu(cpu);

			Memory memory = new Memory();
			memory.setDisplay(_ctx.booleanValue("DescribeNCInformationResponse.Data["+ i +"].Memory.Display"));
			memory.setOversellRatio(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Memory.OversellRatio"));
			memory.setRemain(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Memory.Remain"));
			memory.setReserved(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Memory.Reserved"));
			memory.setReserveDisable(_ctx.booleanValue("DescribeNCInformationResponse.Data["+ i +"].Memory.ReserveDisable"));
			memory.setReserveDisableTotal(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Memory.ReserveDisableTotal"));
			memory.setStatusDisable(_ctx.booleanValue("DescribeNCInformationResponse.Data["+ i +"].Memory.StatusDisable"));
			memory.setStatusDisableTotal(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Memory.StatusDisableTotal"));
			memory.setTotal(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Memory.Total"));
			memory.setType(_ctx.stringValue("DescribeNCInformationResponse.Data["+ i +"].Memory.Type"));
			memory.setUsed(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Memory.Used"));
			memory.setUsedRatio(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Memory.UsedRatio"));
			dataItem.setMemory(memory);

			Gpu gpu = new Gpu();
			gpu.setDisplay(_ctx.booleanValue("DescribeNCInformationResponse.Data["+ i +"].Gpu.Display"));
			gpu.setOversellRatio(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Gpu.OversellRatio"));
			gpu.setRemain(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Gpu.Remain"));
			gpu.setReserved(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Gpu.Reserved"));
			gpu.setReserveDisable(_ctx.booleanValue("DescribeNCInformationResponse.Data["+ i +"].Gpu.ReserveDisable"));
			gpu.setReserveDisableTotal(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Gpu.ReserveDisableTotal"));
			gpu.setStatusDisable(_ctx.booleanValue("DescribeNCInformationResponse.Data["+ i +"].Gpu.StatusDisable"));
			gpu.setStatusDisableTotal(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Gpu.StatusDisableTotal"));
			gpu.setTotal(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Gpu.Total"));
			gpu.setType(_ctx.stringValue("DescribeNCInformationResponse.Data["+ i +"].Gpu.Type"));
			gpu.setUsed(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Gpu.Used"));
			gpu.setUsedRatio(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Gpu.UsedRatio"));
			dataItem.setGpu(gpu);

			Hdd hdd = new Hdd();
			hdd.setDisplay(_ctx.booleanValue("DescribeNCInformationResponse.Data["+ i +"].Hdd.Display"));
			hdd.setOversellRatio(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Hdd.OversellRatio"));
			hdd.setRemain(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Hdd.Remain"));
			hdd.setReserved(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Hdd.Reserved"));
			hdd.setReserveDisable(_ctx.booleanValue("DescribeNCInformationResponse.Data["+ i +"].Hdd.ReserveDisable"));
			hdd.setReserveDisableTotal(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Hdd.ReserveDisableTotal"));
			hdd.setStatusDisable(_ctx.booleanValue("DescribeNCInformationResponse.Data["+ i +"].Hdd.StatusDisable"));
			hdd.setStatusDisableTotal(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Hdd.StatusDisableTotal"));
			hdd.setTotal(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Hdd.Total"));
			hdd.setType(_ctx.stringValue("DescribeNCInformationResponse.Data["+ i +"].Hdd.Type"));
			hdd.setUsed(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Hdd.Used"));
			hdd.setUsedRatio(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Hdd.UsedRatio"));
			dataItem.setHdd(hdd);

			Ssd ssd = new Ssd();
			ssd.setDisplay(_ctx.booleanValue("DescribeNCInformationResponse.Data["+ i +"].Ssd.Display"));
			ssd.setOversellRatio(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Ssd.OversellRatio"));
			ssd.setRemain(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Ssd.Remain"));
			ssd.setReserved(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Ssd.Reserved"));
			ssd.setReserveDisable(_ctx.booleanValue("DescribeNCInformationResponse.Data["+ i +"].Ssd.ReserveDisable"));
			ssd.setReserveDisableTotal(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Ssd.ReserveDisableTotal"));
			ssd.setStatusDisable(_ctx.booleanValue("DescribeNCInformationResponse.Data["+ i +"].Ssd.StatusDisable"));
			ssd.setStatusDisableTotal(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Ssd.StatusDisableTotal"));
			ssd.setTotal(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Ssd.Total"));
			ssd.setType(_ctx.stringValue("DescribeNCInformationResponse.Data["+ i +"].Ssd.Type"));
			ssd.setUsed(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Ssd.Used"));
			ssd.setUsedRatio(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Ssd.UsedRatio"));
			dataItem.setSsd(ssd);

			Nvme nvme = new Nvme();
			nvme.setDisplay(_ctx.booleanValue("DescribeNCInformationResponse.Data["+ i +"].Nvme.Display"));
			nvme.setOversellRatio(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Nvme.OversellRatio"));
			nvme.setRemain(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Nvme.Remain"));
			nvme.setReserved(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Nvme.Reserved"));
			nvme.setReserveDisable(_ctx.booleanValue("DescribeNCInformationResponse.Data["+ i +"].Nvme.ReserveDisable"));
			nvme.setReserveDisableTotal(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Nvme.ReserveDisableTotal"));
			nvme.setStatusDisable(_ctx.booleanValue("DescribeNCInformationResponse.Data["+ i +"].Nvme.StatusDisable"));
			nvme.setStatusDisableTotal(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Nvme.StatusDisableTotal"));
			nvme.setTotal(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Nvme.Total"));
			nvme.setType(_ctx.stringValue("DescribeNCInformationResponse.Data["+ i +"].Nvme.Type"));
			nvme.setUsed(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Nvme.Used"));
			nvme.setUsedRatio(_ctx.longValue("DescribeNCInformationResponse.Data["+ i +"].Nvme.UsedRatio"));
			dataItem.setNvme(nvme);

			Info info = new Info();
			info.setIp(_ctx.stringValue("DescribeNCInformationResponse.Data["+ i +"].Info.Ip"));
			info.setName(_ctx.stringValue("DescribeNCInformationResponse.Data["+ i +"].Info.Name"));
			info.setUuid(_ctx.stringValue("DescribeNCInformationResponse.Data["+ i +"].Info.Uuid"));

			List<String> tag = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNCInformationResponse.Data["+ i +"].Info.Tag.Length"); j++) {
				tag.add(_ctx.stringValue("DescribeNCInformationResponse.Data["+ i +"].Info.Tag["+ j +"]"));
			}
			info.setTag(tag);
			dataItem.setInfo(info);

			data.add(dataItem);
		}
		describeNCInformationResponse.setData(data);
	 
	 	return describeNCInformationResponse;
	}
}