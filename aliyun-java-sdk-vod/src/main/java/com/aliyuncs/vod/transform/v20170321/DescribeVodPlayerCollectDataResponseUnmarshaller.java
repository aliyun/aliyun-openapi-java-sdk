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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.DescribeVodPlayerCollectDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodPlayerCollectDataResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodPlayerCollectDataResponseUnmarshaller {

	public static DescribeVodPlayerCollectDataResponse unmarshall(DescribeVodPlayerCollectDataResponse describeVodPlayerCollectDataResponse, UnmarshallerContext _ctx) {
		
		describeVodPlayerCollectDataResponse.setRequestId(_ctx.stringValue("DescribeVodPlayerCollectDataResponse.RequestId"));

		List<Datas> dataList = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodPlayerCollectDataResponse.DataList.Length"); i++) {
			Datas datas = new Datas();
			datas.setMetric(_ctx.stringValue("DescribeVodPlayerCollectDataResponse.DataList["+ i +"].Metric"));
			datas.setValue(_ctx.doubleValue("DescribeVodPlayerCollectDataResponse.DataList["+ i +"].Value"));
			datas.setValueRefer(_ctx.doubleValue("DescribeVodPlayerCollectDataResponse.DataList["+ i +"].ValueRefer"));
			datas.setValueRatio(_ctx.doubleValue("DescribeVodPlayerCollectDataResponse.DataList["+ i +"].ValueRatio"));

			dataList.add(datas);
		}
		describeVodPlayerCollectDataResponse.setDataList(dataList);
	 
	 	return describeVodPlayerCollectDataResponse;
	}
}