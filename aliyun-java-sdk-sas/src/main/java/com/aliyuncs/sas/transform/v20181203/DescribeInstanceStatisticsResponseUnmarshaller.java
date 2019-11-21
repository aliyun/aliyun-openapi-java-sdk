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

import com.aliyuncs.sas.model.v20181203.DescribeInstanceStatisticsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeInstanceStatisticsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceStatisticsResponseUnmarshaller {

	public static DescribeInstanceStatisticsResponse unmarshall(DescribeInstanceStatisticsResponse describeInstanceStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeInstanceStatisticsResponse.setRequestId(_ctx.stringValue("DescribeInstanceStatisticsResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceStatisticsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setUuid(_ctx.stringValue("DescribeInstanceStatisticsResponse.Data["+ i +"].Uuid"));
			dataItem.setAccount(_ctx.integerValue("DescribeInstanceStatisticsResponse.Data["+ i +"].Account"));
			dataItem.setHealth(_ctx.integerValue("DescribeInstanceStatisticsResponse.Data["+ i +"].Health"));
			dataItem.setTrojan(_ctx.integerValue("DescribeInstanceStatisticsResponse.Data["+ i +"].Trojan"));
			dataItem.setSuspicious(_ctx.integerValue("DescribeInstanceStatisticsResponse.Data["+ i +"].Suspicious"));
			dataItem.setVul(_ctx.integerValue("DescribeInstanceStatisticsResponse.Data["+ i +"].Vul"));
			dataItem.setCveNum(_ctx.integerValue("DescribeInstanceStatisticsResponse.Data["+ i +"].CveNum"));
			dataItem.setEmgNum(_ctx.integerValue("DescribeInstanceStatisticsResponse.Data["+ i +"].EmgNum"));
			dataItem.setSysNum(_ctx.integerValue("DescribeInstanceStatisticsResponse.Data["+ i +"].SysNum"));
			dataItem.setCmsNum(_ctx.integerValue("DescribeInstanceStatisticsResponse.Data["+ i +"].CmsNum"));
			dataItem.setAppNum(_ctx.integerValue("DescribeInstanceStatisticsResponse.Data["+ i +"].AppNum"));

			data.add(dataItem);
		}
		describeInstanceStatisticsResponse.setData(data);
	 
	 	return describeInstanceStatisticsResponse;
	}
}