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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeSlaEventListResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeSlaEventListResponse.SlaEventItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSlaEventListResponseUnmarshaller {

	public static DescribeSlaEventListResponse unmarshall(DescribeSlaEventListResponse describeSlaEventListResponse, UnmarshallerContext _ctx) {
		
		describeSlaEventListResponse.setRequestId(_ctx.stringValue("DescribeSlaEventListResponse.RequestId"));
		describeSlaEventListResponse.setTotal(_ctx.longValue("DescribeSlaEventListResponse.Total"));

		List<SlaEventItem> slaEvent = new ArrayList<SlaEventItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSlaEventListResponse.SlaEvent.Length"); i++) {
			SlaEventItem slaEventItem = new SlaEventItem();
			slaEventItem.setStartTime(_ctx.longValue("DescribeSlaEventListResponse.SlaEvent["+ i +"].StartTime"));
			slaEventItem.setEndTime(_ctx.longValue("DescribeSlaEventListResponse.SlaEvent["+ i +"].EndTime"));
			slaEventItem.setIp(_ctx.stringValue("DescribeSlaEventListResponse.SlaEvent["+ i +"].Ip"));
			slaEventItem.setRegion(_ctx.stringValue("DescribeSlaEventListResponse.SlaEvent["+ i +"].Region"));

			slaEvent.add(slaEventItem);
		}
		describeSlaEventListResponse.setSlaEvent(slaEvent);
	 
	 	return describeSlaEventListResponse;
	}
}