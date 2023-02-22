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

import com.aliyuncs.sas.model.v20181203.DescribeVulListPageResponse;
import com.aliyuncs.sas.model.v20181203.DescribeVulListPageResponse.DataList;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVulListPageResponseUnmarshaller {

	public static DescribeVulListPageResponse unmarshall(DescribeVulListPageResponse describeVulListPageResponse, UnmarshallerContext _ctx) {
		
		describeVulListPageResponse.setRequestId(_ctx.stringValue("DescribeVulListPageResponse.RequestId"));
		describeVulListPageResponse.setTotalCount(_ctx.integerValue("DescribeVulListPageResponse.TotalCount"));

		List<DataList> data = new ArrayList<DataList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVulListPageResponse.Data.Length"); i++) {
			DataList dataList = new DataList();
			dataList.setReleaseTime(_ctx.longValue("DescribeVulListPageResponse.Data["+ i +"].ReleaseTime"));
			dataList.setOtherId(_ctx.stringValue("DescribeVulListPageResponse.Data["+ i +"].OtherId"));
			dataList.setIsSas(_ctx.integerValue("DescribeVulListPageResponse.Data["+ i +"].IsSas"));
			dataList.setCveId(_ctx.stringValue("DescribeVulListPageResponse.Data["+ i +"].CveId"));
			dataList.setId(_ctx.longValue("DescribeVulListPageResponse.Data["+ i +"].Id"));
			dataList.setIsAegis(_ctx.integerValue("DescribeVulListPageResponse.Data["+ i +"].IsAegis"));
			dataList.setTitle(_ctx.stringValue("DescribeVulListPageResponse.Data["+ i +"].Title"));
			dataList.setExtAegis(_ctx.stringValue("DescribeVulListPageResponse.Data["+ i +"].ExtAegis"));

			data.add(dataList);
		}
		describeVulListPageResponse.setData(data);
	 
	 	return describeVulListPageResponse;
	}
}