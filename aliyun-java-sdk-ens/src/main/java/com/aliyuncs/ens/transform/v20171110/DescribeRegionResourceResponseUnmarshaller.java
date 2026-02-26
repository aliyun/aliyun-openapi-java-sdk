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

import com.aliyuncs.ens.model.v20171110.DescribeRegionResourceResponse;
import com.aliyuncs.ens.model.v20171110.DescribeRegionResourceResponse.DataItem;
import com.aliyuncs.ens.model.v20171110.DescribeRegionResourceResponse.DataItem.ArmCard;
import com.aliyuncs.ens.model.v20171110.DescribeRegionResourceResponse.DataItem.Bandwidth;
import com.aliyuncs.ens.model.v20171110.DescribeRegionResourceResponse.DataItem.BlockStorage;
import com.aliyuncs.ens.model.v20171110.DescribeRegionResourceResponse.DataItem.Cpu;
import com.aliyuncs.ens.model.v20171110.DescribeRegionResourceResponse.DataItem.Gpu;
import com.aliyuncs.ens.model.v20171110.DescribeRegionResourceResponse.DataItem.Hdd;
import com.aliyuncs.ens.model.v20171110.DescribeRegionResourceResponse.DataItem.Ipv4sItem;
import com.aliyuncs.ens.model.v20171110.DescribeRegionResourceResponse.DataItem.Ipv6sItem;
import com.aliyuncs.ens.model.v20171110.DescribeRegionResourceResponse.DataItem.Memory;
import com.aliyuncs.ens.model.v20171110.DescribeRegionResourceResponse.DataItem.Nvme;
import com.aliyuncs.ens.model.v20171110.DescribeRegionResourceResponse.DataItem.OssStorage;
import com.aliyuncs.ens.model.v20171110.DescribeRegionResourceResponse.DataItem.Pangu;
import com.aliyuncs.ens.model.v20171110.DescribeRegionResourceResponse.DataItem.PcfarmNum;
import com.aliyuncs.ens.model.v20171110.DescribeRegionResourceResponse.DataItem.Ssd;
import com.aliyuncs.ens.model.v20171110.DescribeRegionResourceResponse.Pager;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionResourceResponseUnmarshaller {

	public static DescribeRegionResourceResponse unmarshall(DescribeRegionResourceResponse describeRegionResourceResponse, UnmarshallerContext _ctx) {
		
		describeRegionResourceResponse.setRequestId(_ctx.stringValue("DescribeRegionResourceResponse.RequestId"));
		describeRegionResourceResponse.setMsg(_ctx.stringValue("DescribeRegionResourceResponse.Msg"));
		describeRegionResourceResponse.setDesc(_ctx.stringValue("DescribeRegionResourceResponse.Desc"));

		Pager pager = new Pager();
		pager.setPage(_ctx.longValue("DescribeRegionResourceResponse.Pager.Page"));
		pager.setSize(_ctx.longValue("DescribeRegionResourceResponse.Pager.Size"));
		pager.setTotal(_ctx.longValue("DescribeRegionResourceResponse.Pager.Total"));
		describeRegionResourceResponse.setPager(pager);

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRegionResourceResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAreaCode(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].AreaCode"));
			dataItem.setAreaName(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].AreaName"));
			dataItem.setCountryCode(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].CountryCode"));
			dataItem.setCountryName(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].CountryName"));
			dataItem.setHouseId(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].HouseId"));
			dataItem.setName(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].Name"));
			dataItem.setPoc(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Poc"));
			dataItem.setProvinceCode(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].ProvinceCode"));
			dataItem.setProvinceName(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].ProvinceName"));
			dataItem.setReserveDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].ReserveDisable"));
			dataItem.setStatusDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].StatusDisable"));
			dataItem.setType(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].Type"));
			dataItem.setUuid(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].Uuid"));
			dataItem.setVirtual(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].Virtual"));

			List<String> attributes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRegionResourceResponse.Data["+ i +"].Attributes.Length"); j++) {
				attributes.add(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].Attributes["+ j +"]"));
			}
			dataItem.setAttributes(attributes);

			List<String> ispTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRegionResourceResponse.Data["+ i +"].IspTypes.Length"); j++) {
				ispTypes.add(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].IspTypes["+ j +"]"));
			}
			dataItem.setIspTypes(ispTypes);

			ArmCard armCard = new ArmCard();
			armCard.setDisplay(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].ArmCard.Display"));
			armCard.setOversellRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].ArmCard.OversellRatio"));
			armCard.setRemain(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].ArmCard.Remain"));
			armCard.setReserved(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].ArmCard.Reserved"));
			armCard.setReserveDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].ArmCard.ReserveDisable"));
			armCard.setReserveDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].ArmCard.ReserveDisableTotal"));
			armCard.setStatusDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].ArmCard.StatusDisable"));
			armCard.setStatusDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].ArmCard.StatusDisableTotal"));
			armCard.setTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].ArmCard.Total"));
			armCard.setType(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].ArmCard.Type"));
			armCard.setUsed(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].ArmCard.Used"));
			armCard.setUsedRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].ArmCard.UsedRatio"));
			dataItem.setArmCard(armCard);

			Bandwidth bandwidth = new Bandwidth();
			bandwidth.setDisplay(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Bandwidth.Display"));
			bandwidth.setOversellRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Bandwidth.OversellRatio"));
			bandwidth.setRemain(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Bandwidth.Remain"));
			bandwidth.setReserved(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Bandwidth.Reserved"));
			bandwidth.setReserveDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Bandwidth.ReserveDisable"));
			bandwidth.setReserveDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Bandwidth.ReserveDisableTotal"));
			bandwidth.setStatusDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Bandwidth.StatusDisable"));
			bandwidth.setStatusDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Bandwidth.StatusDisableTotal"));
			bandwidth.setTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Bandwidth.Total"));
			bandwidth.setType(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].Bandwidth.Type"));
			bandwidth.setUsed(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Bandwidth.Used"));
			bandwidth.setUsedRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Bandwidth.UsedRatio"));
			dataItem.setBandwidth(bandwidth);

			BlockStorage blockStorage = new BlockStorage();
			blockStorage.setDisplay(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].BlockStorage.Display"));
			blockStorage.setOversellRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].BlockStorage.OversellRatio"));
			blockStorage.setRemain(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].BlockStorage.Remain"));
			blockStorage.setReserved(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].BlockStorage.Reserved"));
			blockStorage.setReserveDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].BlockStorage.ReserveDisable"));
			blockStorage.setReserveDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].BlockStorage.ReserveDisableTotal"));
			blockStorage.setStatusDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].BlockStorage.StatusDisable"));
			blockStorage.setStatusDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].BlockStorage.StatusDisableTotal"));
			blockStorage.setTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].BlockStorage.Total"));
			blockStorage.setType(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].BlockStorage.Type"));
			blockStorage.setUsed(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].BlockStorage.Used"));
			blockStorage.setUsedRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].BlockStorage.UsedRatio"));
			dataItem.setBlockStorage(blockStorage);

			Cpu cpu = new Cpu();
			cpu.setDisplay(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Cpu.Display"));
			cpu.setOversellRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Cpu.OversellRatio"));
			cpu.setRemain(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Cpu.Remain"));
			cpu.setReserved(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Cpu.Reserved"));
			cpu.setReserveDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Cpu.ReserveDisable"));
			cpu.setReserveDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Cpu.ReserveDisableTotal"));
			cpu.setStatusDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Cpu.StatusDisable"));
			cpu.setStatusDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Cpu.StatusDisableTotal"));
			cpu.setTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Cpu.Total"));
			cpu.setType(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].Cpu.Type"));
			cpu.setUsed(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Cpu.Used"));
			cpu.setUsedRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Cpu.UsedRatio"));
			dataItem.setCpu(cpu);

			Memory memory = new Memory();
			memory.setDisplay(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Memory.Display"));
			memory.setOversellRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Memory.OversellRatio"));
			memory.setRemain(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Memory.Remain"));
			memory.setReserved(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Memory.Reserved"));
			memory.setReserveDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Memory.ReserveDisable"));
			memory.setReserveDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Memory.ReserveDisableTotal"));
			memory.setStatusDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Memory.StatusDisable"));
			memory.setStatusDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Memory.StatusDisableTotal"));
			memory.setTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Memory.Total"));
			memory.setType(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].Memory.Type"));
			memory.setUsed(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Memory.Used"));
			memory.setUsedRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Memory.UsedRatio"));
			dataItem.setMemory(memory);

			Gpu gpu = new Gpu();
			gpu.setDisplay(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Gpu.Display"));
			gpu.setOversellRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Gpu.OversellRatio"));
			gpu.setRemain(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Gpu.Remain"));
			gpu.setReserved(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Gpu.Reserved"));
			gpu.setReserveDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Gpu.ReserveDisable"));
			gpu.setReserveDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Gpu.ReserveDisableTotal"));
			gpu.setStatusDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Gpu.StatusDisable"));
			gpu.setStatusDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Gpu.StatusDisableTotal"));
			gpu.setTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Gpu.Total"));
			gpu.setType(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].Gpu.Type"));
			gpu.setUsed(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Gpu.Used"));
			gpu.setUsedRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Gpu.UsedRatio"));
			dataItem.setGpu(gpu);

			Hdd hdd = new Hdd();
			hdd.setDisplay(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Hdd.Display"));
			hdd.setOversellRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Hdd.OversellRatio"));
			hdd.setRemain(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Hdd.Remain"));
			hdd.setReserved(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Hdd.Reserved"));
			hdd.setReserveDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Hdd.ReserveDisable"));
			hdd.setReserveDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Hdd.ReserveDisableTotal"));
			hdd.setStatusDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Hdd.StatusDisable"));
			hdd.setStatusDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Hdd.StatusDisableTotal"));
			hdd.setTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Hdd.Total"));
			hdd.setType(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].Hdd.Type"));
			hdd.setUsed(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Hdd.Used"));
			hdd.setUsedRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Hdd.UsedRatio"));
			dataItem.setHdd(hdd);

			Ssd ssd = new Ssd();
			ssd.setDisplay(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Ssd.Display"));
			ssd.setOversellRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Ssd.OversellRatio"));
			ssd.setRemain(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Ssd.Remain"));
			ssd.setReserved(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Ssd.Reserved"));
			ssd.setReserveDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Ssd.ReserveDisable"));
			ssd.setReserveDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Ssd.ReserveDisableTotal"));
			ssd.setStatusDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Ssd.StatusDisable"));
			ssd.setStatusDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Ssd.StatusDisableTotal"));
			ssd.setTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Ssd.Total"));
			ssd.setType(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].Ssd.Type"));
			ssd.setUsed(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Ssd.Used"));
			ssd.setUsedRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Ssd.UsedRatio"));
			dataItem.setSsd(ssd);

			Nvme nvme = new Nvme();
			nvme.setDisplay(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Nvme.Display"));
			nvme.setOversellRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Nvme.OversellRatio"));
			nvme.setRemain(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Nvme.Remain"));
			nvme.setReserved(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Nvme.Reserved"));
			nvme.setReserveDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Nvme.ReserveDisable"));
			nvme.setReserveDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Nvme.ReserveDisableTotal"));
			nvme.setStatusDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Nvme.StatusDisable"));
			nvme.setStatusDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Nvme.StatusDisableTotal"));
			nvme.setTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Nvme.Total"));
			nvme.setType(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].Nvme.Type"));
			nvme.setUsed(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Nvme.Used"));
			nvme.setUsedRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Nvme.UsedRatio"));
			dataItem.setNvme(nvme);

			OssStorage ossStorage = new OssStorage();
			ossStorage.setDisplay(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].OssStorage.Display"));
			ossStorage.setOversellRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].OssStorage.OversellRatio"));
			ossStorage.setRemain(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].OssStorage.Remain"));
			ossStorage.setReserved(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].OssStorage.Reserved"));
			ossStorage.setReserveDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].OssStorage.ReserveDisable"));
			ossStorage.setReserveDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].OssStorage.ReserveDisableTotal"));
			ossStorage.setStatusDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].OssStorage.StatusDisable"));
			ossStorage.setStatusDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].OssStorage.StatusDisableTotal"));
			ossStorage.setTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].OssStorage.Total"));
			ossStorage.setType(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].OssStorage.Type"));
			ossStorage.setUsed(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].OssStorage.Used"));
			ossStorage.setUsedRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].OssStorage.UsedRatio"));
			dataItem.setOssStorage(ossStorage);

			Pangu pangu = new Pangu();
			pangu.setDisplay(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Pangu.Display"));
			pangu.setOversellRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Pangu.OversellRatio"));
			pangu.setRemain(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Pangu.Remain"));
			pangu.setReserved(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Pangu.Reserved"));
			pangu.setReserveDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Pangu.ReserveDisable"));
			pangu.setReserveDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Pangu.ReserveDisableTotal"));
			pangu.setStatusDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Pangu.StatusDisable"));
			pangu.setStatusDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Pangu.StatusDisableTotal"));
			pangu.setTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Pangu.Total"));
			pangu.setType(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].Pangu.Type"));
			pangu.setUsed(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Pangu.Used"));
			pangu.setUsedRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Pangu.UsedRatio"));
			dataItem.setPangu(pangu);

			PcfarmNum pcfarmNum = new PcfarmNum();
			pcfarmNum.setDisplay(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].PcfarmNum.Display"));
			pcfarmNum.setOversellRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].PcfarmNum.OversellRatio"));
			pcfarmNum.setRemain(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].PcfarmNum.Remain"));
			pcfarmNum.setReserved(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].PcfarmNum.Reserved"));
			pcfarmNum.setReserveDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].PcfarmNum.ReserveDisable"));
			pcfarmNum.setReserveDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].PcfarmNum.ReserveDisableTotal"));
			pcfarmNum.setStatusDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].PcfarmNum.StatusDisable"));
			pcfarmNum.setStatusDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].PcfarmNum.StatusDisableTotal"));
			pcfarmNum.setTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].PcfarmNum.Total"));
			pcfarmNum.setType(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].PcfarmNum.Type"));
			pcfarmNum.setUsed(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].PcfarmNum.Used"));
			pcfarmNum.setUsedRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].PcfarmNum.UsedRatio"));
			dataItem.setPcfarmNum(pcfarmNum);

			List<Ipv4sItem> ipv4s = new ArrayList<Ipv4sItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv4s.Length"); j++) {
				Ipv4sItem ipv4sItem = new Ipv4sItem();
				ipv4sItem.setDisplay(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv4s["+ j +"].Display"));
				ipv4sItem.setIsp(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv4s["+ j +"].Isp"));
				ipv4sItem.setOversellRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv4s["+ j +"].OversellRatio"));
				ipv4sItem.setRemain(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv4s["+ j +"].Remain"));
				ipv4sItem.setReserved(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv4s["+ j +"].Reserved"));
				ipv4sItem.setReserveDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv4s["+ j +"].ReserveDisable"));
				ipv4sItem.setReserveDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv4s["+ j +"].ReserveDisableTotal"));
				ipv4sItem.setStatusDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv4s["+ j +"].StatusDisable"));
				ipv4sItem.setStatusDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv4s["+ j +"].StatusDisableTotal"));
				ipv4sItem.setTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv4s["+ j +"].Total"));
				ipv4sItem.setType(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv4s["+ j +"].Type"));
				ipv4sItem.setUsed(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv4s["+ j +"].Used"));
				ipv4sItem.setUsedRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv4s["+ j +"].UsedRatio"));
				ipv4sItem.setVlan(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv4s["+ j +"].Vlan"));

				ipv4s.add(ipv4sItem);
			}
			dataItem.setIpv4s(ipv4s);

			List<Ipv6sItem> ipv6s = new ArrayList<Ipv6sItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv6s.Length"); j++) {
				Ipv6sItem ipv6sItem = new Ipv6sItem();
				ipv6sItem.setDisplay(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv6s["+ j +"].Display"));
				ipv6sItem.setIsp(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv6s["+ j +"].Isp"));
				ipv6sItem.setOversellRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv6s["+ j +"].OversellRatio"));
				ipv6sItem.setRemain(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv6s["+ j +"].Remain"));
				ipv6sItem.setReserved(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv6s["+ j +"].Reserved"));
				ipv6sItem.setReserveDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv6s["+ j +"].ReserveDisable"));
				ipv6sItem.setReserveDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv6s["+ j +"].ReserveDisableTotal"));
				ipv6sItem.setStatusDisable(_ctx.booleanValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv6s["+ j +"].StatusDisable"));
				ipv6sItem.setStatusDisableTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv6s["+ j +"].StatusDisableTotal"));
				ipv6sItem.setTotal(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv6s["+ j +"].Total"));
				ipv6sItem.setType(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv6s["+ j +"].Type"));
				ipv6sItem.setUsed(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv6s["+ j +"].Used"));
				ipv6sItem.setUsedRatio(_ctx.longValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv6s["+ j +"].UsedRatio"));
				ipv6sItem.setVlan(_ctx.stringValue("DescribeRegionResourceResponse.Data["+ i +"].Ipv6s["+ j +"].Vlan"));

				ipv6s.add(ipv6sItem);
			}
			dataItem.setIpv6s(ipv6s);

			data.add(dataItem);
		}
		describeRegionResourceResponse.setData(data);
	 
	 	return describeRegionResourceResponse;
	}
}