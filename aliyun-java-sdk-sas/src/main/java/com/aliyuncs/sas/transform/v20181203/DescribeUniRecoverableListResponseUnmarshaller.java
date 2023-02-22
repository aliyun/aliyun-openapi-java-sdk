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

import com.aliyuncs.sas.model.v20181203.DescribeUniRecoverableListResponse;
import com.aliyuncs.sas.model.v20181203.DescribeUniRecoverableListResponse.RecoverableInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUniRecoverableListResponseUnmarshaller {

	public static DescribeUniRecoverableListResponse unmarshall(DescribeUniRecoverableListResponse describeUniRecoverableListResponse, UnmarshallerContext _ctx) {
		
		describeUniRecoverableListResponse.setRequestId(_ctx.stringValue("DescribeUniRecoverableListResponse.RequestId"));
		describeUniRecoverableListResponse.setCurrentPage(_ctx.integerValue("DescribeUniRecoverableListResponse.CurrentPage"));
		describeUniRecoverableListResponse.setDatabase(_ctx.stringValue("DescribeUniRecoverableListResponse.Database"));
		describeUniRecoverableListResponse.setPageSize(_ctx.integerValue("DescribeUniRecoverableListResponse.PageSize"));
		describeUniRecoverableListResponse.setTotalCount(_ctx.integerValue("DescribeUniRecoverableListResponse.TotalCount"));
		describeUniRecoverableListResponse.setCount(_ctx.integerValue("DescribeUniRecoverableListResponse.Count"));

		List<RecoverableInfoItem> recoverableInfoList = new ArrayList<RecoverableInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUniRecoverableListResponse.RecoverableInfoList.Length"); i++) {
			RecoverableInfoItem recoverableInfoItem = new RecoverableInfoItem();
			recoverableInfoItem.setLastTime(_ctx.longValue("DescribeUniRecoverableListResponse.RecoverableInfoList["+ i +"].LastTime"));
			recoverableInfoItem.setResetTime(_ctx.longValue("DescribeUniRecoverableListResponse.RecoverableInfoList["+ i +"].ResetTime"));
			recoverableInfoItem.setRestoreInfo(_ctx.stringValue("DescribeUniRecoverableListResponse.RecoverableInfoList["+ i +"].RestoreInfo"));
			recoverableInfoItem.setFirstTime(_ctx.longValue("DescribeUniRecoverableListResponse.RecoverableInfoList["+ i +"].FirstTime"));
			recoverableInfoItem.setName(_ctx.stringValue("DescribeUniRecoverableListResponse.RecoverableInfoList["+ i +"].Name"));
			recoverableInfoItem.setResetScn(_ctx.stringValue("DescribeUniRecoverableListResponse.RecoverableInfoList["+ i +"].ResetScn"));

			recoverableInfoList.add(recoverableInfoItem);
		}
		describeUniRecoverableListResponse.setRecoverableInfoList(recoverableInfoList);
	 
	 	return describeUniRecoverableListResponse;
	}
}