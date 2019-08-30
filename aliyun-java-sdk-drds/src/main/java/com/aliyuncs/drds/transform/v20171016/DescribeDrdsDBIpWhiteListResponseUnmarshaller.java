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

package com.aliyuncs.drds.transform.v20171016;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20171016.DescribeDrdsDBIpWhiteListResponse;
import com.aliyuncs.drds.model.v20171016.DescribeDrdsDBIpWhiteListResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsDBIpWhiteListResponseUnmarshaller {

	public static DescribeDrdsDBIpWhiteListResponse unmarshall(DescribeDrdsDBIpWhiteListResponse describeDrdsDBIpWhiteListResponse, UnmarshallerContext _ctx) {
		
		describeDrdsDBIpWhiteListResponse.setRequestId(_ctx.stringValue("DescribeDrdsDBIpWhiteListResponse.RequestId"));
		describeDrdsDBIpWhiteListResponse.setSuccess(_ctx.booleanValue("DescribeDrdsDBIpWhiteListResponse.Success"));

		Data data = new Data();

		List<String> ipWhiteList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDrdsDBIpWhiteListResponse.Data.IpWhiteList.Length"); i++) {
			ipWhiteList.add(_ctx.stringValue("DescribeDrdsDBIpWhiteListResponse.Data.IpWhiteList["+ i +"]"));
		}
		data.setIpWhiteList(ipWhiteList);
		describeDrdsDBIpWhiteListResponse.setData(data);
	 
	 	return describeDrdsDBIpWhiteListResponse;
	}
}