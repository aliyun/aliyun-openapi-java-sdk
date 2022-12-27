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
import com.aliyuncs.ens.transform.v20171110.DescribeNCInformationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNCInformationResponse extends AcsResponse {

	private Integer currentPage;

	private Integer totalCount;

	private String msg;

	private String desc;

	private String requestId;

	private List<DataItem> data;

	private Pager pager;

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

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

		private Boolean online;

		private String region;

		private String virtual;

		private Cpu cpu;

		private Memory memory;

		private Gpu gpu;

		private Hdd hdd;

		private Ssd ssd;

		private Nvme nvme;

		private Info info;

		public Boolean getOnline() {
			return this.online;
		}

		public void setOnline(Boolean online) {
			this.online = online;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getVirtual() {
			return this.virtual;
		}

		public void setVirtual(String virtual) {
			this.virtual = virtual;
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

		public Info getInfo() {
			return this.info;
		}

		public void setInfo(Info info) {
			this.info = info;
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

		public static class Info {

			private String ip;

			private String name;

			private String uuid;

			private List<String> tag;

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getUuid() {
				return this.uuid;
			}

			public void setUuid(String uuid) {
				this.uuid = uuid;
			}

			public List<String> getTag() {
				return this.tag;
			}

			public void setTag(List<String> tag) {
				this.tag = tag;
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
	public DescribeNCInformationResponse getInstance(UnmarshallerContext context) {
		return	DescribeNCInformationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
