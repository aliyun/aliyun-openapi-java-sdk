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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeBusinessModulePropertiesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeBusinessModulePropertiesResponse.BusinessModulePropertySet;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeBusinessModulePropertiesResponseUnmarshaller {

	public static OpsDescribeBusinessModulePropertiesResponse unmarshall(OpsDescribeBusinessModulePropertiesResponse opsDescribeBusinessModulePropertiesResponse, UnmarshallerContext _ctx) {
		
		opsDescribeBusinessModulePropertiesResponse.setRequestId(_ctx.stringValue("OpsDescribeBusinessModulePropertiesResponse.RequestId"));

		List<BusinessModulePropertySet> businessModulePropertySets = new ArrayList<BusinessModulePropertySet>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeBusinessModulePropertiesResponse.BusinessModulePropertySets.Length"); i++) {
			BusinessModulePropertySet businessModulePropertySet = new BusinessModulePropertySet();
			businessModulePropertySet.setId(_ctx.longValue("OpsDescribeBusinessModulePropertiesResponse.BusinessModulePropertySets["+ i +"].Id"));
			businessModulePropertySet.setBusinessId(_ctx.longValue("OpsDescribeBusinessModulePropertiesResponse.BusinessModulePropertySets["+ i +"].BusinessId"));
			businessModulePropertySet.setModuleCode(_ctx.stringValue("OpsDescribeBusinessModulePropertiesResponse.BusinessModulePropertySets["+ i +"].ModuleCode"));
			businessModulePropertySet.setPropertyCode(_ctx.stringValue("OpsDescribeBusinessModulePropertiesResponse.BusinessModulePropertySets["+ i +"].PropertyCode"));
			businessModulePropertySet.setModuleId(_ctx.longValue("OpsDescribeBusinessModulePropertiesResponse.BusinessModulePropertySets["+ i +"].ModuleId"));
			businessModulePropertySet.setPropertyValue(_ctx.stringValue("OpsDescribeBusinessModulePropertiesResponse.BusinessModulePropertySets["+ i +"].PropertyValue"));
			businessModulePropertySet.setPropertyDisplayValue(_ctx.stringValue("OpsDescribeBusinessModulePropertiesResponse.BusinessModulePropertySets["+ i +"].PropertyDisplayValue"));

			businessModulePropertySets.add(businessModulePropertySet);
		}
		opsDescribeBusinessModulePropertiesResponse.setBusinessModulePropertySets(businessModulePropertySets);
	 
	 	return opsDescribeBusinessModulePropertiesResponse;
	}
}