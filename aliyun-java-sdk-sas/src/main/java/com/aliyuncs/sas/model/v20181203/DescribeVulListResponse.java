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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeVulListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVulListResponse extends AcsResponse {

	private Integer currentPage;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<VulRecord> vulRecords;

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<VulRecord> getVulRecords() {
		return this.vulRecords;
	}

	public void setVulRecords(List<VulRecord> vulRecords) {
		this.vulRecords = vulRecords;
	}

	public static class VulRecord {

		private Integer status;

		private String type;

		private Long modifyTs;

		private String internetIp;

		private Long recordId;

		private String containerImageId;

		private Long primaryId;

		private String tag;

		private String k8sClusterId;

		private String containerImageName;

		private String k8sNodeId;

		private String instanceName;

		private String containerInnerPath;

		private Boolean online;

		private String osVersion;

		private String name;

		private String canFix;

		private Integer progress;

		private String ip;

		private String needReboot;

		private String resultCode;

		private String instanceId;

		private String related;

		private String intranetIp;

		private Long lastTs;

		private Long firstTs;

		private String regionId;

		private String necessity;

		private Long repairTs;

		private String uuid;

		private String k8sPodName;

		private String containerId;

		private Integer groupId;

		private String resultMessage;

		private String k8sNamespace;

		private String aliasName;

		private String k8sNodeName;

		private String containerName;

		private String level;

		private Boolean bind;

		private String osName;

		private String authVersion;

		private ExtendContentJson extendContentJson;

		private ProcessInfo processInfo;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Long getModifyTs() {
			return this.modifyTs;
		}

		public void setModifyTs(Long modifyTs) {
			this.modifyTs = modifyTs;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public Long getRecordId() {
			return this.recordId;
		}

		public void setRecordId(Long recordId) {
			this.recordId = recordId;
		}

		public String getContainerImageId() {
			return this.containerImageId;
		}

		public void setContainerImageId(String containerImageId) {
			this.containerImageId = containerImageId;
		}

		public Long getPrimaryId() {
			return this.primaryId;
		}

		public void setPrimaryId(Long primaryId) {
			this.primaryId = primaryId;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getK8sClusterId() {
			return this.k8sClusterId;
		}

		public void setK8sClusterId(String k8sClusterId) {
			this.k8sClusterId = k8sClusterId;
		}

		public String getContainerImageName() {
			return this.containerImageName;
		}

		public void setContainerImageName(String containerImageName) {
			this.containerImageName = containerImageName;
		}

		public String getK8sNodeId() {
			return this.k8sNodeId;
		}

		public void setK8sNodeId(String k8sNodeId) {
			this.k8sNodeId = k8sNodeId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getContainerInnerPath() {
			return this.containerInnerPath;
		}

		public void setContainerInnerPath(String containerInnerPath) {
			this.containerInnerPath = containerInnerPath;
		}

		public Boolean getOnline() {
			return this.online;
		}

		public void setOnline(Boolean online) {
			this.online = online;
		}

		public String getOsVersion() {
			return this.osVersion;
		}

		public void setOsVersion(String osVersion) {
			this.osVersion = osVersion;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCanFix() {
			return this.canFix;
		}

		public void setCanFix(String canFix) {
			this.canFix = canFix;
		}

		public Integer getProgress() {
			return this.progress;
		}

		public void setProgress(Integer progress) {
			this.progress = progress;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getNeedReboot() {
			return this.needReboot;
		}

		public void setNeedReboot(String needReboot) {
			this.needReboot = needReboot;
		}

		public String getResultCode() {
			return this.resultCode;
		}

		public void setResultCode(String resultCode) {
			this.resultCode = resultCode;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getRelated() {
			return this.related;
		}

		public void setRelated(String related) {
			this.related = related;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public Long getLastTs() {
			return this.lastTs;
		}

		public void setLastTs(Long lastTs) {
			this.lastTs = lastTs;
		}

		public Long getFirstTs() {
			return this.firstTs;
		}

		public void setFirstTs(Long firstTs) {
			this.firstTs = firstTs;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getNecessity() {
			return this.necessity;
		}

		public void setNecessity(String necessity) {
			this.necessity = necessity;
		}

		public Long getRepairTs() {
			return this.repairTs;
		}

		public void setRepairTs(Long repairTs) {
			this.repairTs = repairTs;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getK8sPodName() {
			return this.k8sPodName;
		}

		public void setK8sPodName(String k8sPodName) {
			this.k8sPodName = k8sPodName;
		}

		public String getContainerId() {
			return this.containerId;
		}

		public void setContainerId(String containerId) {
			this.containerId = containerId;
		}

		public Integer getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Integer groupId) {
			this.groupId = groupId;
		}

		public String getResultMessage() {
			return this.resultMessage;
		}

		public void setResultMessage(String resultMessage) {
			this.resultMessage = resultMessage;
		}

		public String getK8sNamespace() {
			return this.k8sNamespace;
		}

		public void setK8sNamespace(String k8sNamespace) {
			this.k8sNamespace = k8sNamespace;
		}

		public String getAliasName() {
			return this.aliasName;
		}

		public void setAliasName(String aliasName) {
			this.aliasName = aliasName;
		}

		public String getK8sNodeName() {
			return this.k8sNodeName;
		}

		public void setK8sNodeName(String k8sNodeName) {
			this.k8sNodeName = k8sNodeName;
		}

		public String getContainerName() {
			return this.containerName;
		}

		public void setContainerName(String containerName) {
			this.containerName = containerName;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public Boolean getBind() {
			return this.bind;
		}

		public void setBind(Boolean bind) {
			this.bind = bind;
		}

		public String getOsName() {
			return this.osName;
		}

		public void setOsName(String osName) {
			this.osName = osName;
		}

		public String getAuthVersion() {
			return this.authVersion;
		}

		public void setAuthVersion(String authVersion) {
			this.authVersion = authVersion;
		}

		public ExtendContentJson getExtendContentJson() {
			return this.extendContentJson;
		}

		public void setExtendContentJson(ExtendContentJson extendContentJson) {
			this.extendContentJson = extendContentJson;
		}

		public ProcessInfo getProcessInfo() {
			return this.processInfo;
		}

		public void setProcessInfo(ProcessInfo processInfo) {
			this.processInfo = processInfo;
		}

		public static class ExtendContentJson {

			private String status;

			private String effect;

			private String emgProof;

			private String owasp;

			private String cwe;

			private String ip;

			private Long primaryId;

			private String os;

			private String tag;

			private String reference;

			private String wasc;

			private Long lastTs;

			private String vulType;

			private String description;

			private String osRelease;

			private String title;

			private String aliasName;

			private String solution;

			private String target;

			private String absolutePath;

			private String proof;

			private String reason;

			private List<RpmEntity> rpmEntityList;

			private List<String> cveList;

			private Necessity necessity;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getEffect() {
				return this.effect;
			}

			public void setEffect(String effect) {
				this.effect = effect;
			}

			public String getEmgProof() {
				return this.emgProof;
			}

			public void setEmgProof(String emgProof) {
				this.emgProof = emgProof;
			}

			public String getOwasp() {
				return this.owasp;
			}

			public void setOwasp(String owasp) {
				this.owasp = owasp;
			}

			public String getCwe() {
				return this.cwe;
			}

			public void setCwe(String cwe) {
				this.cwe = cwe;
			}

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public Long getPrimaryId() {
				return this.primaryId;
			}

			public void setPrimaryId(Long primaryId) {
				this.primaryId = primaryId;
			}

			public String getOs() {
				return this.os;
			}

			public void setOs(String os) {
				this.os = os;
			}

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}

			public String getReference() {
				return this.reference;
			}

			public void setReference(String reference) {
				this.reference = reference;
			}

			public String getWasc() {
				return this.wasc;
			}

			public void setWasc(String wasc) {
				this.wasc = wasc;
			}

			public Long getLastTs() {
				return this.lastTs;
			}

			public void setLastTs(Long lastTs) {
				this.lastTs = lastTs;
			}

			public String getVulType() {
				return this.vulType;
			}

			public void setVulType(String vulType) {
				this.vulType = vulType;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getOsRelease() {
				return this.osRelease;
			}

			public void setOsRelease(String osRelease) {
				this.osRelease = osRelease;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getAliasName() {
				return this.aliasName;
			}

			public void setAliasName(String aliasName) {
				this.aliasName = aliasName;
			}

			public String getSolution() {
				return this.solution;
			}

			public void setSolution(String solution) {
				this.solution = solution;
			}

			public String getTarget() {
				return this.target;
			}

			public void setTarget(String target) {
				this.target = target;
			}

			public String getAbsolutePath() {
				return this.absolutePath;
			}

			public void setAbsolutePath(String absolutePath) {
				this.absolutePath = absolutePath;
			}

			public String getProof() {
				return this.proof;
			}

			public void setProof(String proof) {
				this.proof = proof;
			}

			public String getReason() {
				return this.reason;
			}

			public void setReason(String reason) {
				this.reason = reason;
			}

			public List<RpmEntity> getRpmEntityList() {
				return this.rpmEntityList;
			}

			public void setRpmEntityList(List<RpmEntity> rpmEntityList) {
				this.rpmEntityList = rpmEntityList;
			}

			public List<String> getCveList() {
				return this.cveList;
			}

			public void setCveList(List<String> cveList) {
				this.cveList = cveList;
			}

			public Necessity getNecessity() {
				return this.necessity;
			}

			public void setNecessity(Necessity necessity) {
				this.necessity = necessity;
			}

			public static class RpmEntity {

				private String fullVersion;

				private String version;

				private String matchDetail;

				private String imageName;

				private String path;

				private String containerName;

				private String name;

				private String updateCmd;

				private String pid;

				private List<String> matchList;

				public String getFullVersion() {
					return this.fullVersion;
				}

				public void setFullVersion(String fullVersion) {
					this.fullVersion = fullVersion;
				}

				public String getVersion() {
					return this.version;
				}

				public void setVersion(String version) {
					this.version = version;
				}

				public String getMatchDetail() {
					return this.matchDetail;
				}

				public void setMatchDetail(String matchDetail) {
					this.matchDetail = matchDetail;
				}

				public String getImageName() {
					return this.imageName;
				}

				public void setImageName(String imageName) {
					this.imageName = imageName;
				}

				public String getPath() {
					return this.path;
				}

				public void setPath(String path) {
					this.path = path;
				}

				public String getContainerName() {
					return this.containerName;
				}

				public void setContainerName(String containerName) {
					this.containerName = containerName;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getUpdateCmd() {
					return this.updateCmd;
				}

				public void setUpdateCmd(String updateCmd) {
					this.updateCmd = updateCmd;
				}

				public String getPid() {
					return this.pid;
				}

				public void setPid(String pid) {
					this.pid = pid;
				}

				public List<String> getMatchList() {
					return this.matchList;
				}

				public void setMatchList(List<String> matchList) {
					this.matchList = matchList;
				}
			}

			public static class Necessity {

				private String status;

				private String gmt_create;

				private String time_factor;

				private String enviroment_factor;

				private String is_calc;

				private String total_score;

				private String cvss_factor;

				private String assets_factor;

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getGmt_create() {
					return this.gmt_create;
				}

				public void setGmt_create(String gmt_create) {
					this.gmt_create = gmt_create;
				}

				public String getTime_factor() {
					return this.time_factor;
				}

				public void setTime_factor(String time_factor) {
					this.time_factor = time_factor;
				}

				public String getEnviroment_factor() {
					return this.enviroment_factor;
				}

				public void setEnviroment_factor(String enviroment_factor) {
					this.enviroment_factor = enviroment_factor;
				}

				public String getIs_calc() {
					return this.is_calc;
				}

				public void setIs_calc(String is_calc) {
					this.is_calc = is_calc;
				}

				public String getTotal_score() {
					return this.total_score;
				}

				public void setTotal_score(String total_score) {
					this.total_score = total_score;
				}

				public String getCvss_factor() {
					return this.cvss_factor;
				}

				public void setCvss_factor(String cvss_factor) {
					this.cvss_factor = cvss_factor;
				}

				public String getAssets_factor() {
					return this.assets_factor;
				}

				public void setAssets_factor(String assets_factor) {
					this.assets_factor = assets_factor;
				}
			}
		}

		public static class ProcessInfo {

			private Integer totalCount;

			private Long gmtLastTs;

			private List<Process> processList;

			public Integer getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Integer totalCount) {
				this.totalCount = totalCount;
			}

			public Long getGmtLastTs() {
				return this.gmtLastTs;
			}

			public void setGmtLastTs(Long gmtLastTs) {
				this.gmtLastTs = gmtLastTs;
			}

			public List<Process> getProcessList() {
				return this.processList;
			}

			public void setProcessList(List<Process> processList) {
				this.processList = processList;
			}

			public static class Process {

				private String rpm;

				private String pname;

				private String pid;

				private List<SubProcess> subProcessList;

				public String getRpm() {
					return this.rpm;
				}

				public void setRpm(String rpm) {
					this.rpm = rpm;
				}

				public String getPname() {
					return this.pname;
				}

				public void setPname(String pname) {
					this.pname = pname;
				}

				public String getPid() {
					return this.pid;
				}

				public void setPid(String pid) {
					this.pid = pid;
				}

				public List<SubProcess> getSubProcessList() {
					return this.subProcessList;
				}

				public void setSubProcessList(List<SubProcess> subProcessList) {
					this.subProcessList = subProcessList;
				}

				public static class SubProcess {

					private String rpm;

					private String pname;

					private String pid;

					public String getRpm() {
						return this.rpm;
					}

					public void setRpm(String rpm) {
						this.rpm = rpm;
					}

					public String getPname() {
						return this.pname;
					}

					public void setPname(String pname) {
						this.pname = pname;
					}

					public String getPid() {
						return this.pid;
					}

					public void setPid(String pid) {
						this.pid = pid;
					}
				}
			}
		}
	}

	@Override
	public DescribeVulListResponse getInstance(UnmarshallerContext context) {
		return	DescribeVulListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
