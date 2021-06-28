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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeVulListResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeVulListResponse.VulRecord;
import com.aliyuncs.ecd.model.v20200930.DescribeVulListResponse.VulRecord.ExtendContentJson;
import com.aliyuncs.ecd.model.v20200930.DescribeVulListResponse.VulRecord.ExtendContentJson.RpmEntity;
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
			vulRecord.setName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Name"));
			vulRecord.setAliasName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].AliasName"));
			vulRecord.setType(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Type"));
			vulRecord.setFirstTs(_ctx.longValue("DescribeVulListResponse.VulRecords["+ i +"].FirstTs"));
			vulRecord.setLastTs(_ctx.longValue("DescribeVulListResponse.VulRecords["+ i +"].LastTs"));
			vulRecord.setModifyTs(_ctx.longValue("DescribeVulListResponse.VulRecords["+ i +"].ModifyTs"));
			vulRecord.setRepairTs(_ctx.longValue("DescribeVulListResponse.VulRecords["+ i +"].RepairTs"));
			vulRecord.setDesktopId(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].DesktopId"));
			vulRecord.setDesktopName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].DesktopName"));
			vulRecord.setNecessity(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Necessity"));
			vulRecord.setOsVersion(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].OsVersion"));
			vulRecord.setRelated(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Related"));
			vulRecord.setResultCode(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ResultCode"));
			vulRecord.setResultMessage(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ResultMessage"));
			vulRecord.setTag(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Tag"));
			vulRecord.setOnline(_ctx.booleanValue("DescribeVulListResponse.VulRecords["+ i +"].Online"));
			vulRecord.setStatus(_ctx.integerValue("DescribeVulListResponse.VulRecords["+ i +"].Status"));

			ExtendContentJson extendContentJson = new ExtendContentJson();

			List<RpmEntity> rpmEntityList = new ArrayList<RpmEntity>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList.Length"); j++) {
				RpmEntity rpmEntity = new RpmEntity();
				rpmEntity.setFullVersion(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].FullVersion"));
				rpmEntity.setMatchDetail(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].MatchDetail"));
				rpmEntity.setName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].Name"));
				rpmEntity.setPath(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].Path"));
				rpmEntity.setUpdateCmd(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].UpdateCmd"));

				rpmEntityList.add(rpmEntity);
			}
			extendContentJson.setRpmEntityList(rpmEntityList);
			vulRecord.setExtendContentJson(extendContentJson);

			vulRecords.add(vulRecord);
		}
		describeVulListResponse.setVulRecords(vulRecords);
	 
	 	return describeVulListResponse;
	}
}