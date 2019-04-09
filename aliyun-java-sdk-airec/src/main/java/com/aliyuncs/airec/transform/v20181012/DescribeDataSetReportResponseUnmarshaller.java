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

package com.aliyuncs.airec.transform.v20181012;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20181012.DescribeDataSetReportResponse;
import com.aliyuncs.airec.model.v20181012.DescribeDataSetReportResponse.Result;
import com.aliyuncs.airec.model.v20181012.DescribeDataSetReportResponse.Result.DetailItem;
import com.aliyuncs.airec.model.v20181012.DescribeDataSetReportResponse.Result.Overall;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataSetReportResponseUnmarshaller {

	public static DescribeDataSetReportResponse unmarshall(DescribeDataSetReportResponse describeDataSetReportResponse, UnmarshallerContext context) {
		
		describeDataSetReportResponse.setRequestId(context.stringValue("DescribeDataSetReportResponse.RequestId"));
		describeDataSetReportResponse.setCode(context.stringValue("DescribeDataSetReportResponse.Code"));
		describeDataSetReportResponse.setMessage(context.stringValue("DescribeDataSetReportResponse.Message"));

		Result result = new Result();

		Overall overall = new Overall();
		overall.setBhvCount(context.integerValue("DescribeDataSetReportResponse.Result.Overall.BhvCount"));
		overall.setItemItemCount(context.integerValue("DescribeDataSetReportResponse.Result.Overall.ItemItemCount"));
		overall.setUserUserCount(context.integerValue("DescribeDataSetReportResponse.Result.Overall.UserUserCount"));
		overall.setItemRepetitiveRate(context.floatValue("DescribeDataSetReportResponse.Result.Overall.ItemRepetitiveRate"));
		overall.setUserRepetitiveRate(context.floatValue("DescribeDataSetReportResponse.Result.Overall.UserRepetitiveRate"));
		overall.setUserLegalRate(context.floatValue("DescribeDataSetReportResponse.Result.Overall.UserLegalRate"));
		overall.setItemLegalRate(context.floatValue("DescribeDataSetReportResponse.Result.Overall.ItemLegalRate"));
		overall.setBhvLegalRate(context.floatValue("DescribeDataSetReportResponse.Result.Overall.BhvLegalRate"));
		overall.setUserCompleteRate(context.floatValue("DescribeDataSetReportResponse.Result.Overall.UserCompleteRate"));
		overall.setItemCompleteRate(context.floatValue("DescribeDataSetReportResponse.Result.Overall.ItemCompleteRate"));
		overall.setUserLoginRate(context.floatValue("DescribeDataSetReportResponse.Result.Overall.UserLoginRate"));
		overall.setItemLoginRate(context.floatValue("DescribeDataSetReportResponse.Result.Overall.ItemLoginRate"));
		result.setOverall(overall);

		List<DetailItem> detail = new ArrayList<DetailItem>();
		for (int i = 0; i < context.lengthValue("DescribeDataSetReportResponse.Result.Detail.Length"); i++) {
			DetailItem detailItem = new DetailItem();
			detailItem.setBizDate(context.longValue("DescribeDataSetReportResponse.Result.Detail["+ i +"].BizDate"));
			detailItem.setPv(context.longValue("DescribeDataSetReportResponse.Result.Detail["+ i +"].Pv"));
			detailItem.setUv(context.longValue("DescribeDataSetReportResponse.Result.Detail["+ i +"].Uv"));
			detailItem.setClick(context.longValue("DescribeDataSetReportResponse.Result.Detail["+ i +"].Click"));
			detailItem.setCtr(context.floatValue("DescribeDataSetReportResponse.Result.Detail["+ i +"].Ctr"));
			detailItem.setUvCtr(context.floatValue("DescribeDataSetReportResponse.Result.Detail["+ i +"].UvCtr"));
			detailItem.setPerUvBhv(context.floatValue("DescribeDataSetReportResponse.Result.Detail["+ i +"].PerUvBhv"));
			detailItem.setPerUvClick(context.floatValue("DescribeDataSetReportResponse.Result.Detail["+ i +"].PerUvClick"));
			detailItem.setClickUser(context.longValue("DescribeDataSetReportResponse.Result.Detail["+ i +"].ClickUser"));
			detailItem.setActiveItem(context.longValue("DescribeDataSetReportResponse.Result.Detail["+ i +"].ActiveItem"));

			detail.add(detailItem);
		}
		result.setDetail(detail);
		describeDataSetReportResponse.setResult(result);
	 
	 	return describeDataSetReportResponse;
	}
}