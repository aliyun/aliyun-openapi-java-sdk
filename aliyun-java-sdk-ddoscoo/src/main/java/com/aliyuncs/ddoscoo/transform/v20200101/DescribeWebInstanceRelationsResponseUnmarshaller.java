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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebInstanceRelationsResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebInstanceRelationsResponse.WebInstanceRelation;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebInstanceRelationsResponse.WebInstanceRelation.InstanceDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebInstanceRelationsResponseUnmarshaller {

	public static DescribeWebInstanceRelationsResponse unmarshall(DescribeWebInstanceRelationsResponse describeWebInstanceRelationsResponse, UnmarshallerContext _ctx) {
		
		describeWebInstanceRelationsResponse.setRequestId(_ctx.stringValue("DescribeWebInstanceRelationsResponse.RequestId"));

		List<WebInstanceRelation> webInstanceRelations = new ArrayList<WebInstanceRelation>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebInstanceRelationsResponse.WebInstanceRelations.Length"); i++) {
			WebInstanceRelation webInstanceRelation = new WebInstanceRelation();
			webInstanceRelation.setDomain(_ctx.stringValue("DescribeWebInstanceRelationsResponse.WebInstanceRelations["+ i +"].Domain"));

			List<InstanceDetail> instanceDetails = new ArrayList<InstanceDetail>();
			for (int j = 0; j < _ctx.lengthValue("DescribeWebInstanceRelationsResponse.WebInstanceRelations["+ i +"].InstanceDetails.Length"); j++) {
				InstanceDetail instanceDetail = new InstanceDetail();
				instanceDetail.setInstanceId(_ctx.stringValue("DescribeWebInstanceRelationsResponse.WebInstanceRelations["+ i +"].InstanceDetails["+ j +"].InstanceId"));
				instanceDetail.setFunctionVersion(_ctx.stringValue("DescribeWebInstanceRelationsResponse.WebInstanceRelations["+ i +"].InstanceDetails["+ j +"].FunctionVersion"));

				List<String> eipList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeWebInstanceRelationsResponse.WebInstanceRelations["+ i +"].InstanceDetails["+ j +"].EipList.Length"); k++) {
					eipList.add(_ctx.stringValue("DescribeWebInstanceRelationsResponse.WebInstanceRelations["+ i +"].InstanceDetails["+ j +"].EipList["+ k +"]"));
				}
				instanceDetail.setEipList(eipList);

				instanceDetails.add(instanceDetail);
			}
			webInstanceRelation.setInstanceDetails(instanceDetails);

			webInstanceRelations.add(webInstanceRelation);
		}
		describeWebInstanceRelationsResponse.setWebInstanceRelations(webInstanceRelations);
	 
	 	return describeWebInstanceRelationsResponse;
	}
}