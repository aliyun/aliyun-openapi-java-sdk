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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.DescribeAdvisorChecksResponse;
import com.aliyuncs.advisor_share.model.v20180608.DescribeAdvisorChecksResponse.AdvisorCheck;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAdvisorChecksResponseUnmarshaller {

	public static DescribeAdvisorChecksResponse unmarshall(DescribeAdvisorChecksResponse describeAdvisorChecksResponse, UnmarshallerContext _ctx) {
		
		describeAdvisorChecksResponse.setRequestId(_ctx.stringValue("DescribeAdvisorChecksResponse.RequestId"));
		describeAdvisorChecksResponse.setCode(_ctx.stringValue("DescribeAdvisorChecksResponse.Code"));

		List<AdvisorCheck> data = new ArrayList<AdvisorCheck>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAdvisorChecksResponse.Data.Length"); i++) {
			AdvisorCheck advisorCheck = new AdvisorCheck();
			advisorCheck.setStatus(_ctx.stringValue("DescribeAdvisorChecksResponse.Data["+ i +"].Status"));
			advisorCheck.setProduct(_ctx.stringValue("DescribeAdvisorChecksResponse.Data["+ i +"].Product"));
			advisorCheck.setOperateColumn(_ctx.stringValue("DescribeAdvisorChecksResponse.Data["+ i +"].OperateColumn"));
			advisorCheck.setGmtModified(_ctx.stringValue("DescribeAdvisorChecksResponse.Data["+ i +"].GmtModified"));
			advisorCheck.setViewColumn(_ctx.stringValue("DescribeAdvisorChecksResponse.Data["+ i +"].ViewColumn"));
			advisorCheck.setGmtCreated(_ctx.stringValue("DescribeAdvisorChecksResponse.Data["+ i +"].GmtCreated"));
			advisorCheck.setDescription(_ctx.stringValue("DescribeAdvisorChecksResponse.Data["+ i +"].Description"));
			advisorCheck.setTips(_ctx.stringValue("DescribeAdvisorChecksResponse.Data["+ i +"].Tips"));
			advisorCheck.setCode(_ctx.stringValue("DescribeAdvisorChecksResponse.Data["+ i +"].Code"));
			advisorCheck.setCategory(_ctx.stringValue("DescribeAdvisorChecksResponse.Data["+ i +"].Category"));
			advisorCheck.setName(_ctx.stringValue("DescribeAdvisorChecksResponse.Data["+ i +"].Name"));
			advisorCheck.setId(_ctx.longValue("DescribeAdvisorChecksResponse.Data["+ i +"].Id"));
			advisorCheck.setConfigSupport(_ctx.booleanValue("DescribeAdvisorChecksResponse.Data["+ i +"].ConfigSupport"));

			data.add(advisorCheck);
		}
		describeAdvisorChecksResponse.setData(data);
	 
	 	return describeAdvisorChecksResponse;
	}
}