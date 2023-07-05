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

import com.aliyuncs.advisor_share.model.v20180608.DescribeAdvicesResponse;
import com.aliyuncs.advisor_share.model.v20180608.DescribeAdvicesResponse.Advice;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAdvicesResponseUnmarshaller {

	public static DescribeAdvicesResponse unmarshall(DescribeAdvicesResponse describeAdvicesResponse, UnmarshallerContext _ctx) {
		
		describeAdvicesResponse.setRequestId(_ctx.stringValue("DescribeAdvicesResponse.RequestId"));

		List<Advice> data = new ArrayList<Advice>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAdvicesResponse.Data.Length"); i++) {
			Advice advice = new Advice();
			advice.setSeverity(_ctx.integerValue("DescribeAdvicesResponse.Data["+ i +"].Severity"));
			advice.setAction(_ctx.stringValue("DescribeAdvicesResponse.Data["+ i +"].Action"));
			advice.setProduct(_ctx.stringValue("DescribeAdvicesResponse.Data["+ i +"].Product"));
			advice.setGmtModified(_ctx.stringValue("DescribeAdvicesResponse.Data["+ i +"].GmtModified"));
			advice.setDetails(_ctx.stringValue("DescribeAdvicesResponse.Data["+ i +"].Details"));
			advice.setIsExpired(_ctx.booleanValue("DescribeAdvicesResponse.Data["+ i +"].IsExpired"));
			advice.setGmtCreated(_ctx.stringValue("DescribeAdvicesResponse.Data["+ i +"].GmtCreated"));
			advice.setResource(_ctx.stringValue("DescribeAdvicesResponse.Data["+ i +"].Resource"));
			advice.setDescription(_ctx.stringValue("DescribeAdvicesResponse.Data["+ i +"].Description"));
			advice.setLinks(_ctx.stringValue("DescribeAdvicesResponse.Data["+ i +"].Links"));
			advice.setCheckId(_ctx.stringValue("DescribeAdvicesResponse.Data["+ i +"].CheckId"));
			advice.setAliyunId(_ctx.longValue("DescribeAdvicesResponse.Data["+ i +"].AliyunId"));
			advice.setResourceId(_ctx.stringValue("DescribeAdvicesResponse.Data["+ i +"].ResourceId"));
			advice.setContent(_ctx.stringValue("DescribeAdvicesResponse.Data["+ i +"].Content"));
			advice.setReason(_ctx.stringValue("DescribeAdvicesResponse.Data["+ i +"].Reason"));
			advice.setId(_ctx.longValue("DescribeAdvicesResponse.Data["+ i +"].Id"));
			advice.setCheckName(_ctx.stringValue("DescribeAdvicesResponse.Data["+ i +"].CheckName"));

			data.add(advice);
		}
		describeAdvicesResponse.setData(data);
	 
	 	return describeAdvicesResponse;
	}
}