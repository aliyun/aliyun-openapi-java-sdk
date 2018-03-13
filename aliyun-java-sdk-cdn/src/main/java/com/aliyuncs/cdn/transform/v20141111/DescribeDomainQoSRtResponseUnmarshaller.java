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

import com.aliyuncs.cdn.model.v20141111.DescribeDomainQoSRtResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainQoSRtResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainQoSRtResponseUnmarshaller {

	public static DescribeDomainQoSRtResponse unmarshall(DescribeDomainQoSRtResponse describeDomainQoSRtResponse, UnmarshallerContext context) {
		
		describeDomainQoSRtResponse.setDomainName(context.stringValue("DescribeDomainQoSRtResponse.DomainName"));
		describeDomainQoSRtResponse.setStartTime(context.stringValue("DescribeDomainQoSRtResponse.StartTime"));
		describeDomainQoSRtResponse.setEndTime(context.stringValue("DescribeDomainQoSRtResponse.EndTime"));
		describeDomainQoSRtResponse.setIp(context.stringValue("DescribeDomainQoSRtResponse.Ip"));

		List<Data> content = new ArrayList<Data>();
		for (int i = 0; i < context.lengthValue("DescribeDomainQoSRtResponse.Content.Length"); i++) {
			Data data = new Data();
			data.setMore5s(context.stringValue("DescribeDomainQoSRtResponse.Content["+ i +"].More5s"));
			data.setTime(context.stringValue("DescribeDomainQoSRtResponse.Content["+ i +"].Time"));
			data.setMore3s(context.stringValue("DescribeDomainQoSRtResponse.Content["+ i +"].More3s"));

			content.add(data);
		}
		describeDomainQoSRtResponse.setContent(content);
	 
	 	return describeDomainQoSRtResponse;
	}
}