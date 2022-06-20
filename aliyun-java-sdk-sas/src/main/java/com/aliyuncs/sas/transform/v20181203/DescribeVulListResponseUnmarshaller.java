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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeVulListResponse;
import com.aliyuncs.sas.model.v20181203.DescribeVulListResponse.VulRecord;
import com.aliyuncs.sas.model.v20181203.DescribeVulListResponse.VulRecord.ExtendContentJson;
import com.aliyuncs.sas.model.v20181203.DescribeVulListResponse.VulRecord.ExtendContentJson.Necessity;
import com.aliyuncs.sas.model.v20181203.DescribeVulListResponse.VulRecord.ExtendContentJson.RpmEntity;
import com.aliyuncs.sas.model.v20181203.DescribeVulListResponse.VulRecord.ProcessInfo;
import com.aliyuncs.sas.model.v20181203.DescribeVulListResponse.VulRecord.ProcessInfo.Process;
import com.aliyuncs.sas.model.v20181203.DescribeVulListResponse.VulRecord.ProcessInfo.Process.SubProcess;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVulListResponseUnmarshaller {

	public static DescribeVulListResponse unmarshall(DescribeVulListResponse describeVulListResponse, UnmarshallerContext _ctx) {
		
		describeVulListResponse.setRequestId(_ctx.stringValue("DescribeVulListResponse.RequestId"));
		describeVulListResponse.setCurrentPage(_ctx.integerValue("DescribeVulListResponse.CurrentPage"));
		describeVulListResponse.setPageSize(_ctx.integerValue("DescribeVulListResponse.PageSize"));
		describeVulListResponse.setTotalCount(_ctx.integerValue("DescribeVulListResponse.TotalCount"));

		List<VulRecord> vulRecords = new ArrayList<VulRecord>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVulListResponse.VulRecords.Length"); i++) {
			VulRecord vulRecord = new VulRecord();
			vulRecord.setStatus(_ctx.integerValue("DescribeVulListResponse.VulRecords["+ i +"].Status"));
			vulRecord.setType(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Type"));
			vulRecord.setModifyTs(_ctx.longValue("DescribeVulListResponse.VulRecords["+ i +"].ModifyTs"));
			vulRecord.setInternetIp(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].InternetIp"));
			vulRecord.setRecordId(_ctx.longValue("DescribeVulListResponse.VulRecords["+ i +"].RecordId"));
			vulRecord.setContainerImageId(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ContainerImageId"));
			vulRecord.setPrimaryId(_ctx.longValue("DescribeVulListResponse.VulRecords["+ i +"].PrimaryId"));
			vulRecord.setTag(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Tag"));
			vulRecord.setK8sClusterId(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].K8sClusterId"));
			vulRecord.setContainerImageName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ContainerImageName"));
			vulRecord.setK8sNodeId(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].K8sNodeId"));
			vulRecord.setInstanceName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].InstanceName"));
			vulRecord.setContainerInnerPath(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ContainerInnerPath"));
			vulRecord.setOnline(_ctx.booleanValue("DescribeVulListResponse.VulRecords["+ i +"].Online"));
			vulRecord.setOsVersion(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].OsVersion"));
			vulRecord.setName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Name"));
			vulRecord.setCanFix(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].CanFix"));
			vulRecord.setProgress(_ctx.integerValue("DescribeVulListResponse.VulRecords["+ i +"].Progress"));
			vulRecord.setIp(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Ip"));
			vulRecord.setNeedReboot(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].NeedReboot"));
			vulRecord.setResultCode(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ResultCode"));
			vulRecord.setInstanceId(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].InstanceId"));
			vulRecord.setRelated(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Related"));
			vulRecord.setIntranetIp(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].IntranetIp"));
			vulRecord.setLastTs(_ctx.longValue("DescribeVulListResponse.VulRecords["+ i +"].LastTs"));
			vulRecord.setFirstTs(_ctx.longValue("DescribeVulListResponse.VulRecords["+ i +"].FirstTs"));
			vulRecord.setRegionId(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].RegionId"));
			vulRecord.setNecessity(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Necessity"));
			vulRecord.setRepairTs(_ctx.longValue("DescribeVulListResponse.VulRecords["+ i +"].RepairTs"));
			vulRecord.setUuid(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Uuid"));
			vulRecord.setK8sPodName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].K8sPodName"));
			vulRecord.setContainerId(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ContainerId"));
			vulRecord.setGroupId(_ctx.integerValue("DescribeVulListResponse.VulRecords["+ i +"].GroupId"));
			vulRecord.setResultMessage(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ResultMessage"));
			vulRecord.setK8sNamespace(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].K8sNamespace"));
			vulRecord.setAliasName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].AliasName"));
			vulRecord.setK8sNodeName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].K8sNodeName"));
			vulRecord.setContainerName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ContainerName"));
			vulRecord.setLevel(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Level"));
			vulRecord.setBind(_ctx.booleanValue("DescribeVulListResponse.VulRecords["+ i +"].Bind"));
			vulRecord.setOsName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].OsName"));
			vulRecord.setAuthVersion(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].AuthVersion"));

			ExtendContentJson extendContentJson = new ExtendContentJson();
			extendContentJson.setStatus(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Status"));
			extendContentJson.setEffect(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Effect"));
			extendContentJson.setEmgProof(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.EmgProof"));
			extendContentJson.setOwasp(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Owasp"));
			extendContentJson.setCwe(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Cwe"));
			extendContentJson.setIp(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Ip"));
			extendContentJson.setPrimaryId(_ctx.longValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.PrimaryId"));
			extendContentJson.setOs(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Os"));
			extendContentJson.setTag(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Tag"));
			extendContentJson.setReference(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Reference"));
			extendContentJson.setWasc(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Wasc"));
			extendContentJson.setLastTs(_ctx.longValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.LastTs"));
			extendContentJson.setVulType(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.VulType"));
			extendContentJson.setDescription(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Description"));
			extendContentJson.setOsRelease(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.OsRelease"));
			extendContentJson.setTitle(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Title"));
			extendContentJson.setAliasName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.AliasName"));
			extendContentJson.setSolution(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Solution"));
			extendContentJson.setTarget(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Target"));
			extendContentJson.setAbsolutePath(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.AbsolutePath"));
			extendContentJson.setProof(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Proof"));
			extendContentJson.setReason(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Reason"));

			List<String> cveList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.cveList.Length"); j++) {
				cveList.add(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.cveList["+ j +"]"));
			}
			extendContentJson.setCveList(cveList);

			Necessity necessity = new Necessity();
			necessity.setStatus(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Necessity.Status"));
			necessity.setGmt_create(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Necessity.Gmt_create"));
			necessity.setTime_factor(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Necessity.Time_factor"));
			necessity.setEnviroment_factor(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Necessity.Enviroment_factor"));
			necessity.setIs_calc(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Necessity.Is_calc"));
			necessity.setTotal_score(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Necessity.Total_score"));
			necessity.setCvss_factor(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Necessity.Cvss_factor"));
			necessity.setAssets_factor(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Necessity.Assets_factor"));
			extendContentJson.setNecessity(necessity);

			List<RpmEntity> rpmEntityList = new ArrayList<RpmEntity>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList.Length"); j++) {
				RpmEntity rpmEntity = new RpmEntity();
				rpmEntity.setFullVersion(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].FullVersion"));
				rpmEntity.setVersion(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].Version"));
				rpmEntity.setMatchDetail(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].MatchDetail"));
				rpmEntity.setImageName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].ImageName"));
				rpmEntity.setPath(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].Path"));
				rpmEntity.setContainerName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].ContainerName"));
				rpmEntity.setName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].Name"));
				rpmEntity.setUpdateCmd(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].UpdateCmd"));
				rpmEntity.setPid(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].Pid"));

				List<String> matchList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].MatchList.Length"); k++) {
					matchList.add(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].MatchList["+ k +"]"));
				}
				rpmEntity.setMatchList(matchList);

				rpmEntityList.add(rpmEntity);
			}
			extendContentJson.setRpmEntityList(rpmEntityList);
			vulRecord.setExtendContentJson(extendContentJson);

			ProcessInfo processInfo = new ProcessInfo();
			processInfo.setTotalCount(_ctx.integerValue("DescribeVulListResponse.VulRecords["+ i +"].ProcessInfo.TotalCount"));
			processInfo.setGmtLastTs(_ctx.longValue("DescribeVulListResponse.VulRecords["+ i +"].ProcessInfo.GmtLastTs"));

			List<Process> processList = new ArrayList<Process>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVulListResponse.VulRecords["+ i +"].ProcessInfo.ProcessList.Length"); j++) {
				Process process = new Process();
				process.setRpm(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ProcessInfo.ProcessList["+ j +"].Rpm"));
				process.setPname(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ProcessInfo.ProcessList["+ j +"].Pname"));
				process.setPid(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ProcessInfo.ProcessList["+ j +"].Pid"));

				List<SubProcess> subProcessList = new ArrayList<SubProcess>();
				for (int k = 0; k < _ctx.lengthValue("DescribeVulListResponse.VulRecords["+ i +"].ProcessInfo.ProcessList["+ j +"].SubProcessList.Length"); k++) {
					SubProcess subProcess = new SubProcess();
					subProcess.setRpm(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ProcessInfo.ProcessList["+ j +"].SubProcessList["+ k +"].Rpm"));
					subProcess.setPname(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ProcessInfo.ProcessList["+ j +"].SubProcessList["+ k +"].Pname"));
					subProcess.setPid(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ProcessInfo.ProcessList["+ j +"].SubProcessList["+ k +"].Pid"));

					subProcessList.add(subProcess);
				}
				process.setSubProcessList(subProcessList);

				processList.add(process);
			}
			processInfo.setProcessList(processList);
			vulRecord.setProcessInfo(processInfo);

			vulRecords.add(vulRecord);
		}
		describeVulListResponse.setVulRecords(vulRecords);
	 
	 	return describeVulListResponse;
	}
}