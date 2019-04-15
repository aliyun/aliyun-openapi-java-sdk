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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeVulListResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeVulListResponse.VulRecord;
import com.aliyuncs.aegis.model.v20161111.DescribeVulListResponse.VulRecord.ExtendContentJson;
import com.aliyuncs.aegis.model.v20161111.DescribeVulListResponse.VulRecord.ExtendContentJson.Necessity;
import com.aliyuncs.aegis.model.v20161111.DescribeVulListResponse.VulRecord.ExtendContentJson.RpmEntityListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVulListResponseUnmarshaller {

	public static DescribeVulListResponse unmarshall(DescribeVulListResponse describeVulListResponse, UnmarshallerContext context) {
		
		describeVulListResponse.setRequestId(context.stringValue("DescribeVulListResponse.RequestId"));
		describeVulListResponse.setPageSize(context.integerValue("DescribeVulListResponse.PageSize"));
		describeVulListResponse.setCurrentPage(context.integerValue("DescribeVulListResponse.CurrentPage"));
		describeVulListResponse.setTotalCount(context.integerValue("DescribeVulListResponse.TotalCount"));

		List<VulRecord> vulRecords = new ArrayList<VulRecord>();
		for (int i = 0; i < context.lengthValue("DescribeVulListResponse.VulRecords.Length"); i++) {
			VulRecord vulRecord = new VulRecord();
			vulRecord.setPrimaryId(context.longValue("DescribeVulListResponse.VulRecords["+ i +"].PrimaryId"));
			vulRecord.setUuid(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Uuid"));
			vulRecord.setName(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Name"));
			vulRecord.setTag(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Tag"));
			vulRecord.setAliasName(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].AliasName"));
			vulRecord.setRecordId(context.longValue("DescribeVulListResponse.VulRecords["+ i +"].RecordId"));
			vulRecord.setType(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Type"));
			vulRecord.setLevel(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Level"));
			vulRecord.setProduct(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Product"));
			vulRecord.setFirstTs(context.longValue("DescribeVulListResponse.VulRecords["+ i +"].FirstTs"));
			vulRecord.setLastTs(context.longValue("DescribeVulListResponse.VulRecords["+ i +"].LastTs"));
			vulRecord.setRepairTs(context.longValue("DescribeVulListResponse.VulRecords["+ i +"].RepairTs"));
			vulRecord.setStatus(context.integerValue("DescribeVulListResponse.VulRecords["+ i +"].Status"));
			vulRecord.setRelated(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Related"));
			vulRecord.setResultCode(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ResultCode"));
			vulRecord.setResultMessage(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ResultMessage"));
			vulRecord.setModifyTs(context.longValue("DescribeVulListResponse.VulRecords["+ i +"].ModifyTs"));
			vulRecord.setNecessity(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Necessity"));
			vulRecord.setGroupId(context.integerValue("DescribeVulListResponse.VulRecords["+ i +"].GroupId"));
			vulRecord.setInstanceId(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].InstanceId"));
			vulRecord.setInstanceName(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].InstanceName"));
			vulRecord.setInternetIp(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].InternetIp"));
			vulRecord.setIntranetIp(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].IntranetIp"));
			vulRecord.setIp(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Ip"));
			vulRecord.setOsVersion(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].OsVersion"));
			vulRecord.setNeedReboot(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].NeedReboot"));

			ExtendContentJson extendContentJson = new ExtendContentJson();
			extendContentJson.setOs(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Os"));
			extendContentJson.setOsRelease(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.OsRelease"));
			extendContentJson.setStatus(context.integerValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Status"));
			extendContentJson.setLastTs(context.longValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.LastTs"));
			extendContentJson.setAliasName(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.AliasName"));
			extendContentJson.setTag(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Tag"));
			extendContentJson.setPrimaryId(context.longValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.PrimaryId"));
			extendContentJson.setLevel(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Level"));
			extendContentJson.setAbsolutePath(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.AbsolutePath"));
			extendContentJson.setTarget(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Target"));
			extendContentJson.setProof(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Proof"));
			extendContentJson.setReason(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Reason"));

			List<String> cveList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.cveList.Length"); j++) {
				cveList.add(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.cveList["+ j +"]"));
			}
			extendContentJson.setCveList(cveList);

			Necessity necessity = new Necessity();
			necessity.setCvss_factor(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Necessity.Cvss_factor"));
			necessity.setGmt_create(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Necessity.Gmt_create"));
			necessity.setStatus(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Necessity.Status"));
			necessity.setEnviroment_factor(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Necessity.Enviroment_factor"));
			necessity.setAssets_factor(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Necessity.Assets_factor"));
			necessity.setIs_calc(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Necessity.Is_calc"));
			necessity.setTotal_score(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Necessity.Total_score"));
			necessity.setTime_factor(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.Necessity.Time_factor"));
			extendContentJson.setNecessity(necessity);

			List<RpmEntityListItem> rpmEntityList = new ArrayList<RpmEntityListItem>();
			for (int j = 0; j < context.lengthValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList.Length"); j++) {
				RpmEntityListItem rpmEntityListItem = new RpmEntityListItem();
				rpmEntityListItem.setFullVersion(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].FullVersion"));
				rpmEntityListItem.setMatchDetail(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].MatchDetail"));
				rpmEntityListItem.setName(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].Name"));
				rpmEntityListItem.setPath(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].Path"));
				rpmEntityListItem.setUpdateCmd(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].UpdateCmd"));
				rpmEntityListItem.setVersion(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].Version"));

				rpmEntityList.add(rpmEntityListItem);
			}
			extendContentJson.setRpmEntityList(rpmEntityList);
			vulRecord.setExtendContentJson(extendContentJson);

			vulRecords.add(vulRecord);
		}
		describeVulListResponse.setVulRecords(vulRecords);
	 
	 	return describeVulListResponse;
	}
}