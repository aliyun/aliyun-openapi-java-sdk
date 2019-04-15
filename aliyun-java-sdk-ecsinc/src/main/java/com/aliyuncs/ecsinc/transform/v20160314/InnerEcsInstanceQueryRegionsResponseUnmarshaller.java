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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceQueryRegionsResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceQueryRegionsResponse.Data;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceQueryRegionsResponse.Data.Region;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceQueryRegionsResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsInstanceQueryRegionsResponseUnmarshaller {

	public static InnerEcsInstanceQueryRegionsResponse unmarshall(InnerEcsInstanceQueryRegionsResponse innerEcsInstanceQueryRegionsResponse, UnmarshallerContext context) {
		
		innerEcsInstanceQueryRegionsResponse.setRequestId(context.stringValue("InnerEcsInstanceQueryRegionsResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerEcsInstanceQueryRegionsResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerEcsInstanceQueryRegionsResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerEcsInstanceQueryRegionsResponse.errorCode.isSuccess"));
		innerEcsInstanceQueryRegionsResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setTotal(context.integerValue("InnerEcsInstanceQueryRegionsResponse.data.total"));

		List<Region> regions = new ArrayList<Region>();
		for (int i = 0; i < context.lengthValue("InnerEcsInstanceQueryRegionsResponse.data.regions.Length"); i++) {
			Region region = new Region();
			region.setRegionNoAlias(context.stringValue("InnerEcsInstanceQueryRegionsResponse.data.regions["+ i +"].regionNoAlias"));
			region.setRegionNo(context.stringValue("InnerEcsInstanceQueryRegionsResponse.data.regions["+ i +"].regionNo"));
			region.setRegionName(context.stringValue("InnerEcsInstanceQueryRegionsResponse.data.regions["+ i +"].regionName"));

			regions.add(region);
		}
		data.setRegions(regions);
		innerEcsInstanceQueryRegionsResponse.setData(data);
	 
	 	return innerEcsInstanceQueryRegionsResponse;
	}
}