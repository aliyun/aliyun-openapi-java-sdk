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
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsListCusOpsEventsRequest extends RpcAcsRequest<OpsListCusOpsEventsResponse> {
	   

	private String timeEnd;

	private String eventId;

	private String targetHostId;

	private String vmName;

	private List<String> diskIdLists;

	private Integer pageSize;

	private String diskId;

	private List<String> eventIdLists;

	private Long aliUid;

	private List<String> vmNameLists;

	private String opsCode;

	private List<String> opsCodeLists;

	private List<String> ncIpLists;

	private String ncIp;

	private Integer pageNo;

	private String timeStart;

	private List<String> hostIdLists;

	private String auditParamStr;
	public OpsListCusOpsEventsRequest() {
		super("Ecsops", "2016-04-01", "OpsListCusOpsEvents", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getTimeEnd() {
		return this.timeEnd;
	}

	public void setTimeEnd(String timeEnd) {
		this.timeEnd = timeEnd;
		if(timeEnd != null){
			putQueryParameter("TimeEnd", timeEnd);
		}
	}

	public String getEventId() {
		return this.eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
		if(eventId != null){
			putQueryParameter("EventId", eventId);
		}
	}

	public String getTargetHostId() {
		return this.targetHostId;
	}

	public void setTargetHostId(String targetHostId) {
		this.targetHostId = targetHostId;
		if(targetHostId != null){
			putQueryParameter("TargetHostId", targetHostId);
		}
	}

	public String getVmName() {
		return this.vmName;
	}

	public void setVmName(String vmName) {
		this.vmName = vmName;
		if(vmName != null){
			putQueryParameter("VmName", vmName);
		}
	}

	public List<String> getDiskIdLists() {
		return this.diskIdLists;
	}

	public void setDiskIdLists(List<String> diskIdLists) {
		this.diskIdLists = diskIdLists;	
		if (diskIdLists != null) {
			for (int i = 0; i < diskIdLists.size(); i++) {
				putQueryParameter("DiskIdList." + (i + 1) , diskIdLists.get(i));
			}
		}	
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getDiskId() {
		return this.diskId;
	}

	public void setDiskId(String diskId) {
		this.diskId = diskId;
		if(diskId != null){
			putQueryParameter("DiskId", diskId);
		}
	}

	public List<String> getEventIdLists() {
		return this.eventIdLists;
	}

	public void setEventIdLists(List<String> eventIdLists) {
		this.eventIdLists = eventIdLists;	
		if (eventIdLists != null) {
			for (int i = 0; i < eventIdLists.size(); i++) {
				putQueryParameter("EventIdList." + (i + 1) , eventIdLists.get(i));
			}
		}	
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
		}
	}

	public List<String> getVmNameLists() {
		return this.vmNameLists;
	}

	public void setVmNameLists(List<String> vmNameLists) {
		this.vmNameLists = vmNameLists;	
		if (vmNameLists != null) {
			for (int i = 0; i < vmNameLists.size(); i++) {
				putQueryParameter("VmNameList." + (i + 1) , vmNameLists.get(i));
			}
		}	
	}

	public String getOpsCode() {
		return this.opsCode;
	}

	public void setOpsCode(String opsCode) {
		this.opsCode = opsCode;
		if(opsCode != null){
			putQueryParameter("OpsCode", opsCode);
		}
	}

	public List<String> getOpsCodeLists() {
		return this.opsCodeLists;
	}

	public void setOpsCodeLists(List<String> opsCodeLists) {
		this.opsCodeLists = opsCodeLists;	
		if (opsCodeLists != null) {
			for (int i = 0; i < opsCodeLists.size(); i++) {
				putQueryParameter("OpsCodeList." + (i + 1) , opsCodeLists.get(i));
			}
		}	
	}

	public List<String> getNcIpLists() {
		return this.ncIpLists;
	}

	public void setNcIpLists(List<String> ncIpLists) {
		this.ncIpLists = ncIpLists;	
		if (ncIpLists != null) {
			for (int i = 0; i < ncIpLists.size(); i++) {
				putQueryParameter("NcIpList." + (i + 1) , ncIpLists.get(i));
			}
		}	
	}

	public String getNcIp() {
		return this.ncIp;
	}

	public void setNcIp(String ncIp) {
		this.ncIp = ncIp;
		if(ncIp != null){
			putQueryParameter("NcIp", ncIp);
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
		}
	}

	public String getTimeStart() {
		return this.timeStart;
	}

	public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
		if(timeStart != null){
			putQueryParameter("TimeStart", timeStart);
		}
	}

	public List<String> getHostIdLists() {
		return this.hostIdLists;
	}

	public void setHostIdLists(List<String> hostIdLists) {
		this.hostIdLists = hostIdLists;	
		if (hostIdLists != null) {
			for (int i = 0; i < hostIdLists.size(); i++) {
				putQueryParameter("HostIdList." + (i + 1) , hostIdLists.get(i));
			}
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
	public Class<OpsListCusOpsEventsResponse> getResponseClass() {
		return OpsListCusOpsEventsResponse.class;
	}

}
