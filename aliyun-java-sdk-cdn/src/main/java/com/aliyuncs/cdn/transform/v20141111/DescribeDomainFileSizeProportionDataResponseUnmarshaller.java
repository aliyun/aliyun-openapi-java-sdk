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

package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeDomainFileSizeProportionDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainFileSizeProportionDataResponse.UsageData;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainFileSizeProportionDataResponse.UsageData.FileSizeProportionData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainFileSizeProportionDataResponseUnmarshaller {

	public static DescribeDomainFileSizeProportionDataResponse unmarshall(DescribeDomainFileSizeProportionDataResponse describeDomainFileSizeProportionDataResponse, UnmarshallerContext _ctx) {
		
		describeDomainFileSizeProportionDataResponse.setRequestId(_ctx.stringValue("DescribeDomainFileSizeProportionDataResponse.RequestId"));
		describeDomainFileSizeProportionDataResponse.setDomainName(_ctx.stringValue("DescribeDomainFileSizeProportionDataResponse.DomainName"));
		describeDomainFileSizeProportionDataResponse.setDataInterval(_ctx.stringValue("DescribeDomainFileSizeProportionDataResponse.DataInterval"));
		describeDomainFileSizeProportionDataResponse.setStartTime(_ctx.stringValue("DescribeDomainFileSizeProportionDataResponse.StartTime"));
		describeDomainFileSizeProportionDataResponse.setEndTime(_ctx.stringValue("DescribeDomainFileSizeProportionDataResponse.EndTime"));

		List<UsageData> fileSizeProportionDataInterval = new ArrayList<UsageData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainFileSizeProportionDataResponse.FileSizeProportionDataInterval.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setTimeStamp(_ctx.stringValue("DescribeDomainFileSizeProportionDataResponse.FileSizeProportionDataInterval["+ i +"].TimeStamp"));

			List<FileSizeProportionData> value = new ArrayList<FileSizeProportionData>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDomainFileSizeProportionDataResponse.FileSizeProportionDataInterval["+ i +"].Value.Length"); j++) {
				FileSizeProportionData fileSizeProportionData = new FileSizeProportionData();
				fileSizeProportionData.setFileSize(_ctx.stringValue("DescribeDomainFileSizeProportionDataResponse.FileSizeProportionDataInterval["+ i +"].Value["+ j +"].FileSize"));
				fileSizeProportionData.setProportion(_ctx.stringValue("DescribeDomainFileSizeProportionDataResponse.FileSizeProportionDataInterval["+ i +"].Value["+ j +"].Proportion"));

				value.add(fileSizeProportionData);
			}
			usageData.setValue(value);

			fileSizeProportionDataInterval.add(usageData);
		}
		describeDomainFileSizeProportionDataResponse.setFileSizeProportionDataInterval(fileSizeProportionDataInterval);
	 
	 	return describeDomainFileSizeProportionDataResponse;
	}
}