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

package com.aliyuncs.eds_user.transform.v20210308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_user.model.v20210308.DescribeOrgsResponse;
import com.aliyuncs.eds_user.model.v20210308.DescribeOrgsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOrgsResponseUnmarshaller {

	public static DescribeOrgsResponse unmarshall(DescribeOrgsResponse describeOrgsResponse, UnmarshallerContext _ctx) {
		
		describeOrgsResponse.setRequestId(_ctx.stringValue("DescribeOrgsResponse.RequestId"));
		describeOrgsResponse.setNextToken(_ctx.stringValue("DescribeOrgsResponse.NextToken"));

		List<Data> orgs = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOrgsResponse.Orgs.Length"); i++) {
			Data data = new Data();
			data.setOrgName(_ctx.stringValue("DescribeOrgsResponse.Orgs["+ i +"].OrgName"));
			data.setOrgId(_ctx.stringValue("DescribeOrgsResponse.Orgs["+ i +"].OrgId"));
			data.setParentOrgId(_ctx.stringValue("DescribeOrgsResponse.Orgs["+ i +"].ParentOrgId"));

			orgs.add(data);
		}
		describeOrgsResponse.setOrgs(orgs);
	 
	 	return describeOrgsResponse;
	}
}