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

import com.aliyuncs.dataworks_public.model.v20180601.StartCollectQualityResponse;
import com.aliyuncs.dataworks_public.model.v20180601.StartCollectQualityResponse.ReturnValueItem;
import com.aliyuncs.dataworks_public.model.v20180601.StartCollectQualityResponse.ReturnValueItem.StrongMethodSetItem;
import com.aliyuncs.dataworks_public.model.v20180601.StartCollectQualityResponse.ReturnValueItem.WeakMethodSetItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartCollectQualityResponseUnmarshaller {

	public static StartCollectQualityResponse unmarshall(StartCollectQualityResponse startCollectQualityResponse, UnmarshallerContext _ctx) {
		
		startCollectQualityResponse.setRequestId(_ctx.stringValue("StartCollectQualityResponse.RequestId"));
		startCollectQualityResponse.setReturnCode(_ctx.stringValue("StartCollectQualityResponse.ReturnCode"));

		List<ReturnValueItem> returnValue = new ArrayList<ReturnValueItem>();
		for (int i = 0; i < _ctx.lengthValue("StartCollectQualityResponse.ReturnValue.Length"); i++) {
			ReturnValueItem returnValueItem = new ReturnValueItem();
			returnValueItem.setActualExpression(_ctx.stringValue("StartCollectQualityResponse.ReturnValue["+ i +"].ActualExpression"));
			returnValueItem.setBizDate(_ctx.stringValue("StartCollectQualityResponse.ReturnValue["+ i +"].BizDate"));
			returnValueItem.setCallbackUrl(_ctx.stringValue("StartCollectQualityResponse.ReturnValue["+ i +"].CallbackUrl"));
			returnValueItem.setConnection(_ctx.stringValue("StartCollectQualityResponse.ReturnValue["+ i +"].Connection"));
			returnValueItem.setEntityId(_ctx.longValue("StartCollectQualityResponse.ReturnValue["+ i +"].EntityId"));
			returnValueItem.setMatchExpression(_ctx.stringValue("StartCollectQualityResponse.ReturnValue["+ i +"].MatchExpression"));
			returnValueItem.setPluginName(_ctx.stringValue("StartCollectQualityResponse.ReturnValue["+ i +"].PluginName"));
			returnValueItem.setTableGuid(_ctx.stringValue("StartCollectQualityResponse.ReturnValue["+ i +"].TableGuid"));
			returnValueItem.setTaskId(_ctx.stringValue("StartCollectQualityResponse.ReturnValue["+ i +"].TaskId"));

			List<StrongMethodSetItem> strongMethodSet = new ArrayList<StrongMethodSetItem>();
			for (int j = 0; j < _ctx.lengthValue("StartCollectQualityResponse.ReturnValue["+ i +"].StrongMethodSet.Length"); j++) {
				StrongMethodSetItem strongMethodSetItem = new StrongMethodSetItem();
				strongMethodSetItem.setColName(_ctx.stringValue("StartCollectQualityResponse.ReturnValue["+ i +"].StrongMethodSet["+ j +"].ColName"));
				strongMethodSetItem.setIsColRule(_ctx.booleanValue("StartCollectQualityResponse.ReturnValue["+ i +"].StrongMethodSet["+ j +"].IsColRule"));
				strongMethodSetItem.setIsSqlRule(_ctx.booleanValue("StartCollectQualityResponse.ReturnValue["+ i +"].StrongMethodSet["+ j +"].IsSqlRule"));
				strongMethodSetItem.setIsStrongRule(_ctx.booleanValue("StartCollectQualityResponse.ReturnValue["+ i +"].StrongMethodSet["+ j +"].IsStrongRule"));
				strongMethodSetItem.setMethodName(_ctx.stringValue("StartCollectQualityResponse.ReturnValue["+ i +"].StrongMethodSet["+ j +"].MethodName"));
				strongMethodSetItem.setRuleId(_ctx.longValue("StartCollectQualityResponse.ReturnValue["+ i +"].StrongMethodSet["+ j +"].RuleId"));

				strongMethodSet.add(strongMethodSetItem);
			}
			returnValueItem.setStrongMethodSet(strongMethodSet);

			List<WeakMethodSetItem> weakMethodSet = new ArrayList<WeakMethodSetItem>();
			for (int j = 0; j < _ctx.lengthValue("StartCollectQualityResponse.ReturnValue["+ i +"].WeakMethodSet.Length"); j++) {
				WeakMethodSetItem weakMethodSetItem = new WeakMethodSetItem();
				weakMethodSetItem.setColName(_ctx.stringValue("StartCollectQualityResponse.ReturnValue["+ i +"].WeakMethodSet["+ j +"].ColName"));
				weakMethodSetItem.setIsColRule(_ctx.booleanValue("StartCollectQualityResponse.ReturnValue["+ i +"].WeakMethodSet["+ j +"].IsColRule"));
				weakMethodSetItem.setIsSqlRule(_ctx.booleanValue("StartCollectQualityResponse.ReturnValue["+ i +"].WeakMethodSet["+ j +"].IsSqlRule"));
				weakMethodSetItem.setIsStrongRule(_ctx.booleanValue("StartCollectQualityResponse.ReturnValue["+ i +"].WeakMethodSet["+ j +"].IsStrongRule"));
				weakMethodSetItem.setMethodName(_ctx.stringValue("StartCollectQualityResponse.ReturnValue["+ i +"].WeakMethodSet["+ j +"].MethodName"));
				weakMethodSetItem.setRuleId(_ctx.longValue("StartCollectQualityResponse.ReturnValue["+ i +"].WeakMethodSet["+ j +"].RuleId"));

				weakMethodSet.add(weakMethodSetItem);
			}
			returnValueItem.setWeakMethodSet(weakMethodSet);

			returnValue.add(returnValueItem);
		}
		startCollectQualityResponse.setReturnValue(returnValue);
	 
	 	return startCollectQualityResponse;
	}
}