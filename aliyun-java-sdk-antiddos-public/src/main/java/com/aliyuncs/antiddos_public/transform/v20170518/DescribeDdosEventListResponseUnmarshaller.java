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

package com.aliyuncs.antiddos_public.transform.v20170518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.antiddos_public.model.v20170518.DescribeDdosEventListResponse;
import com.aliyuncs.antiddos_public.model.v20170518.DescribeDdosEventListResponse.DdosEvent;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDdosEventListResponseUnmarshaller {

	public static DescribeDdosEventListResponse unmarshall(DescribeDdosEventListResponse describeDdosEventListResponse, UnmarshallerContext _ctx) {
		
		describeDdosEventListResponse.setRequestId(_ctx.stringValue("DescribeDdosEventListResponse.RequestId"));
		describeDdosEventListResponse.setTotal(_ctx.integerValue("DescribeDdosEventListResponse.Total"));

		List<DdosEvent> ddosEventList = new ArrayList<DdosEvent>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDdosEventListResponse.DdosEventList.Length"); i++) {
			DdosEvent ddosEvent = new DdosEvent();
			ddosEvent.setDdosType(_ctx.stringValue("DescribeDdosEventListResponse.DdosEventList["+ i +"].DdosType"));
			ddosEvent.setEndTime(_ctx.longValue("DescribeDdosEventListResponse.DdosEventList["+ i +"].EndTime"));
			ddosEvent.setStartTime(_ctx.longValue("DescribeDdosEventListResponse.DdosEventList["+ i +"].StartTime"));
			ddosEvent.setDelayTime(_ctx.longValue("DescribeDdosEventListResponse.DdosEventList["+ i +"].DelayTime"));
			ddosEvent.setDdosStatus(_ctx.stringValue("DescribeDdosEventListResponse.DdosEventList["+ i +"].DdosStatus"));
			ddosEvent.setUnBlackholeTime(_ctx.longValue("DescribeDdosEventListResponse.DdosEventList["+ i +"].UnBlackholeTime"));

			ddosEventList.add(ddosEvent);
		}
		describeDdosEventListResponse.setDdosEventList(ddosEventList);
	 
	 	return describeDdosEventListResponse;
	}
}