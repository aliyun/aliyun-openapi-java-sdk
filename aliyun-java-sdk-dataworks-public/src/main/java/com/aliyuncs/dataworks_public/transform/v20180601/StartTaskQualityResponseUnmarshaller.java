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

package com.aliyuncs.dataworks_public.transform.v20180601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20180601.StartTaskQualityResponse;
import com.aliyuncs.dataworks_public.model.v20180601.StartTaskQualityResponse.ReturnValue;
import com.aliyuncs.dataworks_public.model.v20180601.StartTaskQualityResponse.ReturnValue.StrongMethodSetItem;
import com.aliyuncs.dataworks_public.model.v20180601.StartTaskQualityResponse.ReturnValue.WeakMethodSetItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartTaskQualityResponseUnmarshaller {

	public static StartTaskQualityResponse unmarshall(StartTaskQualityResponse startTaskQualityResponse, UnmarshallerContext _ctx) {
		
		startTaskQualityResponse.setRequestId(_ctx.stringValue("StartTaskQualityResponse.RequestId"));
		startTaskQualityResponse.setReturnCode(_ctx.stringValue("StartTaskQualityResponse.ReturnCode"));

		ReturnValue returnValue = new ReturnValue();
		returnValue.setCallbackUrl(_ctx.stringValue("StartTaskQualityResponse.ReturnValue.CallbackUrl"));
		returnValue.setEntityId(_ctx.longValue("StartTaskQualityResponse.ReturnValue.EntityId"));
		returnValue.setMatchExpression(_ctx.stringValue("StartTaskQualityResponse.ReturnValue.MatchExpression"));
		returnValue.setPluginName(_ctx.stringValue("StartTaskQualityResponse.ReturnValue.PluginName"));
		returnValue.setStatisticsFlag(_ctx.longValue("StartTaskQualityResponse.ReturnValue.StatisticsFlag"));
		returnValue.setTableGuid(_ctx.stringValue("StartTaskQualityResponse.ReturnValue.TableGuid"));
		returnValue.setTriggerFlag(_ctx.longValue("StartTaskQualityResponse.ReturnValue.TriggerFlag"));
		returnValue.setActualExpression(_ctx.stringValue("StartTaskQualityResponse.ReturnValue.ActualExpression"));
		returnValue.setConnection(_ctx.stringValue("StartTaskQualityResponse.ReturnValue.Connection"));
		returnValue.setTaskId(_ctx.stringValue("StartTaskQualityResponse.ReturnValue.TaskId"));
		returnValue.setBizDate(_ctx.stringValue("StartTaskQualityResponse.ReturnValue.BizDate"));

		List<StrongMethodSetItem> strongMethodSet = new ArrayList<StrongMethodSetItem>();
		for (int i = 0; i < _ctx.lengthValue("StartTaskQualityResponse.ReturnValue.StrongMethodSet.Length"); i++) {
			StrongMethodSetItem strongMethodSetItem = new StrongMethodSetItem();
			strongMethodSetItem.setColName(_ctx.stringValue("StartTaskQualityResponse.ReturnValue.StrongMethodSet["+ i +"].ColName"));
			strongMethodSetItem.setIsColRule(_ctx.booleanValue("StartTaskQualityResponse.ReturnValue.StrongMethodSet["+ i +"].IsColRule"));
			strongMethodSetItem.setIsSqlRule(_ctx.booleanValue("StartTaskQualityResponse.ReturnValue.StrongMethodSet["+ i +"].IsSqlRule"));
			strongMethodSetItem.setIsStrongRule(_ctx.booleanValue("StartTaskQualityResponse.ReturnValue.StrongMethodSet["+ i +"].IsStrongRule"));
			strongMethodSetItem.setMethodName(_ctx.stringValue("StartTaskQualityResponse.ReturnValue.StrongMethodSet["+ i +"].MethodName"));
			strongMethodSetItem.setRuleId(_ctx.longValue("StartTaskQualityResponse.ReturnValue.StrongMethodSet["+ i +"].RuleId"));

			strongMethodSet.add(strongMethodSetItem);
		}
		returnValue.setStrongMethodSet(strongMethodSet);

		List<WeakMethodSetItem> weakMethodSet = new ArrayList<WeakMethodSetItem>();
		for (int i = 0; i < _ctx.lengthValue("StartTaskQualityResponse.ReturnValue.WeakMethodSet.Length"); i++) {
			WeakMethodSetItem weakMethodSetItem = new WeakMethodSetItem();
			weakMethodSetItem.setColName(_ctx.stringValue("StartTaskQualityResponse.ReturnValue.WeakMethodSet["+ i +"].ColName"));
			weakMethodSetItem.setIsColRule(_ctx.booleanValue("StartTaskQualityResponse.ReturnValue.WeakMethodSet["+ i +"].IsColRule"));
			weakMethodSetItem.setIsSqlRule(_ctx.booleanValue("StartTaskQualityResponse.ReturnValue.WeakMethodSet["+ i +"].IsSqlRule"));
			weakMethodSetItem.setIsStrongRule(_ctx.booleanValue("StartTaskQualityResponse.ReturnValue.WeakMethodSet["+ i +"].IsStrongRule"));
			weakMethodSetItem.setMethodName(_ctx.stringValue("StartTaskQualityResponse.ReturnValue.WeakMethodSet["+ i +"].MethodName"));
			weakMethodSetItem.setRuleId(_ctx.longValue("StartTaskQualityResponse.ReturnValue.WeakMethodSet["+ i +"].RuleId"));

			weakMethodSet.add(weakMethodSetItem);
		}
		returnValue.setWeakMethodSet(weakMethodSet);
		startTaskQualityResponse.setReturnValue(returnValue);
	 
	 	return startTaskQualityResponse;
	}
}