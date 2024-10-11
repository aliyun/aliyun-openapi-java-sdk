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

import com.aliyuncs.dataphin_public.model.v20230630.GetDevObjectDependencyResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetDevObjectDependencyResponse.DevObjectDependency;
import com.aliyuncs.dataphin_public.model.v20230630.GetDevObjectDependencyResponse.DevObjectDependency.ContextParam;
import com.aliyuncs.dataphin_public.model.v20230630.GetDevObjectDependencyResponse.DevObjectDependency.DependencyPeriod;
import com.aliyuncs.dataphin_public.model.v20230630.GetDevObjectDependencyResponse.DevObjectDependency.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDevObjectDependencyResponseUnmarshaller {

	public static GetDevObjectDependencyResponse unmarshall(GetDevObjectDependencyResponse getDevObjectDependencyResponse, UnmarshallerContext _ctx) {
		
		getDevObjectDependencyResponse.setRequestId(_ctx.stringValue("GetDevObjectDependencyResponse.RequestId"));
		getDevObjectDependencyResponse.setSuccess(_ctx.booleanValue("GetDevObjectDependencyResponse.Success"));
		getDevObjectDependencyResponse.setHttpStatusCode(_ctx.integerValue("GetDevObjectDependencyResponse.HttpStatusCode"));
		getDevObjectDependencyResponse.setCode(_ctx.stringValue("GetDevObjectDependencyResponse.Code"));
		getDevObjectDependencyResponse.setMessage(_ctx.stringValue("GetDevObjectDependencyResponse.Message"));

		List<DevObjectDependency> devObjectDependencyList = new ArrayList<DevObjectDependency>();
		for (int i = 0; i < _ctx.lengthValue("GetDevObjectDependencyResponse.DevObjectDependencyList.Length"); i++) {
			DevObjectDependency devObjectDependency = new DevObjectDependency();
			devObjectDependency.setScheduleType(_ctx.stringValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].ScheduleType"));
			devObjectDependency.setNodeName(_ctx.stringValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].NodeName"));
			devObjectDependency.setProjectName(_ctx.stringValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].ProjectName"));
			devObjectDependency.setNodeOutputTableName(_ctx.stringValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].NodeOutputTableName"));
			devObjectDependency.setNodeOutputName(_ctx.stringValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].NodeOutputName"));
			devObjectDependency.setManuallyAdd(_ctx.booleanValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].ManuallyAdd"));
			devObjectDependency.setBizUnitId(_ctx.stringValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].BizUnitId"));
			devObjectDependency.setCustomCronExpression(_ctx.booleanValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].CustomCronExpression"));
			devObjectDependency.setDependencyStrategy(_ctx.stringValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].DependencyStrategy"));
			devObjectDependency.setBizUnitName(_ctx.stringValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].BizUnitName"));
			devObjectDependency.setCronExpression(_ctx.stringValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].CronExpression"));
			devObjectDependency.setSubBizType(_ctx.stringValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].SubBizType"));
			devObjectDependency.setDimMidNode(_ctx.booleanValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].DimMidNode"));
			devObjectDependency.setProjectId(_ctx.longValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].ProjectId"));
			devObjectDependency.setBizType(_ctx.stringValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].BizType"));
			devObjectDependency.setSelfDepend(_ctx.booleanValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].SelfDepend"));
			devObjectDependency.setExternalBizInfo(_ctx.stringValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].ExternalBizInfo"));
			devObjectDependency.setPeriodDiff(_ctx.integerValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].PeriodDiff"));
			devObjectDependency.setValid(_ctx.booleanValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].Valid"));
			devObjectDependency.setNodeType(_ctx.stringValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].NodeType"));
			devObjectDependency.setNodeId(_ctx.stringValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].NodeId"));
			devObjectDependency.setAutoParse(_ctx.booleanValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].AutoParse"));

			List<String> effectFieldList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].EffectFieldList.Length"); j++) {
				effectFieldList.add(_ctx.stringValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].EffectFieldList["+ j +"]"));
			}
			devObjectDependency.setEffectFieldList(effectFieldList);

			List<String> dependFieldList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].DependFieldList.Length"); j++) {
				dependFieldList.add(_ctx.stringValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].DependFieldList["+ j +"]"));
			}
			devObjectDependency.setDependFieldList(dependFieldList);

			DependencyPeriod dependencyPeriod = new DependencyPeriod();
			dependencyPeriod.setPeriodType(_ctx.stringValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].DependencyPeriod.PeriodType"));
			dependencyPeriod.setPeriodOffset(_ctx.integerValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].DependencyPeriod.PeriodOffset"));
			devObjectDependency.setDependencyPeriod(dependencyPeriod);

			List<User> ownerList = new ArrayList<User>();
			for (int j = 0; j < _ctx.lengthValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].OwnerList.Length"); j++) {
				User user = new User();
				user.setId(_ctx.stringValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].OwnerList["+ j +"].Id"));
				user.setName(_ctx.stringValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].OwnerList["+ j +"].Name"));

				ownerList.add(user);
			}
			devObjectDependency.setOwnerList(ownerList);

			List<ContextParam> outputContextParamList = new ArrayList<ContextParam>();
			for (int j = 0; j < _ctx.lengthValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].OutputContextParamList.Length"); j++) {
				ContextParam contextParam = new ContextParam();
				contextParam.setKey(_ctx.stringValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].OutputContextParamList["+ j +"].Key"));
				contextParam.setDescription(_ctx.stringValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].OutputContextParamList["+ j +"].Description"));
				contextParam.setDefaultValue(_ctx.stringValue("GetDevObjectDependencyResponse.DevObjectDependencyList["+ i +"].OutputContextParamList["+ j +"].DefaultValue"));

				outputContextParamList.add(contextParam);
			}
			devObjectDependency.setOutputContextParamList(outputContextParamList);

			devObjectDependencyList.add(devObjectDependency);
		}
		getDevObjectDependencyResponse.setDevObjectDependencyList(devObjectDependencyList);
	 
	 	return getDevObjectDependencyResponse;
	}
}