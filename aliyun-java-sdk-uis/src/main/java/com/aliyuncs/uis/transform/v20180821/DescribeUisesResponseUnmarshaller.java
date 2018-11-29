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

package com.aliyuncs.uis.transform.v20180821;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.uis.model.v20180821.DescribeUisesResponse;
import com.aliyuncs.uis.model.v20180821.DescribeUisesResponse.Uis;
import com.aliyuncs.uis.model.v20180821.DescribeUisesResponse.Uis.UserInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUisesResponseUnmarshaller {

	public static DescribeUisesResponse unmarshall(DescribeUisesResponse describeUisesResponse, UnmarshallerContext context) {
		
		describeUisesResponse.setRequestId(context.stringValue("DescribeUisesResponse.RequestId"));
		describeUisesResponse.setTotalCount(context.integerValue("DescribeUisesResponse.TotalCount"));
		describeUisesResponse.setPageNumber(context.integerValue("DescribeUisesResponse.PageNumber"));
		describeUisesResponse.setPageSize(context.integerValue("DescribeUisesResponse.PageSize"));

		List<Uis> uises = new ArrayList<Uis>();
		for (int i = 0; i < context.lengthValue("DescribeUisesResponse.Uises.Length"); i++) {
			Uis uis = new Uis();
			uis.setUisId(context.stringValue("DescribeUisesResponse.Uises["+ i +"].UisId"));
			uis.setCreateTime(context.longValue("DescribeUisesResponse.Uises["+ i +"].CreateTime"));
			uis.setSslClientCertUrl(context.stringValue("DescribeUisesResponse.Uises["+ i +"].SslClientCertUrl"));
			uis.setName(context.stringValue("DescribeUisesResponse.Uises["+ i +"].Name"));
			uis.setDescription(context.stringValue("DescribeUisesResponse.Uises["+ i +"].Description"));
			uis.setStatus(context.stringValue("DescribeUisesResponse.Uises["+ i +"].Status"));

			List<String> uisNodeIds = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeUisesResponse.Uises["+ i +"].UisNodeIds.Length"); j++) {
				uisNodeIds.add(context.stringValue("DescribeUisesResponse.Uises["+ i +"].UisNodeIds["+ j +"]"));
			}
			uis.setUisNodeIds(uisNodeIds);

			UserInfo userInfo = new UserInfo();
			userInfo.setClientInfoDB(context.stringValue("DescribeUisesResponse.Uises["+ i +"].UserInfo.ClientInfoDB"));
			userInfo.setClientInfoDBAccount(context.stringValue("DescribeUisesResponse.Uises["+ i +"].UserInfo.ClientInfoDBAccount"));
			userInfo.setClientInfoDBPassword(context.stringValue("DescribeUisesResponse.Uises["+ i +"].UserInfo.ClientInfoDBPassword"));
			uis.setUserInfo(userInfo);

			uises.add(uis);
		}
		describeUisesResponse.setUises(uises);
	 
	 	return describeUisesResponse;
	}
}