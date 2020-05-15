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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeSearchConditionResponse;
import com.aliyuncs.sas.model.v20181203.DescribeSearchConditionResponse.Condition;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSearchConditionResponseUnmarshaller {

	public static DescribeSearchConditionResponse unmarshall(DescribeSearchConditionResponse describeSearchConditionResponse, UnmarshallerContext _ctx) {
		
		describeSearchConditionResponse.setRequestId(_ctx.stringValue("DescribeSearchConditionResponse.RequestId"));

		List<Condition> conditionList = new ArrayList<Condition>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSearchConditionResponse.ConditionList.Length"); i++) {
			Condition condition = new Condition();
			condition.setName(_ctx.stringValue("DescribeSearchConditionResponse.ConditionList["+ i +"].Name"));
			condition.setFilterConditions(_ctx.stringValue("DescribeSearchConditionResponse.ConditionList["+ i +"].FilterConditions"));
			condition.setNameKey(_ctx.stringValue("DescribeSearchConditionResponse.ConditionList["+ i +"].NameKey"));
			condition.setConditionType(_ctx.stringValue("DescribeSearchConditionResponse.ConditionList["+ i +"].ConditionType"));

			conditionList.add(condition);
		}
		describeSearchConditionResponse.setConditionList(conditionList);
	 
	 	return describeSearchConditionResponse;
	}
}