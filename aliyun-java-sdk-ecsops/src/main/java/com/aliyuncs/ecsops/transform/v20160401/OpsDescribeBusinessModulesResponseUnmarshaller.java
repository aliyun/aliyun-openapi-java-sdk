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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeBusinessModulesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeBusinessModulesResponse.BusinessModuleSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeBusinessModulesResponseUnmarshaller {

	public static OpsDescribeBusinessModulesResponse unmarshall(OpsDescribeBusinessModulesResponse opsDescribeBusinessModulesResponse, UnmarshallerContext _ctx) {
		
		opsDescribeBusinessModulesResponse.setRequestId(_ctx.stringValue("OpsDescribeBusinessModulesResponse.RequestId"));

		List<BusinessModuleSet> businessModuleSets = new ArrayList<BusinessModuleSet>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeBusinessModulesResponse.BusinessModuleSets.Length"); i++) {
			BusinessModuleSet businessModuleSet = new BusinessModuleSet();
			businessModuleSet.setId(_ctx.longValue("OpsDescribeBusinessModulesResponse.BusinessModuleSets["+ i +"].Id"));
			businessModuleSet.setBusinessId(_ctx.longValue("OpsDescribeBusinessModulesResponse.BusinessModuleSets["+ i +"].BusinessId"));
			businessModuleSet.setModuleCode(_ctx.stringValue("OpsDescribeBusinessModulesResponse.BusinessModuleSets["+ i +"].moduleCode"));
			businessModuleSet.setModuleTag(_ctx.stringValue("OpsDescribeBusinessModulesResponse.BusinessModuleSets["+ i +"].moduleTag"));

			businessModuleSets.add(businessModuleSet);
		}
		opsDescribeBusinessModulesResponse.setBusinessModuleSets(businessModuleSets);
	 
	 	return opsDescribeBusinessModulesResponse;
	}
}