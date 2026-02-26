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

import com.aliyuncs.advisor_share.model.v20180608.DescribeAdvicesPageResponse;
import com.aliyuncs.advisor_share.model.v20180608.DescribeAdvicesPageResponse.Data;
import com.aliyuncs.advisor_share.model.v20180608.DescribeAdvicesPageResponse.Data.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAdvicesPageResponseUnmarshaller {

	public static DescribeAdvicesPageResponse unmarshall(DescribeAdvicesPageResponse describeAdvicesPageResponse, UnmarshallerContext _ctx) {
		
		describeAdvicesPageResponse.setRequestId(_ctx.stringValue("DescribeAdvicesPageResponse.RequestId"));

		Data data = new Data();
		data.setPageNo(_ctx.longValue("DescribeAdvicesPageResponse.Data.PageNo"));
		data.setPageSize(_ctx.longValue("DescribeAdvicesPageResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("DescribeAdvicesPageResponse.Data.Total"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAdvicesPageResponse.Data.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAction(_ctx.stringValue("DescribeAdvicesPageResponse.Data.Result["+ i +"].Action"));
			resultItem.setAliyunId(_ctx.longValue("DescribeAdvicesPageResponse.Data.Result["+ i +"].AliyunId"));
			resultItem.setCheckId(_ctx.stringValue("DescribeAdvicesPageResponse.Data.Result["+ i +"].CheckId"));
			resultItem.setCheckName(_ctx.stringValue("DescribeAdvicesPageResponse.Data.Result["+ i +"].CheckName"));
			resultItem.setContent(_ctx.stringValue("DescribeAdvicesPageResponse.Data.Result["+ i +"].Content"));
			resultItem.setDescription(_ctx.stringValue("DescribeAdvicesPageResponse.Data.Result["+ i +"].Description"));
			resultItem.setDetails(_ctx.stringValue("DescribeAdvicesPageResponse.Data.Result["+ i +"].Details"));
			resultItem.setGmtCreated(_ctx.stringValue("DescribeAdvicesPageResponse.Data.Result["+ i +"].GmtCreated"));
			resultItem.setGmtModified(_ctx.stringValue("DescribeAdvicesPageResponse.Data.Result["+ i +"].GmtModified"));
			resultItem.setId(_ctx.longValue("DescribeAdvicesPageResponse.Data.Result["+ i +"].Id"));
			resultItem.setIsExpired(_ctx.booleanValue("DescribeAdvicesPageResponse.Data.Result["+ i +"].IsExpired"));
			resultItem.setLinks(_ctx.stringValue("DescribeAdvicesPageResponse.Data.Result["+ i +"].Links"));
			resultItem.setProduct(_ctx.stringValue("DescribeAdvicesPageResponse.Data.Result["+ i +"].Product"));
			resultItem.setReason(_ctx.stringValue("DescribeAdvicesPageResponse.Data.Result["+ i +"].Reason"));
			resultItem.setResource(_ctx.stringValue("DescribeAdvicesPageResponse.Data.Result["+ i +"].Resource"));
			resultItem.setResourceId(_ctx.stringValue("DescribeAdvicesPageResponse.Data.Result["+ i +"].ResourceId"));
			resultItem.setSeverity(_ctx.longValue("DescribeAdvicesPageResponse.Data.Result["+ i +"].Severity"));

			result.add(resultItem);
		}
		data.setResult(result);
		describeAdvicesPageResponse.setData(data);
	 
	 	return describeAdvicesPageResponse;
	}
}