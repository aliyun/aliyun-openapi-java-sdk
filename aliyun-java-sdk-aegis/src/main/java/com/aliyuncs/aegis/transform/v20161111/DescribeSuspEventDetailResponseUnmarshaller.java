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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeSuspEventDetailResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeSuspEventDetailResponse.QuaraFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSuspEventDetailResponseUnmarshaller {

	public static DescribeSuspEventDetailResponse unmarshall(DescribeSuspEventDetailResponse describeSuspEventDetailResponse, UnmarshallerContext context) {
		
		describeSuspEventDetailResponse.setRequestId(context.stringValue("DescribeSuspEventDetailResponse.RequestId"));
		describeSuspEventDetailResponse.setLastTime(context.stringValue("DescribeSuspEventDetailResponse.LastTime"));
		describeSuspEventDetailResponse.setId(context.integerValue("DescribeSuspEventDetailResponse.Id"));
		describeSuspEventDetailResponse.setInstanceName(context.stringValue("DescribeSuspEventDetailResponse.InstanceName"));
		describeSuspEventDetailResponse.setInternetIp(context.stringValue("DescribeSuspEventDetailResponse.InternetIp"));
		describeSuspEventDetailResponse.setIntranetIp(context.stringValue("DescribeSuspEventDetailResponse.IntranetIp"));
		describeSuspEventDetailResponse.setUuid(context.stringValue("DescribeSuspEventDetailResponse.Uuid"));
		describeSuspEventDetailResponse.setEventDesc(context.stringValue("DescribeSuspEventDetailResponse.EventDesc"));
		describeSuspEventDetailResponse.setEventTypeDesc(context.stringValue("DescribeSuspEventDetailResponse.EventTypeDesc"));
		describeSuspEventDetailResponse.setLevel(context.stringValue("DescribeSuspEventDetailResponse.Level"));
		describeSuspEventDetailResponse.setEventStatus(context.stringValue("DescribeSuspEventDetailResponse.EventStatus"));
		describeSuspEventDetailResponse.setSaleVersion(context.stringValue("DescribeSuspEventDetailResponse.SaleVersion"));
		describeSuspEventDetailResponse.setDataSource(context.stringValue("DescribeSuspEventDetailResponse.DataSource"));
		describeSuspEventDetailResponse.setType(context.stringValue("DescribeSuspEventDetailResponse.Type"));
		describeSuspEventDetailResponse.setOperateMsg(context.stringValue("DescribeSuspEventDetailResponse.OperateMsg"));
		describeSuspEventDetailResponse.setSasId(context.stringValue("DescribeSuspEventDetailResponse.SasId"));
		describeSuspEventDetailResponse.setEventName(context.stringValue("DescribeSuspEventDetailResponse.EventName"));
		describeSuspEventDetailResponse.setCanBeDealOnLine(context.booleanValue("DescribeSuspEventDetailResponse.CanBeDealOnLine"));

		List<QuaraFile> details = new ArrayList<QuaraFile>();
		for (int i = 0; i < context.lengthValue("DescribeSuspEventDetailResponse.Details.Length"); i++) {
			QuaraFile quaraFile = new QuaraFile();
			quaraFile.setName(context.stringValue("DescribeSuspEventDetailResponse.Details["+ i +"].Name"));
			quaraFile.setType(context.stringValue("DescribeSuspEventDetailResponse.Details["+ i +"].Type"));
			quaraFile.setInfoType(context.stringValue("DescribeSuspEventDetailResponse.Details["+ i +"].InfoType"));
			quaraFile.setValue(context.stringValue("DescribeSuspEventDetailResponse.Details["+ i +"].Value"));

			details.add(quaraFile);
		}
		describeSuspEventDetailResponse.setDetails(details);
	 
	 	return describeSuspEventDetailResponse;
	}
}