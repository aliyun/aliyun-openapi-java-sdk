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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeBusinessPropertiesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeBusinessPropertiesResponse.BusinessPropertySet;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeBusinessPropertiesResponseUnmarshaller {

	public static OpsDescribeBusinessPropertiesResponse unmarshall(OpsDescribeBusinessPropertiesResponse opsDescribeBusinessPropertiesResponse, UnmarshallerContext _ctx) {
		
		opsDescribeBusinessPropertiesResponse.setRequestId(_ctx.stringValue("OpsDescribeBusinessPropertiesResponse.RequestId"));

		List<BusinessPropertySet> businessPropertySets = new ArrayList<BusinessPropertySet>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeBusinessPropertiesResponse.BusinessPropertySets.Length"); i++) {
			BusinessPropertySet businessPropertySet = new BusinessPropertySet();
			businessPropertySet.setPropertyCode(_ctx.stringValue("OpsDescribeBusinessPropertiesResponse.BusinessPropertySets["+ i +"].PropertyCode"));
			businessPropertySet.setPropertyValue(_ctx.stringValue("OpsDescribeBusinessPropertiesResponse.BusinessPropertySets["+ i +"].PropertyValue"));
			businessPropertySet.setId(_ctx.longValue("OpsDescribeBusinessPropertiesResponse.BusinessPropertySets["+ i +"].Id"));
			businessPropertySet.setBusinessId(_ctx.longValue("OpsDescribeBusinessPropertiesResponse.BusinessPropertySets["+ i +"].businessId"));

			businessPropertySets.add(businessPropertySet);
		}
		opsDescribeBusinessPropertiesResponse.setBusinessPropertySets(businessPropertySets);
	 
	 	return opsDescribeBusinessPropertiesResponse;
	}
}