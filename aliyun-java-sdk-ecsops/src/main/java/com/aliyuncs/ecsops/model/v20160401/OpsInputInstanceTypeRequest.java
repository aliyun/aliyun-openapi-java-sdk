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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsInputInstanceTypeRequest extends RpcAcsRequest<OpsInputInstanceTypeResponse> {
	   

	private String gpuSpec;

	private Integer dataDiskBpsR;

	private Float txCreditConsumRate;

	private Integer sound;

	private Long publicRxPps;

	private Integer dataDiskIopsR;

	private Integer dataDiskBpsW;

	private Integer txMaxCredit;

	private Integer vmBandwidthRx;

	private Integer dataDiskIopsW;

	private Integer supportIoOptimized;

	private Integer initCredit;

	private Integer cores;

	private Integer diskQueueNum;

	private Float rxCreditConsumRate;

	private Long vmPpsTx;

	private Long privateTxPps;

	private String generation;

	private Long diskSize;

	private Integer rxInitCredit;

	private Integer eniQuantity;

	private Integer txBurst;

	private Integer eniPrivateIpQuantity;

	private Integer baseline;

	private Integer status;

	private Integer txInitCredit;

	private Integer flag;

	private Integer eniQueueNum;

	private String dataDiskCategory;

	private Integer nodeNum;

	private Integer mem;

	private Float txCreditAccumRate;

	private String instanceType;

	private Long vmPpsRx;

	private Integer rxMaxCredit;

	private String instanceTypeFamily;

	private String dataDiskScheduleStrategy;

	private Integer eniIpv6Quantity;

	private Integer diskNum;

	private Integer secondaryEniQueueNum;

	private Long vmIops;

	private Long publicTxPps;

	private Float rxCreditAccumRate;

	private Integer vmBandwidthTx;

	private Integer gpuAmount;

	private Long privateRxPps;

	private Integer rxBurst;

	private Long vmBps;

	private String auditParamStr;
	public OpsInputInstanceTypeRequest() {
		super("Ecsops", "2016-04-01", "OpsInputInstanceType", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getGpuSpec() {
		return this.gpuSpec;
	}

	public void setGpuSpec(String gpuSpec) {
		this.gpuSpec = gpuSpec;
		if(gpuSpec != null){
			putQueryParameter("GpuSpec", gpuSpec);
		}
	}

	public Integer getDataDiskBpsR() {
		return this.dataDiskBpsR;
	}

	public void setDataDiskBpsR(Integer dataDiskBpsR) {
		this.dataDiskBpsR = dataDiskBpsR;
		if(dataDiskBpsR != null){
			putQueryParameter("DataDiskBpsR", dataDiskBpsR.toString());
		}
	}

	public Float getTxCreditConsumRate() {
		return this.txCreditConsumRate;
	}

	public void setTxCreditConsumRate(Float txCreditConsumRate) {
		this.txCreditConsumRate = txCreditConsumRate;
		if(txCreditConsumRate != null){
			putQueryParameter("TxCreditConsumRate", txCreditConsumRate.toString());
		}
	}

	public Integer getSound() {
		return this.sound;
	}

	public void setSound(Integer sound) {
		this.sound = sound;
		if(sound != null){
			putQueryParameter("Sound", sound.toString());
		}
	}

	public Long getPublicRxPps() {
		return this.publicRxPps;
	}

	public void setPublicRxPps(Long publicRxPps) {
		this.publicRxPps = publicRxPps;
		if(publicRxPps != null){
			putQueryParameter("PublicRxPps", publicRxPps.toString());
		}
	}

	public Integer getDataDiskIopsR() {
		return this.dataDiskIopsR;
	}

	public void setDataDiskIopsR(Integer dataDiskIopsR) {
		this.dataDiskIopsR = dataDiskIopsR;
		if(dataDiskIopsR != null){
			putQueryParameter("DataDiskIopsR", dataDiskIopsR.toString());
		}
	}

	public Integer getDataDiskBpsW() {
		return this.dataDiskBpsW;
	}

	public void setDataDiskBpsW(Integer dataDiskBpsW) {
		this.dataDiskBpsW = dataDiskBpsW;
		if(dataDiskBpsW != null){
			putQueryParameter("DataDiskBpsW", dataDiskBpsW.toString());
		}
	}

	public Integer getTxMaxCredit() {
		return this.txMaxCredit;
	}

	public void setTxMaxCredit(Integer txMaxCredit) {
		this.txMaxCredit = txMaxCredit;
		if(txMaxCredit != null){
			putQueryParameter("TxMaxCredit", txMaxCredit.toString());
		}
	}

	public Integer getVmBandwidthRx() {
		return this.vmBandwidthRx;
	}

	public void setVmBandwidthRx(Integer vmBandwidthRx) {
		this.vmBandwidthRx = vmBandwidthRx;
		if(vmBandwidthRx != null){
			putQueryParameter("VmBandwidthRx", vmBandwidthRx.toString());
		}
	}

	public Integer getDataDiskIopsW() {
		return this.dataDiskIopsW;
	}

	public void setDataDiskIopsW(Integer dataDiskIopsW) {
		this.dataDiskIopsW = dataDiskIopsW;
		if(dataDiskIopsW != null){
			putQueryParameter("DataDiskIopsW", dataDiskIopsW.toString());
		}
	}

	public Integer getSupportIoOptimized() {
		return this.supportIoOptimized;
	}

	public void setSupportIoOptimized(Integer supportIoOptimized) {
		this.supportIoOptimized = supportIoOptimized;
		if(supportIoOptimized != null){
			putQueryParameter("SupportIoOptimized", supportIoOptimized.toString());
		}
	}

	public Integer getInitCredit() {
		return this.initCredit;
	}

	public void setInitCredit(Integer initCredit) {
		this.initCredit = initCredit;
		if(initCredit != null){
			putQueryParameter("InitCredit", initCredit.toString());
		}
	}

	public Integer getCores() {
		return this.cores;
	}

	public void setCores(Integer cores) {
		this.cores = cores;
		if(cores != null){
			putQueryParameter("Cores", cores.toString());
		}
	}

	public Integer getDiskQueueNum() {
		return this.diskQueueNum;
	}

	public void setDiskQueueNum(Integer diskQueueNum) {
		this.diskQueueNum = diskQueueNum;
		if(diskQueueNum != null){
			putQueryParameter("DiskQueueNum", diskQueueNum.toString());
		}
	}

	public Float getRxCreditConsumRate() {
		return this.rxCreditConsumRate;
	}

	public void setRxCreditConsumRate(Float rxCreditConsumRate) {
		this.rxCreditConsumRate = rxCreditConsumRate;
		if(rxCreditConsumRate != null){
			putQueryParameter("RxCreditConsumRate", rxCreditConsumRate.toString());
		}
	}

	public Long getVmPpsTx() {
		return this.vmPpsTx;
	}

	public void setVmPpsTx(Long vmPpsTx) {
		this.vmPpsTx = vmPpsTx;
		if(vmPpsTx != null){
			putQueryParameter("VmPpsTx", vmPpsTx.toString());
		}
	}

	public Long getPrivateTxPps() {
		return this.privateTxPps;
	}

	public void setPrivateTxPps(Long privateTxPps) {
		this.privateTxPps = privateTxPps;
		if(privateTxPps != null){
			putQueryParameter("PrivateTxPps", privateTxPps.toString());
		}
	}

	public String getGeneration() {
		return this.generation;
	}

	public void setGeneration(String generation) {
		this.generation = generation;
		if(generation != null){
			putQueryParameter("Generation", generation);
		}
	}

	public Long getDiskSize() {
		return this.diskSize;
	}

	public void setDiskSize(Long diskSize) {
		this.diskSize = diskSize;
		if(diskSize != null){
			putQueryParameter("DiskSize", diskSize.toString());
		}
	}

	public Integer getRxInitCredit() {
		return this.rxInitCredit;
	}

	public void setRxInitCredit(Integer rxInitCredit) {
		this.rxInitCredit = rxInitCredit;
		if(rxInitCredit != null){
			putQueryParameter("RxInitCredit", rxInitCredit.toString());
		}
	}

	public Integer getEniQuantity() {
		return this.eniQuantity;
	}

	public void setEniQuantity(Integer eniQuantity) {
		this.eniQuantity = eniQuantity;
		if(eniQuantity != null){
			putQueryParameter("EniQuantity", eniQuantity.toString());
		}
	}

	public Integer getTxBurst() {
		return this.txBurst;
	}

	public void setTxBurst(Integer txBurst) {
		this.txBurst = txBurst;
		if(txBurst != null){
			putQueryParameter("TxBurst", txBurst.toString());
		}
	}

	public Integer getEniPrivateIpQuantity() {
		return this.eniPrivateIpQuantity;
	}

	public void setEniPrivateIpQuantity(Integer eniPrivateIpQuantity) {
		this.eniPrivateIpQuantity = eniPrivateIpQuantity;
		if(eniPrivateIpQuantity != null){
			putQueryParameter("EniPrivateIpQuantity", eniPrivateIpQuantity.toString());
		}
	}

	public Integer getBaseline() {
		return this.baseline;
	}

	public void setBaseline(Integer baseline) {
		this.baseline = baseline;
		if(baseline != null){
			putQueryParameter("Baseline", baseline.toString());
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	public Integer getTxInitCredit() {
		return this.txInitCredit;
	}

	public void setTxInitCredit(Integer txInitCredit) {
		this.txInitCredit = txInitCredit;
		if(txInitCredit != null){
			putQueryParameter("TxInitCredit", txInitCredit.toString());
		}
	}

	public Integer getFlag() {
		return this.flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
		if(flag != null){
			putQueryParameter("Flag", flag.toString());
		}
	}

	public Integer getEniQueueNum() {
		return this.eniQueueNum;
	}

	public void setEniQueueNum(Integer eniQueueNum) {
		this.eniQueueNum = eniQueueNum;
		if(eniQueueNum != null){
			putQueryParameter("EniQueueNum", eniQueueNum.toString());
		}
	}

	public String getDataDiskCategory() {
		return this.dataDiskCategory;
	}

	public void setDataDiskCategory(String dataDiskCategory) {
		this.dataDiskCategory = dataDiskCategory;
		if(dataDiskCategory != null){
			putQueryParameter("DataDiskCategory", dataDiskCategory);
		}
	}

	public Integer getNodeNum() {
		return this.nodeNum;
	}

	public void setNodeNum(Integer nodeNum) {
		this.nodeNum = nodeNum;
		if(nodeNum != null){
			putQueryParameter("NodeNum", nodeNum.toString());
		}
	}

	public Integer getMem() {
		return this.mem;
	}

	public void setMem(Integer mem) {
		this.mem = mem;
		if(mem != null){
			putQueryParameter("Mem", mem.toString());
		}
	}

	public Float getTxCreditAccumRate() {
		return this.txCreditAccumRate;
	}

	public void setTxCreditAccumRate(Float txCreditAccumRate) {
		this.txCreditAccumRate = txCreditAccumRate;
		if(txCreditAccumRate != null){
			putQueryParameter("TxCreditAccumRate", txCreditAccumRate.toString());
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public Long getVmPpsRx() {
		return this.vmPpsRx;
	}

	public void setVmPpsRx(Long vmPpsRx) {
		this.vmPpsRx = vmPpsRx;
		if(vmPpsRx != null){
			putQueryParameter("VmPpsRx", vmPpsRx.toString());
		}
	}

	public Integer getRxMaxCredit() {
		return this.rxMaxCredit;
	}

	public void setRxMaxCredit(Integer rxMaxCredit) {
		this.rxMaxCredit = rxMaxCredit;
		if(rxMaxCredit != null){
			putQueryParameter("RxMaxCredit", rxMaxCredit.toString());
		}
	}

	public String getInstanceTypeFamily() {
		return this.instanceTypeFamily;
	}

	public void setInstanceTypeFamily(String instanceTypeFamily) {
		this.instanceTypeFamily = instanceTypeFamily;
		if(instanceTypeFamily != null){
			putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
		}
	}

	public String getDataDiskScheduleStrategy() {
		return this.dataDiskScheduleStrategy;
	}

	public void setDataDiskScheduleStrategy(String dataDiskScheduleStrategy) {
		this.dataDiskScheduleStrategy = dataDiskScheduleStrategy;
		if(dataDiskScheduleStrategy != null){
			putQueryParameter("DataDiskScheduleStrategy", dataDiskScheduleStrategy);
		}
	}

	public Integer getEniIpv6Quantity() {
		return this.eniIpv6Quantity;
	}

	public void setEniIpv6Quantity(Integer eniIpv6Quantity) {
		this.eniIpv6Quantity = eniIpv6Quantity;
		if(eniIpv6Quantity != null){
			putQueryParameter("EniIpv6Quantity", eniIpv6Quantity.toString());
		}
	}

	public Integer getDiskNum() {
		return this.diskNum;
	}

	public void setDiskNum(Integer diskNum) {
		this.diskNum = diskNum;
		if(diskNum != null){
			putQueryParameter("DiskNum", diskNum.toString());
		}
	}

	public Integer getSecondaryEniQueueNum() {
		return this.secondaryEniQueueNum;
	}

	public void setSecondaryEniQueueNum(Integer secondaryEniQueueNum) {
		this.secondaryEniQueueNum = secondaryEniQueueNum;
		if(secondaryEniQueueNum != null){
			putQueryParameter("SecondaryEniQueueNum", secondaryEniQueueNum.toString());
		}
	}

	public Long getVmIops() {
		return this.vmIops;
	}

	public void setVmIops(Long vmIops) {
		this.vmIops = vmIops;
		if(vmIops != null){
			putQueryParameter("VmIops", vmIops.toString());
		}
	}

	public Long getPublicTxPps() {
		return this.publicTxPps;
	}

	public void setPublicTxPps(Long publicTxPps) {
		this.publicTxPps = publicTxPps;
		if(publicTxPps != null){
			putQueryParameter("PublicTxPps", publicTxPps.toString());
		}
	}

	public Float getRxCreditAccumRate() {
		return this.rxCreditAccumRate;
	}

	public void setRxCreditAccumRate(Float rxCreditAccumRate) {
		this.rxCreditAccumRate = rxCreditAccumRate;
		if(rxCreditAccumRate != null){
			putQueryParameter("RxCreditAccumRate", rxCreditAccumRate.toString());
		}
	}

	public Integer getVmBandwidthTx() {
		return this.vmBandwidthTx;
	}

	public void setVmBandwidthTx(Integer vmBandwidthTx) {
		this.vmBandwidthTx = vmBandwidthTx;
		if(vmBandwidthTx != null){
			putQueryParameter("VmBandwidthTx", vmBandwidthTx.toString());
		}
	}

	public Integer getGpuAmount() {
		return this.gpuAmount;
	}

	public void setGpuAmount(Integer gpuAmount) {
		this.gpuAmount = gpuAmount;
		if(gpuAmount != null){
			putQueryParameter("GpuAmount", gpuAmount.toString());
		}
	}

	public Long getPrivateRxPps() {
		return this.privateRxPps;
	}

	public void setPrivateRxPps(Long privateRxPps) {
		this.privateRxPps = privateRxPps;
		if(privateRxPps != null){
			putQueryParameter("PrivateRxPps", privateRxPps.toString());
		}
	}

	public Integer getRxBurst() {
		return this.rxBurst;
	}

	public void setRxBurst(Integer rxBurst) {
		this.rxBurst = rxBurst;
		if(rxBurst != null){
			putQueryParameter("RxBurst", rxBurst.toString());
		}
	}

	public Long getVmBps() {
		return this.vmBps;
	}

	public void setVmBps(Long vmBps) {
		this.vmBps = vmBps;
		if(vmBps != null){
			putQueryParameter("VmBps", vmBps.toString());
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsInputInstanceTypeResponse> getResponseClass() {
		return OpsInputInstanceTypeResponse.class;
	}

}
