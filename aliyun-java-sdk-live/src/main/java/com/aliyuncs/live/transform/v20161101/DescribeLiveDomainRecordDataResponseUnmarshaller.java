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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainRecordDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainRecordDataResponse.RecordDataInfo;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainRecordDataResponse.RecordDataInfo.Detail;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainRecordDataResponseUnmarshaller {

	public static DescribeLiveDomainRecordDataResponse unmarshall(DescribeLiveDomainRecordDataResponse describeLiveDomainRecordDataResponse, UnmarshallerContext context) {
		
		describeLiveDomainRecordDataResponse.setRequestId(context.stringValue("DescribeLiveDomainRecordDataResponse.RequestId"));

		List<RecordDataInfo> recordDataInfos = new ArrayList<RecordDataInfo>();
		for (int i = 0; i < context.lengthValue("DescribeLiveDomainRecordDataResponse.RecordDataInfos.Length"); i++) {
			RecordDataInfo recordDataInfo = new RecordDataInfo();
			recordDataInfo.setDate(context.stringValue("DescribeLiveDomainRecordDataResponse.RecordDataInfos["+ i +"].Date"));
			recordDataInfo.setTotal(context.integerValue("DescribeLiveDomainRecordDataResponse.RecordDataInfos["+ i +"].Total"));

			Detail detail = new Detail();
			detail.setMP4(context.integerValue("DescribeLiveDomainRecordDataResponse.RecordDataInfos["+ i +"].Detail.MP4"));
			detail.setFLV(context.integerValue("DescribeLiveDomainRecordDataResponse.RecordDataInfos["+ i +"].Detail.FLV"));
			detail.setTS(context.integerValue("DescribeLiveDomainRecordDataResponse.RecordDataInfos["+ i +"].Detail.TS"));
			recordDataInfo.setDetail(detail);

			recordDataInfos.add(recordDataInfo);
		}
		describeLiveDomainRecordDataResponse.setRecordDataInfos(recordDataInfos);
	 
	 	return describeLiveDomainRecordDataResponse;
	}
}