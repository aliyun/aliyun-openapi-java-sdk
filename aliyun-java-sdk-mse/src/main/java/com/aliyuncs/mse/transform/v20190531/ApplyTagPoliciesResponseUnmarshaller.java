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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ApplyTagPoliciesResponse;
import com.aliyuncs.mse.model.v20190531.ApplyTagPoliciesResponse.RouteRuleVO;
import com.aliyuncs.transform.UnmarshallerContext;


public class ApplyTagPoliciesResponseUnmarshaller {

	public static ApplyTagPoliciesResponse unmarshall(ApplyTagPoliciesResponse applyTagPoliciesResponse, UnmarshallerContext _ctx) {
		
		applyTagPoliciesResponse.setRequestId(_ctx.stringValue("ApplyTagPoliciesResponse.RequestId"));
		applyTagPoliciesResponse.setHttpStatusCode(_ctx.integerValue("ApplyTagPoliciesResponse.HttpStatusCode"));
		applyTagPoliciesResponse.setMessage(_ctx.stringValue("ApplyTagPoliciesResponse.Message"));
		applyTagPoliciesResponse.setCode(_ctx.integerValue("ApplyTagPoliciesResponse.Code"));
		applyTagPoliciesResponse.setSuccess(_ctx.booleanValue("ApplyTagPoliciesResponse.Success"));

		List<RouteRuleVO> data = new ArrayList<RouteRuleVO>();
		for (int i = 0; i < _ctx.lengthValue("ApplyTagPoliciesResponse.Data.Length"); i++) {
			RouteRuleVO routeRuleVO = new RouteRuleVO();
			routeRuleVO.setStatus(_ctx.integerValue("ApplyTagPoliciesResponse.Data["+ i +"].Status"));
			routeRuleVO.setInstanceNum(_ctx.integerValue("ApplyTagPoliciesResponse.Data["+ i +"].InstanceNum"));
			routeRuleVO.setRemove(_ctx.booleanValue("ApplyTagPoliciesResponse.Data["+ i +"].Remove"));
			routeRuleVO.setCarryData(_ctx.booleanValue("ApplyTagPoliciesResponse.Data["+ i +"].CarryData"));
			routeRuleVO.setTag(_ctx.stringValue("ApplyTagPoliciesResponse.Data["+ i +"].Tag"));
			routeRuleVO.setName(_ctx.stringValue("ApplyTagPoliciesResponse.Data["+ i +"].Name"));
			routeRuleVO.setRules(_ctx.stringValue("ApplyTagPoliciesResponse.Data["+ i +"].Rules"));
			routeRuleVO.setId(_ctx.longValue("ApplyTagPoliciesResponse.Data["+ i +"].Id"));
			routeRuleVO.setRate(_ctx.integerValue("ApplyTagPoliciesResponse.Data["+ i +"].Rate"));
			routeRuleVO.setEnable(_ctx.booleanValue("ApplyTagPoliciesResponse.Data["+ i +"].Enable"));

			data.add(routeRuleVO);
		}
		applyTagPoliciesResponse.setData(data);
	 
	 	return applyTagPoliciesResponse;
	}
}