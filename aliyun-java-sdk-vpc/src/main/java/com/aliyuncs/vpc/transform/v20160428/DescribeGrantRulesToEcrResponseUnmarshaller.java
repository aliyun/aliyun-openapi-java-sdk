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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeGrantRulesToEcrResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeGrantRulesToEcrResponse.EcrRelationModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGrantRulesToEcrResponseUnmarshaller {

	public static DescribeGrantRulesToEcrResponse unmarshall(DescribeGrantRulesToEcrResponse describeGrantRulesToEcrResponse, UnmarshallerContext _ctx) {
		
		describeGrantRulesToEcrResponse.setRequestId(_ctx.stringValue("DescribeGrantRulesToEcrResponse.RequestId"));
		describeGrantRulesToEcrResponse.setTotalCount(_ctx.integerValue("DescribeGrantRulesToEcrResponse.TotalCount"));
		describeGrantRulesToEcrResponse.setCount(_ctx.integerValue("DescribeGrantRulesToEcrResponse.Count"));
		describeGrantRulesToEcrResponse.setPageNumber(_ctx.integerValue("DescribeGrantRulesToEcrResponse.PageNumber"));
		describeGrantRulesToEcrResponse.setPageSize(_ctx.integerValue("DescribeGrantRulesToEcrResponse.PageSize"));

		List<EcrRelationModel> ecrGrantRules = new ArrayList<EcrRelationModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGrantRulesToEcrResponse.EcrGrantRules.Length"); i++) {
			EcrRelationModel ecrRelationModel = new EcrRelationModel();
			ecrRelationModel.setEcrUid(_ctx.longValue("DescribeGrantRulesToEcrResponse.EcrGrantRules["+ i +"].EcrUid"));
			ecrRelationModel.setCreateTime(_ctx.stringValue("DescribeGrantRulesToEcrResponse.EcrGrantRules["+ i +"].CreateTime"));
			ecrRelationModel.setEcrInstanceId(_ctx.stringValue("DescribeGrantRulesToEcrResponse.EcrGrantRules["+ i +"].EcrInstanceId"));

			ecrGrantRules.add(ecrRelationModel);
		}
		describeGrantRulesToEcrResponse.setEcrGrantRules(ecrGrantRules);
	 
	 	return describeGrantRulesToEcrResponse;
	}
}