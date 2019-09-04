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

package com.aliyuncs.dataworks_enterprise_ultimate.transform.v20190424;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.PubGetDQCQualityByEntityResponse;
import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.PubGetDQCQualityByEntityResponse.EntityQuality;
import com.aliyuncs.transform.UnmarshallerContext;


public class PubGetDQCQualityByEntityResponseUnmarshaller {

	public static PubGetDQCQualityByEntityResponse unmarshall(PubGetDQCQualityByEntityResponse pubGetDQCQualityByEntityResponse, UnmarshallerContext _ctx) {
		
		pubGetDQCQualityByEntityResponse.setReturnCode(_ctx.stringValue("PubGetDQCQualityByEntityResponse.ReturnCode"));
		pubGetDQCQualityByEntityResponse.setCount(_ctx.integerValue("PubGetDQCQualityByEntityResponse.Count"));

		List<EntityQuality> returnValue = new ArrayList<EntityQuality>();
		for (int i = 0; i < _ctx.lengthValue("PubGetDQCQualityByEntityResponse.ReturnValue.Length"); i++) {
			EntityQuality entityQuality = new EntityQuality();
			entityQuality.setId(_ctx.integerValue("PubGetDQCQualityByEntityResponse.ReturnValue["+ i +"].Id"));
			entityQuality.setTaskId(_ctx.stringValue("PubGetDQCQualityByEntityResponse.ReturnValue["+ i +"].TaskId"));
			entityQuality.setEntityId(_ctx.integerValue("PubGetDQCQualityByEntityResponse.ReturnValue["+ i +"].EntityId"));
			entityQuality.setRuleId(_ctx.integerValue("PubGetDQCQualityByEntityResponse.ReturnValue["+ i +"].RuleId"));
			entityQuality.setProperty(_ctx.stringValue("PubGetDQCQualityByEntityResponse.ReturnValue["+ i +"].Property"));
			entityQuality.setBizdate(_ctx.stringValue("PubGetDQCQualityByEntityResponse.ReturnValue["+ i +"].Bizdate"));
			entityQuality.setDateType(_ctx.stringValue("PubGetDQCQualityByEntityResponse.ReturnValue["+ i +"].DateType"));
			entityQuality.setActualExpression(_ctx.stringValue("PubGetDQCQualityByEntityResponse.ReturnValue["+ i +"].ActualExpression"));
			entityQuality.setMatchExpression(_ctx.stringValue("PubGetDQCQualityByEntityResponse.ReturnValue["+ i +"].MatchExpression"));
			entityQuality.setBlockType(_ctx.integerValue("PubGetDQCQualityByEntityResponse.ReturnValue["+ i +"].BlockType"));
			entityQuality.setCheckResult(_ctx.integerValue("PubGetDQCQualityByEntityResponse.ReturnValue["+ i +"].CheckResult"));
			entityQuality.setCheckResultStatus(_ctx.integerValue("PubGetDQCQualityByEntityResponse.ReturnValue["+ i +"].CheckResultStatus"));
			entityQuality.setMethodName(_ctx.stringValue("PubGetDQCQualityByEntityResponse.ReturnValue["+ i +"].MethodName"));
			entityQuality.setComment(_ctx.stringValue("PubGetDQCQualityByEntityResponse.ReturnValue["+ i +"].Comment"));
			entityQuality.setBeginTime(_ctx.stringValue("PubGetDQCQualityByEntityResponse.ReturnValue["+ i +"].BeginTime"));
			entityQuality.setEndTime(_ctx.stringValue("PubGetDQCQualityByEntityResponse.ReturnValue["+ i +"].EndTime"));
			entityQuality.setTimeConsuming(_ctx.stringValue("PubGetDQCQualityByEntityResponse.ReturnValue["+ i +"].TimeConsuming"));
			entityQuality.setDiscrete(_ctx.booleanValue("PubGetDQCQualityByEntityResponse.ReturnValue["+ i +"].Discrete"));
			entityQuality.setCheckerType(_ctx.integerValue("PubGetDQCQualityByEntityResponse.ReturnValue["+ i +"].CheckerType"));
			entityQuality.setRuleName(_ctx.stringValue("PubGetDQCQualityByEntityResponse.ReturnValue["+ i +"].RuleName"));
			entityQuality.setIsPrediction(_ctx.booleanValue("PubGetDQCQualityByEntityResponse.ReturnValue["+ i +"].IsPrediction"));
			entityQuality.setCheckerName(_ctx.stringValue("PubGetDQCQualityByEntityResponse.ReturnValue["+ i +"].CheckerName"));

			returnValue.add(entityQuality);
		}
		pubGetDQCQualityByEntityResponse.setReturnValue(returnValue);
	 
	 	return pubGetDQCQualityByEntityResponse;
	}
}