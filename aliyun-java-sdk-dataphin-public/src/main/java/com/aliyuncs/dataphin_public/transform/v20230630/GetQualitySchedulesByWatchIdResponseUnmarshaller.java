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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetQualitySchedulesByWatchIdResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualitySchedulesByWatchIdResponse.QualitySchedule;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQualitySchedulesByWatchIdResponseUnmarshaller {

	public static GetQualitySchedulesByWatchIdResponse unmarshall(GetQualitySchedulesByWatchIdResponse getQualitySchedulesByWatchIdResponse, UnmarshallerContext _ctx) {
		
		getQualitySchedulesByWatchIdResponse.setRequestId(_ctx.stringValue("GetQualitySchedulesByWatchIdResponse.RequestId"));
		getQualitySchedulesByWatchIdResponse.setSuccess(_ctx.booleanValue("GetQualitySchedulesByWatchIdResponse.Success"));
		getQualitySchedulesByWatchIdResponse.setHttpStatusCode(_ctx.integerValue("GetQualitySchedulesByWatchIdResponse.HttpStatusCode"));
		getQualitySchedulesByWatchIdResponse.setCode(_ctx.stringValue("GetQualitySchedulesByWatchIdResponse.Code"));
		getQualitySchedulesByWatchIdResponse.setMessage(_ctx.stringValue("GetQualitySchedulesByWatchIdResponse.Message"));

		List<QualitySchedule> qualityScheduleList = new ArrayList<QualitySchedule>();
		for (int i = 0; i < _ctx.lengthValue("GetQualitySchedulesByWatchIdResponse.QualityScheduleList.Length"); i++) {
			QualitySchedule qualitySchedule = new QualitySchedule();
			qualitySchedule.setWatchId(_ctx.longValue("GetQualitySchedulesByWatchIdResponse.QualityScheduleList["+ i +"].WatchId"));
			qualitySchedule.setId(_ctx.longValue("GetQualitySchedulesByWatchIdResponse.QualityScheduleList["+ i +"].Id"));
			qualitySchedule.setName(_ctx.stringValue("GetQualitySchedulesByWatchIdResponse.QualityScheduleList["+ i +"].Name"));
			qualitySchedule.setIsRefByRule(_ctx.booleanValue("GetQualitySchedulesByWatchIdResponse.QualityScheduleList["+ i +"].IsRefByRule"));
			qualitySchedule.setType(_ctx.stringValue("GetQualitySchedulesByWatchIdResponse.QualityScheduleList["+ i +"].Type"));
			qualitySchedule.setPartitionType(_ctx.stringValue("GetQualitySchedulesByWatchIdResponse.QualityScheduleList["+ i +"].PartitionType"));
			qualitySchedule.setPartitionExpression(_ctx.stringValue("GetQualitySchedulesByWatchIdResponse.QualityScheduleList["+ i +"].PartitionExpression"));
			qualitySchedule.setTriggerType(_ctx.stringValue("GetQualitySchedulesByWatchIdResponse.QualityScheduleList["+ i +"].TriggerType"));
			qualitySchedule.setStaticTaskTriggerType(_ctx.stringValue("GetQualitySchedulesByWatchIdResponse.QualityScheduleList["+ i +"].StaticTaskTriggerType"));
			qualitySchedule.setPeriodScheduleIntervalType(_ctx.stringValue("GetQualitySchedulesByWatchIdResponse.QualityScheduleList["+ i +"].PeriodScheduleIntervalType"));
			qualitySchedule.setCronExpression(_ctx.stringValue("GetQualitySchedulesByWatchIdResponse.QualityScheduleList["+ i +"].CronExpression"));
			qualitySchedule.setValidatePartitionType(_ctx.stringValue("GetQualitySchedulesByWatchIdResponse.QualityScheduleList["+ i +"].ValidatePartitionType"));
			qualitySchedule.setCreator(_ctx.stringValue("GetQualitySchedulesByWatchIdResponse.QualityScheduleList["+ i +"].Creator"));
			qualitySchedule.setModifier(_ctx.stringValue("GetQualitySchedulesByWatchIdResponse.QualityScheduleList["+ i +"].Modifier"));
			qualitySchedule.setCreateTime(_ctx.stringValue("GetQualitySchedulesByWatchIdResponse.QualityScheduleList["+ i +"].CreateTime"));
			qualitySchedule.setModifyTime(_ctx.stringValue("GetQualitySchedulesByWatchIdResponse.QualityScheduleList["+ i +"].ModifyTime"));

			List<String> triggerNodeList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetQualitySchedulesByWatchIdResponse.QualityScheduleList["+ i +"].TriggerNodeList.Length"); j++) {
				triggerNodeList.add(_ctx.stringValue("GetQualitySchedulesByWatchIdResponse.QualityScheduleList["+ i +"].TriggerNodeList["+ j +"]"));
			}
			qualitySchedule.setTriggerNodeList(triggerNodeList);

			List<String> periodScheduleParamList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetQualitySchedulesByWatchIdResponse.QualityScheduleList["+ i +"].PeriodScheduleParamList.Length"); j++) {
				periodScheduleParamList.add(_ctx.stringValue("GetQualitySchedulesByWatchIdResponse.QualityScheduleList["+ i +"].PeriodScheduleParamList["+ j +"]"));
			}
			qualitySchedule.setPeriodScheduleParamList(periodScheduleParamList);

			qualityScheduleList.add(qualitySchedule);
		}
		getQualitySchedulesByWatchIdResponse.setQualityScheduleList(qualityScheduleList);
	 
	 	return getQualitySchedulesByWatchIdResponse;
	}
}