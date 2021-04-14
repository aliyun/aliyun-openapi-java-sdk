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

package com.aliyuncs.geoip.transform.v20200101;

import com.aliyuncs.geoip.model.v20200101.DescribeGeoipInstanceDataUrlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGeoipInstanceDataUrlResponseUnmarshaller {

	public static DescribeGeoipInstanceDataUrlResponse unmarshall(DescribeGeoipInstanceDataUrlResponse describeGeoipInstanceDataUrlResponse, UnmarshallerContext _ctx) {
		
		describeGeoipInstanceDataUrlResponse.setRequestId(_ctx.stringValue("DescribeGeoipInstanceDataUrlResponse.RequestId"));
		describeGeoipInstanceDataUrlResponse.setFixedDomainDownloadUrl(_ctx.stringValue("DescribeGeoipInstanceDataUrlResponse.FixedDomainDownloadUrl"));
		describeGeoipInstanceDataUrlResponse.setDownloadUrl(_ctx.stringValue("DescribeGeoipInstanceDataUrlResponse.DownloadUrl"));
	 
	 	return describeGeoipInstanceDataUrlResponse;
	}
}