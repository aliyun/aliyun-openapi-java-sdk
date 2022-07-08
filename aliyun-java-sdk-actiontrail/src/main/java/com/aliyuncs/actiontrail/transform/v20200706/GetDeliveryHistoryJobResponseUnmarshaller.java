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

package com.aliyuncs.actiontrail.transform.v20200706;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.actiontrail.model.v20200706.GetDeliveryHistoryJobResponse;
import com.aliyuncs.actiontrail.model.v20200706.GetDeliveryHistoryJobResponse.StatusItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeliveryHistoryJobResponseUnmarshaller {

	public static GetDeliveryHistoryJobResponse unmarshall(GetDeliveryHistoryJobResponse getDeliveryHistoryJobResponse, UnmarshallerContext _ctx) {
		
		getDeliveryHistoryJobResponse.setRequestId(_ctx.stringValue("GetDeliveryHistoryJobResponse.RequestId"));
		getDeliveryHistoryJobResponse.setJobStatus(_ctx.integerValue("GetDeliveryHistoryJobResponse.JobStatus"));
		getDeliveryHistoryJobResponse.setCreatedTime(_ctx.stringValue("GetDeliveryHistoryJobResponse.CreatedTime"));
		getDeliveryHistoryJobResponse.setEndTime(_ctx.stringValue("GetDeliveryHistoryJobResponse.EndTime"));
		getDeliveryHistoryJobResponse.setStartTime(_ctx.stringValue("GetDeliveryHistoryJobResponse.StartTime"));
		getDeliveryHistoryJobResponse.setTrailName(_ctx.stringValue("GetDeliveryHistoryJobResponse.TrailName"));
		getDeliveryHistoryJobResponse.setUpdatedTime(_ctx.stringValue("GetDeliveryHistoryJobResponse.UpdatedTime"));
		getDeliveryHistoryJobResponse.setJobId(_ctx.longValue("GetDeliveryHistoryJobResponse.JobId"));
		getDeliveryHistoryJobResponse.setHomeRegion(_ctx.stringValue("GetDeliveryHistoryJobResponse.HomeRegion"));

		List<StatusItem> status = new ArrayList<StatusItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDeliveryHistoryJobResponse.Status.Length"); i++) {
			StatusItem statusItem = new StatusItem();
			statusItem.setStatus(_ctx.integerValue("GetDeliveryHistoryJobResponse.Status["+ i +"].Status"));
			statusItem.setRegion(_ctx.stringValue("GetDeliveryHistoryJobResponse.Status["+ i +"].Region"));

			status.add(statusItem);
		}
		getDeliveryHistoryJobResponse.setStatus(status);
	 
	 	return getDeliveryHistoryJobResponse;
	}
}