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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.GetTopicResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetTopicResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTopicResponseUnmarshaller {

	public static GetTopicResponse unmarshall(GetTopicResponse getTopicResponse, UnmarshallerContext _ctx) {
		
		getTopicResponse.setRequestId(_ctx.stringValue("GetTopicResponse.RequestId"));
		getTopicResponse.setHttpStatusCode(_ctx.integerValue("GetTopicResponse.HttpStatusCode"));
		getTopicResponse.setErrorMessage(_ctx.stringValue("GetTopicResponse.ErrorMessage"));
		getTopicResponse.setErrorCode(_ctx.stringValue("GetTopicResponse.ErrorCode"));
		getTopicResponse.setSuccess(_ctx.booleanValue("GetTopicResponse.Success"));

		Data data = new Data();
		data.setOwner(_ctx.stringValue("GetTopicResponse.Data.Owner"));
		data.setTopicName(_ctx.stringValue("GetTopicResponse.Data.TopicName"));
		data.setBaselineStatus(_ctx.stringValue("GetTopicResponse.Data.BaselineStatus"));
		data.setProjectId(_ctx.longValue("GetTopicResponse.Data.ProjectId"));
		data.setNextAlertTime(_ctx.longValue("GetTopicResponse.Data.NextAlertTime"));
		data.setInstanceId(_ctx.longValue("GetTopicResponse.Data.InstanceId"));
		data.setFixTime(_ctx.longValue("GetTopicResponse.Data.FixTime"));
		data.setBaselineInGroupId(_ctx.integerValue("GetTopicResponse.Data.BaselineInGroupId"));
		data.setBaselineBuffer(_ctx.longValue("GetTopicResponse.Data.BaselineBuffer"));
		data.setTopicType(_ctx.stringValue("GetTopicResponse.Data.TopicType"));
		data.setTopicStatus(_ctx.stringValue("GetTopicResponse.Data.TopicStatus"));
		data.setHappenTime(_ctx.longValue("GetTopicResponse.Data.HappenTime"));
		data.setDealTime(_ctx.longValue("GetTopicResponse.Data.DealTime"));
		data.setDealUser(_ctx.stringValue("GetTopicResponse.Data.DealUser"));
		data.setBaselineName(_ctx.stringValue("GetTopicResponse.Data.BaselineName"));
		data.setBaselineId(_ctx.longValue("GetTopicResponse.Data.BaselineId"));
		data.setNodeName(_ctx.stringValue("GetTopicResponse.Data.NodeName"));
		data.setAlertTime(_ctx.longValue("GetTopicResponse.Data.AlertTime"));
		data.setBuffer(_ctx.longValue("GetTopicResponse.Data.Buffer"));
		data.setAssigner(_ctx.stringValue("GetTopicResponse.Data.Assigner"));
		data.setTopicId(_ctx.longValue("GetTopicResponse.Data.TopicId"));
		data.setAddTime(_ctx.longValue("GetTopicResponse.Data.AddTime"));
		data.setNodeId(_ctx.longValue("GetTopicResponse.Data.NodeId"));
		getTopicResponse.setData(data);
	 
	 	return getTopicResponse;
	}
}