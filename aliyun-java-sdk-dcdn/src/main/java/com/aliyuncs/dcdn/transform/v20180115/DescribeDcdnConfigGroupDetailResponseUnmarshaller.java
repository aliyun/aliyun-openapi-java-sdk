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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnConfigGroupDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnConfigGroupDetailResponseUnmarshaller {

	public static DescribeDcdnConfigGroupDetailResponse unmarshall(DescribeDcdnConfigGroupDetailResponse describeDcdnConfigGroupDetailResponse, UnmarshallerContext _ctx) {
		
		describeDcdnConfigGroupDetailResponse.setRequestId(_ctx.stringValue("DescribeDcdnConfigGroupDetailResponse.RequestId"));
		describeDcdnConfigGroupDetailResponse.setConfigGroupId(_ctx.stringValue("DescribeDcdnConfigGroupDetailResponse.ConfigGroupId"));
		describeDcdnConfigGroupDetailResponse.setConfigGroupName(_ctx.stringValue("DescribeDcdnConfigGroupDetailResponse.ConfigGroupName"));
		describeDcdnConfigGroupDetailResponse.setDescription(_ctx.stringValue("DescribeDcdnConfigGroupDetailResponse.Description"));
		describeDcdnConfigGroupDetailResponse.setBizName(_ctx.stringValue("DescribeDcdnConfigGroupDetailResponse.BizName"));
		describeDcdnConfigGroupDetailResponse.setCreateTime(_ctx.stringValue("DescribeDcdnConfigGroupDetailResponse.CreateTime"));
		describeDcdnConfigGroupDetailResponse.setUpdateTime(_ctx.stringValue("DescribeDcdnConfigGroupDetailResponse.UpdateTime"));
	 
	 	return describeDcdnConfigGroupDetailResponse;
	}
}