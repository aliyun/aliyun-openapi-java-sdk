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

import com.aliyuncs.sas.model.v20181203.DescribeExposedInstanceCriteriaResponse;
import com.aliyuncs.sas.model.v20181203.DescribeExposedInstanceCriteriaResponse.Criteria;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExposedInstanceCriteriaResponseUnmarshaller {

	public static DescribeExposedInstanceCriteriaResponse unmarshall(DescribeExposedInstanceCriteriaResponse describeExposedInstanceCriteriaResponse, UnmarshallerContext _ctx) {
		
		describeExposedInstanceCriteriaResponse.setRequestId(_ctx.stringValue("DescribeExposedInstanceCriteriaResponse.RequestId"));

		List<Criteria> criteriaList = new ArrayList<Criteria>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExposedInstanceCriteriaResponse.CriteriaList.Length"); i++) {
			Criteria criteria = new Criteria();
			criteria.setValues(_ctx.stringValue("DescribeExposedInstanceCriteriaResponse.CriteriaList["+ i +"].Values"));
			criteria.setName(_ctx.stringValue("DescribeExposedInstanceCriteriaResponse.CriteriaList["+ i +"].Name"));
			criteria.setType(_ctx.stringValue("DescribeExposedInstanceCriteriaResponse.CriteriaList["+ i +"].Type"));

			criteriaList.add(criteria);
		}
		describeExposedInstanceCriteriaResponse.setCriteriaList(criteriaList);
	 
	 	return describeExposedInstanceCriteriaResponse;
	}
}