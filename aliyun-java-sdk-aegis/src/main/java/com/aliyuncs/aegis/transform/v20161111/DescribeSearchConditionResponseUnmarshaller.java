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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeSearchConditionResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeSearchConditionResponse.Condition;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSearchConditionResponseUnmarshaller {

	public static DescribeSearchConditionResponse unmarshall(DescribeSearchConditionResponse describeSearchConditionResponse, UnmarshallerContext context) {
		
		describeSearchConditionResponse.setRequestId(context.stringValue("DescribeSearchConditionResponse.RequestId"));

		List<Condition> conditionList = new ArrayList<Condition>();
		for (int i = 0; i < context.lengthValue("DescribeSearchConditionResponse.ConditionList.Length"); i++) {
			Condition condition = new Condition();
			condition.setName(context.stringValue("DescribeSearchConditionResponse.ConditionList["+ i +"].Name"));
			condition.setAssetType(context.stringValue("DescribeSearchConditionResponse.ConditionList["+ i +"].AssetType"));
			condition.setTag(context.stringValue("DescribeSearchConditionResponse.ConditionList["+ i +"].Tag"));
			condition.setRegion(context.stringValue("DescribeSearchConditionResponse.ConditionList["+ i +"].Region"));
			condition.setSafeStatus(context.stringValue("DescribeSearchConditionResponse.ConditionList["+ i +"].SafeStatus"));
			condition.setClientStatus(context.stringValue("DescribeSearchConditionResponse.ConditionList["+ i +"].ClientStatus"));
			condition.setGroupId(context.stringValue("DescribeSearchConditionResponse.ConditionList["+ i +"].GroupId"));
			condition.setOs(context.stringValue("DescribeSearchConditionResponse.ConditionList["+ i +"].Os"));
			condition.setRemark(context.stringValue("DescribeSearchConditionResponse.ConditionList["+ i +"].Remark"));

			conditionList.add(condition);
		}
		describeSearchConditionResponse.setConditionList(conditionList);
	 
	 	return describeSearchConditionResponse;
	}
}