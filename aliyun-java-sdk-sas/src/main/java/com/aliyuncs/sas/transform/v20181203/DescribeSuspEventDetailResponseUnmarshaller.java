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

import com.aliyuncs.sas.model.v20181203.DescribeSuspEventDetailResponse;
import com.aliyuncs.sas.model.v20181203.DescribeSuspEventDetailResponse.QuaraFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSuspEventDetailResponseUnmarshaller {

	public static DescribeSuspEventDetailResponse unmarshall(DescribeSuspEventDetailResponse describeSuspEventDetailResponse, UnmarshallerContext _ctx) {
		
		describeSuspEventDetailResponse.setRequestId(_ctx.stringValue("DescribeSuspEventDetailResponse.RequestId"));
		describeSuspEventDetailResponse.setLastTime(_ctx.stringValue("DescribeSuspEventDetailResponse.LastTime"));
		describeSuspEventDetailResponse.setId(_ctx.integerValue("DescribeSuspEventDetailResponse.Id"));
		describeSuspEventDetailResponse.setInstanceName(_ctx.stringValue("DescribeSuspEventDetailResponse.InstanceName"));
		describeSuspEventDetailResponse.setInternetIp(_ctx.stringValue("DescribeSuspEventDetailResponse.InternetIp"));
		describeSuspEventDetailResponse.setIntranetIp(_ctx.stringValue("DescribeSuspEventDetailResponse.IntranetIp"));
		describeSuspEventDetailResponse.setUuid(_ctx.stringValue("DescribeSuspEventDetailResponse.Uuid"));
		describeSuspEventDetailResponse.setEventDesc(_ctx.stringValue("DescribeSuspEventDetailResponse.EventDesc"));
		describeSuspEventDetailResponse.setEventTypeDesc(_ctx.stringValue("DescribeSuspEventDetailResponse.EventTypeDesc"));
		describeSuspEventDetailResponse.setLevel(_ctx.stringValue("DescribeSuspEventDetailResponse.Level"));
		describeSuspEventDetailResponse.setEventStatus(_ctx.stringValue("DescribeSuspEventDetailResponse.EventStatus"));
		describeSuspEventDetailResponse.setSaleVersion(_ctx.stringValue("DescribeSuspEventDetailResponse.SaleVersion"));
		describeSuspEventDetailResponse.setDataSource(_ctx.stringValue("DescribeSuspEventDetailResponse.DataSource"));
		describeSuspEventDetailResponse.setType(_ctx.stringValue("DescribeSuspEventDetailResponse.Type"));
		describeSuspEventDetailResponse.setOperateMsg(_ctx.stringValue("DescribeSuspEventDetailResponse.OperateMsg"));
		describeSuspEventDetailResponse.setSasId(_ctx.stringValue("DescribeSuspEventDetailResponse.SasId"));
		describeSuspEventDetailResponse.setEventName(_ctx.stringValue("DescribeSuspEventDetailResponse.EventName"));
		describeSuspEventDetailResponse.setCanBeDealOnLine(_ctx.booleanValue("DescribeSuspEventDetailResponse.CanBeDealOnLine"));
		describeSuspEventDetailResponse.setOperateErrorCode(_ctx.stringValue("DescribeSuspEventDetailResponse.OperateErrorCode"));

		List<QuaraFile> details = new ArrayList<QuaraFile>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSuspEventDetailResponse.Details.Length"); i++) {
			QuaraFile quaraFile = new QuaraFile();
			quaraFile.setName(_ctx.stringValue("DescribeSuspEventDetailResponse.Details["+ i +"].Name"));
			quaraFile.setType(_ctx.stringValue("DescribeSuspEventDetailResponse.Details["+ i +"].Type"));
			quaraFile.setInfoType(_ctx.stringValue("DescribeSuspEventDetailResponse.Details["+ i +"].InfoType"));
			quaraFile.setValue(_ctx.stringValue("DescribeSuspEventDetailResponse.Details["+ i +"].Value"));

			details.add(quaraFile);
		}
		describeSuspEventDetailResponse.setDetails(details);
	 
	 	return describeSuspEventDetailResponse;
	}
}