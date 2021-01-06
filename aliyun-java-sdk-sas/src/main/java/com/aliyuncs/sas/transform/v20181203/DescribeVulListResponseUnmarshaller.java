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
		describeVulListResponse.setPageSize(_ctx.integerValue("DescribeVulListResponse.PageSize"));
		describeVulListResponse.setCurrentPage(_ctx.integerValue("DescribeVulListResponse.CurrentPage"));
		describeVulListResponse.setTotalCount(_ctx.integerValue("DescribeVulListResponse.TotalCount"));

		List<VulRecord> vulRecords = new ArrayList<VulRecord>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVulListResponse.VulRecords.Length"); i++) {
			VulRecord vulRecord = new VulRecord();
			vulRecord.setPrimaryId(_ctx.longValue("DescribeVulListResponse.VulRecords["+ i +"].PrimaryId"));
			vulRecord.setUuid(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Uuid"));
			vulRecord.setName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Name"));
			vulRecord.setTag(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Tag"));
			vulRecord.setType(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Type"));
			vulRecord.setAliasName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].AliasName"));
			vulRecord.setFirstTs(_ctx.longValue("DescribeVulListResponse.VulRecords["+ i +"].FirstTs"));
			vulRecord.setLastTs(_ctx.longValue("DescribeVulListResponse.VulRecords["+ i +"].LastTs"));
			vulRecord.setRepairTs(_ctx.longValue("DescribeVulListResponse.VulRecords["+ i +"].RepairTs"));
			vulRecord.setStatus(_ctx.integerValue("DescribeVulListResponse.VulRecords["+ i +"].Status"));
			vulRecord.setRelated(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Related"));
			vulRecord.setRecordId(_ctx.longValue("DescribeVulListResponse.VulRecords["+ i +"].RecordId"));
			vulRecord.setResultCode(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ResultCode"));
			vulRecord.setResultMessage(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ResultMessage"));
			vulRecord.setModifyTs(_ctx.longValue("DescribeVulListResponse.VulRecords["+ i +"].ModifyTs"));
			vulRecord.setNecessity(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Necessity"));
			vulRecord.setGroupId(_ctx.integerValue("DescribeVulListResponse.VulRecords["+ i +"].GroupId"));
			vulRecord.setInstanceId(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].InstanceId"));
			vulRecord.setInstanceName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].InstanceName"));
			vulRecord.setRegionId(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].RegionId"));
			vulRecord.setOnline(_ctx.booleanValue("DescribeVulListResponse.VulRecords["+ i +"].Online"));
			vulRecord.setLevel(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Level"));
			vulRecord.setInternetIp(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].InternetIp"));
			vulRecord.setIntranetIp(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].IntranetIp"));
			vulRecord.setIp(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Ip"));
			vulRecord.setOsVersion(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].OsVersion"));
			vulRecord.setNeedReboot(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].NeedReboot"));
			vulRecord.setProgress(_ctx.integerValue("DescribeVulListResponse.VulRecords["+ i +"].Progress"));
			vulRecord.setCanFix(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].CanFix"));
			vulRecord.setContainerImageId(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ContainerImageId"));
			vulRecord.setContainerImageName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ContainerImageName"));
			vulRecord.setContainerName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ContainerName"));
			vulRecord.setContainerInnerPath(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ContainerInnerPath"));
			vulRecord.setContainerId(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ContainerId"));
			vulRecord.setK8sNamespace(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].K8sNamespace"));
			vulRecord.setK8sClusterId(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].K8sClusterId"));
			vulRecord.setK8sNodeId(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].K8sNodeId"));
			vulRecord.setK8sPodName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].K8sPodName"));
			vulRecord.setK8sNodeName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].K8sNodeName"));

			ExtendContentJson extendContentJson = new ExtendContentJson();
			extendContentJson.setOs(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Os"));
			extendContentJson.setOsRelease(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.OsRelease"));
			extendContentJson.setStatus(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Status"));
			extendContentJson.setLastTs(_ctx.longValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.LastTs"));
			extendContentJson.setAliasName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.AliasName"));
			extendContentJson.setTag(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Tag"));
			extendContentJson.setPrimaryId(_ctx.longValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.PrimaryId"));
			extendContentJson.setAbsolutePath(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.AbsolutePath"));
			extendContentJson.setTarget(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Target"));
			extendContentJson.setEmgProof(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.EmgProof"));
			extendContentJson.setReason(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Reason"));
			extendContentJson.setTitle(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Title"));
			extendContentJson.setDescription(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Description"));
			extendContentJson.setIp(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Ip"));
			extendContentJson.setOwasp(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Owasp"));
			extendContentJson.setCwe(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Cwe"));
			extendContentJson.setWasc(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Wasc"));
			extendContentJson.setVulType(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.VulType"));
			extendContentJson.setEffect(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Effect"));
			extendContentJson.setSolution(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Solution"));
			extendContentJson.setReference(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Reference"));
			extendContentJson.setProof(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Proof"));

			List<String> cveList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.cveList.Length"); j++) {
				cveList.add(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.cveList["+ j +"]"));
			}
			extendContentJson.setCveList(cveList);

			Necessity necessity = new Necessity();
			necessity.setCvss_factor(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Necessity.Cvss_factor"));
			necessity.setGmt_create(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Necessity.Gmt_create"));
			necessity.setStatus(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Necessity.Status"));
			necessity.setEnviroment_factor(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Necessity.Enviroment_factor"));
			necessity.setAssets_factor(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Necessity.Assets_factor"));
			necessity.setIs_calc(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Necessity.Is_calc"));
			necessity.setTotal_score(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Necessity.Total_score"));
			necessity.setTime_factor(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Necessity.Time_factor"));
			extendContentJson.setNecessity(necessity);

			List<RpmEntity> rpmEntityList = new ArrayList<RpmEntity>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList.Length"); j++) {
				RpmEntity rpmEntity = new RpmEntity();
				rpmEntity.setFullVersion(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].FullVersion"));
				rpmEntity.setMatchDetail(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].MatchDetail"));
				rpmEntity.setName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].Name"));
				rpmEntity.setPath(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].Path"));
				rpmEntity.setUpdateCmd(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].UpdateCmd"));
				rpmEntity.setVersion(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].Version"));

				rpmEntityList.add(rpmEntity);
			}
			extendContentJson.setRpmEntityList(rpmEntityList);
			vulRecord.setExtendContentJson(extendContentJson);

			ProcessInfo processInfo = new ProcessInfo();
			processInfo.setGmtLastTs(_ctx.longValue("DescribeVulListResponse.VulRecords["+ i +"].ProcessInfo.GmtLastTs"));
			processInfo.setTotalCount(_ctx.integerValue("DescribeVulListResponse.VulRecords["+ i +"].ProcessInfo.TotalCount"));

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