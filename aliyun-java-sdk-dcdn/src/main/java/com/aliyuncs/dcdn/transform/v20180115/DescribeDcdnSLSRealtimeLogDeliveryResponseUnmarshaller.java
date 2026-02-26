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

package com.aliyuncs.dcdn.transform.v20180115;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnSLSRealtimeLogDeliveryResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnSLSRealtimeLogDeliveryResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnSLSRealtimeLogDeliveryResponseUnmarshaller {

	public static DescribeDcdnSLSRealtimeLogDeliveryResponse unmarshall(DescribeDcdnSLSRealtimeLogDeliveryResponse describeDcdnSLSRealtimeLogDeliveryResponse, UnmarshallerContext _ctx) {
		
		describeDcdnSLSRealtimeLogDeliveryResponse.setRequestId(_ctx.stringValue("DescribeDcdnSLSRealtimeLogDeliveryResponse.RequestId"));

		Content content = new Content();
		content.setStatus(_ctx.stringValue("DescribeDcdnSLSRealtimeLogDeliveryResponse.Content.Status"));
		content.setType(_ctx.stringValue("DescribeDcdnSLSRealtimeLogDeliveryResponse.Content.Type"));
		content.setSLSLogStore(_ctx.stringValue("DescribeDcdnSLSRealtimeLogDeliveryResponse.Content.SLSLogStore"));
		content.setDataCenter(_ctx.stringValue("DescribeDcdnSLSRealtimeLogDeliveryResponse.Content.DataCenter"));
		content.setFieldName(_ctx.stringValue("DescribeDcdnSLSRealtimeLogDeliveryResponse.Content.FieldName"));
		content.setProjectName(_ctx.stringValue("DescribeDcdnSLSRealtimeLogDeliveryResponse.Content.ProjectName"));
		content.setSamplingRate(_ctx.stringValue("DescribeDcdnSLSRealtimeLogDeliveryResponse.Content.SamplingRate"));
		content.setSLSProject(_ctx.stringValue("DescribeDcdnSLSRealtimeLogDeliveryResponse.Content.SLSProject"));
		content.setDomainName(_ctx.stringValue("DescribeDcdnSLSRealtimeLogDeliveryResponse.Content.DomainName"));
		content.setBusinessType(_ctx.stringValue("DescribeDcdnSLSRealtimeLogDeliveryResponse.Content.BusinessType"));
		content.setSLSRegion(_ctx.stringValue("DescribeDcdnSLSRealtimeLogDeliveryResponse.Content.SLSRegion"));
		describeDcdnSLSRealtimeLogDeliveryResponse.setContent(content);
	 
	 	return describeDcdnSLSRealtimeLogDeliveryResponse;
	}
}