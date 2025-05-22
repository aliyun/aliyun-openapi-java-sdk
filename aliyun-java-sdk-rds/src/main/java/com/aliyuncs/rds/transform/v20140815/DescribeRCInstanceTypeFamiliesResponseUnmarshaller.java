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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeRCInstanceTypeFamiliesResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRCInstanceTypeFamiliesResponse.InstanceTypeFamilies;
import com.aliyuncs.rds.model.v20140815.DescribeRCInstanceTypeFamiliesResponse.InstanceTypeFamilies.FamilyList;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRCInstanceTypeFamiliesResponseUnmarshaller {

	public static DescribeRCInstanceTypeFamiliesResponse unmarshall(DescribeRCInstanceTypeFamiliesResponse describeRCInstanceTypeFamiliesResponse, UnmarshallerContext _ctx) {
		
		describeRCInstanceTypeFamiliesResponse.setRequestId(_ctx.stringValue("DescribeRCInstanceTypeFamiliesResponse.RequestId"));

		InstanceTypeFamilies instanceTypeFamilies = new InstanceTypeFamilies();

		List<FamilyList> instanceTypeFamily = new ArrayList<FamilyList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRCInstanceTypeFamiliesResponse.InstanceTypeFamilies.InstanceTypeFamily.Length"); i++) {
			FamilyList familyList = new FamilyList();
			familyList.setInstanceTypeFamilyId(_ctx.stringValue("DescribeRCInstanceTypeFamiliesResponse.InstanceTypeFamilies.InstanceTypeFamily["+ i +"].InstanceTypeFamilyId"));
			familyList.setInstanceTypeFamilyDesc(_ctx.stringValue("DescribeRCInstanceTypeFamiliesResponse.InstanceTypeFamilies.InstanceTypeFamily["+ i +"].InstanceTypeFamilyDesc"));

			instanceTypeFamily.add(familyList);
		}
		instanceTypeFamilies.setInstanceTypeFamily(instanceTypeFamily);
		describeRCInstanceTypeFamiliesResponse.setInstanceTypeFamilies(instanceTypeFamilies);
	 
	 	return describeRCInstanceTypeFamiliesResponse;
	}
}