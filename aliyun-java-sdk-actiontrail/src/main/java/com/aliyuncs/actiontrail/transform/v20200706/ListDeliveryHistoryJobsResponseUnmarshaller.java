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

import com.aliyuncs.actiontrail.model.v20200706.ListDeliveryHistoryJobsResponse;
import com.aliyuncs.actiontrail.model.v20200706.ListDeliveryHistoryJobsResponse.DeliveryHistoryJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeliveryHistoryJobsResponseUnmarshaller {

	public static ListDeliveryHistoryJobsResponse unmarshall(ListDeliveryHistoryJobsResponse listDeliveryHistoryJobsResponse, UnmarshallerContext _ctx) {
		
		listDeliveryHistoryJobsResponse.setRequestId(_ctx.stringValue("ListDeliveryHistoryJobsResponse.RequestId"));
		listDeliveryHistoryJobsResponse.setTotalCount(_ctx.integerValue("ListDeliveryHistoryJobsResponse.TotalCount"));
		listDeliveryHistoryJobsResponse.setPageNumber(_ctx.integerValue("ListDeliveryHistoryJobsResponse.PageNumber"));
		listDeliveryHistoryJobsResponse.setPageSize(_ctx.integerValue("ListDeliveryHistoryJobsResponse.PageSize"));

		List<DeliveryHistoryJob> deliveryHistoryJobs = new ArrayList<DeliveryHistoryJob>();
		for (int i = 0; i < _ctx.lengthValue("ListDeliveryHistoryJobsResponse.DeliveryHistoryJobs.Length"); i++) {
			DeliveryHistoryJob deliveryHistoryJob = new DeliveryHistoryJob();
			deliveryHistoryJob.setTrailName(_ctx.stringValue("ListDeliveryHistoryJobsResponse.DeliveryHistoryJobs["+ i +"].TrailName"));
			deliveryHistoryJob.setCreatedTime(_ctx.stringValue("ListDeliveryHistoryJobsResponse.DeliveryHistoryJobs["+ i +"].CreatedTime"));
			deliveryHistoryJob.setUpdatedTime(_ctx.stringValue("ListDeliveryHistoryJobsResponse.DeliveryHistoryJobs["+ i +"].UpdatedTime"));
			deliveryHistoryJob.setHomeRegion(_ctx.stringValue("ListDeliveryHistoryJobsResponse.DeliveryHistoryJobs["+ i +"].HomeRegion"));
			deliveryHistoryJob.setStartTime(_ctx.stringValue("ListDeliveryHistoryJobsResponse.DeliveryHistoryJobs["+ i +"].StartTime"));
			deliveryHistoryJob.setEndTime(_ctx.stringValue("ListDeliveryHistoryJobsResponse.DeliveryHistoryJobs["+ i +"].EndTime"));
			deliveryHistoryJob.setJobId(_ctx.longValue("ListDeliveryHistoryJobsResponse.DeliveryHistoryJobs["+ i +"].JobId"));
			deliveryHistoryJob.setJobStatus(_ctx.integerValue("ListDeliveryHistoryJobsResponse.DeliveryHistoryJobs["+ i +"].JobStatus"));

			deliveryHistoryJobs.add(deliveryHistoryJob);
		}
		listDeliveryHistoryJobsResponse.setDeliveryHistoryJobs(deliveryHistoryJobs);
	 
	 	return listDeliveryHistoryJobsResponse;
	}
}