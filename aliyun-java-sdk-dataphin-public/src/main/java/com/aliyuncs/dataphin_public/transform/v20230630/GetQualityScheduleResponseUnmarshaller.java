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

import com.aliyuncs.dataphin_public.model.v20230630.GetQualityScheduleResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityScheduleResponse.QualityScheduleInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQualityScheduleResponseUnmarshaller {

	public static GetQualityScheduleResponse unmarshall(GetQualityScheduleResponse getQualityScheduleResponse, UnmarshallerContext _ctx) {
		
		getQualityScheduleResponse.setRequestId(_ctx.stringValue("GetQualityScheduleResponse.RequestId"));
		getQualityScheduleResponse.setSuccess(_ctx.booleanValue("GetQualityScheduleResponse.Success"));
		getQualityScheduleResponse.setHttpStatusCode(_ctx.integerValue("GetQualityScheduleResponse.HttpStatusCode"));
		getQualityScheduleResponse.setCode(_ctx.stringValue("GetQualityScheduleResponse.Code"));
		getQualityScheduleResponse.setMessage(_ctx.stringValue("GetQualityScheduleResponse.Message"));

		QualityScheduleInfo qualityScheduleInfo = new QualityScheduleInfo();
		qualityScheduleInfo.setWatchId(_ctx.longValue("GetQualityScheduleResponse.QualityScheduleInfo.WatchId"));
		qualityScheduleInfo.setId(_ctx.longValue("GetQualityScheduleResponse.QualityScheduleInfo.Id"));
		qualityScheduleInfo.setName(_ctx.stringValue("GetQualityScheduleResponse.QualityScheduleInfo.Name"));
		qualityScheduleInfo.setIsRefByRule(_ctx.booleanValue("GetQualityScheduleResponse.QualityScheduleInfo.IsRefByRule"));
		qualityScheduleInfo.setType(_ctx.stringValue("GetQualityScheduleResponse.QualityScheduleInfo.Type"));
		qualityScheduleInfo.setPartitionType(_ctx.stringValue("GetQualityScheduleResponse.QualityScheduleInfo.PartitionType"));
		qualityScheduleInfo.setPartitionExpression(_ctx.stringValue("GetQualityScheduleResponse.QualityScheduleInfo.PartitionExpression"));
		qualityScheduleInfo.setTriggerType(_ctx.stringValue("GetQualityScheduleResponse.QualityScheduleInfo.TriggerType"));
		qualityScheduleInfo.setStaticTaskTriggerType(_ctx.stringValue("GetQualityScheduleResponse.QualityScheduleInfo.StaticTaskTriggerType"));
		qualityScheduleInfo.setPeriodScheduleIntervalType(_ctx.stringValue("GetQualityScheduleResponse.QualityScheduleInfo.PeriodScheduleIntervalType"));
		qualityScheduleInfo.setCronExpression(_ctx.stringValue("GetQualityScheduleResponse.QualityScheduleInfo.CronExpression"));
		qualityScheduleInfo.setValidatePartitionType(_ctx.stringValue("GetQualityScheduleResponse.QualityScheduleInfo.ValidatePartitionType"));
		qualityScheduleInfo.setCreator(_ctx.stringValue("GetQualityScheduleResponse.QualityScheduleInfo.Creator"));
		qualityScheduleInfo.setModifier(_ctx.stringValue("GetQualityScheduleResponse.QualityScheduleInfo.Modifier"));
		qualityScheduleInfo.setCreateTime(_ctx.stringValue("GetQualityScheduleResponse.QualityScheduleInfo.CreateTime"));
		qualityScheduleInfo.setModifyTime(_ctx.stringValue("GetQualityScheduleResponse.QualityScheduleInfo.ModifyTime"));

		List<String> triggerNodeList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityScheduleResponse.QualityScheduleInfo.TriggerNodeList.Length"); i++) {
			triggerNodeList.add(_ctx.stringValue("GetQualityScheduleResponse.QualityScheduleInfo.TriggerNodeList["+ i +"]"));
		}
		qualityScheduleInfo.setTriggerNodeList(triggerNodeList);

		List<String> periodScheduleParamList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityScheduleResponse.QualityScheduleInfo.PeriodScheduleParamList.Length"); i++) {
			periodScheduleParamList.add(_ctx.stringValue("GetQualityScheduleResponse.QualityScheduleInfo.PeriodScheduleParamList["+ i +"]"));
		}
		qualityScheduleInfo.setPeriodScheduleParamList(periodScheduleParamList);
		getQualityScheduleResponse.setQualityScheduleInfo(qualityScheduleInfo);
	 
	 	return getQualityScheduleResponse;
	}
}