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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailadvqa_public.model.v20200515.GetAudienceMarketingInfoResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.GetAudienceMarketingInfoResponse.Data;
import com.aliyuncs.retailadvqa_public.model.v20200515.GetAudienceMarketingInfoResponse.Data.ContentItem;
import com.aliyuncs.retailadvqa_public.model.v20200515.GetAudienceMarketingInfoResponse.Data.ContentItem.SmsMarketingModel;
import com.aliyuncs.retailadvqa_public.model.v20200515.GetAudienceMarketingInfoResponse.Data.ContentItem.SmsMarketingModel.MarketingJobsItem;
import com.aliyuncs.retailadvqa_public.model.v20200515.GetAudienceMarketingInfoResponse.Data.ContentItem.SmsMarketingModel.MarketingTasksItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAudienceMarketingInfoResponseUnmarshaller {

	public static GetAudienceMarketingInfoResponse unmarshall(GetAudienceMarketingInfoResponse getAudienceMarketingInfoResponse, UnmarshallerContext _ctx) {
		
		getAudienceMarketingInfoResponse.setRequestId(_ctx.stringValue("GetAudienceMarketingInfoResponse.RequestId"));
		getAudienceMarketingInfoResponse.setSuccess(_ctx.booleanValue("GetAudienceMarketingInfoResponse.Success"));
		getAudienceMarketingInfoResponse.setErrorDesc(_ctx.stringValue("GetAudienceMarketingInfoResponse.ErrorDesc"));
		getAudienceMarketingInfoResponse.setTraceId(_ctx.stringValue("GetAudienceMarketingInfoResponse.TraceId"));
		getAudienceMarketingInfoResponse.setErrorCode(_ctx.stringValue("GetAudienceMarketingInfoResponse.ErrorCode"));

		Data data = new Data();
		data.setPageNum(_ctx.longValue("GetAudienceMarketingInfoResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("GetAudienceMarketingInfoResponse.Data.PageSize"));
		data.setTotalNum(_ctx.longValue("GetAudienceMarketingInfoResponse.Data.TotalNum"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAudienceMarketingInfoResponse.Data.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setId(_ctx.stringValue("GetAudienceMarketingInfoResponse.Data.Content["+ i +"].Id"));
			contentItem.setName(_ctx.stringValue("GetAudienceMarketingInfoResponse.Data.Content["+ i +"].Name"));
			contentItem.setGmtCreate(_ctx.stringValue("GetAudienceMarketingInfoResponse.Data.Content["+ i +"].GmtCreate"));
			contentItem.setGmtModified(_ctx.stringValue("GetAudienceMarketingInfoResponse.Data.Content["+ i +"].GmtModified"));
			contentItem.setLatestDataModifyTime(_ctx.stringValue("GetAudienceMarketingInfoResponse.Data.Content["+ i +"].LatestDataModifyTime"));
			contentItem.setLatestDataModifyStatus(_ctx.stringValue("GetAudienceMarketingInfoResponse.Data.Content["+ i +"].LatestDataModifyStatus"));
			contentItem.setNumberOfAudiences(_ctx.longValue("GetAudienceMarketingInfoResponse.Data.Content["+ i +"].NumberOfAudiences"));
			contentItem.setErrorMessage(_ctx.stringValue("GetAudienceMarketingInfoResponse.Data.Content["+ i +"].ErrorMessage"));
			contentItem.setDefaultMappingType(_ctx.stringValue("GetAudienceMarketingInfoResponse.Data.Content["+ i +"].DefaultMappingType"));

			SmsMarketingModel smsMarketingModel = new SmsMarketingModel();
			smsMarketingModel.setHasMarketingJob(_ctx.booleanValue("GetAudienceMarketingInfoResponse.Data.Content["+ i +"].SmsMarketingModel.HasMarketingJob"));
			smsMarketingModel.setHasMarketingTask(_ctx.booleanValue("GetAudienceMarketingInfoResponse.Data.Content["+ i +"].SmsMarketingModel.HasMarketingTask"));
			smsMarketingModel.setMarketingMainAudienceId(_ctx.stringValue("GetAudienceMarketingInfoResponse.Data.Content["+ i +"].SmsMarketingModel.MarketingMainAudienceId"));

			List<MarketingJobsItem> marketingJobs = new ArrayList<MarketingJobsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetAudienceMarketingInfoResponse.Data.Content["+ i +"].SmsMarketingModel.MarketingJobs.Length"); j++) {
				MarketingJobsItem marketingJobsItem = new MarketingJobsItem();
				marketingJobsItem.setJobId(_ctx.stringValue("GetAudienceMarketingInfoResponse.Data.Content["+ i +"].SmsMarketingModel.MarketingJobs["+ j +"].JobId"));
				marketingJobsItem.setJobName(_ctx.stringValue("GetAudienceMarketingInfoResponse.Data.Content["+ i +"].SmsMarketingModel.MarketingJobs["+ j +"].JobName"));
				marketingJobsItem.setStatus(_ctx.stringValue("GetAudienceMarketingInfoResponse.Data.Content["+ i +"].SmsMarketingModel.MarketingJobs["+ j +"].Status"));

				marketingJobs.add(marketingJobsItem);
			}
			smsMarketingModel.setMarketingJobs(marketingJobs);

			List<MarketingTasksItem> marketingTasks = new ArrayList<MarketingTasksItem>();
			for (int j = 0; j < _ctx.lengthValue("GetAudienceMarketingInfoResponse.Data.Content["+ i +"].SmsMarketingModel.MarketingTasks.Length"); j++) {
				MarketingTasksItem marketingTasksItem = new MarketingTasksItem();
				marketingTasksItem.setJobId(_ctx.stringValue("GetAudienceMarketingInfoResponse.Data.Content["+ i +"].SmsMarketingModel.MarketingTasks["+ j +"].JobId"));
				marketingTasksItem.setTaskId(_ctx.stringValue("GetAudienceMarketingInfoResponse.Data.Content["+ i +"].SmsMarketingModel.MarketingTasks["+ j +"].TaskId"));
				marketingTasksItem.setTaskName(_ctx.stringValue("GetAudienceMarketingInfoResponse.Data.Content["+ i +"].SmsMarketingModel.MarketingTasks["+ j +"].TaskName"));
				marketingTasksItem.setMarketType(_ctx.stringValue("GetAudienceMarketingInfoResponse.Data.Content["+ i +"].SmsMarketingModel.MarketingTasks["+ j +"].MarketType"));
				marketingTasksItem.setStatus(_ctx.stringValue("GetAudienceMarketingInfoResponse.Data.Content["+ i +"].SmsMarketingModel.MarketingTasks["+ j +"].Status"));

				marketingTasks.add(marketingTasksItem);
			}
			smsMarketingModel.setMarketingTasks(marketingTasks);
			contentItem.setSmsMarketingModel(smsMarketingModel);

			content.add(contentItem);
		}
		data.setContent(content);
		getAudienceMarketingInfoResponse.setData(data);
	 
	 	return getAudienceMarketingInfoResponse;
	}
}