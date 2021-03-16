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
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsInsertInstanceTypeRequest extends RpcAcsRequest<OpsInsertInstanceTypeResponse> {
	   

	private String gpuSpec;

	private Long vmBurstBps;

	private Integer dataDiskBpsR;

	private Integer netCpuNormal;

	private Float txCreditConsumRate;

	private Long sessionEstablishRate;

	private Integer sound;

	private String ecsCategory3En;

	private Long publicRxPps;

	private Integer dataDiskIopsR;

	private Integer dataDiskBpsW;

	private Integer txMaxCredit;

	private Integer vmBandwidthRx;

	private Integer dataDiskIopsW;

	private Integer supportIoOptimized;

	private String dataNvmPassthruMode;

	private Integer initCredit;

	private Integer cores;

	private Integer diskQueueNum;

	private Boolean cpuOptionsNuma;

	private Float rxCreditConsumRate;

	private Integer maxQueueNumPerEni;

	private Long vmPpsTx;

	private Long privateTxPps;

	private String generation;

	private Long diskSize;

	private Integer rxInitCredit;

	private Integer nvmNum;

	private Integer eniQuantity;

	private Integer txBurst;

	private Integer eniPrivateIpQuantity;

	private Integer baseline;

	private String dataDiskArchitecture;

	private Long sessionQuota;

	private Long vmBurstBaseBps;

	private Integer dataDiskQueueNum;

	private Boolean supportVtpm;

	private Integer status;

	private Integer txInitCredit;

	private Boolean cpuOptionsSupportNuma;

	private Integer flag;

	private Boolean enableEniHotPlug;

	private Integer eniQueueNum;

	private Integer networkInhibitType;

	private Integer rdmaEniNum;

	private String dataDiskCategory;

	private String vtpmVersion;

	private Integer nodeNum;

	private Long vmBurstIops;

	private Integer cpuOptionsHt;

	private Float netConsumCreditRate;

	private Integer mem;

	private Float txCreditAccumRate;

	private String instanceType;

	private Long nvmSize;

	private Long vmPpsRx;

	private Integer rxMaxCredit;

	private Integer netCpuMin;

	private Integer cpuOptionsCore;

	private Integer cpuOptionsCoreFactor;

	private String instanceTypeFamily;

	private String dataDiskScheduleStrategy;

	private Integer eniVportQuota;

	private Integer eniIpv6Quantity;

	private Integer diskNum;

	private Integer secondaryEniQueueNum;

	private Long vmIops;

	private Float netAccumCreditRate;

	private Long publicTxPps;

	private Float rxCreditAccumRate;

	private Integer vmBandwidthTx;

	private Long vmBurstBaseIops;

	private Float networkInhibitRatio;

	private Integer netInitCredit;

	private Boolean eniTrunkEnabled;

	private Integer gpuAmount;

	private Integer netCpuMax;

	private Long privateRxPps;

	private Long vmBurstMaxBpsBalance;

	private Integer rxBurst;

	private Integer netMaxCredit;

	private Long vmBurstMaxIopsBalance;

	private Long vmBps;

	private String auditParamStr;
	public OpsInsertInstanceTypeRequest() {
		super("Ecsops", "2016-04-01", "OpsInsertInstanceType", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Long getVmBurstBps() {
		return this.vmBurstBps;
	}

	public void setVmBurstBps(Long vmBurstBps) {
		this.vmBurstBps = vmBurstBps;
		if(vmBurstBps != null){
			putQueryParameter("VmBurstBps", vmBurstBps.toString());
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

	public Integer getNetCpuNormal() {
		return this.netCpuNormal;
	}

	public void setNetCpuNormal(Integer netCpuNormal) {
		this.netCpuNormal = netCpuNormal;
		if(netCpuNormal != null){
			putQueryParameter("NetCpuNormal", netCpuNormal.toString());
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

	public Long getSessionEstablishRate() {
		return this.sessionEstablishRate;
	}

	public void setSessionEstablishRate(Long sessionEstablishRate) {
		this.sessionEstablishRate = sessionEstablishRate;
		if(sessionEstablishRate != null){
			putQueryParameter("SessionEstablishRate", sessionEstablishRate.toString());
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

	public String getEcsCategory3En() {
		return this.ecsCategory3En;
	}

	public void setEcsCategory3En(String ecsCategory3En) {
		this.ecsCategory3En = ecsCategory3En;
		if(ecsCategory3En != null){
			putQueryParameter("EcsCategory3En", ecsCategory3En);
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

	public String getDataNvmPassthruMode() {
		return this.dataNvmPassthruMode;
	}

	public void setDataNvmPassthruMode(String dataNvmPassthruMode) {
		this.dataNvmPassthruMode = dataNvmPassthruMode;
		if(dataNvmPassthruMode != null){
			putQueryParameter("DataNvmPassthruMode", dataNvmPassthruMode);
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

	public Boolean getCpuOptionsNuma() {
		return this.cpuOptionsNuma;
	}

	public void setCpuOptionsNuma(Boolean cpuOptionsNuma) {
		this.cpuOptionsNuma = cpuOptionsNuma;
		if(cpuOptionsNuma != null){
			putQueryParameter("CpuOptionsNuma", cpuOptionsNuma.toString());
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

	public Integer getMaxQueueNumPerEni() {
		return this.maxQueueNumPerEni;
	}

	public void setMaxQueueNumPerEni(Integer maxQueueNumPerEni) {
		this.maxQueueNumPerEni = maxQueueNumPerEni;
		if(maxQueueNumPerEni != null){
			putQueryParameter("MaxQueueNumPerEni", maxQueueNumPerEni.toString());
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

	public Integer getNvmNum() {
		return this.nvmNum;
	}

	public void setNvmNum(Integer nvmNum) {
		this.nvmNum = nvmNum;
		if(nvmNum != null){
			putQueryParameter("NvmNum", nvmNum.toString());
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

	public String getDataDiskArchitecture() {
		return this.dataDiskArchitecture;
	}

	public void setDataDiskArchitecture(String dataDiskArchitecture) {
		this.dataDiskArchitecture = dataDiskArchitecture;
		if(dataDiskArchitecture != null){
			putQueryParameter("DataDiskArchitecture", dataDiskArchitecture);
		}
	}

	public Long getSessionQuota() {
		return this.sessionQuota;
	}

	public void setSessionQuota(Long sessionQuota) {
		this.sessionQuota = sessionQuota;
		if(sessionQuota != null){
			putQueryParameter("SessionQuota", sessionQuota.toString());
		}
	}

	public Long getVmBurstBaseBps() {
		return this.vmBurstBaseBps;
	}

	public void setVmBurstBaseBps(Long vmBurstBaseBps) {
		this.vmBurstBaseBps = vmBurstBaseBps;
		if(vmBurstBaseBps != null){
			putQueryParameter("VmBurstBaseBps", vmBurstBaseBps.toString());
		}
	}

	public Integer getDataDiskQueueNum() {
		return this.dataDiskQueueNum;
	}

	public void setDataDiskQueueNum(Integer dataDiskQueueNum) {
		this.dataDiskQueueNum = dataDiskQueueNum;
		if(dataDiskQueueNum != null){
			putQueryParameter("DataDiskQueueNum", dataDiskQueueNum.toString());
		}
	}

	public Boolean getSupportVtpm() {
		return this.supportVtpm;
	}

	public void setSupportVtpm(Boolean supportVtpm) {
		this.supportVtpm = supportVtpm;
		if(supportVtpm != null){
			putQueryParameter("SupportVtpm", supportVtpm.toString());
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

	public Boolean getCpuOptionsSupportNuma() {
		return this.cpuOptionsSupportNuma;
	}

	public void setCpuOptionsSupportNuma(Boolean cpuOptionsSupportNuma) {
		this.cpuOptionsSupportNuma = cpuOptionsSupportNuma;
		if(cpuOptionsSupportNuma != null){
			putQueryParameter("CpuOptionsSupportNuma", cpuOptionsSupportNuma.toString());
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

	public Boolean getEnableEniHotPlug() {
		return this.enableEniHotPlug;
	}

	public void setEnableEniHotPlug(Boolean enableEniHotPlug) {
		this.enableEniHotPlug = enableEniHotPlug;
		if(enableEniHotPlug != null){
			putQueryParameter("EnableEniHotPlug", enableEniHotPlug.toString());
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

	public Integer getNetworkInhibitType() {
		return this.networkInhibitType;
	}

	public void setNetworkInhibitType(Integer networkInhibitType) {
		this.networkInhibitType = networkInhibitType;
		if(networkInhibitType != null){
			putQueryParameter("NetworkInhibitType", networkInhibitType.toString());
		}
	}

	public Integer getRdmaEniNum() {
		return this.rdmaEniNum;
	}

	public void setRdmaEniNum(Integer rdmaEniNum) {
		this.rdmaEniNum = rdmaEniNum;
		if(rdmaEniNum != null){
			putQueryParameter("RdmaEniNum", rdmaEniNum.toString());
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

	public String getVtpmVersion() {
		return this.vtpmVersion;
	}

	public void setVtpmVersion(String vtpmVersion) {
		this.vtpmVersion = vtpmVersion;
		if(vtpmVersion != null){
			putQueryParameter("VtpmVersion", vtpmVersion);
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

	public Long getVmBurstIops() {
		return this.vmBurstIops;
	}

	public void setVmBurstIops(Long vmBurstIops) {
		this.vmBurstIops = vmBurstIops;
		if(vmBurstIops != null){
			putQueryParameter("VmBurstIops", vmBurstIops.toString());
		}
	}

	public Integer getCpuOptionsHt() {
		return this.cpuOptionsHt;
	}

	public void setCpuOptionsHt(Integer cpuOptionsHt) {
		this.cpuOptionsHt = cpuOptionsHt;
		if(cpuOptionsHt != null){
			putQueryParameter("CpuOptionsHt", cpuOptionsHt.toString());
		}
	}

	public Float getNetConsumCreditRate() {
		return this.netConsumCreditRate;
	}

	public void setNetConsumCreditRate(Float netConsumCreditRate) {
		this.netConsumCreditRate = netConsumCreditRate;
		if(netConsumCreditRate != null){
			putQueryParameter("NetConsumCreditRate", netConsumCreditRate.toString());
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

	public Long getNvmSize() {
		return this.nvmSize;
	}

	public void setNvmSize(Long nvmSize) {
		this.nvmSize = nvmSize;
		if(nvmSize != null){
			putQueryParameter("NvmSize", nvmSize.toString());
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

	public Integer getNetCpuMin() {
		return this.netCpuMin;
	}

	public void setNetCpuMin(Integer netCpuMin) {
		this.netCpuMin = netCpuMin;
		if(netCpuMin != null){
			putQueryParameter("NetCpuMin", netCpuMin.toString());
		}
	}

	public Integer getCpuOptionsCore() {
		return this.cpuOptionsCore;
	}

	public void setCpuOptionsCore(Integer cpuOptionsCore) {
		this.cpuOptionsCore = cpuOptionsCore;
		if(cpuOptionsCore != null){
			putQueryParameter("CpuOptionsCore", cpuOptionsCore.toString());
		}
	}

	public Integer getCpuOptionsCoreFactor() {
		return this.cpuOptionsCoreFactor;
	}

	public void setCpuOptionsCoreFactor(Integer cpuOptionsCoreFactor) {
		this.cpuOptionsCoreFactor = cpuOptionsCoreFactor;
		if(cpuOptionsCoreFactor != null){
			putQueryParameter("CpuOptionsCoreFactor", cpuOptionsCoreFactor.toString());
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

	public Integer getEniVportQuota() {
		return this.eniVportQuota;
	}

	public void setEniVportQuota(Integer eniVportQuota) {
		this.eniVportQuota = eniVportQuota;
		if(eniVportQuota != null){
			putQueryParameter("EniVportQuota", eniVportQuota.toString());
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

	public Float getNetAccumCreditRate() {
		return this.netAccumCreditRate;
	}

	public void setNetAccumCreditRate(Float netAccumCreditRate) {
		this.netAccumCreditRate = netAccumCreditRate;
		if(netAccumCreditRate != null){
			putQueryParameter("NetAccumCreditRate", netAccumCreditRate.toString());
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

	public Long getVmBurstBaseIops() {
		return this.vmBurstBaseIops;
	}

	public void setVmBurstBaseIops(Long vmBurstBaseIops) {
		this.vmBurstBaseIops = vmBurstBaseIops;
		if(vmBurstBaseIops != null){
			putQueryParameter("VmBurstBaseIops", vmBurstBaseIops.toString());
		}
	}

	public Float getNetworkInhibitRatio() {
		return this.networkInhibitRatio;
	}

	public void setNetworkInhibitRatio(Float networkInhibitRatio) {
		this.networkInhibitRatio = networkInhibitRatio;
		if(networkInhibitRatio != null){
			putQueryParameter("NetworkInhibitRatio", networkInhibitRatio.toString());
		}
	}

	public Integer getNetInitCredit() {
		return this.netInitCredit;
	}

	public void setNetInitCredit(Integer netInitCredit) {
		this.netInitCredit = netInitCredit;
		if(netInitCredit != null){
			putQueryParameter("NetInitCredit", netInitCredit.toString());
		}
	}

	public Boolean getEniTrunkEnabled() {
		return this.eniTrunkEnabled;
	}

	public void setEniTrunkEnabled(Boolean eniTrunkEnabled) {
		this.eniTrunkEnabled = eniTrunkEnabled;
		if(eniTrunkEnabled != null){
			putQueryParameter("EniTrunkEnabled", eniTrunkEnabled.toString());
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

	public Integer getNetCpuMax() {
		return this.netCpuMax;
	}

	public void setNetCpuMax(Integer netCpuMax) {
		this.netCpuMax = netCpuMax;
		if(netCpuMax != null){
			putQueryParameter("NetCpuMax", netCpuMax.toString());
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

	public Long getVmBurstMaxBpsBalance() {
		return this.vmBurstMaxBpsBalance;
	}

	public void setVmBurstMaxBpsBalance(Long vmBurstMaxBpsBalance) {
		this.vmBurstMaxBpsBalance = vmBurstMaxBpsBalance;
		if(vmBurstMaxBpsBalance != null){
			putQueryParameter("VmBurstMaxBpsBalance", vmBurstMaxBpsBalance.toString());
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

	public Integer getNetMaxCredit() {
		return this.netMaxCredit;
	}

	public void setNetMaxCredit(Integer netMaxCredit) {
		this.netMaxCredit = netMaxCredit;
		if(netMaxCredit != null){
			putQueryParameter("NetMaxCredit", netMaxCredit.toString());
		}
	}

	public Long getVmBurstMaxIopsBalance() {
		return this.vmBurstMaxIopsBalance;
	}

	public void setVmBurstMaxIopsBalance(Long vmBurstMaxIopsBalance) {
		this.vmBurstMaxIopsBalance = vmBurstMaxIopsBalance;
		if(vmBurstMaxIopsBalance != null){
			putQueryParameter("VmBurstMaxIopsBalance", vmBurstMaxIopsBalance.toString());
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
	public Class<OpsInsertInstanceTypeResponse> getResponseClass() {
		return OpsInsertInstanceTypeResponse.class;
	}

}
