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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeRegionResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRegionResourceResponse extends AcsResponse {

	private String msg;

	private String desc;

	private String requestId;

	private List<DataItem> data;

	private Pager pager;

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public Pager getPager() {
		return this.pager;
	}

	public void setPager(Pager pager) {
		this.pager = pager;
	}

	public static class DataItem {

		private String areaCode;

		private String areaName;

		private String countryCode;

		private String countryName;

		private String houseId;

		private String name;

		private Boolean poc;

		private String provinceCode;

		private String provinceName;

		private Boolean reserveDisable;

		private Boolean statusDisable;

		private String type;

		private String uuid;

		private String virtual;

		private List<Ipv4sItem> ipv4s;

		private List<Ipv6sItem> ipv6s;

		private List<String> attributes;

		private List<String> ispTypes;

		private ArmCard armCard;

		private Bandwidth bandwidth;

		private BlockStorage blockStorage;

		private Cpu cpu;

		private Memory memory;

		private Gpu gpu;

		private Hdd hdd;

		private Ssd ssd;

		private Nvme nvme;

		private OssStorage ossStorage;

		private Pangu pangu;

		private PcfarmNum pcfarmNum;

		public String getAreaCode() {
			return this.areaCode;
		}

		public void setAreaCode(String areaCode) {
			this.areaCode = areaCode;
		}

		public String getAreaName() {
			return this.areaName;
		}

		public void setAreaName(String areaName) {
			this.areaName = areaName;
		}

		public String getCountryCode() {
			return this.countryCode;
		}

		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}

		public String getCountryName() {
			return this.countryName;
		}

		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}

		public String getHouseId() {
			return this.houseId;
		}

		public void setHouseId(String houseId) {
			this.houseId = houseId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getPoc() {
			return this.poc;
		}

		public void setPoc(Boolean poc) {
			this.poc = poc;
		}

		public String getProvinceCode() {
			return this.provinceCode;
		}

		public void setProvinceCode(String provinceCode) {
			this.provinceCode = provinceCode;
		}

		public String getProvinceName() {
			return this.provinceName;
		}

		public void setProvinceName(String provinceName) {
			this.provinceName = provinceName;
		}

		public Boolean getReserveDisable() {
			return this.reserveDisable;
		}

		public void setReserveDisable(Boolean reserveDisable) {
			this.reserveDisable = reserveDisable;
		}

		public Boolean getStatusDisable() {
			return this.statusDisable;
		}

		public void setStatusDisable(Boolean statusDisable) {
			this.statusDisable = statusDisable;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getVirtual() {
			return this.virtual;
		}

		public void setVirtual(String virtual) {
			this.virtual = virtual;
		}

		public List<Ipv4sItem> getIpv4s() {
			return this.ipv4s;
		}

		public void setIpv4s(List<Ipv4sItem> ipv4s) {
			this.ipv4s = ipv4s;
		}

		public List<Ipv6sItem> getIpv6s() {
			return this.ipv6s;
		}

		public void setIpv6s(List<Ipv6sItem> ipv6s) {
			this.ipv6s = ipv6s;
		}

		public List<String> getAttributes() {
			return this.attributes;
		}

		public void setAttributes(List<String> attributes) {
			this.attributes = attributes;
		}

		public List<String> getIspTypes() {
			return this.ispTypes;
		}

		public void setIspTypes(List<String> ispTypes) {
			this.ispTypes = ispTypes;
		}

		public ArmCard getArmCard() {
			return this.armCard;
		}

		public void setArmCard(ArmCard armCard) {
			this.armCard = armCard;
		}

		public Bandwidth getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Bandwidth bandwidth) {
			this.bandwidth = bandwidth;
		}

		public BlockStorage getBlockStorage() {
			return this.blockStorage;
		}

		public void setBlockStorage(BlockStorage blockStorage) {
			this.blockStorage = blockStorage;
		}

		public Cpu getCpu() {
			return this.cpu;
		}

		public void setCpu(Cpu cpu) {
			this.cpu = cpu;
		}

		public Memory getMemory() {
			return this.memory;
		}

		public void setMemory(Memory memory) {
			this.memory = memory;
		}

		public Gpu getGpu() {
			return this.gpu;
		}

		public void setGpu(Gpu gpu) {
			this.gpu = gpu;
		}

		public Hdd getHdd() {
			return this.hdd;
		}

		public void setHdd(Hdd hdd) {
			this.hdd = hdd;
		}

		public Ssd getSsd() {
			return this.ssd;
		}

		public void setSsd(Ssd ssd) {
			this.ssd = ssd;
		}

		public Nvme getNvme() {
			return this.nvme;
		}

		public void setNvme(Nvme nvme) {
			this.nvme = nvme;
		}

		public OssStorage getOssStorage() {
			return this.ossStorage;
		}

		public void setOssStorage(OssStorage ossStorage) {
			this.ossStorage = ossStorage;
		}

		public Pangu getPangu() {
			return this.pangu;
		}

		public void setPangu(Pangu pangu) {
			this.pangu = pangu;
		}

		public PcfarmNum getPcfarmNum() {
			return this.pcfarmNum;
		}

		public void setPcfarmNum(PcfarmNum pcfarmNum) {
			this.pcfarmNum = pcfarmNum;
		}

		public static class Ipv4sItem {

			private String display;

			private String isp;

			private Long oversellRatio;

			private Long remain;

			private Long reserved;

			private Boolean reserveDisable;

			private Long reserveDisableTotal;

			private Boolean statusDisable;

			private Long statusDisableTotal;

			private Long total;

			private String type;

			private Long used;

			private Long usedRatio;

			private String vlan;

			public String getDisplay() {
				return this.display;
			}

			public void setDisplay(String display) {
				this.display = display;
			}

			public String getIsp() {
				return this.isp;
			}

			public void setIsp(String isp) {
				this.isp = isp;
			}

			public Long getOversellRatio() {
				return this.oversellRatio;
			}

			public void setOversellRatio(Long oversellRatio) {
				this.oversellRatio = oversellRatio;
			}

			public Long getRemain() {
				return this.remain;
			}

			public void setRemain(Long remain) {
				this.remain = remain;
			}

			public Long getReserved() {
				return this.reserved;
			}

			public void setReserved(Long reserved) {
				this.reserved = reserved;
			}

			public Boolean getReserveDisable() {
				return this.reserveDisable;
			}

			public void setReserveDisable(Boolean reserveDisable) {
				this.reserveDisable = reserveDisable;
			}

			public Long getReserveDisableTotal() {
				return this.reserveDisableTotal;
			}

			public void setReserveDisableTotal(Long reserveDisableTotal) {
				this.reserveDisableTotal = reserveDisableTotal;
			}

			public Boolean getStatusDisable() {
				return this.statusDisable;
			}

			public void setStatusDisable(Boolean statusDisable) {
				this.statusDisable = statusDisable;
			}

			public Long getStatusDisableTotal() {
				return this.statusDisableTotal;
			}

			public void setStatusDisableTotal(Long statusDisableTotal) {
				this.statusDisableTotal = statusDisableTotal;
			}

			public Long getTotal() {
				return this.total;
			}

			public void setTotal(Long total) {
				this.total = total;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Long getUsed() {
				return this.used;
			}

			public void setUsed(Long used) {
				this.used = used;
			}

			public Long getUsedRatio() {
				return this.usedRatio;
			}

			public void setUsedRatio(Long usedRatio) {
				this.usedRatio = usedRatio;
			}

			public String getVlan() {
				return this.vlan;
			}

			public void setVlan(String vlan) {
				this.vlan = vlan;
			}
		}

		public static class Ipv6sItem {

			private String display;

			private String isp;

			private Long oversellRatio;

			private Long remain;

			private Long reserved;

			private Boolean reserveDisable;

			private Long reserveDisableTotal;

			private Boolean statusDisable;

			private Long statusDisableTotal;

			private Long total;

			private String type;

			private Long used;

			private Long usedRatio;

			private String vlan;

			public String getDisplay() {
				return this.display;
			}

			public void setDisplay(String display) {
				this.display = display;
			}

			public String getIsp() {
				return this.isp;
			}

			public void setIsp(String isp) {
				this.isp = isp;
			}

			public Long getOversellRatio() {
				return this.oversellRatio;
			}

			public void setOversellRatio(Long oversellRatio) {
				this.oversellRatio = oversellRatio;
			}

			public Long getRemain() {
				return this.remain;
			}

			public void setRemain(Long remain) {
				this.remain = remain;
			}

			public Long getReserved() {
				return this.reserved;
			}

			public void setReserved(Long reserved) {
				this.reserved = reserved;
			}

			public Boolean getReserveDisable() {
				return this.reserveDisable;
			}

			public void setReserveDisable(Boolean reserveDisable) {
				this.reserveDisable = reserveDisable;
			}

			public Long getReserveDisableTotal() {
				return this.reserveDisableTotal;
			}

			public void setReserveDisableTotal(Long reserveDisableTotal) {
				this.reserveDisableTotal = reserveDisableTotal;
			}

			public Boolean getStatusDisable() {
				return this.statusDisable;
			}

			public void setStatusDisable(Boolean statusDisable) {
				this.statusDisable = statusDisable;
			}

			public Long getStatusDisableTotal() {
				return this.statusDisableTotal;
			}

			public void setStatusDisableTotal(Long statusDisableTotal) {
				this.statusDisableTotal = statusDisableTotal;
			}

			public Long getTotal() {
				return this.total;
			}

			public void setTotal(Long total) {
				this.total = total;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Long getUsed() {
				return this.used;
			}

			public void setUsed(Long used) {
				this.used = used;
			}

			public Long getUsedRatio() {
				return this.usedRatio;
			}

			public void setUsedRatio(Long usedRatio) {
				this.usedRatio = usedRatio;
			}

			public String getVlan() {
				return this.vlan;
			}

			public void setVlan(String vlan) {
				this.vlan = vlan;
			}
		}

		public static class ArmCard {

			private Boolean display;

			private Long oversellRatio;

			private Long remain;

			private Long reserved;

			private Boolean reserveDisable;

			private Long reserveDisableTotal;

			private Boolean statusDisable;

			private Long statusDisableTotal;

			private Long total;

			private String type;

			private Long used;

			private Long usedRatio;

			public Boolean getDisplay() {
				return this.display;
			}

			public void setDisplay(Boolean display) {
				this.display = display;
			}

			public Long getOversellRatio() {
				return this.oversellRatio;
			}

			public void setOversellRatio(Long oversellRatio) {
				this.oversellRatio = oversellRatio;
			}

			public Long getRemain() {
				return this.remain;
			}

			public void setRemain(Long remain) {
				this.remain = remain;
			}

			public Long getReserved() {
				return this.reserved;
			}

			public void setReserved(Long reserved) {
				this.reserved = reserved;
			}

			public Boolean getReserveDisable() {
				return this.reserveDisable;
			}

			public void setReserveDisable(Boolean reserveDisable) {
				this.reserveDisable = reserveDisable;
			}

			public Long getReserveDisableTotal() {
				return this.reserveDisableTotal;
			}

			public void setReserveDisableTotal(Long reserveDisableTotal) {
				this.reserveDisableTotal = reserveDisableTotal;
			}

			public Boolean getStatusDisable() {
				return this.statusDisable;
			}

			public void setStatusDisable(Boolean statusDisable) {
				this.statusDisable = statusDisable;
			}

			public Long getStatusDisableTotal() {
				return this.statusDisableTotal;
			}

			public void setStatusDisableTotal(Long statusDisableTotal) {
				this.statusDisableTotal = statusDisableTotal;
			}

			public Long getTotal() {
				return this.total;
			}

			public void setTotal(Long total) {
				this.total = total;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Long getUsed() {
				return this.used;
			}

			public void setUsed(Long used) {
				this.used = used;
			}

			public Long getUsedRatio() {
				return this.usedRatio;
			}

			public void setUsedRatio(Long usedRatio) {
				this.usedRatio = usedRatio;
			}
		}

		public static class Bandwidth {

			private Boolean display;

			private Long oversellRatio;

			private Long remain;

			private Long reserved;

			private Boolean reserveDisable;

			private Long reserveDisableTotal;

			private Boolean statusDisable;

			private Long statusDisableTotal;

			private Long total;

			private String type;

			private Long used;

			private Long usedRatio;

			public Boolean getDisplay() {
				return this.display;
			}

			public void setDisplay(Boolean display) {
				this.display = display;
			}

			public Long getOversellRatio() {
				return this.oversellRatio;
			}

			public void setOversellRatio(Long oversellRatio) {
				this.oversellRatio = oversellRatio;
			}

			public Long getRemain() {
				return this.remain;
			}

			public void setRemain(Long remain) {
				this.remain = remain;
			}

			public Long getReserved() {
				return this.reserved;
			}

			public void setReserved(Long reserved) {
				this.reserved = reserved;
			}

			public Boolean getReserveDisable() {
				return this.reserveDisable;
			}

			public void setReserveDisable(Boolean reserveDisable) {
				this.reserveDisable = reserveDisable;
			}

			public Long getReserveDisableTotal() {
				return this.reserveDisableTotal;
			}

			public void setReserveDisableTotal(Long reserveDisableTotal) {
				this.reserveDisableTotal = reserveDisableTotal;
			}

			public Boolean getStatusDisable() {
				return this.statusDisable;
			}

			public void setStatusDisable(Boolean statusDisable) {
				this.statusDisable = statusDisable;
			}

			public Long getStatusDisableTotal() {
				return this.statusDisableTotal;
			}

			public void setStatusDisableTotal(Long statusDisableTotal) {
				this.statusDisableTotal = statusDisableTotal;
			}

			public Long getTotal() {
				return this.total;
			}

			public void setTotal(Long total) {
				this.total = total;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Long getUsed() {
				return this.used;
			}

			public void setUsed(Long used) {
				this.used = used;
			}

			public Long getUsedRatio() {
				return this.usedRatio;
			}

			public void setUsedRatio(Long usedRatio) {
				this.usedRatio = usedRatio;
			}
		}

		public static class BlockStorage {

			private Boolean display;

			private Long oversellRatio;

			private Long remain;

			private Long reserved;

			private Boolean reserveDisable;

			private Long reserveDisableTotal;

			private Boolean statusDisable;

			private Long statusDisableTotal;

			private Long total;

			private String type;

			private Long used;

			private Long usedRatio;

			public Boolean getDisplay() {
				return this.display;
			}

			public void setDisplay(Boolean display) {
				this.display = display;
			}

			public Long getOversellRatio() {
				return this.oversellRatio;
			}

			public void setOversellRatio(Long oversellRatio) {
				this.oversellRatio = oversellRatio;
			}

			public Long getRemain() {
				return this.remain;
			}

			public void setRemain(Long remain) {
				this.remain = remain;
			}

			public Long getReserved() {
				return this.reserved;
			}

			public void setReserved(Long reserved) {
				this.reserved = reserved;
			}

			public Boolean getReserveDisable() {
				return this.reserveDisable;
			}

			public void setReserveDisable(Boolean reserveDisable) {
				this.reserveDisable = reserveDisable;
			}

			public Long getReserveDisableTotal() {
				return this.reserveDisableTotal;
			}

			public void setReserveDisableTotal(Long reserveDisableTotal) {
				this.reserveDisableTotal = reserveDisableTotal;
			}

			public Boolean getStatusDisable() {
				return this.statusDisable;
			}

			public void setStatusDisable(Boolean statusDisable) {
				this.statusDisable = statusDisable;
			}

			public Long getStatusDisableTotal() {
				return this.statusDisableTotal;
			}

			public void setStatusDisableTotal(Long statusDisableTotal) {
				this.statusDisableTotal = statusDisableTotal;
			}

			public Long getTotal() {
				return this.total;
			}

			public void setTotal(Long total) {
				this.total = total;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Long getUsed() {
				return this.used;
			}

			public void setUsed(Long used) {
				this.used = used;
			}

			public Long getUsedRatio() {
				return this.usedRatio;
			}

			public void setUsedRatio(Long usedRatio) {
				this.usedRatio = usedRatio;
			}
		}

		public static class Cpu {

			private Boolean display;

			private Long oversellRatio;

			private Long remain;

			private Long reserved;

			private Boolean reserveDisable;

			private Long reserveDisableTotal;

			private Boolean statusDisable;

			private Long statusDisableTotal;

			private Long total;

			private String type;

			private Long used;

			private Long usedRatio;

			public Boolean getDisplay() {
				return this.display;
			}

			public void setDisplay(Boolean display) {
				this.display = display;
			}

			public Long getOversellRatio() {
				return this.oversellRatio;
			}

			public void setOversellRatio(Long oversellRatio) {
				this.oversellRatio = oversellRatio;
			}

			public Long getRemain() {
				return this.remain;
			}

			public void setRemain(Long remain) {
				this.remain = remain;
			}

			public Long getReserved() {
				return this.reserved;
			}

			public void setReserved(Long reserved) {
				this.reserved = reserved;
			}

			public Boolean getReserveDisable() {
				return this.reserveDisable;
			}

			public void setReserveDisable(Boolean reserveDisable) {
				this.reserveDisable = reserveDisable;
			}

			public Long getReserveDisableTotal() {
				return this.reserveDisableTotal;
			}

			public void setReserveDisableTotal(Long reserveDisableTotal) {
				this.reserveDisableTotal = reserveDisableTotal;
			}

			public Boolean getStatusDisable() {
				return this.statusDisable;
			}

			public void setStatusDisable(Boolean statusDisable) {
				this.statusDisable = statusDisable;
			}

			public Long getStatusDisableTotal() {
				return this.statusDisableTotal;
			}

			public void setStatusDisableTotal(Long statusDisableTotal) {
				this.statusDisableTotal = statusDisableTotal;
			}

			public Long getTotal() {
				return this.total;
			}

			public void setTotal(Long total) {
				this.total = total;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Long getUsed() {
				return this.used;
			}

			public void setUsed(Long used) {
				this.used = used;
			}

			public Long getUsedRatio() {
				return this.usedRatio;
			}

			public void setUsedRatio(Long usedRatio) {
				this.usedRatio = usedRatio;
			}
		}

		public static class Memory {

			private Boolean display;

			private Long oversellRatio;

			private Long remain;

			private Long reserved;

			private Boolean reserveDisable;

			private Long reserveDisableTotal;

			private Boolean statusDisable;

			private Long statusDisableTotal;

			private Long total;

			private String type;

			private Long used;

			private Long usedRatio;

			public Boolean getDisplay() {
				return this.display;
			}

			public void setDisplay(Boolean display) {
				this.display = display;
			}

			public Long getOversellRatio() {
				return this.oversellRatio;
			}

			public void setOversellRatio(Long oversellRatio) {
				this.oversellRatio = oversellRatio;
			}

			public Long getRemain() {
				return this.remain;
			}

			public void setRemain(Long remain) {
				this.remain = remain;
			}

			public Long getReserved() {
				return this.reserved;
			}

			public void setReserved(Long reserved) {
				this.reserved = reserved;
			}

			public Boolean getReserveDisable() {
				return this.reserveDisable;
			}

			public void setReserveDisable(Boolean reserveDisable) {
				this.reserveDisable = reserveDisable;
			}

			public Long getReserveDisableTotal() {
				return this.reserveDisableTotal;
			}

			public void setReserveDisableTotal(Long reserveDisableTotal) {
				this.reserveDisableTotal = reserveDisableTotal;
			}

			public Boolean getStatusDisable() {
				return this.statusDisable;
			}

			public void setStatusDisable(Boolean statusDisable) {
				this.statusDisable = statusDisable;
			}

			public Long getStatusDisableTotal() {
				return this.statusDisableTotal;
			}

			public void setStatusDisableTotal(Long statusDisableTotal) {
				this.statusDisableTotal = statusDisableTotal;
			}

			public Long getTotal() {
				return this.total;
			}

			public void setTotal(Long total) {
				this.total = total;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Long getUsed() {
				return this.used;
			}

			public void setUsed(Long used) {
				this.used = used;
			}

			public Long getUsedRatio() {
				return this.usedRatio;
			}

			public void setUsedRatio(Long usedRatio) {
				this.usedRatio = usedRatio;
			}
		}

		public static class Gpu {

			private Boolean display;

			private Long oversellRatio;

			private Long remain;

			private Long reserved;

			private Boolean reserveDisable;

			private Long reserveDisableTotal;

			private Boolean statusDisable;

			private Long statusDisableTotal;

			private Long total;

			private String type;

			private Long used;

			private Long usedRatio;

			public Boolean getDisplay() {
				return this.display;
			}

			public void setDisplay(Boolean display) {
				this.display = display;
			}

			public Long getOversellRatio() {
				return this.oversellRatio;
			}

			public void setOversellRatio(Long oversellRatio) {
				this.oversellRatio = oversellRatio;
			}

			public Long getRemain() {
				return this.remain;
			}

			public void setRemain(Long remain) {
				this.remain = remain;
			}

			public Long getReserved() {
				return this.reserved;
			}

			public void setReserved(Long reserved) {
				this.reserved = reserved;
			}

			public Boolean getReserveDisable() {
				return this.reserveDisable;
			}

			public void setReserveDisable(Boolean reserveDisable) {
				this.reserveDisable = reserveDisable;
			}

			public Long getReserveDisableTotal() {
				return this.reserveDisableTotal;
			}

			public void setReserveDisableTotal(Long reserveDisableTotal) {
				this.reserveDisableTotal = reserveDisableTotal;
			}

			public Boolean getStatusDisable() {
				return this.statusDisable;
			}

			public void setStatusDisable(Boolean statusDisable) {
				this.statusDisable = statusDisable;
			}

			public Long getStatusDisableTotal() {
				return this.statusDisableTotal;
			}

			public void setStatusDisableTotal(Long statusDisableTotal) {
				this.statusDisableTotal = statusDisableTotal;
			}

			public Long getTotal() {
				return this.total;
			}

			public void setTotal(Long total) {
				this.total = total;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Long getUsed() {
				return this.used;
			}

			public void setUsed(Long used) {
				this.used = used;
			}

			public Long getUsedRatio() {
				return this.usedRatio;
			}

			public void setUsedRatio(Long usedRatio) {
				this.usedRatio = usedRatio;
			}
		}

		public static class Hdd {

			private Boolean display;

			private Long oversellRatio;

			private Long remain;

			private Long reserved;

			private Boolean reserveDisable;

			private Long reserveDisableTotal;

			private Boolean statusDisable;

			private Long statusDisableTotal;

			private Long total;

			private String type;

			private Long used;

			private Long usedRatio;

			public Boolean getDisplay() {
				return this.display;
			}

			public void setDisplay(Boolean display) {
				this.display = display;
			}

			public Long getOversellRatio() {
				return this.oversellRatio;
			}

			public void setOversellRatio(Long oversellRatio) {
				this.oversellRatio = oversellRatio;
			}

			public Long getRemain() {
				return this.remain;
			}

			public void setRemain(Long remain) {
				this.remain = remain;
			}

			public Long getReserved() {
				return this.reserved;
			}

			public void setReserved(Long reserved) {
				this.reserved = reserved;
			}

			public Boolean getReserveDisable() {
				return this.reserveDisable;
			}

			public void setReserveDisable(Boolean reserveDisable) {
				this.reserveDisable = reserveDisable;
			}

			public Long getReserveDisableTotal() {
				return this.reserveDisableTotal;
			}

			public void setReserveDisableTotal(Long reserveDisableTotal) {
				this.reserveDisableTotal = reserveDisableTotal;
			}

			public Boolean getStatusDisable() {
				return this.statusDisable;
			}

			public void setStatusDisable(Boolean statusDisable) {
				this.statusDisable = statusDisable;
			}

			public Long getStatusDisableTotal() {
				return this.statusDisableTotal;
			}

			public void setStatusDisableTotal(Long statusDisableTotal) {
				this.statusDisableTotal = statusDisableTotal;
			}

			public Long getTotal() {
				return this.total;
			}

			public void setTotal(Long total) {
				this.total = total;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Long getUsed() {
				return this.used;
			}

			public void setUsed(Long used) {
				this.used = used;
			}

			public Long getUsedRatio() {
				return this.usedRatio;
			}

			public void setUsedRatio(Long usedRatio) {
				this.usedRatio = usedRatio;
			}
		}

		public static class Ssd {

			private Boolean display;

			private Long oversellRatio;

			private Long remain;

			private Long reserved;

			private Boolean reserveDisable;

			private Long reserveDisableTotal;

			private Boolean statusDisable;

			private Long statusDisableTotal;

			private Long total;

			private String type;

			private Long used;

			private Long usedRatio;

			public Boolean getDisplay() {
				return this.display;
			}

			public void setDisplay(Boolean display) {
				this.display = display;
			}

			public Long getOversellRatio() {
				return this.oversellRatio;
			}

			public void setOversellRatio(Long oversellRatio) {
				this.oversellRatio = oversellRatio;
			}

			public Long getRemain() {
				return this.remain;
			}

			public void setRemain(Long remain) {
				this.remain = remain;
			}

			public Long getReserved() {
				return this.reserved;
			}

			public void setReserved(Long reserved) {
				this.reserved = reserved;
			}

			public Boolean getReserveDisable() {
				return this.reserveDisable;
			}

			public void setReserveDisable(Boolean reserveDisable) {
				this.reserveDisable = reserveDisable;
			}

			public Long getReserveDisableTotal() {
				return this.reserveDisableTotal;
			}

			public void setReserveDisableTotal(Long reserveDisableTotal) {
				this.reserveDisableTotal = reserveDisableTotal;
			}

			public Boolean getStatusDisable() {
				return this.statusDisable;
			}

			public void setStatusDisable(Boolean statusDisable) {
				this.statusDisable = statusDisable;
			}

			public Long getStatusDisableTotal() {
				return this.statusDisableTotal;
			}

			public void setStatusDisableTotal(Long statusDisableTotal) {
				this.statusDisableTotal = statusDisableTotal;
			}

			public Long getTotal() {
				return this.total;
			}

			public void setTotal(Long total) {
				this.total = total;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Long getUsed() {
				return this.used;
			}

			public void setUsed(Long used) {
				this.used = used;
			}

			public Long getUsedRatio() {
				return this.usedRatio;
			}

			public void setUsedRatio(Long usedRatio) {
				this.usedRatio = usedRatio;
			}
		}

		public static class Nvme {

			private Boolean display;

			private Long oversellRatio;

			private Long remain;

			private Long reserved;

			private Boolean reserveDisable;

			private Long reserveDisableTotal;

			private Boolean statusDisable;

			private Long statusDisableTotal;

			private Long total;

			private String type;

			private Long used;

			private Long usedRatio;

			public Boolean getDisplay() {
				return this.display;
			}

			public void setDisplay(Boolean display) {
				this.display = display;
			}

			public Long getOversellRatio() {
				return this.oversellRatio;
			}

			public void setOversellRatio(Long oversellRatio) {
				this.oversellRatio = oversellRatio;
			}

			public Long getRemain() {
				return this.remain;
			}

			public void setRemain(Long remain) {
				this.remain = remain;
			}

			public Long getReserved() {
				return this.reserved;
			}

			public void setReserved(Long reserved) {
				this.reserved = reserved;
			}

			public Boolean getReserveDisable() {
				return this.reserveDisable;
			}

			public void setReserveDisable(Boolean reserveDisable) {
				this.reserveDisable = reserveDisable;
			}

			public Long getReserveDisableTotal() {
				return this.reserveDisableTotal;
			}

			public void setReserveDisableTotal(Long reserveDisableTotal) {
				this.reserveDisableTotal = reserveDisableTotal;
			}

			public Boolean getStatusDisable() {
				return this.statusDisable;
			}

			public void setStatusDisable(Boolean statusDisable) {
				this.statusDisable = statusDisable;
			}

			public Long getStatusDisableTotal() {
				return this.statusDisableTotal;
			}

			public void setStatusDisableTotal(Long statusDisableTotal) {
				this.statusDisableTotal = statusDisableTotal;
			}

			public Long getTotal() {
				return this.total;
			}

			public void setTotal(Long total) {
				this.total = total;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Long getUsed() {
				return this.used;
			}

			public void setUsed(Long used) {
				this.used = used;
			}

			public Long getUsedRatio() {
				return this.usedRatio;
			}

			public void setUsedRatio(Long usedRatio) {
				this.usedRatio = usedRatio;
			}
		}

		public static class OssStorage {

			private Boolean display;

			private Long oversellRatio;

			private Long remain;

			private Long reserved;

			private Boolean reserveDisable;

			private Long reserveDisableTotal;

			private Boolean statusDisable;

			private Long statusDisableTotal;

			private Long total;

			private String type;

			private Long used;

			private Long usedRatio;

			public Boolean getDisplay() {
				return this.display;
			}

			public void setDisplay(Boolean display) {
				this.display = display;
			}

			public Long getOversellRatio() {
				return this.oversellRatio;
			}

			public void setOversellRatio(Long oversellRatio) {
				this.oversellRatio = oversellRatio;
			}

			public Long getRemain() {
				return this.remain;
			}

			public void setRemain(Long remain) {
				this.remain = remain;
			}

			public Long getReserved() {
				return this.reserved;
			}

			public void setReserved(Long reserved) {
				this.reserved = reserved;
			}

			public Boolean getReserveDisable() {
				return this.reserveDisable;
			}

			public void setReserveDisable(Boolean reserveDisable) {
				this.reserveDisable = reserveDisable;
			}

			public Long getReserveDisableTotal() {
				return this.reserveDisableTotal;
			}

			public void setReserveDisableTotal(Long reserveDisableTotal) {
				this.reserveDisableTotal = reserveDisableTotal;
			}

			public Boolean getStatusDisable() {
				return this.statusDisable;
			}

			public void setStatusDisable(Boolean statusDisable) {
				this.statusDisable = statusDisable;
			}

			public Long getStatusDisableTotal() {
				return this.statusDisableTotal;
			}

			public void setStatusDisableTotal(Long statusDisableTotal) {
				this.statusDisableTotal = statusDisableTotal;
			}

			public Long getTotal() {
				return this.total;
			}

			public void setTotal(Long total) {
				this.total = total;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Long getUsed() {
				return this.used;
			}

			public void setUsed(Long used) {
				this.used = used;
			}

			public Long getUsedRatio() {
				return this.usedRatio;
			}

			public void setUsedRatio(Long usedRatio) {
				this.usedRatio = usedRatio;
			}
		}

		public static class Pangu {

			private Boolean display;

			private Long oversellRatio;

			private Long remain;

			private Long reserved;

			private Boolean reserveDisable;

			private Long reserveDisableTotal;

			private Boolean statusDisable;

			private Long statusDisableTotal;

			private Long total;

			private String type;

			private Long used;

			private Long usedRatio;

			public Boolean getDisplay() {
				return this.display;
			}

			public void setDisplay(Boolean display) {
				this.display = display;
			}

			public Long getOversellRatio() {
				return this.oversellRatio;
			}

			public void setOversellRatio(Long oversellRatio) {
				this.oversellRatio = oversellRatio;
			}

			public Long getRemain() {
				return this.remain;
			}

			public void setRemain(Long remain) {
				this.remain = remain;
			}

			public Long getReserved() {
				return this.reserved;
			}

			public void setReserved(Long reserved) {
				this.reserved = reserved;
			}

			public Boolean getReserveDisable() {
				return this.reserveDisable;
			}

			public void setReserveDisable(Boolean reserveDisable) {
				this.reserveDisable = reserveDisable;
			}

			public Long getReserveDisableTotal() {
				return this.reserveDisableTotal;
			}

			public void setReserveDisableTotal(Long reserveDisableTotal) {
				this.reserveDisableTotal = reserveDisableTotal;
			}

			public Boolean getStatusDisable() {
				return this.statusDisable;
			}

			public void setStatusDisable(Boolean statusDisable) {
				this.statusDisable = statusDisable;
			}

			public Long getStatusDisableTotal() {
				return this.statusDisableTotal;
			}

			public void setStatusDisableTotal(Long statusDisableTotal) {
				this.statusDisableTotal = statusDisableTotal;
			}

			public Long getTotal() {
				return this.total;
			}

			public void setTotal(Long total) {
				this.total = total;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Long getUsed() {
				return this.used;
			}

			public void setUsed(Long used) {
				this.used = used;
			}

			public Long getUsedRatio() {
				return this.usedRatio;
			}

			public void setUsedRatio(Long usedRatio) {
				this.usedRatio = usedRatio;
			}
		}

		public static class PcfarmNum {

			private Boolean display;

			private Long oversellRatio;

			private Long remain;

			private Long reserved;

			private Boolean reserveDisable;

			private Long reserveDisableTotal;

			private Boolean statusDisable;

			private Long statusDisableTotal;

			private Long total;

			private String type;

			private Long used;

			private Long usedRatio;

			public Boolean getDisplay() {
				return this.display;
			}

			public void setDisplay(Boolean display) {
				this.display = display;
			}

			public Long getOversellRatio() {
				return this.oversellRatio;
			}

			public void setOversellRatio(Long oversellRatio) {
				this.oversellRatio = oversellRatio;
			}

			public Long getRemain() {
				return this.remain;
			}

			public void setRemain(Long remain) {
				this.remain = remain;
			}

			public Long getReserved() {
				return this.reserved;
			}

			public void setReserved(Long reserved) {
				this.reserved = reserved;
			}

			public Boolean getReserveDisable() {
				return this.reserveDisable;
			}

			public void setReserveDisable(Boolean reserveDisable) {
				this.reserveDisable = reserveDisable;
			}

			public Long getReserveDisableTotal() {
				return this.reserveDisableTotal;
			}

			public void setReserveDisableTotal(Long reserveDisableTotal) {
				this.reserveDisableTotal = reserveDisableTotal;
			}

			public Boolean getStatusDisable() {
				return this.statusDisable;
			}

			public void setStatusDisable(Boolean statusDisable) {
				this.statusDisable = statusDisable;
			}

			public Long getStatusDisableTotal() {
				return this.statusDisableTotal;
			}

			public void setStatusDisableTotal(Long statusDisableTotal) {
				this.statusDisableTotal = statusDisableTotal;
			}

			public Long getTotal() {
				return this.total;
			}

			public void setTotal(Long total) {
				this.total = total;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Long getUsed() {
				return this.used;
			}

			public void setUsed(Long used) {
				this.used = used;
			}

			public Long getUsedRatio() {
				return this.usedRatio;
			}

			public void setUsedRatio(Long usedRatio) {
				this.usedRatio = usedRatio;
			}
		}
	}

	public static class Pager {

		private Long page;

		private Long size;

		private Long total;

		public Long getPage() {
			return this.page;
		}

		public void setPage(Long page) {
			this.page = page;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}
	}

	@Override
	public DescribeRegionResourceResponse getInstance(UnmarshallerContext context) {
		return	DescribeRegionResourceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
