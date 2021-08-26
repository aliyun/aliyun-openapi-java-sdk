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
		describeVulListResponse.setCurrentPage(_ctx.integerValue("DescribeVulListResponse.CurrentPage"));
		describeVulListResponse.setPageSize(_ctx.integerValue("DescribeVulListResponse.PageSize"));
		describeVulListResponse.setTotalCount(_ctx.integerValue("DescribeVulListResponse.TotalCount"));

		List<VulRecord> vulRecords = new ArrayList<VulRecord>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVulListResponse.VulRecords.Length"); i++) {
			VulRecord vulRecord = new VulRecord();
			vulRecord.setStatus(_ctx.integerValue("DescribeVulListResponse.VulRecords["+ i +"].Status"));
			vulRecord.setType(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Type"));
			vulRecord.setModifyTs(_ctx.longValue("DescribeVulListResponse.VulRecords["+ i +"].ModifyTs"));
			vulRecord.setDesktopName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].DesktopName"));
			vulRecord.setResultCode(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ResultCode"));
			vulRecord.setTag(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Tag"));
			vulRecord.setDesktopId(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].DesktopId"));
			vulRecord.setRelated(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Related"));
			vulRecord.setLastTs(_ctx.longValue("DescribeVulListResponse.VulRecords["+ i +"].LastTs"));
			vulRecord.setFirstTs(_ctx.longValue("DescribeVulListResponse.VulRecords["+ i +"].FirstTs"));
			vulRecord.setNecessity(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Necessity"));
			vulRecord.setRepairTs(_ctx.longValue("DescribeVulListResponse.VulRecords["+ i +"].RepairTs"));
			vulRecord.setOnline(_ctx.booleanValue("DescribeVulListResponse.VulRecords["+ i +"].Online"));
			vulRecord.setResultMessage(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ResultMessage"));
			vulRecord.setOsVersion(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].OsVersion"));
			vulRecord.setAliasName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].AliasName"));
			vulRecord.setName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].Name"));

			ExtendContentJson extendContentJson = new ExtendContentJson();

			List<RpmEntity> rpmEntityList = new ArrayList<RpmEntity>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList.Length"); j++) {
				RpmEntity rpmEntity = new RpmEntity();
				rpmEntity.setPath(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].Path"));
				rpmEntity.setUpdateCmd(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].UpdateCmd"));
				rpmEntity.setName(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].Name"));
				rpmEntity.setFullVersion(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].FullVersion"));
				rpmEntity.setMatchDetail(_ctx.stringValue("DescribeVulListResponse.VulRecords["+ i +"].ExtendContentJson.RpmEntityList["+ j +"].MatchDetail"));

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