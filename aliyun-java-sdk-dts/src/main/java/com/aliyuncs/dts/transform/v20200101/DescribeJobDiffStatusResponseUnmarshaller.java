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

package com.aliyuncs.dts.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dts.model.v20200101.DescribeJobDiffStatusResponse;
import com.aliyuncs.dts.model.v20200101.DescribeJobDiffStatusResponse.DiffInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeJobDiffStatusResponseUnmarshaller {

	public static DescribeJobDiffStatusResponse unmarshall(DescribeJobDiffStatusResponse describeJobDiffStatusResponse, UnmarshallerContext _ctx) {
		
		describeJobDiffStatusResponse.setRequestId(_ctx.stringValue("DescribeJobDiffStatusResponse.RequestId"));
		describeJobDiffStatusResponse.setDynamicCode(_ctx.stringValue("DescribeJobDiffStatusResponse.DynamicCode"));
		describeJobDiffStatusResponse.setDynamicMessage(_ctx.stringValue("DescribeJobDiffStatusResponse.DynamicMessage"));
		describeJobDiffStatusResponse.setErrCode(_ctx.stringValue("DescribeJobDiffStatusResponse.ErrCode"));
		describeJobDiffStatusResponse.setErrMessage(_ctx.stringValue("DescribeJobDiffStatusResponse.ErrMessage"));
		describeJobDiffStatusResponse.setHttpStatusCode(_ctx.integerValue("DescribeJobDiffStatusResponse.HttpStatusCode"));
		describeJobDiffStatusResponse.setSuccess(_ctx.booleanValue("DescribeJobDiffStatusResponse.Success"));
		describeJobDiffStatusResponse.setTotal(_ctx.longValue("DescribeJobDiffStatusResponse.Total"));

		List<DiffInfosItem> diffInfos = new ArrayList<DiffInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobDiffStatusResponse.DiffInfos.Length"); i++) {
			DiffInfosItem diffInfosItem = new DiffInfosItem();
			diffInfosItem.setScheduleJobId(_ctx.stringValue("DescribeJobDiffStatusResponse.DiffInfos["+ i +"].ScheduleJobId"));
			diffInfosItem.setDbName(_ctx.stringValue("DescribeJobDiffStatusResponse.DiffInfos["+ i +"].DbName"));
			diffInfosItem.setTableName(_ctx.stringValue("DescribeJobDiffStatusResponse.DiffInfos["+ i +"].TableName"));
			diffInfosItem.setPkName(_ctx.stringValue("DescribeJobDiffStatusResponse.DiffInfos["+ i +"].PkName"));
			diffInfosItem.setPkValue(_ctx.stringValue("DescribeJobDiffStatusResponse.DiffInfos["+ i +"].PkValue"));
			diffInfosItem.setDiff(_ctx.stringValue("DescribeJobDiffStatusResponse.DiffInfos["+ i +"].Diff"));

			diffInfos.add(diffInfosItem);
		}
		describeJobDiffStatusResponse.setDiffInfos(diffInfos);
	 
	 	return describeJobDiffStatusResponse;
	}
}