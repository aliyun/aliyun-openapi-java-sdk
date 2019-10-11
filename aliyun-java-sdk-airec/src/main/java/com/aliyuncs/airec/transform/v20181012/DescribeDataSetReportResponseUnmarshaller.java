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

	public static DescribeDataSetReportResponse unmarshall(DescribeDataSetReportResponse describeDataSetReportResponse, UnmarshallerContext _ctx) {
		
		describeDataSetReportResponse.setRequestId(_ctx.stringValue("DescribeDataSetReportResponse.RequestId"));
		describeDataSetReportResponse.setCode(_ctx.stringValue("DescribeDataSetReportResponse.Code"));
		describeDataSetReportResponse.setMessage(_ctx.stringValue("DescribeDataSetReportResponse.Message"));

		Result result = new Result();

		Overall overall = new Overall();
		overall.setBhvCount(_ctx.integerValue("DescribeDataSetReportResponse.Result.Overall.BhvCount"));
		overall.setItemItemCount(_ctx.integerValue("DescribeDataSetReportResponse.Result.Overall.ItemItemCount"));
		overall.setUserUserCount(_ctx.integerValue("DescribeDataSetReportResponse.Result.Overall.UserUserCount"));
		overall.setItemRepetitiveRate(_ctx.floatValue("DescribeDataSetReportResponse.Result.Overall.ItemRepetitiveRate"));
		overall.setUserRepetitiveRate(_ctx.floatValue("DescribeDataSetReportResponse.Result.Overall.UserRepetitiveRate"));
		overall.setUserLegalRate(_ctx.floatValue("DescribeDataSetReportResponse.Result.Overall.UserLegalRate"));
		overall.setItemLegalRate(_ctx.floatValue("DescribeDataSetReportResponse.Result.Overall.ItemLegalRate"));
		overall.setBhvLegalRate(_ctx.floatValue("DescribeDataSetReportResponse.Result.Overall.BhvLegalRate"));
		overall.setUserCompleteRate(_ctx.floatValue("DescribeDataSetReportResponse.Result.Overall.UserCompleteRate"));
		overall.setItemCompleteRate(_ctx.floatValue("DescribeDataSetReportResponse.Result.Overall.ItemCompleteRate"));
		overall.setUserLoginRate(_ctx.floatValue("DescribeDataSetReportResponse.Result.Overall.UserLoginRate"));
		overall.setItemLoginRate(_ctx.floatValue("DescribeDataSetReportResponse.Result.Overall.ItemLoginRate"));
		result.setOverall(overall);

		List<DetailItem> detail = new ArrayList<DetailItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataSetReportResponse.Result.Detail.Length"); i++) {
			DetailItem detailItem = new DetailItem();
			detailItem.setBizDate(_ctx.longValue("DescribeDataSetReportResponse.Result.Detail["+ i +"].BizDate"));
			detailItem.setPv(_ctx.longValue("DescribeDataSetReportResponse.Result.Detail["+ i +"].Pv"));
			detailItem.setUv(_ctx.longValue("DescribeDataSetReportResponse.Result.Detail["+ i +"].Uv"));
			detailItem.setClick(_ctx.longValue("DescribeDataSetReportResponse.Result.Detail["+ i +"].Click"));
			detailItem.setCtr(_ctx.floatValue("DescribeDataSetReportResponse.Result.Detail["+ i +"].Ctr"));
			detailItem.setUvCtr(_ctx.floatValue("DescribeDataSetReportResponse.Result.Detail["+ i +"].UvCtr"));
			detailItem.setPerUvBhv(_ctx.floatValue("DescribeDataSetReportResponse.Result.Detail["+ i +"].PerUvBhv"));
			detailItem.setPerUvClick(_ctx.floatValue("DescribeDataSetReportResponse.Result.Detail["+ i +"].PerUvClick"));
			detailItem.setClickUser(_ctx.longValue("DescribeDataSetReportResponse.Result.Detail["+ i +"].ClickUser"));
			detailItem.setActiveItem(_ctx.longValue("DescribeDataSetReportResponse.Result.Detail["+ i +"].ActiveItem"));

			detail.add(detailItem);
		}
		result.setDetail(detail);
		describeDataSetReportResponse.setResult(result);
	 
	 	return describeDataSetReportResponse;
	}
}