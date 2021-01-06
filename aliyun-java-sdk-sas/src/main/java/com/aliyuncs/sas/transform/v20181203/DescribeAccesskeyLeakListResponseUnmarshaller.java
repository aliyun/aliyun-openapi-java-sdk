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

import com.aliyuncs.sas.model.v20181203.DescribeAccesskeyLeakListResponse;
import com.aliyuncs.sas.model.v20181203.DescribeAccesskeyLeakListResponse.AccessKeyLeak;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccesskeyLeakListResponseUnmarshaller {

	public static DescribeAccesskeyLeakListResponse unmarshall(DescribeAccesskeyLeakListResponse describeAccesskeyLeakListResponse, UnmarshallerContext _ctx) {
		
		describeAccesskeyLeakListResponse.setRequestId(_ctx.stringValue("DescribeAccesskeyLeakListResponse.RequestId"));
		describeAccesskeyLeakListResponse.setGmtLast(_ctx.longValue("DescribeAccesskeyLeakListResponse.GmtLast"));
		describeAccesskeyLeakListResponse.setAkLeakCount(_ctx.integerValue("DescribeAccesskeyLeakListResponse.AkLeakCount"));
		describeAccesskeyLeakListResponse.setPageSize(_ctx.integerValue("DescribeAccesskeyLeakListResponse.PageSize"));
		describeAccesskeyLeakListResponse.setCurrentPage(_ctx.integerValue("DescribeAccesskeyLeakListResponse.CurrentPage"));
		describeAccesskeyLeakListResponse.setTotalCount(_ctx.integerValue("DescribeAccesskeyLeakListResponse.TotalCount"));

		List<AccessKeyLeak> accessKeyLeakList = new ArrayList<AccessKeyLeak>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccesskeyLeakListResponse.AccessKeyLeakList.Length"); i++) {
			AccessKeyLeak accessKeyLeak = new AccessKeyLeak();
			accessKeyLeak.setId(_ctx.longValue("DescribeAccesskeyLeakListResponse.AccessKeyLeakList["+ i +"].Id"));
			accessKeyLeak.setGmtModified(_ctx.longValue("DescribeAccesskeyLeakListResponse.AccessKeyLeakList["+ i +"].GmtModified"));
			accessKeyLeak.setAsset(_ctx.stringValue("DescribeAccesskeyLeakListResponse.AccessKeyLeakList["+ i +"].Asset"));
			accessKeyLeak.setType(_ctx.stringValue("DescribeAccesskeyLeakListResponse.AccessKeyLeakList["+ i +"].Type"));
			accessKeyLeak.setAccesskeyId(_ctx.stringValue("DescribeAccesskeyLeakListResponse.AccessKeyLeakList["+ i +"].AccesskeyId"));
			accessKeyLeak.setStatus(_ctx.stringValue("DescribeAccesskeyLeakListResponse.AccessKeyLeakList["+ i +"].Status"));
			accessKeyLeak.setAliUserName(_ctx.stringValue("DescribeAccesskeyLeakListResponse.AccessKeyLeakList["+ i +"].AliUserName"));
			accessKeyLeak.setDealType(_ctx.stringValue("DescribeAccesskeyLeakListResponse.AccessKeyLeakList["+ i +"].DealType"));
			accessKeyLeak.setDealTime(_ctx.stringValue("DescribeAccesskeyLeakListResponse.AccessKeyLeakList["+ i +"].DealTime"));
			accessKeyLeak.setUserType(_ctx.stringValue("DescribeAccesskeyLeakListResponse.AccessKeyLeakList["+ i +"].UserType"));
			accessKeyLeak.setUrl(_ctx.stringValue("DescribeAccesskeyLeakListResponse.AccessKeyLeakList["+ i +"].Url"));

			accessKeyLeakList.add(accessKeyLeak);
		}
		describeAccesskeyLeakListResponse.setAccessKeyLeakList(accessKeyLeakList);
	 
	 	return describeAccesskeyLeakListResponse;
	}
}