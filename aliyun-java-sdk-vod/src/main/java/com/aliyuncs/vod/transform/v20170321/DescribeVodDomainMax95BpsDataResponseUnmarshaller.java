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

import com.aliyuncs.vod.model.v20170321.DescribeVodDomainMax95BpsDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainMax95BpsDataResponse.Max95Detail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodDomainMax95BpsDataResponseUnmarshaller {

	public static DescribeVodDomainMax95BpsDataResponse unmarshall(DescribeVodDomainMax95BpsDataResponse describeVodDomainMax95BpsDataResponse, UnmarshallerContext _ctx) {
		
		describeVodDomainMax95BpsDataResponse.setRequestId(_ctx.stringValue("DescribeVodDomainMax95BpsDataResponse.RequestId"));
		describeVodDomainMax95BpsDataResponse.setDomainName(_ctx.stringValue("DescribeVodDomainMax95BpsDataResponse.DomainName"));
		describeVodDomainMax95BpsDataResponse.setEndTime(_ctx.stringValue("DescribeVodDomainMax95BpsDataResponse.EndTime"));
		describeVodDomainMax95BpsDataResponse.setStartTime(_ctx.stringValue("DescribeVodDomainMax95BpsDataResponse.StartTime"));
		describeVodDomainMax95BpsDataResponse.setDomesticMax95Bps(_ctx.stringValue("DescribeVodDomainMax95BpsDataResponse.DomesticMax95Bps"));
		describeVodDomainMax95BpsDataResponse.setOverseasMax95Bps(_ctx.stringValue("DescribeVodDomainMax95BpsDataResponse.OverseasMax95Bps"));
		describeVodDomainMax95BpsDataResponse.setMax95Bps(_ctx.stringValue("DescribeVodDomainMax95BpsDataResponse.Max95Bps"));

		List<Max95Detail> detailData = new ArrayList<Max95Detail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodDomainMax95BpsDataResponse.DetailData.Length"); i++) {
			Max95Detail max95Detail = new Max95Detail();
			max95Detail.setTimeStamp(_ctx.stringValue("DescribeVodDomainMax95BpsDataResponse.DetailData["+ i +"].TimeStamp"));
			max95Detail.setArea(_ctx.stringValue("DescribeVodDomainMax95BpsDataResponse.DetailData["+ i +"].Area"));
			max95Detail.setMax95BpsPeakTime(_ctx.stringValue("DescribeVodDomainMax95BpsDataResponse.DetailData["+ i +"].Max95BpsPeakTime"));
			max95Detail.setMax95Bps(_ctx.floatValue("DescribeVodDomainMax95BpsDataResponse.DetailData["+ i +"].Max95Bps"));

			detailData.add(max95Detail);
		}
		describeVodDomainMax95BpsDataResponse.setDetailData(detailData);
	 
	 	return describeVodDomainMax95BpsDataResponse;
	}
}