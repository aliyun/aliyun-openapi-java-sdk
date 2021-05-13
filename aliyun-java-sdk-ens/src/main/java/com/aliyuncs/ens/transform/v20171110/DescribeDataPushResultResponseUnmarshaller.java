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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeDataPushResultResponse;
import com.aliyuncs.ens.model.v20171110.DescribeDataPushResultResponse.PushResult;
import com.aliyuncs.ens.model.v20171110.DescribeDataPushResultResponse.PushResult.StatusStat;
import com.aliyuncs.ens.model.v20171110.DescribeDataPushResultResponse.PushResult.StatusStat.RegionId;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataPushResultResponseUnmarshaller {

	public static DescribeDataPushResultResponse unmarshall(DescribeDataPushResultResponse describeDataPushResultResponse, UnmarshallerContext _ctx) {
		
		describeDataPushResultResponse.setRequestId(_ctx.stringValue("DescribeDataPushResultResponse.RequestId"));
		describeDataPushResultResponse.setPageNumber(_ctx.integerValue("DescribeDataPushResultResponse.PageNumber"));
		describeDataPushResultResponse.setPageSize(_ctx.integerValue("DescribeDataPushResultResponse.PageSize"));
		describeDataPushResultResponse.setTotalCount(_ctx.integerValue("DescribeDataPushResultResponse.TotalCount"));

		List<PushResult> pushResults = new ArrayList<PushResult>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataPushResultResponse.PushResults.Length"); i++) {
			PushResult pushResult = new PushResult();
			pushResult.setName(_ctx.stringValue("DescribeDataPushResultResponse.PushResults["+ i +"].Name"));
			pushResult.setVersion(_ctx.stringValue("DescribeDataPushResultResponse.PushResults["+ i +"].Version"));

			List<StatusStat> statusStatS = new ArrayList<StatusStat>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDataPushResultResponse.PushResults["+ i +"].StatusStatS.Length"); j++) {
				StatusStat statusStat = new StatusStat();
				statusStat.setRegionIdCount(_ctx.integerValue("DescribeDataPushResultResponse.PushResults["+ i +"].StatusStatS["+ j +"].RegionIdCount"));
				statusStat.setStatus(_ctx.stringValue("DescribeDataPushResultResponse.PushResults["+ i +"].StatusStatS["+ j +"].Status"));

				List<RegionId> regionIds = new ArrayList<RegionId>();
				for (int k = 0; k < _ctx.lengthValue("DescribeDataPushResultResponse.PushResults["+ i +"].StatusStatS["+ j +"].RegionIds.Length"); k++) {
					RegionId regionId = new RegionId();
					regionId.setRegionId(_ctx.stringValue("DescribeDataPushResultResponse.PushResults["+ i +"].StatusStatS["+ j +"].RegionIds["+ k +"].RegionId"));
					regionId.setStartTime(_ctx.stringValue("DescribeDataPushResultResponse.PushResults["+ i +"].StatusStatS["+ j +"].RegionIds["+ k +"].StartTime"));
					regionId.setStatusDescrip(_ctx.stringValue("DescribeDataPushResultResponse.PushResults["+ i +"].StatusStatS["+ j +"].RegionIds["+ k +"].StatusDescrip"));
					regionId.setUpdateTime(_ctx.stringValue("DescribeDataPushResultResponse.PushResults["+ i +"].StatusStatS["+ j +"].RegionIds["+ k +"].UpdateTime"));

					regionIds.add(regionId);
				}
				statusStat.setRegionIds(regionIds);

				statusStatS.add(statusStat);
			}
			pushResult.setStatusStatS(statusStatS);

			pushResults.add(pushResult);
		}
		describeDataPushResultResponse.setPushResults(pushResults);
	 
	 	return describeDataPushResultResponse;
	}
}